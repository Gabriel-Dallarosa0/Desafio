package repositories;

import java.util.ArrayList;
import models.PersonModel;
// classe para armazenar as pessoas
public class PersonRepository {

	private ArrayList<PersonModel> persons = new ArrayList<PersonModel>();

	// m�todo get das pessoas
	public ArrayList<PersonModel> getPersons() {
		return persons;
	}

	// m�todo add pessoas
	public void addPerson(PersonModel person) {
		this.persons.add(person);

	}

	// m�todo get pessoas por ID
	public PersonModel getPerson(int id) {
		return this.persons.get(id);

	}

	// m�todo get pessoas por nome
	public PersonModel getPerson(String name) {
		for (PersonModel person : persons) {
			if (person.getName().equals(name)) {
				return person;
			}

		}
		return null;

	}

}
