package com.gqltest.services;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.gqltest.model.Address;
import com.gqltest.model.Person;

@Component
public class PersonServiceImpl {

	static Map<String, Person> persons;
	static {
		persons = new HashMap<>();
		Person james = new Person("P100", "James", 21, new Address(1, "Mission St", null, "San Francisco", "CA", "USA"));
		Person tom = new Person("P101", "Tom", 22, new Address(2, "Cedar St", null, "San Rafel", "CA", "USA"));
		Person jose = new Person("P102", "Jose", 23, new Address(3, "Aliso St", null, "Irvine", "CA", "USA"));
		
		persons.put("P100", james);
		persons.put("P101", tom);
		persons.put("P102", jose);
		
	}
	
	public Person getPerson(String pid) {
		if (pid.equalsIgnoreCase("P100"))
			return persons.get("P100");
		else if (pid.equalsIgnoreCase("P101"))
			return persons.get("P101");
		else if (pid.equalsIgnoreCase("P102"))
			return persons.get("P102");
		else return null;
	}

}
