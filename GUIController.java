package gui;

import View.FacadeRegistrazione;
import View.Sondaggio;
import View.UtenteRegistrato;

public class GUIController{

	private FacadeRegistrazione facadeRegistrazione;
	
	
	private static GUIController instance = null;

	private GUIController(){
		facadeRegistrazione=FacadeRegistrazione.getInstance();
	}
	
	public static synchronized GUIController getInstance(){
		if(instance == null) 
		{
			System.out.println("INFO GUI -------- Prima creazione GUIController");
			instance = new GUIController();
			
		}
		return instance;
	}
	
	
	public void createUtente(UtenteRegistrato u){
		facadeRegistrazione.addNuovoUtente(u);
	
	}
	
	
	public boolean addSaldo(UtenteRegistrato u, Sondaggio s ){
		
		return facadeRegistrazione.addSaldo(s, u);
	
	}
	public void createViewHomepage(UtenteRegistrato u){
	@SuppressWarnings("unused")
	Homepage home = new Homepage(u);
	System.out.println("INFO GUI -------- Creazione Hompage per utente: " + u.getAccount().getUsername());
	}
	
  public void createFormRegistrazione(){
		
  @SuppressWarnings("unused")
  FormRegistrazione form =  new FormRegistrazione("Registrazione");
  
	}
  
  
	
	
	
	

}
