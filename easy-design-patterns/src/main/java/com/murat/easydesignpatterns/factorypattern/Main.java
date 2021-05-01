package com.murat.easydesignpatterns.factorypattern;

import com.murat.easydesignpatterns.factorypattern.factory.PersonFactory;
import com.murat.easydesignpatterns.factorypattern.model.Person;

public class Main {

	public static void main(String[] args) {
		
		PersonFactory personFactory = new PersonFactory();
		
		Person person = personFactory.getPerson(PersonFactory.PHYSICAL_PERSON);
		person.save();
		
		person = personFactory.getPerson(PersonFactory.LEGAL_PERSON);
		person.save();
		
	}

}
