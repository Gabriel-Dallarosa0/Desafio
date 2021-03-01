package views;

import java.util.ArrayList;

import models.PersonModel;
import repositories.PersonRepository;
// est� classe est� gaz a liga��o entre as pessoas e a interface
public class PersonView {

	private static PersonRepository personRepository = new PersonRepository();
	private int id = 0;

	// m�todo get ID
	private int getId() {
		return id;
	}


	// m�todo add ID
	private void addId() {
		this.id++;
	}


	// m�todo add pessoas
	public void addPerson(String name, String lastName) {
		PersonModel person = new PersonModel(this.getId(), name, lastName);
		this.personRepository.addPerson(person);
		this.addId();
	}
	
	// m�todo get das pessoas por ID
	public PersonModel getPerson(int id) {
		return this.personRepository.getPerson(id);
	}
	
	// m�todo get das pessoas por nome
	public PersonModel getPerson(String name) {
		return this.personRepository.getPerson(name);
	}
	
	// m�todo get das pessoas
	public ArrayList<PersonModel> getPersons(){
		return this.personRepository.getPersons();
	}
	
	


}

