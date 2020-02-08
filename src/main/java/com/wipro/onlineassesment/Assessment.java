package com.wipro.onlineassesment;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name="Assessment.findAllSorted",query="select a from Assessment a order by a.testDate")
public class Assessment {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Long id;
	
	@Column
	String testDate;
	
	@Column
	String assessment;
	
	@Column
	int testMarks;
	
	@Column
	String emailId;
	
	@Column
	int totalMarks;
	
	@Column
	String result;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTestDate() {
		return testDate;
	}

	public void setTestDate(String testDate) {
		this.testDate = testDate;
	}

	public String getAssessment() {
		return assessment;
	}

	public void setAssessment(String assessment) {
		this.assessment = assessment;
	}

	public int getTestMarks() {
		return testMarks;
	}

	public void setTestMarks(int testMarks) {
		this.testMarks = testMarks;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public int getTotalMarks() {
		return totalMarks;
	}

	public void setTotalMarks(int totalMarks) {
		this.totalMarks = totalMarks;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public Assessment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Assessment(Long id, String testDate, String assessment, int testMarks, String emailId, int totalMarks,
			String result) {
		super();
		this.id = id;
		this.testDate = testDate;
		this.assessment = assessment;
		this.testMarks = testMarks;
		this.emailId = emailId;
		this.totalMarks = totalMarks;
		this.result = result;
	}
	

}
