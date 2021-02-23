package models;

public class EventRoom extends Room {
	private int capacity;

	public EventRoom(int id, String name, int capacity) {
		super(id, name);
		this.setCapacity(capacity);
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
}
