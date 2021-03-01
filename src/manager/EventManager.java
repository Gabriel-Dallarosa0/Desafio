package manager;
import views.PersonView;
import views.RoomView;
import constants.Periods;
import models.PersonModel;

public class EventManager {
	// est� classe organiza o evento
	private PersonView personView; 
	private RoomView roomView;
	
	// m�todo construtor
	public EventManager(PersonView personView, RoomView roomView) {
		this.personView = personView;
		this.roomView = roomView;
	}

	// m�todo para organizar
	public void organizer() {
		int qtdSalas = roomView.getRooms().size();
		int cont = 0;
		for (PersonModel p : personView.getPersons()) {
			roomView.getRoom(cont).addPerson(p, Periods.FIRST);
		}
		
	}
	
}
