package gui;

import javax.swing.JOptionPane;

import View.FacadeGestioneProdotti;


public class GUIControllerProdotti {
	
		private FacadeGestioneProdotti facadeProdotti;
		private static GUIControllerProdotti instance = null;
//		private FormScorte formScorte;
//		private FormListino formListino;
//		
//		
		
		private GUIControllerProdotti(){
			facadeProdotti=FacadeGestioneProdotti.getInstance();
		}
		
		public static synchronized GUIControllerProdotti getInstance(){
			if(instance == null){
				//System.out.println("Prima creazione GUIProdotti");
				instance = new GUIControllerProdotti();
				
			}
			return instance;
		}
		
//		public void createFormProdotti(){
//			
//			formScorte = new FormScorte(facadeProdotti.accediScorte());
//		}
		
//		public void createFormItems(){
//			
//			
//			formListino = new FormListino(facadeProdotti.accediListino());
//		}
//		
//	
//		public void createFormModificaDisponibilita(Object item){
//			FormModificaDisponibilita form = new FormModificaDisponibilita(item);
//		}
//		
//		
//		public void createFormModificaPrezzo(ElementoGestioneListino item){
//			FormModificaPrezzo form = new FormModificaPrezzo(item);
//		}
//		
//		public void updateListinoScorte(){
//			formScorte.update();
//		}
//		
//        public void updateListino(){
//			formListino.update();
//		}
        
        public void createErrorMessage(String str){
        	JOptionPane.showMessageDialog(null, str, "Errore", JOptionPane.ERROR_MESSAGE);
        }
        
        public void setErrorInfo(String info){
        	createErrorMessage(info);
        }
        
//        public void setItemSelected(Object item){
//        	createFormModificaDisponibilita(item);
//        }
        
//        public void setItemSelected(ElementoGestioneListino item){
//        	createFormModificaPrezzo(item);
//        }
//		
		
		
		
		
}
