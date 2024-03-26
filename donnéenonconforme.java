package projetstage;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.JButton;

public class donnéenonconforme {

	public JFrame frmErreurDonneNon;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					donnéenonconforme window = new donnéenonconforme();
					window.frmErreurDonneNon.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public donnéenonconforme() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmErreurDonneNon = new JFrame();
		frmErreurDonneNon.setTitle("erreur donnée non conforme ");
		frmErreurDonneNon.getContentPane().setBackground(Color.RED);
		frmErreurDonneNon.setBounds(100, 100, 450, 300);
		frmErreurDonneNon.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmErreurDonneNon.getContentPane().setLayout(null);
		
		JTextArea txtrErreurLorsDe = new JTextArea();
		txtrErreurLorsDe.setBackground(Color.RED);
		txtrErreurLorsDe.setText("erreur lors de la saisie");
		txtrErreurLorsDe.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 16));
		txtrErreurLorsDe.setBounds(106, 36, 213, 34);
		frmErreurDonneNon.getContentPane().add(txtrErreurLorsDe);
		
		JTextArea txtrDonneNonConforme = new JTextArea();
		txtrDonneNonConforme.setBackground(Color.RED);
		txtrDonneNonConforme.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 16));
		txtrDonneNonConforme.setText("donnée non conforme");
		txtrDonneNonConforme.setBounds(106, 101, 199, 34);
		frmErreurDonneNon.getContentPane().add(txtrDonneNonConforme);
		
		JTextArea txtrTailleDeDonnetype = new JTextArea();
		txtrTailleDeDonnetype.setText("taille de donnée/type");
		txtrTailleDeDonnetype.setFont(new Font("MS PGothic", Font.PLAIN, 13));
		txtrTailleDeDonnetype.setBackground(Color.RED);
		txtrTailleDeDonnetype.setBounds(131, 166, 147, 22);
		frmErreurDonneNon.getContentPane().add(txtrTailleDeDonnetype);
		
		JButton btnNewButton = new JButton("ok");
		btnNewButton.setBounds(154, 232, 85, 21);
		frmErreurDonneNon.getContentPane().add(btnNewButton);
	
		btnNewButton.addActionListener(new ActionListener() {
			@Override
		    public void actionPerformed(ActionEvent e) {
				frmErreurDonneNon.setVisible(false);
				
			}
		})
		;
	}
}
