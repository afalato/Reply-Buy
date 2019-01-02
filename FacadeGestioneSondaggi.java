package View;

import java.util.LinkedList;

public class FacadeGestioneSondaggi {

	

	private static FacadeGestioneSondaggi instance;

	private GestoreRispostaSondaggi gestoreRispostaSondaggi;

	private GestoreSondaggi gestoreSondaggi;

	private GestoreBacheche gestoreBacheche;
	

	
	public static FacadeGestioneSondaggi getInstance() {
		if(instance==null) return new FacadeGestioneSondaggi();
		return instance;
	}

	private FacadeGestioneSondaggi() {
		gestoreRispostaSondaggi = GestoreRispostaSondaggi.getInstance();;
		gestoreSondaggi = GestoreSondaggi.getInstance();
		gestoreBacheche = GestoreBacheche.getInstance();
		

	}

	public BachecaUtente visualizzaBachecaUtente(UtenteRegistrato utente) {
		return gestoreBacheche.getBacheca(utente);
	}

	public Sondaggio visualizzaSondaggio(Sondaggio s) {
		return null;
	}


	public boolean creaNuovaBacheca(UtenteRegistrato u) {
		if(u != null) {
    	BachecaUtente nuovaBac = new BachecaUtente(gestoreSondaggi.getAllSondaggi(), u);
    	return  gestoreBacheche.addBacheca(nuovaBac);
		}
		return false;
	}

	public boolean salvaRispostaSondaggio(RispostaSondaggioUtente rispPreparazione) {
		return gestoreRispostaSondaggi.addRispostaSondaggio(rispPreparazione);
		
	}
 
	public int calculateValoreSondaggio(Sondaggio s) {
		return gestoreSondaggi.calculateCreditoSondaggio(s);
		
	}

}
