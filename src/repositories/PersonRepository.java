package repositories;

import java.util.ArrayList;
import models.PersonModel;

public class PersonRepository {

	private ArrayList<PersonModel> persons = new ArrayList<PersonModel>();

	public ArrayList<PersonModel> getPersons() {
		return persons;
	}

	public void addPerson(PersonModel person) {
		this.persons.add(person);

	}

	public PersonModel getPerson(int id) {
		return this.persons.get(id);

	}

	public PersonModel getPerson(String name) {
		for (PersonModel person : persons) {
			if (person.getName().equals(name)) {
				return person;
			}

		}
		return null;

	}

}
