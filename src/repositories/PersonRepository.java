package repositories;

import java.util.ArrayList;
import models.PersonModel;
// classe para armazenar as pessoas
public class PersonRepository {

	private ArrayList<PersonModel> persons = new ArrayList<PersonModel>();

	// método get das pessoas
	public ArrayList<PersonModel> getPersons() {
		return persons;
	}

	// método add pessoas
	public void addPerson(PersonModel person) {
		this.persons.add(person);

	}

	// método get pessoas por ID
	public PersonModel getPerson(int id) {
		return this.persons.get(id);

	}

	// método get pessoas por nome
	public PersonModel getPerson(String name) {
		for (PersonModel person : persons) {
			if (person.getName().equals(name)) {
				return person;
			}

		}
		return null;

	}

}
