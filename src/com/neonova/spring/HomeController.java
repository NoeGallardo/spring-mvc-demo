package com.neonova.spring;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String showPage(){
		return "main-menu";
	}
	
	
	@RequestMapping("/processForm")
	public String processRequest(HttpServletRequest request, Model model) {
		String name = "Hola, soy " + request.getParameter("studentName");
		String address = "Actualmente vivo en " + request.getParameter("address");
		String phone = "Mi Telefono es " + request.getParameter("phone");
		String email = "Puedes Mandarme correo a " + request.getParameter("email");
		
		model.addAttribute("name", name);
		model.addAttribute("address", address);
		model.addAttribute("phone", phone);
		model.addAttribute("email", email);
		
		return "helloWorld";
	}
	
	
	@RequestMapping("/processForm2")
	public String processRequest2(@RequestParam("studentName") String name, Model model) {
		name = name.toUpperCase();
		model.addAttribute("name",name);
		return "helloWorld";
	}
	
	@RequestMapping("/showForm")
	public String showForm() {
		System.out.println(">> Hello °°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*");
		
		return "showForm";
	}
}