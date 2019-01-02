package gui;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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


public class MainFrame extends JFrame{

	private static final long serialVersionUID = 1L;
	private GUIController controlleRiferimento;
	
	
	
	public MainFrame(String name){
		super(name);
		controlleRiferimento = GUIController.getInstance();
		
		
		
		
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setMinimumSize(new Dimension(1200, 800));
		this.setMaximumSize(new Dimension(1200, 800));
		this.setPreferredSize(new Dimension(1350, 800));
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));
	
		
		
		JPanel labelPanel = new JPanel();
		labelPanel.setLayout(new BoxLayout(labelPanel, BoxLayout.Y_AXIS));
		JLabel label = new JLabel("******		REPLY & BUY		******");
		JLabel labelError = new JLabel(" ");
		label.setAlignmentX(CENTER_ALIGNMENT);
		label.setFont(new Font("Arial",Font.ITALIC,22));
		labelError.setFont(new Font("Arial",Font.ITALIC,22));
		label.setForeground(SystemColor.WHITE);
		labelError.setForeground(SystemColor.RED);
		labelPanel.add(label);
		labelPanel.add(Box.createVerticalStrut(90));
		labelPanel.add(labelError);
		labelPanel.setBackground(SystemColor.DARK_GRAY);
		labelPanel.setVisible(true);
		
		
		
		//  pannello login inizio ->
		
		JPanel pannelloLogin = new JPanel();
		
		pannelloLogin.setMinimumSize(new Dimension(800, 220));
		pannelloLogin.setPreferredSize(new Dimension(800, 220));
		pannelloLogin.setMaximumSize(new Dimension(800, 220));
		 
		Border border1 = BorderFactory.createEtchedBorder(EtchedBorder.RAISED);
		pannelloLogin.setBorder(BorderFactory.createTitledBorder(border1, "Login/Registrazione"));
		
		pannelloLogin.setLayout(new BoxLayout(pannelloLogin, BoxLayout.Y_AXIS));
		 JLabel JlUsername = new JLabel ("Username");
		 JLabel JlPassword = new JLabel ("Password");
	     JPasswordField pwd = new JPasswordField (50);
	     JTextField user = new JTextField (50);
	     JButton loginB = new JButton ("Login");
	     JButton registrazioneB = new JButton ("Registrazione");
	   			
	     JlUsername.setAlignmentX(CENTER_ALIGNMENT);
	     JlPassword.setAlignmentX(CENTER_ALIGNMENT);
	    
	     pwd.setAlignmentX(CENTER_ALIGNMENT);
	     pwd.setMinimumSize(new Dimension(600, 40));
	     pwd.setPreferredSize(new Dimension(600, 40));
	     pwd.setMaximumSize(new Dimension(600, 40));
			
	     user.setAlignmentX(CENTER_ALIGNMENT);
	     user.setMinimumSize(new Dimension(600, 40));
	     user.setPreferredSize(new Dimension(600, 40));
	     user.setMaximumSize(new Dimension(600, 40));
	     	
	     	  loginB.setAlignmentX(CENTER_ALIGNMENT);
	     	 loginB.setMinimumSize(new Dimension(220, 40));
	     	loginB.setPreferredSize(new Dimension(220, 40));
	     	loginB.setMaximumSize(new Dimension(220, 40));
		     	
	     	registrazioneB.setAlignmentX(CENTER_ALIGNMENT);
	     	registrazioneB.setMinimumSize(new Dimension(220, 40));
	     	registrazioneB.setPreferredSize(new Dimension(220, 40));
	     	registrazioneB.setMaximumSize(new Dimension(220, 40));
	     	
	     	
	     	registrazioneB.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
		   controlleRiferimento.createFormRegistrazione();
	
		   dispose();
				}
			});
			     	
	     	
	     pannelloLogin.add (JlUsername);
	     pannelloLogin.add (user);
	     pannelloLogin.add (JlPassword);
	     pannelloLogin.add (pwd);
	     pannelloLogin.add (loginB);
	     pannelloLogin.add (registrazioneB);
	     
	     pannelloLogin.setAlignmentX(CENTER_ALIGNMENT);
	     pannelloLogin.setAlignmentY(TOP_ALIGNMENT);
	     
		pannelloLogin.setVisible(true);
	 // fine pannello login 
		
		
	
		JPanel pannelloProdotti = new JPanel();
		pannelloProdotti.setMinimumSize(new Dimension(800, 220));
		pannelloProdotti.setPreferredSize(new Dimension(800, 220));
		pannelloProdotti.setMaximumSize(new Dimension(800, 220));
		pannelloProdotti.setLayout(new BoxLayout(pannelloProdotti, BoxLayout.Y_AXIS));
		Border border = BorderFactory.createEtchedBorder(EtchedBorder.RAISED);
		pannelloProdotti.setBorder(BorderFactory.createTitledBorder(border, "Servizi Catalogo/Ordini"));
		
		JButton vistaCatalogo = new JButton("Visualizza catalogo prodotti");
		vistaCatalogo.setMinimumSize(new Dimension(220, 35));
		vistaCatalogo.setPreferredSize(new Dimension(220, 35));
		vistaCatalogo.setMaximumSize(new Dimension(220, 35));
		vistaCatalogo.setAlignmentX(CENTER_ALIGNMENT);
		
		vistaCatalogo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		
//		JButton vistaOrdini = new JButton("Viusalizza ordini");
//		vistaOrdini.setMinimumSize(new Dimension(220, 35));
//		vistaOrdini.setPreferredSize(new Dimension(220, 35));
//		vistaOrdini.setMaximumSize(new Dimension(220, 35));
//		vistaOrdini.setAlignmentX(CENTER_ALIGNMENT);
//		
//		vistaOrdini.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				//controllerProdotti.createFormItems();
//			}	
//		});
		
//		JButton vistaOrdiniNonEvasi = new JButton("Visualizza ordini non evasi");
//		vistaOrdiniNonEvasi.setMinimumSize(new Dimension(220, 35));
//		vistaOrdiniNonEvasi.setPreferredSize(new Dimension(220, 35));
//		vistaOrdiniNonEvasi.setMaximumSize(new Dimension(220, 35));
//		vistaOrdiniNonEvasi.setAlignmentX(CENTER_ALIGNMENT);
//		
//		vistaOrdiniNonEvasi.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//		
//			}	
//		});
		
		
		pannelloProdotti.add(vistaCatalogo);
	

		pannelloProdotti.setVisible(true);
	     pannelloProdotti.setAlignmentY(TOP_ALIGNMENT);
		
	    this.getContentPane().setBackground(SystemColor.DARK_GRAY);
		this.add(labelPanel);
		
		this.add(pannelloLogin);
		add(Box.createVerticalStrut(90));
		this.add(pannelloProdotti);

		
		this.pack();
		this.setVisible(true); 
	}
	
	
	
	
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		JFrame mainFrame=new MainFrame("Reply & Buy");
		

	}

}

