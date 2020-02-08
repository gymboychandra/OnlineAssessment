package com.wipro.onlineassesment;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
public class serviceTest {
	
	@Mock
	UserRepository urepo;
	
	@Mock
	AssessmentRepository arepo;
	
	@Mock
	Question question;
	
	@InjectMocks
	service ser;
	
	@Test
	public void validateAdmintest() {
		when(urepo.findByEmailId("roger@gmail.com"))
		.thenReturn(new User((long) 1000000,"roger@gmail.com","wipro@123","roger","kutcher","admin") );
	    assertEquals("admin",ser.validate("roger@gmail.com", "wipro@123"));
	}
	@Test
	public void validatePasswordErrtest() {
		when(urepo.findByEmailId("roger@gmail.com"))
		.thenReturn(new User((long) 1000000,"roger@gmail.com","wipro@123","roger","kutcher","admin") );
	    assertEquals("passerror",ser.validate("roger@gmail.com", "wipro"));
	}
	@Test
	public void validateCandidatetest() {
		when(urepo.findByEmailId("chandra@gmail.com"))
		.thenReturn(new User((long) 1000000,"chandra@gmail.com","wipro@123","roger","kutcher","candidate") );
	    assertEquals("candidate",ser.validate("chandra@gmail.com", "wipro@123"));
	}

	@Test
	public void allUsertests() {
		when(urepo.findAllSorted()).thenReturn(Stream
				.of(new User((long) 1000000,"roger@gmail.com","wipro@123","roger","kutcher","admin"), new User((long) 1000000,"roqger@gmail.com","wipro@123","roger","kutcher","admin"))
				.collect(Collectors.toList()));
	  
		assertEquals(2,ser.allUser().size());
	 
	}
	@Test
	public void alltests() {
		when(arepo.findAllSorted()).thenReturn(Stream
				.of(new Assessment((long) 1000000,"12/12/12","hibernate",30,"kutcher",50,"pass"), new Assessment((long) 1000000,"12/12/12","hibernate",20,"kutcher",50,"fail"))
				.collect(Collectors.toList()));
	  
		assertEquals(2,ser.allTest().size());
	 
	}
	
	@Test
	public void registertest() {
		User u=new User((long) 1000000,"roger@gmail.com","wipro@123","roger","kutvvcher","admin");
	   when(urepo.save(u)).thenReturn(u);
	   assertEquals("RegSucess", ser.register(u));
	}
	
	
	@Test
	public void evalSpringPasstest() {
		Assessment a= new Assessment(null,"assessmentDate","Hibernate-L1",20,"loggedEmail",50,"status");
		 when(arepo.save(a)).thenReturn(a);
		Question q=new Question("J2EE App Development Framework","","","Application Context","Dispatcher Servlet");
		assertEquals("passed", ser.eValSpring(q));
	}
	
	@Test
	public void evalSpringFailtest() {
		Assessment a= new Assessment(null,"assessmentDate","Hibernate-L1",20,"loggedEmail",50,"status");
		 when(arepo.save(a)).thenReturn(a);
		Question q=new Question("","","","Application Context","Dispatcher Servlet");
		assertEquals("failed", ser.eValSpring(q));
	}
	
	@Test
	public void evalHibernatePasstest() {
		Question q=new Question("Object Relational Mapping","","","Hibernate Query Language","isolation levels");
		assertEquals("passed", ser.eValHibernate(q));
	}
	@Test
	public void evalHibernateFailtest() {
		Question q=new Question("","","","Hibernate Query Language","isolation levels");
		assertEquals("failed", ser.eValHibernate(q));
	}
	
	

}
