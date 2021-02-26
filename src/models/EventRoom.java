package models;

import exceptions.UnprocessableEntity;

public class EventRoom extends Room {
	private int capacity;

	public EventRoom(int id, String name, int capacity) {
		super(id, name, capacity);

	}


}
