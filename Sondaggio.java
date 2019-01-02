package View;

import java.util.LinkedList;

public class Sondaggio extends ElementoSondaggio {
	
	

	public Sondaggio(int id_Sondaggio, String descrizione, LinkedList<Domanda> domande) {
		super();
		Id_Sondaggio = id_Sondaggio;
		Descrizione = descrizione;
		this.domande = domande;
	}
	
	

	public int getId_Sondaggio() {
		return Id_Sondaggio;
	}

	public void setId_Sondaggio(int id_Sondaggio) {
		Id_Sondaggio = id_Sondaggio;
	}

	public String getDescrizione() {
		return Descrizione;
	}

	public void setDescrizione(String descrizione) {
		Descrizione = descrizione;
	}

	public LinkedList<Domanda> getDomande() {
		return domande;
	}

	public void setDomande(LinkedList<Domanda> domande) {
		this.domande = domande;
	}

	public void add(ElementoSondaggio component) {

	}

	public boolean remove(ElementoSondaggio component) {
		return false;
	}

	public ElementoSondaggio getChild(int index) {
		return null;
	}

	
	private int Id_Sondaggio;

	private String Descrizione;
	
	private LinkedList<Domanda> domande;


}
