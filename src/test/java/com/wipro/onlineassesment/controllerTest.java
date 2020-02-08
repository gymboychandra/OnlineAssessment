package com.wipro.onlineassesment;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

@RunWith(SpringJUnit4ClassRunner.class)
public class controllerTest {
	
	
	private MockMvc mockMvc;
	
	@Mock
	service service;
	
	@InjectMocks
	controller controller;
	
	@Before
    public void setUp() throws Exception {
        mockMvc = MockMvcBuilders.standaloneSetup(controller)
                .build();
    }

	@Test
	public void hometest() throws Exception {
		
		MvcResult mvcresult=
		mockMvc.perform(get("/"))
		.andExpect(status().isOk())
		//.andExpect(content().contentType(MediaType.APPLICATION_JSON)).               
		//.andExpect(content().string("hello"));
        .andReturn();
		
		String content=mvcresult.getResponse().getContentAsString();
		assertEquals("login",content);
				
	}
	@Test
	public void registertest() throws Exception {
		
		mockMvc.perform(get("/register"))
		.andExpect(status().isOk())
		.andExpect(content().string("registration"));
	}
	@Test
	public void springAssestest() throws Exception {
		
		mockMvc.perform(get("/springAssessment"))
		.andExpect(status().isOk())
		.andExpect(content().string("springassessment"));
	}
	@Test
	public void hibernateAssestest() throws Exception {
		
		mockMvc.perform(get("/hibernateAssessment"))
		.andExpect(status().isOk())
		.andExpect(content().string("hibernateassessment"));
	}
	@Test
	public void allTesttest() throws Exception {
		
		mockMvc.perform(get("/tests/all"))
		.andExpect(status().isOk())
		.andExpect(content().string("testdetails"));
	}
	@Test
	public void indextest() throws Exception {
		
		mockMvc.perform(get("/users/all"))
		.andExpect(status().isOk())
		.andExpect(content().string("alluser"));
	}
	@Test
	public void springExamtest() throws Exception {
		
		Question question = new Question("J2EE App Development Framework", "Inversion Of Control", "Aspect Oriented Programming", "", "");
		when(service.eValSpring(question)).thenReturn("passed");
		
		mockMvc.perform(get("/evaluate/spring/test"))
		.andExpect(status().isOk())
		.andExpect(content().string(""));
	}
	@Test
	public void hibernateExamtest() throws Exception {
		
//		Question question = new Question("J2EE App Development Framework", "Inversion Of Control", "Aspect Oriented Programming", "", "");
//		when(service.eValSpring(question)).thenReturn("passed");
//		
		mockMvc.perform(get("/evaluate/hibernate/test"))
		.andExpect(status().isOk())
		.andExpect(content().string(""));
	}
	@Test
	public void succesRegtest() throws Exception {
		
		mockMvc.perform(get("/registration/do"))
		.andExpect(status().isOk())
		.andExpect(content().string(""));
	}
	@Test
	public void validatetest() throws Exception {
		
		mockMvc.perform(get("/login/do"))
		.andExpect(status().isOk())
		.andExpect(content().string(""));
	}
	

}
