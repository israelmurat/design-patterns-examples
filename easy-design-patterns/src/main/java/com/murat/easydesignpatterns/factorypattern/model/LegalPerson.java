package com.murat.easydesignpatterns.factorypattern.model;

import java.util.Date;

public class LegalPerson extends Person {

	private String companyName;
	private String cnpj;
	private String stateRegistration;
	private Date dateOfFoundation;
	
	@Override
	public void save() {
		System.out.println("Pessoa Jurídica salva com sucesso!");
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getStateRegistration() {
		return stateRegistration;
	}

	public void setStateRegistration(String stateRegistration) {
		this.stateRegistration = stateRegistration;
	}

	public Date getDateOfFoundation() {
		return dateOfFoundation;
	}

	public void setDateOfFoundation(Date dateOfFoundation) {
		this.dateOfFoundation = dateOfFoundation;
	}
	
}
