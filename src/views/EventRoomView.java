package views;

import models.EventRoom;
import models.PersonModel;

public class EventRoomView extends RoomView{

	@Override
	public void addRoom(String name, int capacity) {
		EventRoom room = new EventRoom(super.getId(), name, capacity);
		super.roomRepository.addRoom(room);
		super.addId();
		
	}

	

	

}
