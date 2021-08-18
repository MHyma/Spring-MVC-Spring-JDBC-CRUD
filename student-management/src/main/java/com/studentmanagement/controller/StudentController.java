package com.studentmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.studentmanagement.api.StudentDTO;
import com.studentmanagement.api.Students;
import com.studentmanagement.dao.StudentDAO;
import com.studentmanagement.service.StudentService;

@Controller
public class StudentController {

	
	@Autowired
	private StudentService studentService;
	
	@RequestMapping(value="/", method = RequestMethod.GET)
	public String showStudent() {
	
		return "student-page";
	}
	
	
	
	@RequestMapping(value="/showStudent", method = RequestMethod.GET)
	public String showStudentList(Model model) {
		
//		List<Students> studentList=studentDAO.loadStudents();
		List<Students> studentList=studentService.loadStudents();
		
		model.addAttribute("students", studentList);
		return "student-list";
	}
	
	@GetMapping("/showAddStudentPage")
	public String addStudent(Model model ) {
		//StudentDTO studentDto=new StudentDTO();
		Students student=new Students();
		model.addAttribute("student", student);
		return "add-student";
	}
	
	
	@PostMapping("/saveStudent")
	public String addStudent(Students student) {
	
		System.out.println(student);
		if(student.getId()==0) {	
			studentService.saveStudent(student);
		}
		else {
			studentService.update(student);
		}
		return "redirect:/showStudent";
	}
	
//  Post-redirect-get pattern
	
//	@ResponseBody
//	@GetMapping("/thankyou")
//	public String thankYou() {
//		return "Thank You...Your data has been added to database....";
//	}
	
	
	@GetMapping("/updateStudent")
	public String updateStudent(@RequestParam("userId") int id,@ModelAttribute("student") Students student ) {
		//StudentDTO studentDto=new StudentDTO();
//		Students student=new Students();
//		model.addAttribute("student", student);
		Students theStudent=studentService.getStudent(id);
		System.out.println(theStudent);
		student.setId(id);
		student.setName(theStudent.getName());
		student.setMobile(theStudent.getMobile());
		student.setCountry(theStudent.getCountry());
		return "add-student";
	}
	
	@GetMapping("/deleteStudent")
	public String deleteStudent(@RequestParam("userId") int id ) {
	studentService.deleteStudent(id);
		return "redirect:/showStudent";
	}
}
