package View;

import java.util.Date;

public class RispostaSondaggioUtente {

	private UtenteRegistrato Utente;

	private Date DataOraRisposta;

	private Sondaggio sondaggio;

	private Risposta risposta;

	private Domanda  domanda ;
	
	
	
	public RispostaSondaggioUtente() {
     new RispostaSondaggioUtente(null, null, null, null, null);
	}

	private RispostaSondaggioUtente(UtenteRegistrato utente, Date dataOraRisposta, Sondaggio sondaggio,
			Risposta risposta, Domanda domanda) {
		Utente = utente;
		DataOraRisposta = dataOraRisposta;
		this.sondaggio = sondaggio;
		this.risposta = risposta;
		this.domanda = domanda;
	}

	public UtenteRegistrato getUtente() {
		return Utente;
	}

	public void setUtente(UtenteRegistrato utente) {
		Utente = utente;
	}

	public Date getDataOraRisposta() {
		return DataOraRisposta;
	}

	public void setDataOraRisposta(Date dataOraRisposta) {
		DataOraRisposta = dataOraRisposta;
	}

	public Sondaggio getSondaggio() {
		return sondaggio;
	}

	public void setSondaggio(Sondaggio sondaggio) {
		this.sondaggio = sondaggio;
	}

	public Risposta getRisposta() {
		return risposta;
	}

	public void setRisposta(Risposta risposta) {
		this.risposta = risposta;
	}

	public Domanda getDomanda() {
		return domanda;
	}

	public void setDomanda(Domanda domanda) {
		this.domanda = domanda;
	}

	@Override
	public String toString() {
		return "RispostaSondaggioUtente [Utente=" + Utente + ", DataOraRisposta=" + DataOraRisposta + ", sondaggio="
				+ sondaggio + ", risposta=" + risposta + ", domanda=" + domanda + "]";
	}
	
	
	

}
