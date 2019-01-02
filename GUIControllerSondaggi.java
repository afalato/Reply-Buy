package gui;

import View.FacadeGestioneSondaggi;
import View.FacadeRegistrazione;
import View.RispostaSondaggioUtente;
import View.Sondaggio;
import View.UtenteRegistrato;

public class GUIControllerSondaggi {

	private static GUIControllerSondaggi instance = null;
	private FacadeGestioneSondaggi facadeSondaggi;
	private FacadeRegistrazione facadeRegistrazione;
	
	private GUIControllerSondaggi(){
		facadeSondaggi = FacadeGestioneSondaggi.getInstance();
		facadeRegistrazione = FacadeRegistrazione.getInstance();
	}
	
	public static synchronized GUIControllerSondaggi getInstance(){
		if(instance == null) 
		{
			System.out.println("INFO GUI -------- Prima creazione GUIControllerSondaggi");
			instance = new GUIControllerSondaggi();
			
		}
		return instance;
	}
	
	
	  public void createFormViewSondaggi(UtenteRegistrato utente){
		  
		  
		  ViewSondaggi formViewSondaggi =  new ViewSondaggi(facadeSondaggi.visualizzaBachecaUtente(utente).getListaSondaggi());
		  
			}

	public void createFormRispondiSondaggio(Sondaggio s, UtenteRegistrato u) {
		FormRispondiAsondaggio formRisp = new FormRispondiAsondaggio(s, u);
		
	}

	public boolean createNuovaRispostaASondaggio(RispostaSondaggioUtente rispPreparazione) {
		return	facadeSondaggi.salvaRispostaSondaggio(rispPreparazione);
	}
		
	public int calculateValoreSondaggio (Sondaggio s ) {
		return facadeSondaggi.calculateValoreSondaggio(s);
		
	}

	public boolean fineSondaggio(UtenteRegistrato user, Sondaggio s) {
		return facadeRegistrazione.addSaldo(s, user);
		
	}
		  
	  
	  
	
	}
