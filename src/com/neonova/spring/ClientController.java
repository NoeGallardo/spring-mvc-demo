package com.neonova.spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

import java.util.Map;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/client")
public class ClientController {
	
	@Value("#{countryOptions}") 
	private Map<String, String> countryOptions;
	
	@Value("#{genderOptions}") 
	private Map<String, String> genderOptions;
	
	@Value("#{lenguajeOptions}") 
	private Map<String, String> lenguajeOptions;

	@RequestMapping("showFormClient")
	public String showFormClient(Model model) {
		
		System.out.println("******************** this is the showFormClient **********************");
		model.addAttribute("cliente", new Cliente());
		model.addAttribute("countryOptions",countryOptions);
		model.addAttribute("genderOptions",genderOptions);
		model.addAttribute("lenguajeOptions", lenguajeOptions);
		return "showFormCliente";
	}
	
	@RequestMapping("processForm")
	public String processForm(@Valid @ModelAttribute("cliente") Cliente cliente, BindingResult br, Model model) {
		//model.addAttribute("cliente", new Cliente());
		model.addAttribute("countryOptions",countryOptions);
		model.addAttribute("genderOptions",genderOptions);
		model.addAttribute("lenguajeOptions", lenguajeOptions);
		
		if (br.hasErrors()) {
			return "showFormCliente";
		}
		
		else {
			cliente.toString2();
			
			System.out.println("El Code Es: "+cliente.getCode());
			
			for (String item : cliente.getLenguaje()) {
				System.out.println(item);
			}
		}
		
		return "clienteSuccess";
	}

	public Map<String, String> getCountryOptions() {
		return countryOptions;
	}

	public void setCountryOptions(Map<String, String> countryOptions) {
		this.countryOptions = countryOptions;
	}

	public Map<String, String> getGenderOptions() {
		return genderOptions;
	}

	public void setGenderOptions(Map<String, String> genderOptions) {
		this.genderOptions = genderOptions;
	}

	public Map<String, String> getLenguajeOptions() {
		return lenguajeOptions;
	}

	public void setLenguajeOptions(Map<String, String> lenguajeOptions) {
		this.lenguajeOptions = lenguajeOptions;
	}
	
	
}
