package views;

import java.util.ArrayList;

import RoomPerson.RoomPerson;
import constants.Periods;
import models.CoffeRoom;
import models.EventRoom;
import models.PersonModel;
import models.Room;
import repositories.RoomRepository;

// está classe faz a ligação das salas com a interface
public class RoomView {

	private int id = 0;

	// método get ID
	public int getId() {
		return id;
	}

	// método set ID
	public void addId() {
		this.id++;
	}

	private PersonView personView = new PersonView();

	private RoomRepository roomRepository = new RoomRepository();

	// // método add salas de evento
	public void addRoom(String name, int capacity) {
		EventRoom room = new EventRoom(this.getId(), name, capacity);
		this.addId();
		this.roomRepository.addRoom(room);

	}

	// método add salas cafe
	public void addRoom(String name) {
		CoffeRoom room = new CoffeRoom(this.getId(), name);
		this.addId();
		this.roomRepository.addRoom(room);

	}

	// método get das pessoas
	public String getPerson(String name) {
		RoomPerson roomPerson = this.roomRepository.getPerson(name);

		String namePerson, roomStage1, roomStage2, roomCoffe, periodCoffe;

		if (roomPerson != null) {
			namePerson = roomPerson.getPerson().getName();
			roomStage1 = roomPerson.getRooms().get(Periods.FIRST).getName();
			roomStage2 = roomPerson.getRooms().get(Periods.SECOND).getName();
			try {
				roomCoffe = roomPerson.getRooms().get(Periods.FIRST_COFFE).getName();
				periodCoffe = "Primeiro";
			} catch (NullPointerException e) {
				roomCoffe = roomPerson.getRooms().get(Periods.SECOND_COFFE).getName();
				periodCoffe = "Segundo";
			}

			return "Nome: " + namePerson + " - Sala Primeira Etapa: " + roomStage1 + " - Sala Segunda Etapa: "
					+ roomStage2 + "Sala de Café: " + roomCoffe + " - Periodo do Café: " + periodCoffe;

		} else {
			return "Pessoa não encontrada!";
		}

	}

	// método add pessoas
	public void addPerson(String name, String roomName, int periods) {

		Room room = roomRepository.getRoom(roomName);
		String stage;

		if (periods == 1) {
			stage = Periods.FIRST;
		} else if (periods == 2) {
			stage = Periods.SECOND;
		} else {
			throw new NullPointerException("Periodo Inválido!");
		}

		if (room != null) {
			PersonModel person = personView.getPerson(name);
			if (person != null) {
				room.addPerson(person, stage);
			} else {
				throw new NullPointerException("Pessoa não encontrada!");
			}

		} else {
			throw new NullPointerException("Sala não encontrada!");
		}
	}

	// método get das salas por nome
	public String getRoom(String name) {
		String str = "";
		Room room = roomRepository.getRoom(name);
		if (room != null) {
			str = str + "Primeira Etapa /n";
			for (PersonModel p : room.getPersons().get(Periods.FIRST)) {
				str = str + p.getName() + "/n";
				}
			str = str + "Segunda Etapa /n";
			for (PersonModel p : room.getPersons().get(Periods.SECOND)) {
				str = str + p.getName() + "/n";
				
				
			}
		}
		return str;
	}

	// método get das salas
	public ArrayList<Room> getRooms() {
		return roomRepository.getRooms();
	}
	
	// método get das slas por ID
	public Room getRoom(int id) {
		return roomRepository.getRoom(id);
		
	}
	
}
