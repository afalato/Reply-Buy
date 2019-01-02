package View;


import gui.GUIController;
public class FacadeRegistrazione {
	
	private GestoreUtenti gestUtenti;
	private FacadeGestioneSondaggi facadeGestioneSondaggi;

	private static FacadeRegistrazione instance;
	
	
	
	private FacadeRegistrazione() {
	gestUtenti = GestoreUtenti.getInstance();
	facadeGestioneSondaggi = FacadeGestioneSondaggi.getInstance();


	}
	
	public static FacadeRegistrazione getInstance() {
		if(instance ==  null ) {
			instance = new FacadeRegistrazione();
		}
		
	return instance;
	}




/* viene chiamato da formRegistrazione in particolare dal button registrati
 * se l'aggiunta del nuovo utente e il caricamento della nuova bacheca
 * avviene con successo  viene avviata l'Hompage
 * altrimenti viene riavviato il form di registrazione
*/
	public void addNuovoUtente(UtenteRegistrato u) {
    if(gestUtenti.aggiungiUtente(u)) {
    	
  	
     	if(facadeGestioneSondaggi.creaNuovaBacheca(u)) {
    		GUIController.getInstance().createViewHomepage(u);
    		
    	}	else {
    		GUIController.getInstance().createFormRegistrazione();
    		}	
    }else
	GUIController.getInstance().createFormRegistrazione(); 
	}

	
	public boolean addSaldo(Sondaggio s, UtenteRegistrato user) {
		
			gestUtenti.addSaldoToUser(FacadeGestioneSondaggi.getInstance().calculateValoreSondaggio(s), user);

			return true;
	}

}
