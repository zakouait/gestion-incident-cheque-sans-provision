package projetstage;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;

public class cnfsup extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					cnfsup frame = new cnfsup();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public cnfsup() {
		getContentPane().setBackground(SystemColor.activeCaption);
		getContentPane().setLayout(null);
		
		JTextArea txtrtevousSureDe = new JTextArea();
		txtrtevousSureDe.setText("éte-vous sure de vouloire suprimer");
		txtrtevousSureDe.setBackground(SystemColor.activeCaption);
		txtrtevousSureDe.setFont(new Font("Monospaced", Font.PLAIN, 18));
		txtrtevousSureDe.setBounds(29, 77, 386, 39);
		getContentPane().add(txtrtevousSureDe);
		
		JButton btnNewButton = new JButton("oui");
		btnNewButton.setForeground(new Color(0, 102, 0));
		btnNewButton.setBounds(58, 179, 85, 21);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("non");
		btnNewButton_1.setForeground(new Color(204, 0, 0));
		btnNewButton_1.setBounds(262, 179, 85, 21);
		getContentPane().add(btnNewButton_1);
		setBounds(100, 100, 450, 300);
		btnNewButton_1.addActionListener(new ActionListener() {
			@Override
			  public void actionPerformed(ActionEvent e) {
					superviseur mo=new superviseur ();
					 
					mo.frmMenuSuperviseur.setVisible(true);
					
				}
			})
			;
	}
}
