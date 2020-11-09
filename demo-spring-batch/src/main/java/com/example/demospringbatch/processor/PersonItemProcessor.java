package com.example.demospringbatch.processor;

import org.springframework.batch.item.ItemProcessor;

import com.example.demospringbatch.model.Person;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class PersonItemProcessor implements ItemProcessor<Person, Person> {
	
	@Override
	public Person process(Person item) throws Exception {
		String firstName = item.getFirstName().toUpperCase();
		String secondName = item.getSecondName().toUpperCase();
		String phone = item.getPhone();
		
		Person person = new Person(firstName, secondName, phone);
		
		log.info("Changing ("+item+") a ("+person+")");
		
		return person;
	}

}
