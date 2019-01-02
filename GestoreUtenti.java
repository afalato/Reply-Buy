package View;

import java.util.Iterator;
import java.util.LinkedList;

public class GestoreUtenti {
	private static GestoreUtenti instance;
	
	
//Deve Essere Sostituita con il gestore DB
	private LinkedList<UtenteRegistrato> listaUtenti;

	public static  GestoreUtenti getInstance() {
		if(instance ==  null) {
			instance  =  new GestoreUtenti();
		}
		return instance;
	}

	private GestoreUtenti() {
		listaUtenti=new LinkedList<UtenteRegistrato>();

	}

	

	public Boolean aggiungiUtente(UtenteRegistrato u) {
	boolean validate = true;
	Iterator<UtenteRegistrato> it = listaUtenti.iterator();
	while(it.hasNext()) {
		if(it.next().getAccount().getUsername().equalsIgnoreCase(u.getAccount().getUsername())){
			validate=false;
		}
		
	}
		if(validate) {
			
			listaUtenti.add(u);
			
		
		}
		return validate;
	}


	public void rimuoviUtente(UtenteRegistrato u) {
		listaUtenti.remove(u);

	}

	public void addSaldoToUser(int saldo, UtenteRegistrato user) {
		Iterator<UtenteRegistrato> it = listaUtenti.iterator();
		while(it.hasNext()) {
			if(it.next().getAccount().getUsername().equalsIgnoreCase(user.getAccount().getUsername())){
				user.setCredito(user.getCredito()+saldo);
				
			}
			
		}
	}
}
