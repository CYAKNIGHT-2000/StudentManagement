package edu.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.spring.entity.Student;
import edu.spring.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository studentRepository;
	
	public Student saveStudent(Student s) {
		return studentRepository.save(s);
	}
	
	public List<Student>getStudent(){
		return studentRepository.findAll();
	}
	
	public Student getAnStudent(int id)
	{
		return studentRepository.findById(id).get();
	}
	public Student updateStudent(Student s,int id)
	{
		Student old=studentRepository.findById(id).get();
		old.setFirstName(s.getFirstName());
		old.setLastName(s.getLastName());
		old.setEmail(s.getEmail());
		return studentRepository.save(old);
	}
	public String deletStudent(int id)
	{
		studentRepository.deleteById(id);
		return ("The Student having id" + id + "has been deleted!!!!");
	}
	public List<Student> getStudentByEmail(String email) {
		return studentRepository.findByEmail(email);
	}

	public List<Student> getStudentByFirstName(String FirstName) {
		return studentRepository.findByFirstName(FirstName);
	}
	public List<Student> getStudentByLastName(String LastName) {
		return studentRepository.findByFirstName(LastName);
	}

}
