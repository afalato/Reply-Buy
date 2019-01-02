package View;

import java.util.Date;

public class UtenteRegistrato extends User {

	private String residenza;
	private float credito;
	private Date dataNascita;
	
	public UtenteRegistrato(String nome, String cognome, Date dataNascita, String residenza, String username, String pwd) {
		super(nome, cognome);
		this.residenza = residenza;
		this.credito = 10;
		this.dataNascita = dataNascita;
		super.setAccount(username, pwd);
	}

	public String getResidenza() {
		return residenza;
	}

	public void setResidenza(String residenza) {
		this.residenza = residenza;
	}

	public float getCredito() {
		return credito;
	}

	public void setCredito(float credito) {
		this.credito = credito;
	}

	public Date getDataNascita() {
		return dataNascita;
	}


	public void setDataNascita(Date dataNascita) {
		this.dataNascita = dataNascita;
	}
	
	
	
	
	

	
	
	
}
