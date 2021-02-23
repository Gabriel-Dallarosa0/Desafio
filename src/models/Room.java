
package models;

public class Room {

	private int id;
	private String name;

	private PersonModel[] occupation;

	public Room(int id, String name) {
		this.setId(id);
		this.setName(name);

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
		this.name = name;
	}

	public PersonModel[] getOccupation() {
		return occupation;
	}

	public void setOccupation(PersonModel[] occupation) {
		this.occupation = occupation;
	}

}
