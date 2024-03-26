package projetstage;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class ereurdate {

	public JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ereurdate window = new ereurdate();
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
	public ereurdate() {
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
		btnNewButton.setBounds(163, 242, 85, 21);
		frame.getContentPane().add(btnNewButton);
		
		JTextArea txtrMetreDesChiffre = new JTextArea();
		txtrMetreDesChiffre.setBackground(Color.RED);
		txtrMetreDesChiffre.setText("metre des date pour les Date");
		txtrMetreDesChiffre.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 16));
		txtrMetreDesChiffre.setBounds(72, 119, 297, 22);
		frame.getContentPane().add(txtrMetreDesChiffre);
		
		JTextArea txtrFormatDdmmyyyy = new JTextArea();
		txtrFormatDdmmyyyy.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		txtrFormatDdmmyyyy.setForeground(Color.BLACK);
		txtrFormatDdmmyyyy.setBackground(Color.RED);
		txtrFormatDdmmyyyy.setText("format dd-MM-yyyy");
		txtrFormatDdmmyyyy.setBounds(118, 189, 132, 22);
		frame.getContentPane().add(txtrFormatDdmmyyyy);
		btnNewButton.addActionListener(new ActionListener() {
			@Override
		    public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				
			}
		})
		;
	}

}
