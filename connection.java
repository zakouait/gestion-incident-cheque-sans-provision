package projetstage;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.SystemColor;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPasswordField;
import javax.swing.JLabel;

public class connection {

	private JFrame frmEcranConnection;
	private JTextField textField;
	private JTextArea txtrMotDePass;
	private JPasswordField passwordField;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					connection window = new connection();
					window.frmEcranConnection.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public connection() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmEcranConnection = new JFrame();

		frmEcranConnection.setTitle("administration");
		frmEcranConnection.setIconImage(Toolkit.getDefaultToolkit().getImage(connection.class.getResource("/projetstage/logoBADR.png")));
		frmEcranConnection.getContentPane().setBackground(Color.WHITE);
		frmEcranConnection.setBounds(100, 100, 964, 658);
		frmEcranConnection.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmEcranConnection.getContentPane().setLayout(null);

		textField = new JTextField();
		textField.setBounds(173, 154, 96, 19);
		frmEcranConnection.getContentPane().add(textField);
		textField.setColumns(10);

		JTextArea txtrNomDutilisateur = new JTextArea();
		txtrNomDutilisateur.setBackground(Color.WHITE);
		txtrNomDutilisateur.setText("Nom d'utilisateur");
		txtrNomDutilisateur.setBounds(10, 151, 153, 22);
		frmEcranConnection.getContentPane().add(txtrNomDutilisateur);

		txtrMotDePass = new JTextArea();
		txtrMotDePass.setBackground(Color.WHITE);
		txtrMotDePass.setText("Mot de pass");
		txtrMotDePass.setBounds(10, 198, 140, 58);
		frmEcranConnection.getContentPane().add(txtrMotDePass);

		JButton btnNewButton = new JButton("CONNECTER");
		btnNewButton.setBounds(253, 321, 192, 43);
		frmEcranConnection.getContentPane().add(btnNewButton);

		passwordField = new JPasswordField();
		passwordField.setBounds(173, 201, 96, 19);
		frmEcranConnection.getContentPane().add(passwordField);
		
		lblNewLabel = new JLabel("");
		Image img=new ImageIcon(this.getClass().getResource("/projetstage/logoBADR.png")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img));
		lblNewLabel.setBounds(239, -56, 419, 243);
		frmEcranConnection.getContentPane().add(lblNewLabel);
		btnNewButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String user = textField.getText();
				String mdp = String.valueOf(passwordField.getPassword());
				Utilisateur u = new connect().UserExiste(user, mdp);
String s="guichet";
String v="superviseur";
				if (u.get().equals(s)) {
					Menu_principal menu = new Menu_principal();
					frmEcranConnection.setVisible(false);
					menu.frmMenuPrincipale.setVisible(true);
				} else {
					if (u.get().equals(v)) {
						
				
					
						superviseur me = new superviseur();
						frmEcranConnection.setVisible(false);
						me.frmMenuSuperviseur.setVisible(true);
					}
				}
			}
		});
	}
}
