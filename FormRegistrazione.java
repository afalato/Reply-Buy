package gui;


import java.awt.Dimension;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;


import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;

import View.UtenteRegistrato;

public class FormRegistrazione extends JFrame{


	private static final long serialVersionUID = 1L;
	private GUIController controlleRiferimento;
	
	public FormRegistrazione(String name){
		super(name);
		controlleRiferimento= GUIController.getInstance();
			
		
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setMinimumSize(new Dimension(1200, 800));
		this.setMaximumSize(new Dimension(1200, 800));
		this.setPreferredSize(new Dimension(1350, 800));
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));
	
		
		
		JPanel labelPanel = new JPanel();
		labelPanel.setLayout(new BoxLayout(labelPanel, BoxLayout.Y_AXIS));
		JLabel label = new JLabel("******	REGISTRAZIONE NUOVO UTENTE	******");
		JLabel labelError = new JLabel(" COMPILA IL FORM");
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
		
		
		
		//  pannello registrazione inizio 
		
		JPanel pannelloLogin = new JPanel();
		pannelloLogin.setMinimumSize(new Dimension(780, 550));
		pannelloLogin.setPreferredSize(new Dimension(780, 550));
		pannelloLogin.setMaximumSize(new Dimension(780, 550));
		 
		Border border1 = BorderFactory.createEtchedBorder(EtchedBorder.RAISED);
		pannelloLogin.setBorder(BorderFactory.createTitledBorder(border1, "Login/Registrazione"));
		
		pannelloLogin.setLayout(new BoxLayout(pannelloLogin, BoxLayout.Y_AXIS));
		pannelloLogin.setBackground(SystemColor.window);
		
		 
		
		 JLabel JlUsername = new JLabel ("Username");
		 JLabel JlPassword = new JLabel ("Password");
		 JLabel JlNome = new JLabel ("Nome");
		 JLabel JlCognome= new JLabel ("Cognome");
		 JLabel JlData = new JLabel ("Data di nascita: DD-MM-YYYY");
		 JLabel JlResidenza = new JLabel ("Residenza (CAP - Provincia - Città - Via - Numero Civico)");
	     JPasswordField pwd = new JPasswordField (50);
	     JTextField user = new JTextField (50);
	     JTextField nome = new JTextField (50);
	     JTextField cognome = new JTextField (50);
	     JTextField residenza = new JTextField (200);
	     JTextField data = new JTextField (50);
	     
	     JButton registratiB = new JButton ("Registrati");
	     JButton cancellaB = new JButton ("Svuota campi");
	   			
	     JlUsername.setAlignmentX(CENTER_ALIGNMENT);
	     JlPassword.setAlignmentX(CENTER_ALIGNMENT);
	     JlNome.setAlignmentX(CENTER_ALIGNMENT);
	     JlCognome.setAlignmentX(CENTER_ALIGNMENT);
	     JlData.setAlignmentX(CENTER_ALIGNMENT);
	     JlResidenza.setAlignmentX(CENTER_ALIGNMENT);
	   
	        pwd.setAlignmentX(CENTER_ALIGNMENT);
			pwd.setMinimumSize(new Dimension(600, 40));
			pwd.setPreferredSize(new Dimension(600, 40));
			pwd.setMaximumSize(new Dimension(600, 40));
			
			nome.setAlignmentX(CENTER_ALIGNMENT);
			nome.setMinimumSize(new Dimension(600, 40));
			nome.setPreferredSize(new Dimension(600, 40));
			nome.setMaximumSize(new Dimension(600, 40));
			
			cognome.setAlignmentX(CENTER_ALIGNMENT);
			cognome.setMinimumSize(new Dimension(600, 40));
			cognome.setPreferredSize(new Dimension(600, 40));
			cognome.setMaximumSize(new Dimension(600, 40));
			
			residenza.setAlignmentX(CENTER_ALIGNMENT);
			residenza.setMinimumSize(new Dimension(600, 40));
			residenza.setPreferredSize(new Dimension(600, 40));
			residenza.setMaximumSize(new Dimension(600, 40));
			
			data.setAlignmentX(CENTER_ALIGNMENT);
			data.setMinimumSize(new Dimension(600, 40));
			data.setPreferredSize(new Dimension(600, 40));
			data.setMaximumSize(new Dimension(600, 40));
			
	        user.setAlignmentX(CENTER_ALIGNMENT);
	     	user.setMinimumSize(new Dimension(600, 40));
	     	user.setPreferredSize(new Dimension(600, 40));
	     	user.setMaximumSize(new Dimension(600, 40));
	     	
	     	registratiB.setAlignmentX(CENTER_ALIGNMENT);
	     	registratiB.setMinimumSize(new Dimension(220, 40));
	     	registratiB.setPreferredSize(new Dimension(220, 40));
	     	registratiB.setMaximumSize(new Dimension(220, 40));
		    

	     	cancellaB.setAlignmentX(CENTER_ALIGNMENT);
	     	cancellaB.setMinimumSize(new Dimension(220, 40));
	     	cancellaB.setPreferredSize(new Dimension(220, 40));
	     	cancellaB.setMaximumSize(new Dimension(220, 40));
	     	
	     	
	     	
	     	
	     	
	     	registratiB.addActionListener(new ActionListener() {
				
				@SuppressWarnings("deprecation")
				@Override
				public void actionPerformed(ActionEvent e) {
					
					SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-YYYY");
					
					UtenteRegistrato u;
					try {
						
						u = new UtenteRegistrato(nome.getText(), cognome.getText(),	sdf.parse(data.getText()), residenza.getText(), user.getText(), pwd.getText());

					
					} catch (ParseException e1) {
					
						System.err.println("Data non valida");
						u=null;
					}
					
					if(u!=null) controlleRiferimento.createUtente(u);
			     	dispose();

						
				}
			});
			     	
	
	     	cancellaB.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
		
				}
			});
			     	
	     pannelloLogin.add (JlUsername);
	     pannelloLogin.add (user);
	     pannelloLogin.add (JlPassword);
	     pannelloLogin.add (pwd);
	     pannelloLogin.add (JlNome);
	     pannelloLogin.add (nome);
	     pannelloLogin.add (JlCognome);
	     pannelloLogin.add (cognome);
	     pannelloLogin.add (JlData);
	     pannelloLogin.add (data);
	     pannelloLogin.add (JlResidenza);
	     pannelloLogin.add (residenza);
	     pannelloLogin.add(Box.createVerticalStrut(90));
	     pannelloLogin.add (registratiB);
	     pannelloLogin.add (cancellaB);
	     
	     pannelloLogin.setAlignmentX(CENTER_ALIGNMENT);
	     pannelloLogin.setAlignmentY(TOP_ALIGNMENT);
	     
	     pannelloLogin.setVisible(true);
	 // fine pannello registrazione
	
	    this.getContentPane().setBackground(SystemColor.darkGray);
		this.add(labelPanel);
		this.add(pannelloLogin);
		this.pack();
		this.setVisible(true); 
	}
	
	
	
	


	}

	
	
	

