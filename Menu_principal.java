package projetstage;

import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.Font;

public class Menu_principal {

	public JFrame frmMenuPrincipale;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu_principal window = new Menu_principal();
					window.frmMenuPrincipale.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Menu_principal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMenuPrincipale = new JFrame();
		frmMenuPrincipale.setBackground(new Color(240, 240, 240));
		frmMenuPrincipale.setIconImage(Toolkit.getDefaultToolkit().getImage(Menu_principal.class.getResource("/projetstage/logoBADR.png")));
		frmMenuPrincipale.setTitle("Menu principal");
		frmMenuPrincipale.setBounds(100, 100, 701, 584);
		frmMenuPrincipale.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMenuPrincipale.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("ajout incident");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setBounds(233, 173, 195, 91);
		frmMenuPrincipale.getContentPane().add(btnNewButton);
		JLabel lblNewLabel = new JLabel("");
		Image img=new ImageIcon(this.getClass().getResource("/projetstage/logoBADR.png")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img));
		lblNewLabel.setBounds(0, -17, 462, 189);
		frmMenuPrincipale.getContentPane().add(lblNewLabel);
		JButton btnNewButton_1 = new JButton("modifier");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_1.setBounds(233, 288, 195, 91);
		frmMenuPrincipale.getContentPane().add(btnNewButton_1);
		btnNewButton.addActionListener(new ActionListener() {
			@Override
		  public void actionPerformed(ActionEvent e) {
				ajincident mo=new ajincident();
				frmMenuPrincipale.setVisible(false);
				mo.frmEntrerDincident.setVisible(true);
				
			}
		})
		;
		btnNewButton_1.addActionListener(new ActionListener() {
			@Override
		  public void actionPerformed(ActionEvent e) {
				modification mo=new modification();
				frmMenuPrincipale.setVisible(false);
				mo.frmModification.setVisible(true);
				
			}
		})
		;
		
		
		
	}

}
