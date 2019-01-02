package View;

import java.util.LinkedList;

public class BachecaUtente {
	

	public BachecaUtente(LinkedList<Sondaggio> listaSondaggi, UtenteRegistrato utenteRegistrato) {
		
		ListaSondaggi = listaSondaggi;
		UtenteRegistrato = utenteRegistrato;
	}
	
	

	public LinkedList<Sondaggio> getListaSondaggi() {
		return ListaSondaggi;
	}



	public void setListaSondaggi(LinkedList<Sondaggio> listaSondaggi) {
		ListaSondaggi = listaSondaggi;
	}



	public UtenteRegistrato getUtenteRegistrato() {
		return UtenteRegistrato;
	}



	public void setUtenteRegistrato(UtenteRegistrato utenteRegistrato) {
		UtenteRegistrato = utenteRegistrato;
	}



	public void addSondaggio(Sondaggio sondaggio) {
		
		ListaSondaggi.add(sondaggio);

	}

	public void removeSondaggio(Sondaggio sondaggio) {
		ListaSondaggi.remove(sondaggio);


	}

	public Sondaggio getSondaggio(int i) {
		return null;
	}

	private LinkedList<Sondaggio> ListaSondaggi;

	private UtenteRegistrato UtenteRegistrato;

}
