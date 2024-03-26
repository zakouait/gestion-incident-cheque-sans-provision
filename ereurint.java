package projetstage;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ereurint {

	public JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ereurint window = new ereurint();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ereurint() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.RED);
		frame.setBackground(Color.RED);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextArea txtrDonneNonConforme = new JTextArea();
		txtrDonneNonConforme.setBackground(Color.RED);
		txtrDonneNonConforme.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 16));
		txtrDonneNonConforme.setText("donnée non conforme");
		txtrDonneNonConforme.setBounds(118, 44, 191, 22);
		frame.getContentPane().add(txtrDonneNonConforme);
		
		JButton btnNewButton = new JButton("ok");
		btnNewButton.setBounds(167, 242, 85, 21);
		frame.getContentPane().add(btnNewButton);
		
		JTextArea txtrMetreDesChiffre = new JTextArea();
		txtrMetreDesChiffre.setBackground(Color.RED);
		txtrMetreDesChiffre.setText("metre des chiffre pour les chiffres");
		txtrMetreDesChiffre.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 16));
		txtrMetreDesChiffre.setBounds(71, 119, 297, 22);
		frame.getContentPane().add(txtrMetreDesChiffre);
		btnNewButton.addActionListener(new ActionListener() {
			@Override
		    public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				
			}
		})
		;
	}

}
