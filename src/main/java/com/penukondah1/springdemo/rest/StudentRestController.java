package com.penukondah1.springdemo.rest;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.penukondah1.springdemo.entity.Student;

@RestController
@RequestMapping("/api")
public class StudentRestController {
	
	private List<Student> theStudents;
	
	// define @PostConstruct to load the student data...
	
	@PostConstruct
	/* The PostConstruct annotation is used on a method that needs to be executed after dependency injection is done to perform any initialization.
	 * This method MUST be invoked before the class is put into service. */
	public void loadData() {
		
	    theStudents = new ArrayList<>();
		
		theStudents.add(new Student("Alice","Cooper"));
		theStudents.add(new Student("Betty","Cooper"));
		theStudents.add(new Student("Jughead","Jones"));
		theStudents.add(new Student("Archie","Andrews"));
		
	}
	

	// defining end point for "/students" - return list of students
	
	@GetMapping("/students")
	public List<Student> getStudents(){
		
		return theStudents;
		
	}
	
	// define end point for "/students/{studentId}" -  return student at index
	@GetMapping("/students/{studentId}")
	public Student getStudent(@PathVariable int studentId) {
		// just index into the list... keep it simple for now
		return theStudents.get(studentId);
		
	}

}
