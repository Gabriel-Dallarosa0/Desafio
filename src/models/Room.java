
package models;

import java.util.ArrayList;

import exceptions.UnprocessableEntity;

public class Room {

	private int id, capacity;
	private String name;

	protected ArrayList<PersonModel> occupation = new ArrayList<PersonModel>();

	public Room(int id, String name, int capacity) {
		this.setId(id);
		this.setName(name);
		this.setCapacity(capacity);

	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		if (capacity < 0) {
			throw new NullPointerException("A capacidade não pode ser menor que 0!");
		} else {
			this.capacity = capacity;
		}
		
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

	public ArrayList<PersonModel> getOccupation() {
		return occupation;
	}

	
	public void addOccupation(PersonModel person) throws UnprocessableEntity {
		if (this.occupation.size() < capacity) {

			this.occupation.add(person);

		} else {
			throw new UnprocessableEntity("Sala cheia!");
		}

	}


}
