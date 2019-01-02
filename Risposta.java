package View;

public class Risposta extends ElementoSondaggio {
	
	public Risposta(int id_Risposta, Domanda domanda, Sondaggio sondaggio, int punti, String descrizione) {
		super();
		Id_Risposta = id_Risposta;
		this.domanda = domanda;
		this.sondaggio = sondaggio;
		Punti = punti;
		Descrizione = descrizione;
	}
	
	

	public int getId_Risposta() {
		return Id_Risposta;
	}

	public void setId_Risposta(int id_Risposta) {
		Id_Risposta = id_Risposta;
	}

	public Domanda getDomanda() {
		return domanda;
	}

	public void setDomanda(Domanda domanda) {
		this.domanda = domanda;
	}

	public Sondaggio getSondaggio() {
		return sondaggio;
	}

	public void setSondaggio(Sondaggio sondaggio) {
		this.sondaggio = sondaggio;
	}

	public int getPunti() {
		return Punti;
	}

	public void setPunti(int punti) {
		Punti = punti;
	}

	public String getDescrizione() {
		return Descrizione;
	}

	public void setDescrizione(String descrizione) {
		Descrizione = descrizione;
	}



	private int Id_Risposta;
	
	private Domanda domanda;
	
	private Sondaggio sondaggio;

	private int Punti;

	private String Descrizione;

}
