package models;

import java.util.ArrayList;

import constants.Periods;
import constants.RoomType;
import exceptions.UnprocessableEntity;

public class EventRoom extends Room {
	private int capacity;
	// est� classe inicia os tipos das salas
	public EventRoom(int id, String name, int capacity) {
		super(id, name);
		this.setCapacity(capacity);
		super.periods.put(Periods.FIRST, new ArrayList<PersonModel>());
		super.periods.put(Periods.SECOND, new ArrayList<PersonModel>());
		super.setType(RoomType.EVENT_ROOM);

		}


	// m�todo get da capacidade
	public int getCapacity() {
		return capacity;
	}

	// m�todo set da capacidade
	public void setCapacity(int capacity) {
		if (capacity < 0) {
			throw new NullPointerException("A capacidade n�o pode ser menor que 0!");
		} else {
			this.capacity = capacity;
		}
		
	}
	
	
}
