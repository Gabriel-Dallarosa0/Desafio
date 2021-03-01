package RoomPerson;
import java.util.HashMap;

import models.PersonModel;
import models.Room;

// est� classe � a liga��o entre pessoas e salas
public class RoomPerson {
	
	private PersonModel person;
	private HashMap<String, Room> rooms = new HashMap<>();
	
	// m�todo get das pessoas
	public PersonModel getPerson() {
		return person;
	}
	
	// m�todo set das pessoas
	public void setPerson(PersonModel person) {
		this.person = person;
	}
	
	// m�todo get das salas
	public HashMap<String, Room> getRooms() {
		return rooms;
	}
	
	// m�todo add salas
	public void addRoom(String period, Room room) {
		this.rooms.put(period, room);
	}
	 
	
}
