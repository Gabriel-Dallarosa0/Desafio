
package models;

import java.util.ArrayList;
import java.util.HashMap;

import exceptions.UnprocessableEntity;
// está classe é o modelo para as salas
public class Room {

	private int id;
	private String name, type;

	protected HashMap<String, ArrayList<PersonModel>> periods = new HashMap<String, ArrayList<PersonModel>>();

	// método construtor das salas
	public Room(int id, String name) {
		this.setId(id);
		this.setName(name);

	}

	// método get dos tipos das salas
	public String getType() {
		return type;
	}

	// método set dos tipos das salas
	public void setType(String type) {
		this.type = type;
	}

	// método get do ID das salas
	public int getId() {
		return id;
	}
 
	// método set do ID das salas
	public void setId(int id) {
		this.id = id;
	}

	// método get do nome das salas
	public String getName() {
		return name;
	}

	// método set do nome das salas
	public void setName(String name) {
		if (name.equals("") || name == null) {
			throw new NullPointerException("O nome não pode ser nulo!");
		} else {
			this.name = name;
		}

	}

	// método get das pessoas
	public HashMap<String, ArrayList<PersonModel>> getPersons() {
		return this.periods;
	}

	// método add pessoas
	public void addPerson(PersonModel p, String periods) {
		this.periods.get(periods).add(p);
	}

}
