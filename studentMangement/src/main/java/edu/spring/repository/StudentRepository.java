package edu.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.spring.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

	
    List<Student> findByFirstName(String FirstName);
    List<Student> findByLastName(String LastName);
    List<Student> findByEmail(String email);
}
