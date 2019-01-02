package View;

import java.util.LinkedList;

import javax.swing.JFrame;

import gui.GUIController;


public class FacadeGestioneOrdini {
	private GUIController controllerRiferimento;
	
	private static FacadeGestioneOrdini instance = null;
	
	public static synchronized FacadeGestioneOrdini getInstance(){
		if (instance == null){
			//System.out.println("Prima creazione FacadeOrdini");
			instance = new FacadeGestioneOrdini();
			
		}
			instance = new FacadeGestioneOrdini();
		return instance;
	}

}
