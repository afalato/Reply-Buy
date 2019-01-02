package View;

import java.util.LinkedList;

public class Domanda  extends ElementoSondaggio {

	public Domanda(int id_Domanda, Sondaggio sondaggio, String descrizione, LinkedList<Risposta> listaRisposte) {
		super();
		Id_Domanda = id_Domanda;
		this.sondaggio = sondaggio;
		Descrizione = descrizione;
		ListaRisposte = listaRisposte;
	}
	
	

	public int getId_Domanda() {
		return Id_Domanda;
	}

	public void setId_Domanda(int id_Domanda) {
		Id_Domanda = id_Domanda;
	}

	public Sondaggio getSondaggio() {
		return sondaggio;
	}

	public void setSondaggio(Sondaggio sondaggio) {
		this.sondaggio = sondaggio;
	}

	public String getDescrizione() {
		return Descrizione;
	}

	public void setDescrizione(String descrizione) {
		Descrizione = descrizione;
	}

	public LinkedList<Risposta> getListaRisposte() {
		return ListaRisposte;
	}

	public void setListaRisposte(LinkedList<Risposta> listaRisposte) {
		ListaRisposte = listaRisposte;
	}
	
	public void addRisposta(Risposta risposta){
		if(risposta != null) {
			ListaRisposte.add(risposta);
		}
		
	}



	private int Id_Domanda;
	
	private Sondaggio sondaggio;

	private String Descrizione;

	private LinkedList<Risposta> ListaRisposte;

}
