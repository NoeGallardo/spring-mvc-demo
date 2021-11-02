package com.neonova.spring;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import validations.ClientCode;

public class Cliente {
	private String firstName;
	
	@NotNull(message="Filed Required")
	@Size(min=5, message="Filed Invalid")
	private String lastName;
	private String country;
	private char sexo;
	private String[] lenguaje;
	
	@ClientCode
	private String code;

	public Cliente(){

	}
	
	public void toString2(){
		System.out.println("Hello "+firstName+" "+lastName+" from "+country+
				" you are "+sexo);
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public String[] getLenguaje() {
		return lenguaje;
	}

	public void setLenguaje(String[] lenguaje) {
		this.lenguaje = lenguaje;
	}
	
	
}
