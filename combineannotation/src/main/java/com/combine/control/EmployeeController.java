package com.combine.control;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.combine.model.Employee;

@Controller
public class EmployeeController {
	/*Employee e;

	@RequestMapping("/callme")
	public String showemp() {

		return "test";
	}

	@RequestMapping("/add")
	public ModelAndView showForm(@ModelAttribute("emp") Employee emp) {

		return new ModelAndView("Addemployee");
	}

	@RequestMapping("/sucess")
	public ModelAndView save(Employee emp) {
		System.out.println(emp.getFirstName() + "  " + emp.getLastName());
		e = emp;

		return new ModelAndView("redirect:/viewlist");
	}

	@RequestMapping("/viewlist")
	public ModelAndView display() {
		ArrayList<Employee> list = new ArrayList<>();
		// list.add(new Employee(1,"a","s"));
		list.add(e);
		ModelAndView mav = new ModelAndView("sucess");
		mav.addObject("msg", list);
		return mav;
	}
	*/
	
	@RequestMapping(value="/",method = RequestMethod.GET)
	public String showemp() {

		return "test";
	}
	

}
