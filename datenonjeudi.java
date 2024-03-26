package projetstage;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class datenonjeudi {

	public JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					datenonjeudi window = new datenonjeudi();
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
	public datenonjeudi() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 489, 250);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextArea txtrServiceNonDisponible = new JTextArea();
		txtrServiceNonDisponible.setBounds(99, 47, 292, 31);
		txtrServiceNonDisponible.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 16));
		txtrServiceNonDisponible.setBackground(Color.WHITE);
		txtrServiceNonDisponible.setForeground(Color.RED);
		txtrServiceNonDisponible.setText("service non disponible actuelment");
		frame.getContentPane().add(txtrServiceNonDisponible);
		
		JTextArea txtrVeuillerRevenirJeudi = new JTextArea();
		txtrVeuillerRevenirJeudi.setBounds(10, 108, 454, 22);
		txtrVeuillerRevenirJeudi.setText("veuiller revenir jeudi ou contacter le service technique");
		frame.getContentPane().add(txtrVeuillerRevenirJeudi);
		
		JButton btnNewButton = new JButton("ok");
		btnNewButton.setBounds(193, 182, 85, 21);
		frame.getContentPane().add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			@Override
			  public void actionPerformed(ActionEvent e) {
					superviseur mo=new superviseur ();
					frame.setVisible(false);
					mo.frmMenuSuperviseur.setVisible(true);
					
				}
			})
			;
	}
}
