package views;

import models.CoffeRoom;
import models.EventRoom;

public class CoffeRoomView extends RoomView{

	@Override
	public void addRoom(String name, int capacity ) {
		CoffeRoom room = new CoffeRoom(super.getId(), name, capacity);
		super.roomRepository.addRoom(room);
		super.addId();
		
	}
}
