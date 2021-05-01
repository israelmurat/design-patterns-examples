package com.murat.easydesignpatterns.factorypattern.model;

import java.util.Date;

public class PhysicalPerson extends Person {

	private String name;
	private String rg;
	private String cpf;
	private Date dateOfBirhday;
	
	@Override
	public void save() {
		System.out.println("Pessoa Física salva com sucesso!");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Date getDateOfBirhday() {
		return dateOfBirhday;
	}

	public void setDateOfBirhday(Date dateOfBirhday) {
		this.dateOfBirhday = dateOfBirhday;
	}

}
