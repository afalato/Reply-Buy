package gui;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JRadioButton;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;

import View.RispostaSondaggioUtente;
import View.Sondaggio;
import View.UtenteRegistrato;
public class FormRispondiAsondaggio extends JFrame {

	
	private static final long serialVersionUID = 1L;
private GUIControllerSondaggi controlleRiferimento;
private int contDomande = 0;
private RispostaSondaggioUtente rispPreparazione = new RispostaSondaggioUtente();
	public FormRispondiAsondaggio(Sondaggio s, UtenteRegistrato user) {
		super("Rispondi");
		controlleRiferimento= GUIControllerSondaggi.getInstance();
		rispPreparazione.setUtente(user);
		
		
		// opzioni Jframe 
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setMinimumSize(new Dimension(1200, 800));
		this.setMaximumSize(new Dimension(1200, 800));
		this.setPreferredSize(new Dimension(1350, 800));
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));
	
		
		//Panel introduzione
		JPanel labelPanel = new JPanel();
		labelPanel.setLayout(new BoxLayout(labelPanel, BoxLayout.Y_AXIS));
		JLabel label = new JLabel("******	RISPOSTA A NUOVO SONDAGGIO	******");
		JLabel labelError = new JLabel(" COMPLETA TUTTE LE DOMANDE");
		label.setAlignmentX(CENTER_ALIGNMENT);
		labelError.setAlignmentX(CENTER_ALIGNMENT);
		label.setFont(new Font("Arial",Font.ITALIC,22));
		label.setForeground(SystemColor.WHITE);
		labelError.setForeground(SystemColor.WHITE);
		labelError.setFont(new Font("Arial",Font.ITALIC,18));
		labelPanel.setBackground(SystemColor.DARK_GRAY);
		labelPanel.add(Box.createVerticalStrut(10));
		labelPanel.add(label);
		labelPanel.add(Box.createVerticalStrut(90));
		labelPanel.add(labelError);
		labelPanel.setVisible(true);
		
		
		
		//  pannello rispondi
		JPanel pannelloRispondi= new JPanel();
		Border border1 = BorderFactory.createEtchedBorder(EtchedBorder.RAISED);
		pannelloRispondi.setBorder(BorderFactory.createTitledBorder(border1, "Rispondi"));
		 
		pannelloRispondi.setLayout(new BoxLayout(pannelloRispondi, BoxLayout.Y_AXIS));
		pannelloRispondi.setBackground(SystemColor.window);
		
	
		JPanel panelRiciclabile = new JPanel();
		panelRiciclabile.setMinimumSize(new Dimension(480, 350));
		panelRiciclabile.setPreferredSize(new Dimension(480, 350));
		panelRiciclabile.setMaximumSize(new Dimension(480, 350));
		 
		Border borderR = BorderFactory.createEtchedBorder(EtchedBorder.RAISED);
		panelRiciclabile.setBorder(BorderFactory.createTitledBorder(borderR, "Domanda"));
		
		panelRiciclabile.setLayout(new BoxLayout(panelRiciclabile, BoxLayout.Y_AXIS));
		panelRiciclabile.setBackground(SystemColor.window);
		
		JProgressBar pbProgressBar2 = new JProgressBar( );
		pbProgressBar2.setMaximum( s.getDomande().size());
		pbProgressBar2.setValue( contDomande+1 );
		pbProgressBar2.setMinimumSize(new Dimension(460, 10));
		pbProgressBar2.setPreferredSize(new Dimension(460, 10));
		pbProgressBar2.setMaximumSize(new Dimension(460, 10));
		
		JLabel labelAvanzamento = new JLabel("Avanzamento "+ pbProgressBar2.getString());
		 JLabel domandaDesc = new JLabel (s.getDomande().get(contDomande).getDescrizione());
         JRadioButton but1 = new JRadioButton(s.getDomande().get(contDomande).getListaRisposte().get(0).getDescrizione());
         JRadioButton but2 = new JRadioButton(s.getDomande().get(contDomande).getListaRisposte().get(1).getDescrizione());
         JRadioButton but3 = new JRadioButton(s.getDomande().get(contDomande).getListaRisposte().get(2).getDescrizione());
         ButtonGroup grupRatio = new ButtonGroup();
         grupRatio.add(but1);
         grupRatio.add(but2);
         grupRatio.add(but3);
        
         
	     JButton next = new JButton ("Successiva");
	     JButton fine = new JButton ("Fine");
	     fine.setEnabled(true);
	     fine.setEnabled(false);
	     
	     	
	   
	     
	 	ImageIcon icon = new ImageIcon("imgQuestion.png"); 
		JLabel img = new JLabel();
		img.setIcon(icon );
		
	    
	     	panelRiciclabile.add(Box.createVerticalStrut(20));
	     	panelRiciclabile.add (domandaDesc);
	     	panelRiciclabile.add(Box.createVerticalStrut(15));
	     	panelRiciclabile.add(but1);
	     	panelRiciclabile.add(Box.createVerticalStrut(10));
	     	panelRiciclabile.add(but2);
	     	panelRiciclabile.add(Box.createVerticalStrut(10));
	     	panelRiciclabile.add(but3);
	     	panelRiciclabile.add(Box.createVerticalStrut(40));
	     	panelRiciclabile.add (next);
	     	panelRiciclabile.add(Box.createVerticalStrut(10));
	     	panelRiciclabile.add (fine);
	     	img.setAlignmentX(CENTER_ALIGNMENT);
	     	pbProgressBar2.setAlignmentX(CENTER_ALIGNMENT);
	     	panelRiciclabile.setAlignmentX(CENTER_ALIGNMENT);
	     	labelAvanzamento.setAlignmentX(CENTER_ALIGNMENT);
	     	
	    pannelloRispondi.add(img);
	    pannelloRispondi.add(labelAvanzamento);
	    pannelloRispondi.add (pbProgressBar2);
	    pannelloRispondi.add(panelRiciclabile);
	    pannelloRispondi.setAlignmentX(CENTER_ALIGNMENT);
	     	
	     	panelRiciclabile.setVisible(true);
	 // fine 
	     	
	     
	     	
	     	// il click sul bottone next effettua un riciclo delle componenti meantendo i contenuti dell'interazione in una variabile
	     next.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
		if(but1.isSelected() || but2.isSelected() || but3.isSelected()) {
			rispPreparazione.setDomanda(s.getDomande().get(contDomande));
		
			if(but1.isSelected()) {
				rispPreparazione.setRisposta(s.getDomande().get(contDomande).getListaRisposte().get(0));
				rispPreparazione.setDataOraRisposta(new Date());
			}else { 
				if(but2.isSelected()) {
					rispPreparazione.setRisposta(s.getDomande().get(contDomande).getListaRisposte().get(1));
					rispPreparazione.setDataOraRisposta(new Date());

				}else {
					rispPreparazione.setRisposta(s.getDomande().get(contDomande).getListaRisposte().get(2));
					rispPreparazione.setDataOraRisposta(new Date());
				}
			}
			controlleRiferimento.createNuovaRispostaASondaggio(rispPreparazione);
				if(++contDomande <s.getDomande().size() ){


		
				 pbProgressBar2.setValue(contDomande+1);
			     labelAvanzamento.setText("Avanzamento " +pbProgressBar2.getString());
				 domandaDesc.setText(s.getDomande().get(contDomande).getDescrizione()); 
		         but1.setText(s.getDomande().get(contDomande).getListaRisposte().get(0).getDescrizione());
		         but2.setText(s.getDomande().get(contDomande).getListaRisposte().get(1).getDescrizione());
		         but3.setText(s.getDomande().get(contDomande).getListaRisposte().get(2).getDescrizione());
		         	but1.setSelected(false);
		         	but2.setSelected(false);
		         	but3.setSelected(false);
		         
				}
				
             next.setEnabled(false);
             fine.setEnabled(true);
					
				}
			}
			});
	     
	     fine.addActionListener(new ActionListener() {
				
	 				@Override
	 				public void actionPerformed(ActionEvent e) {
	 					if(but1.isSelected() || but2.isSelected() || but3.isSelected()) {
	 						rispPreparazione.setDomanda(s.getDomande().get(contDomande));
	 					
	 						if(but1.isSelected()) {
	 							rispPreparazione.setRisposta(s.getDomande().get(contDomande).getListaRisposte().get(0));
	 							rispPreparazione.setDataOraRisposta(new Date());
	 						}else { 
	 							if(but2.isSelected()) {
	 								rispPreparazione.setRisposta(s.getDomande().get(contDomande).getListaRisposte().get(1));
	 								rispPreparazione.setDataOraRisposta(new Date());

	 							}else {
	 								rispPreparazione.setRisposta(s.getDomande().get(contDomande).getListaRisposte().get(2));
	 								rispPreparazione.setDataOraRisposta(new Date());
	 							}
	 						}
	 				// controllo ultima risposta più accredito saldo		
	 				if(	controlleRiferimento.createNuovaRispostaASondaggio(rispPreparazione) && controlleRiferimento.fineSondaggio(user ,s)){
	 					
	 					
	 					JOptionPane.showMessageDialog(new JFrame(), "Ti sono stati versati \n"+ controlleRiferimento.calculateValoreSondaggio(s)+ " CREDITI", "Sondaggio Completato!!!",
	 					        JOptionPane.INFORMATION_MESSAGE);
	 					dispose();

	 				}
	 					}
	 					

	 						
	 				}
	 			});
			     	
	
	 	
	  
	
	    this.getContentPane().setBackground(SystemColor.darkGray);
		this.add(labelPanel);
		this.add(pannelloRispondi);
		this.pack();
		this.setVisible(true); 
}
}
