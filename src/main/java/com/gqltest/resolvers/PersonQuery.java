package com.gqltest.resolvers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.gqltest.model.Person;
import com.gqltest.model.PersonInputquery;
import com.gqltest.services.PersonServiceImpl;

@Component
public class PersonQuery implements GraphQLQueryResolver {

	@Autowired
	PersonServiceImpl personServiceImpl;
	
	public Person getPerson(PersonInputquery pquery) {
		return personServiceImpl.getPerson(pquery.getPid());
	}
}
