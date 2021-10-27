package com.neonova.spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/client")
public class ClientController {

	@RequestMapping("showFormClient")
	public String showFormClient(Model model) {
		
		System.out.println("******************** this is the showFormClient **********************");
		model.addAttribute("cliente", new Cliente());
		
		return "showFormCliente";
	}
	
	@RequestMapping("processForm")
	public String processForm(@ModelAttribute("cliente") Cliente cliente) {
		
		System.out.println("El Cliente es: "+cliente.lastName+", "+cliente.firstName);
		return "clienteSuccess";
	}
}
