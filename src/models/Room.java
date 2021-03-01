
package models;

import java.util.ArrayList;
import java.util.HashMap;

import exceptions.UnprocessableEntity;
// est� classe � o modelo para as salas
public class Room {

	private int id;
	private String name, type;

	protected HashMap<String, ArrayList<PersonModel>> periods = new HashMap<String, ArrayList<PersonModel>>();

	// m�todo construtor das salas
	public Room(int id, String name) {
		this.setId(id);
		this.setName(name);

	}

	// m�todo get dos tipos das salas
	public String getType() {
		return type;
	}

	// m�todo set dos tipos das salas
	public void setType(String type) {
		this.type = type;
	}

	// m�todo get do ID das salas
	public int getId() {
		return id;
	}
 
	// m�todo set do ID das salas
	public void setId(int id) {
		this.id = id;
	}

	// m�todo get do nome das salas
	public String getName() {
		return name;
	}

	// m�todo set do nome das salas
	public void setName(String name) {
		if (name.equals("") || name == null) {
			throw new NullPointerException("O nome n�o pode ser nulo!");
		} else {
			this.name = name;
		}

	}

	// m�todo get das pessoas
	public HashMap<String, ArrayList<PersonModel>> getPersons() {
		return this.periods;
	}

	// m�todo add pessoas
	public void addPerson(PersonModel p, String periods) {
		this.periods.get(periods).add(p);
	}

}
