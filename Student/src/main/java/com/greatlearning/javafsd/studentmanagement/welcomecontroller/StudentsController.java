package com.greatlearning.javafsd.studentmanagement.welcomecontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.greatlearning.javafsd.studentmanagement.StudentService.StudentService;
import com.greatlearning.javafsd.studentmanagement.StudentService.StudentServiceImpl;
import com.greatlearning.javafsd.studentmanagement.entity.Student;

@Controller
@RequestMapping("/students")
public class StudentsController {
	
	
		@Autowired
		private StudentService studentService;

		@RequestMapping("/list")
		public String handleListStudents(Model theModel) {

			List<Student> students = studentService.listAll();
			System.out.println("List of Students");
for(int i=0;i<students.size();i++)
{
Student s=students.get(i);
System.out.println(s.getId());
}
			
			theModel.addAttribute("students", students);

			return "Students-lister";
		}


}
