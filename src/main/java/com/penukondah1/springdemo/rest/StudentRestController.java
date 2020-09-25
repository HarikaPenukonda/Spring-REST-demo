package com.penukondah1.springdemo.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.penukondah1.springdemo.entity.Student;

@RestController
@RequestMapping("/api")
public class StudentRestController {
	
//	@GetMapping("/students")
//	public String getStudents() {
//		return "List of students";
//		
//	}
	
	@GetMapping("/students")
	public List<Student> getStudents(){
		
		List<Student> theStudents = new ArrayList<>();
		theStudents.add(new Student("Alice","Cooper"));
		theStudents.add(new Student("Betty","Cooper"));
		theStudents.add(new Student("Jughead","Jones"));
		theStudents.add(new Student("Archie","Andrews"));
		return theStudents;
		
	}

}
