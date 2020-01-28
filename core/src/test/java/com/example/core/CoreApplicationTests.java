package com.example.core;

import com.example.core.Model.Student;
import com.example.core.controllers.StudentController;
import com.example.core.repositories.StudentRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
//@WebMvcTest(controllers = StudentController.class)
class CoreApplicationTests {
//
//	@Autowired
//	private MockMvc mockMvc;

	private int localport = 8989;

	@Autowired
	private StudentController studentController;

	@Autowired
	private MockMvc mockMvc;

//	public void getStudentByUsername(String username) throws Exception {
//		Student newStudent = new Student(1, "hazargul", "nazari");
//		studentRepository.save(newStudent);
//		mockMvc.perform(get("/students/hazargul")).andExpect(content().string(newStudent.toString())).andExpect(status().is2xxSuccessful());
//	}


	@Test
	void contextLoads() throws Exception {
		// simple test
		assertThat(studentController).isNotNull();
//		mockMvc.perform(get("/test/test")).andExpect(content().string("test")).andExpect(status().is2xxSuccessful());
	}

	@Test
	public void isHelloWorldCorrect() throws Exception{
		mockMvc.perform(get("/test/hello")).andDo(print()).andExpect(content().string("hello")).andExpect(status().isOk());
	}


}
