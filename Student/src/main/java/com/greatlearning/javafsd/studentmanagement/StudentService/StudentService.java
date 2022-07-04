package com.greatlearning.javafsd.studentmanagement.StudentService;
import java.util.List;

import com.greatlearning.javafsd.studentmanagement.entity.Student;

public interface StudentService {
	List<Student> listAll();
	
Student findById(int theId);
	
void save (Student thestudent);
void deleteById(int theId);

}
