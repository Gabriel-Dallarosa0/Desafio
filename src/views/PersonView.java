package views;

import java.util.ArrayList;

import models.PersonModel;
import repositories.PersonRepository;

public class PersonView {

	private static PersonRepository personRepository = new PersonRepository();
	private int id = 0;

	
	private int getId() {
		return id;
	}


	private void addId() {
		this.id++;
	}


	public void addPerson(String name, String lastName) {
		PersonModel person = new PersonModel(this.getId(), name, lastName);
		this.personRepository.addPerson(person);
		this.addId();
	}
	
	public PersonModel getPerson(int id) {
		return this.personRepository.getPerson(id);
	}
	
	public PersonModel getPerson(String name) {
		return this.personRepository.getPerson(name);
	}
	
	public ArrayList<PersonModel> getPersons(){
		return this.personRepository.getPersons();
	}


}

