package View;



import java.util.Iterator;
import java.util.LinkedList;

public class GestoreBacheche {

	private static GestoreBacheche instance;
	
	
//Da Sostituire con il Gestore db
	private LinkedList<BachecaUtente> listaBacheche;

	public static GestoreBacheche getInstance() {
		
		if(instance == null) {
		instance = new GestoreBacheche();	
		}
		
		return instance;
	}

	public boolean addBacheca(BachecaUtente bacheca) {
		if(bacheca != null) {
			listaBacheche.add(bacheca);
			return true;
		}
		return false;

	}

	public void removeBacheca(BachecaUtente bacheca) {

	}

	public void updateBacheca(BachecaUtente bacheca) {

	}

	private GestoreBacheche() {
		listaBacheche = new LinkedList<BachecaUtente>();

	}

	public BachecaUtente getBacheca(UtenteRegistrato utente) {
		Iterator<BachecaUtente> it = listaBacheche.iterator();
		while (it.hasNext()) {
			BachecaUtente bac = it.next();
			if (bac.getUtenteRegistrato().getAccount().getUsername().equalsIgnoreCase(utente.getAccount().getUsername())){
				return bac;
			}
		}
		return null;
	}
}
