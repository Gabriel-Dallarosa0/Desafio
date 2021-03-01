package RoomPerson;
import java.util.HashMap;

import models.PersonModel;
import models.Room;

// está classe é a ligação entre pessoas e salas
public class RoomPerson {
	
	private PersonModel person;
	private HashMap<String, Room> rooms = new HashMap<>();
	
	// método get das pessoas
	public PersonModel getPerson() {
		return person;
	}
	
	// método set das pessoas
	public void setPerson(PersonModel person) {
		this.person = person;
	}
	
	// método get das salas
	public HashMap<String, Room> getRooms() {
		return rooms;
	}
	
	// método add salas
	public void addRoom(String period, Room room) {
		this.rooms.put(period, room);
	}
	 
	
}
