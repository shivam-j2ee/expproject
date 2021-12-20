package com.ncs.SpringSecurity.student;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/student")
public class StudentCtl {

	
	
	private static final List<StudentDTO> STUDENTS=Arrays.asList(
			new StudentDTO(1, "shivam", "ee123"),
			new StudentDTO(2, "anil",   "cs145"),
			new StudentDTO(3, "yash", "cs125")
			);
			
	
	@GetMapping("test")
	public String test() {
		return "hello student";
	}
	
	@GetMapping("get/{id}")
	public StudentDTO getStudent(@PathVariable Integer id) {
		return STUDENTS.stream()
				.filter(std->id.equals(std.getId()))
				.findFirst()
				.orElseThrow(()->new IllegalStateException("Student id not found"));
	}
	
	
}
