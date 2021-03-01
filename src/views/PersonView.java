package views;

import java.util.ArrayList;

import models.PersonModel;
import repositories.PersonRepository;
// está classe está gaz a ligação entre as pessoas e a interface
public class PersonView {

	private static PersonRepository personRepository = new PersonRepository();
	private int id = 0;

	// método get ID
	private int getId() {
		return id;
	}


	// método add ID
	private void addId() {
		this.id++;
	}


	// método add pessoas
	public void addPerson(String name, String lastName) {
		PersonModel person = new PersonModel(this.getId(), name, lastName);
		this.personRepository.addPerson(person);
		this.addId();
	}
	
	// método get das pessoas por ID
	public PersonModel getPerson(int id) {
		return this.personRepository.getPerson(id);
	}
	
	// método get das pessoas por nome
	public PersonModel getPerson(String name) {
		return this.personRepository.getPerson(name);
	}
	
	// método get das pessoas
	public ArrayList<PersonModel> getPersons(){
		return this.personRepository.getPersons();
	}
	
	


}

