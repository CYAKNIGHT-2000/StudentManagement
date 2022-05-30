package edu.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import edu.spring.entity.Student;
import edu.spring.service.StudentService;


@RestController
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@PostMapping(value="/post")
	public Student post(@RequestBody Student s)
	{
		return studentService.saveStudent(s);
	}
	
	
	@GetMapping(value="/getall")
	public List<Student>getALL(){
		return studentService.getStudent();
	}
	
	@GetMapping(value="/getone/{id}")
	public Student fetchAnStudent(@PathVariable int id)
	{
		return studentService.getAnStudent(id);
	}
	
	@PutMapping(value="/updateone/{id}")
	public Student putAnStudent(@PathVariable int id,@RequestBody Student s)
	{
		return studentService.updateStudent(s, id);
	}
	
	@DeleteMapping(value="/deletone/{id}")
	public String deleteStudent(@PathVariable int id)
	{
		return studentService.deletStudent(id);
	}
	
	@GetMapping(value="/getbyemail")
	public List< Student> getemail( String email)
	{
		return studentService.getStudentByEmail(email);
	}
	
	@GetMapping(value="/getbyFirstName")
	public List< Student> getFirstName( String FirstName)
	{
		return studentService.getStudentByFirstName(FirstName);
	}
	@GetMapping(value="/getbyLastName")
	public List< Student> getLastName( String LastName)
	{
		return studentService.getStudentByLastName(LastName);
	}
	

}
