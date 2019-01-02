package View;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import javafx.scene.layout.Border;

public class Login  extends JPanel {
    private JLabel JlUsername;
    private JLabel JlPassword;
    private JPasswordField pwd;
    private JTextField user;
    private JButton loginB;
    private JButton registrazioneB;

    public Login() {
        //construct components
        JlUsername = new JLabel ("Username");
        JlPassword = new JLabel ("Password");
        pwd = new JPasswordField (50);
        user = new JTextField (50);
        loginB = new JButton ("Login");
        registrazioneB = new JButton ("Registrazione");
        
  
      
        //adjust size and set layout
        setLayout (new BoxLayout(this, BoxLayout.Y_AXIS));

        //add components
        add (JlUsername);
        add (JlPassword);
        add (user);
        add (pwd);
        add (loginB);
        add (registrazioneB);
        
        //set component bounds (only needed by Absolute Positioning)
     
    }


    public static void main (String[] args) {
        JFrame frame = new JFrame ("login");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

     frame.getContentPane().add (new Login());
        frame.pack();
        frame.setVisible (true);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
}

