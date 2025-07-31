package com.sejay.student_management_system.service.serviceimpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sejay.student_management_system.entity.Student;
import com.sejay.student_management_system.repository.StudentRepository;
import com.sejay.student_management_system.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{

    private StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAllStudents() {
       return studentRepository.findAll();
    }

    @Override
    public Student saveStudent(Student student) {
       return studentRepository.save(student);
    }

    @Override
    public Student getStudentById(Long id) {
       return studentRepository.findById(id).get();
    }
          
    @Override
    public Student updateStudent(Student student) {
       return studentRepository.save(student);
    }

    @Override
    public void deleteStudent(Long id) {
      studentRepository.deleteById(id);
    }

}
