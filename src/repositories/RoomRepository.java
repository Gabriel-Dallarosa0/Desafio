package repositories;

import java.util.ArrayList;

import RoomPerson.RoomPerson;
import constants.Periods;
import constants.RoomType;
import models.PersonModel;
import models.Room;

// est� classe armazena as salas 
public class RoomRepository {

	protected ArrayList<Room> rooms = new ArrayList<Room>();

	// m�todo get das salas
	public ArrayList<Room> getRooms() {
		return rooms;
	}

	// m�todo add salas
	public void addRoom(Room room) {
		this.rooms.add(room);
	}
	
	// m�todo add pessoas
	public boolean addPerson(String roomName, PersonModel person, int period) {
		if (period == 1) {
			for (Room room : this.rooms) {
				try {
					if (room.getName().equals(roomName)) {
						room.getPersons().get(Periods.FIRST).add(person);
						return true;
					}
				} catch (NullPointerException error) {
					return false;
				}
			}
		} else if (period == 2) {
			for (Room room : this.rooms) {
				try {
					if (room.getName().equals(roomName)) {
						room.getPersons().get(Periods.SECOND).add(person);
						return true;
					}
				} catch (NullPointerException e) {
					return false;
				}
			}
		}
		return false;
	}

	// m�todo get salas por ID
	public Room getRoom(int id) {
		return this.rooms.get(id);
	}
	
	// m�todo get salas por nome
	public Room getRoom(String name) {
		for (Room room : rooms) {
			if (room.getName().equals(name)) {
				return room;
			}
		}
		return null;
	}
	
	// m�todo get capacidade das salas
	public Room getCapacityRoom(int capacity) {
		return this.rooms.get(capacity);
	}

	// m�todo get das pessoas
	public RoomPerson getPerson(String name) {
		RoomPerson roomPerson = new RoomPerson();

		for (Room room : this.rooms) {
			for (PersonModel p : room.getPersons().get(Periods.FIRST)) {
				if (p.getName().equals(name)) {
					roomPerson.setPerson(p);
					if (room.getType().equals(RoomType.COFFE_ROOM)) {
						roomPerson.addRoom(Periods.FIRST_COFFE, room);
					} else {
						roomPerson.addRoom(Periods.FIRST, room);
					}
					
					break;
				}
			}
			for (PersonModel p : room.getPersons().get(Periods.SECOND)) {
				if (p.getName().equals(name)) {
					if (room.getType().equals(RoomType.COFFE_ROOM)) {
						roomPerson.addRoom(Periods.SECOND_COFFE, room);
					} else {
						roomPerson.addRoom(Periods.SECOND, room);
					}
					
					break;
				}
			}
		}
		return roomPerson;
	}

	// m�todo set das salas
	public void setRooms(ArrayList<Room> rooms) {
		this.rooms = rooms;
	}
	
	
	
	
}
