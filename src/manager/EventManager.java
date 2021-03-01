package manager;
import views.PersonView;
import views.RoomView;
import constants.Periods;
import models.PersonModel;

public class EventManager {
	// está classe organiza o evento
	private PersonView personView; 
	private RoomView roomView;
	
	// método construtor
	public EventManager(PersonView personView, RoomView roomView) {
		this.personView = personView;
		this.roomView = roomView;
	}

	// método para organizar
	public void organizer() {
		int qtdSalas = roomView.getRooms().size();
		int cont = 0;
		for (PersonModel p : personView.getPersons()) {
			roomView.getRoom(cont).addPerson(p, Periods.FIRST);
		}
		
	}
	
}
