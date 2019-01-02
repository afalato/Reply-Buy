package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.table.DefaultTableModel;

import View.Domanda;
import View.Risposta;
import View.Sondaggio;
import View.UtenteRegistrato;

import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.LinkedList;

import javax.swing.JTabbedPane;
import javax.swing.JTable;

public class Homepage extends JFrame{

private static final long serialVersionUID = 1L;
private GUIController controllerRiferimento;

private GUIControllerSondaggi controllerSondaggi;	
	
	public Homepage(UtenteRegistrato u) {
	super("homepage");
	
	controllerRiferimento = GUIController.getInstance(); 
	controllerSondaggi = GUIControllerSondaggi.getInstance();
	
	
	JPanel contentPane;
	JTabbedPane tabbedPane;
	JPanel panelAccount;
	
	
	this.setMinimumSize(new Dimension(1200, 800));
	this.setMaximumSize(new Dimension(1200, 800));
	this.setPreferredSize(new Dimension(1350, 800));
	this.setResizable(false);
	this.setLocationRelativeTo(null);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	contentPane = new JPanel();
	contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	contentPane.setLayout(new BorderLayout(0, 0));
	
		
		// BARRA INFO 
		JPanel panelInfo = new JPanel();
		panelInfo.setLayout(new BoxLayout(panelInfo, BoxLayout.X_AXIS));
		JLabel lbl = new JLabel("Username: "+ u.getAccount().getUsername() + " 			Saldo: "+u.getCredito());
		Border border1 = BorderFactory.createEtchedBorder(EtchedBorder.RAISED);
		lbl.setBorder(BorderFactory.createTitledBorder(border1, "INFO"));
		lbl.setAlignmentX(CENTER_ALIGNMENT);
		JButton refresh = new JButton("Refresh");
		refresh.setForeground(Color.blue);
		JButton logout = new JButton("Logout");
		logout.setForeground(Color.red);
		logout.setAlignmentY(CENTER_ALIGNMENT);
		refresh.setAlignmentY(CENTER_ALIGNMENT);
		panelInfo.add(lbl);
		panelInfo.add(refresh);
		panelInfo.add(logout);
		contentPane.add(panelInfo, BorderLayout.NORTH);
		// FINE BARRA INFO
		
		
		
		//PANNELLO CENTRALE MENU 
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);		
		contentPane.add(tabbedPane, BorderLayout.CENTER);
		
		//INIZIO CONTENUTO BACHECA SONDAGGI
		JPanel panelBacheca = new JPanel();
		tabbedPane.addTab("Bacheca Sondaggi", null, panelBacheca, null);
		panelBacheca.setLayout(new BoxLayout(panelBacheca, BoxLayout.Y_AXIS));
		
		
	
		JLabel label = new JLabel("Benvenuto nella bacheca sondaggi, per accumulare punti seleziona un sondaggio e rispondi a tutte le domande");
		label.setAlignmentX(CENTER_ALIGNMENT);
		label.setFont(new Font("Arial",Font.ITALIC,22));
		label.setForeground(SystemColor.WHITE);
		panelBacheca.setBackground(SystemColor.DARK_GRAY);
	
		ImageIcon icon = new ImageIcon("imgQuestion.png"); 
		JLabel img = new JLabel();
		img.setIcon(icon );
		img.setAlignmentX(CENTER_ALIGNMENT);
		panelBacheca.add(Box.createVerticalStrut(20));
		panelBacheca.add(img);
		panelBacheca.add(Box.createVerticalStrut(20));
		panelBacheca.add(label);
		panelBacheca.add(Box.createVerticalStrut(30));
		panelBacheca.setVisible(true);

		
		Border borderTable = BorderFactory.createEtchedBorder(EtchedBorder.RAISED);
		
