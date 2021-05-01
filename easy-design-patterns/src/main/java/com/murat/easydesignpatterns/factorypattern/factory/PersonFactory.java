package com.murat.easydesignpatterns.factorypattern.factory;

import com.murat.easydesignpatterns.factorypattern.model.LegalPerson;
import com.murat.easydesignpatterns.factorypattern.model.Person;
import com.murat.easydesignpatterns.factorypattern.model.PhysicalPerson;

public class PersonFactory {

	public static final int PHYSICAL_PERSON = 1;
	public static final int LEGAL_PERSON = 2;
	
	public Person getPerson(int typePerson) {
		if (typePerson == PHYSICAL_PERSON)
			return new PhysicalPerson();
		else if (typePerson == LEGAL_PERSON)
			return new LegalPerson();
		else
			return null;
	}
	
}
