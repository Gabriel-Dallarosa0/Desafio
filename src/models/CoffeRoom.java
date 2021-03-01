package models;

import java.util.ArrayList;

import constants.Periods;
import constants.RoomType;

public class CoffeRoom extends Room {
	
    // está classe inicia o tipo da sala
	public CoffeRoom(int id, String name) {
		super(id, name);
		super.periods.put(Periods.FIRST, new ArrayList<PersonModel>());
		super.periods.put(Periods.SECOND, new ArrayList<PersonModel>());
		super.setType(RoomType.COFFE_ROOM);
	}

}