		JTable listaSondaggi = new JTable();
		listaSondaggi.setSelectionMode(0);
		DefaultTableModel tableModelListaSondaggi = new DefaultTableModel(0, 0) {
			private static final long serialVersionUID = 1L;

			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
				}
			};
		String intestazione[] = new String[] { "Nome Sondaggio", "Guadagno"};
		tableModelListaSondaggi.setColumnIdentifiers(intestazione);
		listaSondaggi.setModel(tableModelListaSondaggi);
		listaSondaggi.getTableHeader().setFont(new Font("Arial", Font.BOLD, 14));
		listaSondaggi.setGridColor(Color.LIGHT_GRAY);
		//
		//
		LinkedList<Sondaggio> sondaggi = new LinkedList<Sondaggio>();
        Sondaggio s1 = new Sondaggio(1, "Sport", null);
		
		Domanda d1  = new Domanda(1, s1, "Quale sport tra quelli elencati preferisci?", null);
		Risposta r1 = new Risposta(1, d1, s1, 1, "Calcio");
		Risposta r2 = new Risposta(2, d1, s1, 1, "Tennis");
		Risposta r3 = new Risposta(3, d1, s1, 1, "Basket");
		Domanda d2  = new Domanda(2, s1, "Quanati giorni a settimana svolgi attività sportive", null);
		Risposta r12 = new Risposta(1, d2, s1, 1, "Nemmeno un giorno");
		Risposta r22 = new Risposta(2, d2, s1, 1, "Un solo giorno");
		Risposta r32 = new Risposta(3, d2, s1, 1, "Due o più giorni");
	
		LinkedList<Risposta> risposte = new LinkedList<Risposta>();
		risposte.add(r1);
		risposte.add(r2);
		risposte.add(r3);
		
		LinkedList<Risposta> risposte1 = new LinkedList<Risposta>();
		risposte1.add(r12);
		risposte1.add(r22);
		risposte1.add(r32);
		
		d1.setListaRisposte(risposte);
		d2.setListaRisposte(risposte1);
		
		LinkedList<Domanda> domande = new LinkedList<Domanda>();
		domande.add(d1);
		domande.add(d2);
		
		s1.setDomande(domande);
		sondaggi.add(s1);
		//
		//
		for(Sondaggio s : sondaggi){
			
			tableModelListaSondaggi.addRow(new Object[]{s.getDescrizione(), ""+ controllerSondaggi.calculateValoreSondaggio(s)});
		}
	
		
		JScrollPane scrollPaneLista = new JScrollPane(listaSondaggi);
		JPanel listaPanel = new JPanel();
		listaPanel.setBorder(BorderFactory.createTitledBorder(borderTable, "Lista Sondaggi"));
		listaPanel.setLayout(new BoxLayout(listaPanel, BoxLayout.Y_AXIS));
		listaPanel.add(scrollPaneLista);
		listaPanel.setMinimumSize(new Dimension(800, 350));
		listaPanel.setPreferredSize(new Dimension(800, 350));
		listaPanel.setMaximumSize(new Dimension(800, 350));
		listaPanel.setAlignmentX(CENTER_ALIGNMENT);
		listaPanel.setVisible(true);
		
		
		JButton rispondi = new JButton("Rispondi al sondaggio selezionato");
		rispondi.setMinimumSize(new Dimension(320, 35));
		rispondi.setPreferredSize(new Dimension(320, 35));
		rispondi.setMaximumSize(new Dimension(320, 35));
		rispondi.setForeground(Color.blue);
		rispondi.setAlignmentX(CENTER_ALIGNMENT);
		
		rispondi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Sondaggio s;
				s = sondaggi.get(listaSondaggi.getSelectedRow());
				controllerSondaggi.createFormRispondiSondaggio(s,u);
			}
		});
		
		panelBacheca.add(listaPanel);
		panelBacheca.add(Box.createVerticalStrut(20));
	    panelBacheca.add(rispondi);
		// FINE BACHECA SONDAGGI
		
	
		
		
		// INIZIO CONTENUTO PANEL ACCOUNT 
		panelAccount = new JPanel();
	
		icon = new ImageIcon("imgAccount.png"); 
		img = new JLabel();
		img.setIcon(icon );
		img.setAlignmentX(CENTER_ALIGNMENT);
		JPanel panelImg = new JPanel();
		panelImg.setLayout(new BoxLayout(panelImg, BoxLayout.Y_AXIS));
		panelImg.add(Box.createVerticalStrut(30));
		panelImg.add(img);
		panelImg.add(Box.createVerticalStrut(30));
		panelImg.setBackground(SystemColor.DARK_GRAY);
		
		panelAccount.setMinimumSize(new Dimension(780, 350));
		panelAccount.setPreferredSize(new Dimension(780, 350));
		panelAccount.setMaximumSize(new Dimension(780, 350));
		
		Border border = BorderFactory.createEtchedBorder(EtchedBorder.RAISED);
		panelAccount.setBorder(BorderFactory.createTitledBorder(border, "Il mio profilo"));
		tabbedPane.addTab("Account", null, panelImg, null);
		panelAccount.setLayout(new BoxLayout(panelAccount, BoxLayout.Y_AXIS));
		
		JLabel lblNewLabel = new JLabel( "Nome: " + u.getNome());
		lblNewLabel.setAlignmentX(CENTER_ALIGNMENT);
		JLabel lblNewLabel1 = new JLabel("Cognome: "+u.getCognome());
		lblNewLabel1.setAlignmentX(CENTER_ALIGNMENT);
		JLabel lblNewLabel2 = new JLabel("Username: "+u.getAccount().getUsername());
		
		SimpleDateFormat st = new SimpleDateFormat("DD-MM-YYYY");
		JLabel lblNewLabel4 = new JLabel("Data di nascita: " + 	st.format(u.getDataNascita()).toString());
		lblNewLabel4.setAlignmentX(CENTER_ALIGNMENT);
		
		JLabel lblNewLabel5 = new JLabel("Residenza: "+u.getResidenza());
		lblNewLabel5.setAlignmentX(CENTER_ALIGNMENT);
		
		lblNewLabel2.setAlignmentX(CENTER_ALIGNMENT);
		JLabel lblNewLabel3 = new JLabel("Saldo: "+u.getCredito());
		lblNewLabel3.setAlignmentX(CENTER_ALIGNMENT);
		
	
		
		panelAccount.add(lblNewLabel);
		panelAccount.add(Box.createVerticalStrut(10));
		panelAccount.add(lblNewLabel1);
		panelAccount.add(Box.createVerticalStrut(10));
		panelAccount.add(lblNewLabel2);
		panelAccount.add(Box.createVerticalStrut(10));
		panelAccount.add(lblNewLabel4);
		panelAccount.add(Box.createVerticalStrut(10));
		panelAccount.add(lblNewLabel5);
		panelAccount.add(Box.createVerticalStrut(10));
		panelAccount.add(lblNewLabel3);
		panelImg.add(panelAccount);
		//FINE ACCOUNT
	
		setContentPane( contentPane );
		pack();
		setVisible( true );
	}  
	
	
}
