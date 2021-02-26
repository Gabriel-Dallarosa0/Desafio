package views;

import models.Room;
import repositories.RoomRepository;

public abstract class RoomView {
	
	protected RoomRepository roomRepository = new RoomRepository();
	private int id = 0;
	
	
	public int getId() {
		return id;
	}
	public void addId() {
		this.id++;
	}
	
	public abstract void addRoom(String name, int capacity);
	
	
	public Room getRoom(int id) {
		return this.roomRepository.getRoom(id);
	}
	
	public Room getRoom(String name) {
		return this.roomRepository.getRoom(name);
	}
	
	public Room getCapacityRoom(int capacity) {
		return this.roomRepository.getRoom(capacity);
	}
	

}
