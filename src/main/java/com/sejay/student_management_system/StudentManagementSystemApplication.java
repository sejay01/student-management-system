package com.sejay.student_management_system;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sejay.student_management_system.entity.Student;
import com.sejay.student_management_system.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}
	@Autowired 
	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {
	// 	Student std1 = new Student("Monkey","D Luffy","Luffy@gmail.com");
	// 	Student std2 = new Student("Roronoa","Zoro","zoro@gmail.com");
	// 	Student std3 = new Student("Vinsmoke","Sanji","sanji@gmail.com");
	// 	studentRepository.save(std1);
	// 	studentRepository.save(std2);
	// 	studentRepository.save(std3);
	}
 
}
