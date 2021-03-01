package models;

import exceptions.UnprocessableEntity;
// está classe é o modelo para as pessoas
public class PersonModel {

	private int id;
	private String name;
	private String lastName;

	// método construtor das pessoas
	public PersonModel(int id, String name, String lastName) {
		this.setId(id);
		this.setName(name);
		this.setLastName(lastName);

	}

	// método get do ID das pessoas
	public int getId() {
		return id;
	}

	// método set do ID pessoas
	public void setId(int id) {
		this.id = id;
	}

	// método get do nome
	public String getName() {
		return name;
	}

	// método set do nome
	public void setName(String name) {
		if (name.equals("") || name == null) {
			throw new NullPointerException("O nome não pode ser nulo!");
		} else {
			this.name = name;
		}

	}

	// método get do sobrenome
	public String getLastName() {
		return lastName;
	}

	// método set do sobrenome
	public void setLastName(String lastName) {
		if (lastName.equals("") || lastName == null) {
			throw new NullPointerException("O sobrenome não pode ser nulo!");
		} else {
			this.lastName = lastName;
		}

	}
	
}

	
