package repositories;

import java.util.ArrayList;
import models.Room;

public class RoomRepository {

	private ArrayList<Room> rooms = new ArrayList<Room>();

	public ArrayList<Room> getRooms() {
		return rooms;
	}

	public void addRoom(Room room) {
		this.rooms.add(room);
	}

	public Room getRoom(int id) {
		return this.rooms.get(id);
	}
	
	public Room getRoom(String name) {
		for (Room room : rooms) {
			if (room.getName().equals(name)) {
				return room;
			}
		}
		return null;
	}
	
	public Room getCapacityRoom(int capacity) {
		return this.rooms.get(capacity);
	}

	
	
}
