package models;

import exceptions.UnprocessableEntity;

public class PersonModel {

	private int id;
	private String name;
	private String lastName;

	public PersonModel(int id, String name, String lastName) {
		this.setId(id);
		this.setName(name);
		this.setLastName(lastName);

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name.equals("") || name == null) {
			throw new NullPointerException("O nome não pode ser nulo!");
		} else {
			this.name = name;
		}
		
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		if (lastName.equals("") || lastName == null) {
			throw new NullPointerException("O sobrenome não pode ser nulo!");
		} else {
			this.lastName = lastName;
		}
		
	}

}
