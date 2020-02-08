package com.wipro.onlineassesment;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;

@Service
public class service {
	
	@Autowired
	private UserRepository repository;
	
	@Autowired 
	private AssessmentRepository assessmentr;
	
	String loggedEmail;
	
	SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
	String status="";
	
	public String validate(String email,String pass) {
		
		String returnval="invaliduser";
		User user=repository.findByEmailId(email);
		if(user!=null) {
			
			loggedEmail=user.getEmailId();
			if(user.getPassword().equals(pass) && user.getUserType().equals("admin"))
				returnval="admin";
			else if(user.getPassword().equals(pass) && user.getUserType().equals("candidate"))
				returnval="candidate";
			else if(!user.getPassword().equals(pass))
				returnval="passerror";			
		}
		return returnval;
	}
	
	public String register(@ModelAttribute("userForm") User userForm) 
	{
		String retunVal="RegSucess";
		User u= new User(userForm.getUserId(),userForm.getEmailId(),userForm.getPassword(),userForm.getFirstName(),userForm.getLastName(),"candidate");
		repository.save(u);
		return retunVal;
	}

	public List<User> allUser() 
	{
		return repository.findAllSorted();
	}
	
	public String eValSpring(Question ans) 
	{
		int markScored=0;
		String returnVal="";
		if(ans.getQuestion1().equals("J2EE App Development Framework"))
			markScored+=10;
		if(ans.getQuestion2().equals("Inversion Of Control"))
			markScored+=10;
		if(ans.getQuestion3().equals("Aspect Oriented Programming"))
			markScored+=10;
		if(ans.getQuestion4().equals("Application Context"))
			markScored+=10;
		if(ans.getQuestion5().equals("Dispatcher Servlet"))
			markScored+=10;
		if(markScored>=30)
		{
			status="Passed";
			returnVal= "passed";
		}
		else 
		{
			status="Failed";
			returnVal= "failed";	
		}
		Date d= new Date();
		String assessmentDate=sdf.format(d);
		Assessment a= new Assessment(null,assessmentDate,"Spring-L1",markScored,loggedEmail,50,status);
		assessmentr.save(a);
		return returnVal;
	}
	
	public String eValHibernate(Question ans) 
	{
		int markScored=0;
		String returnVal="";
		if(ans.getQuestion1().equals("Object Relational Mapping"))
			markScored+=10;
		if(ans.getQuestion2().equals("uni-directional & bi-directional"))
			markScored+=10;
		if(ans.getQuestion3().equals("configuration file"))
			markScored+=10;
		if(ans.getQuestion4().equals("Hibernate Query Language"))
			markScored+=10;
		if(ans.getQuestion5().equals("isolation levels"))
			markScored+=10;
		if(markScored>=30)
		{
			status="Passed";
			returnVal= "passed";
		}
		else 
		{
			status="Failed";
			returnVal= "failed";	
		}
		Date d= new Date();
		String assessmentDate=sdf.format(d);
		Assessment a= new Assessment(null,assessmentDate,"Hibernate-L1",markScored,loggedEmail,50,status);
		assessmentr.save(a);
		return returnVal;
	}
	
	public List<Assessment> allTest() 
	{
		return assessmentr.findAllSorted();
	}

}



