package View;
import java.util.LinkedList;

import gui.GUIControllerProdotti;



public class FacadeGestioneProdotti {

	private GUIControllerProdotti controllerRiferimento;
	private static FacadeGestioneProdotti instance = null;

	private FacadeGestioneProdotti(){
		//inizializza gestoreDB
		controllerRiferimento=null;

	}
	
	public static synchronized FacadeGestioneProdotti getInstance(){
		if(instance ==null){
			//System.out.println("Prima creazione FacadeProdotti");
			instance = new FacadeGestioneProdotti();
			
		}
		return instance;
	}
	
	
}
