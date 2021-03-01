package models;

import exceptions.UnprocessableEntity;
// est� classe � o modelo para as pessoas
public class PersonModel {

	private int id;
	private String name;
	private String lastName;

	// m�todo construtor das pessoas
	public PersonModel(int id, String name, String lastName) {
		this.setId(id);
		this.setName(name);
		this.setLastName(lastName);

	}

	// m�todo get do ID das pessoas
	public int getId() {
		return id;
	}

	// m�todo set do ID pessoas
	public void setId(int id) {
		this.id = id;
	}

	// m�todo get do nome
	public String getName() {
		return name;
	}

	// m�todo set do nome
	public void setName(String name) {
		if (name.equals("") || name == null) {
			throw new NullPointerException("O nome n�o pode ser nulo!");
		} else {
			this.name = name;
		}

	}

	// m�todo get do sobrenome
	public String getLastName() {
		return lastName;
	}

	// m�todo set do sobrenome
	public void setLastName(String lastName) {
		if (lastName.equals("") || lastName == null) {
			throw new NullPointerException("O sobrenome n�o pode ser nulo!");
		} else {
			this.lastName = lastName;
		}

	}
	
}

	
