package projetstage;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Toolkit;

public class superviseur {

	public JFrame frmMenuSuperviseur;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					superviseur window = new superviseur();
					window.frmMenuSuperviseur.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}}		});
	}

	/**
	 * Create the application.
	 */
	public superviseur() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMenuSuperviseur = new JFrame();
		frmMenuSuperviseur.setIconImage(Toolkit.getDefaultToolkit().getImage(superviseur.class.getResource("/projetstage/logoBADR.gif")));
		frmMenuSuperviseur.setTitle("menu superviseur");
		frmMenuSuperviseur.setBounds(100, 100, 904, 561);
		frmMenuSuperviseur.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMenuSuperviseur.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("MENU SIMPLE");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.setBounds(430, 212, 156, 78);
		frmMenuSuperviseur.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("VALIDER");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				confimer_incident conf=new confimer_incident();
				frmMenuSuperviseur.setVisible(false);
				conf.frmConfimer.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(162, 212, 216, 78);
		frmMenuSuperviseur.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("REGULARISER/SUPRIMER");
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_2.setBounds(162, 365, 216, 65);
		frmMenuSuperviseur.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("GENERER FICHIER");
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_3.setBounds(430, 361, 167, 69);
		frmMenuSuperviseur.getContentPane().add(btnNewButton_3);
		
		JLabel lblNewLabel = new JLabel("");
		Image img=new ImageIcon(this.getClass().getResource("/projetstage/logoBADR.png")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img));
		lblNewLabel.setBounds(293, -21, 416, 208);
		frmMenuSuperviseur.getContentPane().add(lblNewLabel);
		
		btnNewButton.addActionListener(new ActionListener() {
			@Override
		  public void actionPerformed(ActionEvent e) {
				Menu_principal mo=new Menu_principal();
				frmMenuSuperviseur.setVisible(false);
				mo.frmMenuPrincipale.setVisible(true);
				
			}})	;
		
		btnNewButton_2.addActionListener(new ActionListener() {
			@Override
		  public void actionPerformed(ActionEvent e) {
				suprimer mo=new suprimer();
				frmMenuSuperviseur.setVisible(false);
				mo.frmSuppression.setVisible(true);
				
			}
		})
		;
		btnNewButton_3.addActionListener(new ActionListener() {
			@Override
		  public void actionPerformed(ActionEvent e) {
				
				Calendar cal=Calendar.getInstance() ;
			
				int jour=cal.get(Calendar.DAY_OF_WEEK);
				if(jour==5) {
					Date d=new Date();
					DateFormat format = new SimpleDateFormat("dd-MM-yyyy");
					String	da=format.format(d);
					generation s=new generation();
					s.cnfgenerertxt();;
				}else {datenonjeudi dat=new datenonjeudi();
				frmMenuSuperviseur.setVisible(false);
					dat.frame.setVisible(true);
				
				}
				
			}
		})
		;
	}
}
