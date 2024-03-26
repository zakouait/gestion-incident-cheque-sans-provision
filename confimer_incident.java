package projetstage;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.JTextField;

public class confimer_incident {

	public JFrame frmConfimer;
 private int i=0;
 private JTextField textField;
 private JTextField textField_1;
 private JTextField textField_2;
 private JTextField textField_3;
 private JTextField textField_4;
 private JTextField textField_5;
 private JTextField textField_6;
 private JTextField textField_7;
 private JTextField textField_8;
 private JTextField textField_9;
 private JTextField textField_10;
 private JButton btnNewButton_2;
 private JTextArea txtrNumeroCheque;
 private JTextArea txtrCif;
 private JTextArea txtrNumeroCompte;
 private JTextArea txtrNumeroAgence;
 private JTextArea txtrDateEmission;
 private JTextArea txtrDatePresentation;
 private JTextArea txtrDatrSaisie;
 private JTextArea txtrDateLimiteRegulation;
 private JTextArea txtrMontantCheque;
 private JTextArea txtrMontantDisponible;
 private JTextArea txtrNomBeneficiere;
	public confimer_incident(JFrame frmConfimer, int i) {
	super();
	this.frmConfimer = frmConfimer;
	
	this.i = i;
}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					confimer_incident window = new confimer_incident();
					window.frmConfimer.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public confimer_incident() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmConfimer = new JFrame();
		frmConfimer.getContentPane().setBackground(Color.WHITE);
		frmConfimer.setIconImage(Toolkit.getDefaultToolkit().getImage(confimer_incident.class.getResource("/projetstage/logoBADR.png")));
		frmConfimer.setTitle("confimer");
		frmConfimer.setBounds(100, 100, 779, 600);
		frmConfimer.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmConfimer.getContentPane().setLayout(null);
		
		
		
		JButton btnNewButton = new JButton("Confirmer");
		btnNewButton.setBounds(10, 491, 118, 21);
		frmConfimer.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_3 = new JButton("Supprimer");
		btnNewButton_3.setBounds(154, 491, 103, 21);
		frmConfimer.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Retour");
		btnNewButton_4.setBounds(506, 491, 85, 21);
		frmConfimer.getContentPane().add(btnNewButton_4);
		
		incident[] inc;
		inc=new recupincident().recupincid();
		String[] columns = { "numerocheque", "CIF", "Numcompte","branch_code","Date_Emission","Date_presentation","date_saisie","date_limit_regul","montant_cheque","montant_disponible","nom_benificiere" };
		String[][] donnée=new String[12][2];
		int j;
		for(j=0;j<11;j++) {
			donnée[j][0]=columns[j];
			
		}String[] data = {"type","donnée"};
		incident[] u=new recupincident().recupincid();
	
		 
			
			JLabel jLab = new JLabel("");
			Image img=new ImageIcon(this.getClass().getResource("/projetstage/logoBADR.png")).getImage();
			jLab.setIcon(new ImageIcon(img));
			jLab.setBounds(133, -28, 628, 241);
			frmConfimer.getContentPane().add(jLab);
			
			textField = new JTextField();
			textField.setBounds(231, 166, 96, 19);
			frmConfimer.getContentPane().add(textField);
			textField.setColumns(10);
			
			textField_1 = new JTextField();
			textField_1.setBounds(231, 195, 96, 19);
			frmConfimer.getContentPane().add(textField_1);
			textField_1.setColumns(10);
			
			textField_2 = new JTextField();
			textField_2.setBounds(231, 226, 96, 19);
			frmConfimer.getContentPane().add(textField_2);
			textField_2.setColumns(10);
			
			textField_3 = new JTextField();
			textField_3.setBounds(231, 255, 96, 19);
			frmConfimer.getContentPane().add(textField_3);
			textField_3.setColumns(10);
			
			textField_4 = new JTextField();
			textField_4.setBounds(231, 286, 96, 19);
			frmConfimer.getContentPane().add(textField_4);
			textField_4.setColumns(10);
			
			textField_5 = new JTextField();
			textField_5.setBounds(231, 315, 96, 19);
			frmConfimer.getContentPane().add(textField_5);
			textField_5.setColumns(10);
			
			textField_6 = new JTextField();
			textField_6.setBounds(231, 344, 96, 19);
			frmConfimer.getContentPane().add(textField_6);
			textField_6.setColumns(10);
			
			textField_7 = new JTextField();
			textField_7.setBounds(231, 373, 96, 19);
			frmConfimer.getContentPane().add(textField_7);
			textField_7.setColumns(10);
			
			textField_8 = new JTextField();
			textField_8.setBounds(231, 402, 96, 19);
			frmConfimer.getContentPane().add(textField_8);
			textField_8.setColumns(10);
			
			textField_9 = new JTextField();
			textField_9.setBounds(231, 431, 96, 19);
			frmConfimer.getContentPane().add(textField_9);
			textField_9.setColumns(10);
			
			textField_10 = new JTextField();
			textField_10.setBounds(231, 462, 96, 19);
			frmConfimer.getContentPane().add(textField_10);
			textField_10.setColumns(10);
			
			JButton btnNewButton_1 = new JButton("Suivant");
			btnNewButton_1.setBounds(411, 491, 85, 21);
			frmConfimer.getContentPane().add(btnNewButton_1);
	
			textField.setText(inc[i].getNumerocheque());
			textField_1.setText(inc[i].getCIF());
			textField_2.setText(inc[i].getNumcompte());
			textField_3.setText(inc[i].getBranch_code());
			textField_4.setText(inc[i].getDate_Emission());
			textField_5.setText(inc[i].getDate_presentation());
			textField_6.setText(inc[i].getDate_saisie());
			textField_7.setText(inc[i].getDate_limit_regul());
			textField_8.setText(inc[i].getMontant_cheque());
			textField_9.setText(inc[i].getMontant_disponible());
			textField_10.setText(inc[i].getNom_benificiere());
			
			btnNewButton_2 = new JButton("Precedent");
			btnNewButton_2.setBounds(304, 491, 85, 21);
			frmConfimer.getContentPane().add(btnNewButton_2);
			
			txtrNumeroCheque = new JTextArea();
			txtrNumeroCheque.setText("Numero cheque");
			txtrNumeroCheque.setBounds(52, 163, 118, 22);
			frmConfimer.getContentPane().add(txtrNumeroCheque);
			
			txtrCif = new JTextArea();
			txtrCif.setText("CIF");
			txtrCif.setBounds(52, 192, 118, 22);
			frmConfimer.getContentPane().add(txtrCif);
			
			txtrNumeroCompte = new JTextArea();
			txtrNumeroCompte.setText("Numero compte");
			txtrNumeroCompte.setBounds(52, 223, 118, 22);
			frmConfimer.getContentPane().add(txtrNumeroCompte);
			
			txtrNumeroAgence = new JTextArea();
			txtrNumeroAgence.setText("Numero agence");
			txtrNumeroAgence.setBounds(52, 252, 118, 22);
			frmConfimer.getContentPane().add(txtrNumeroAgence);
			
			txtrDateEmission = new JTextArea();
			txtrDateEmission.setText("Date emission");
			txtrDateEmission.setBounds(49, 283, 118, 22);
			frmConfimer.getContentPane().add(txtrDateEmission);
			
			txtrDatePresentation = new JTextArea();
			txtrDatePresentation.setText("Date presentation");
			txtrDatePresentation.setBounds(52, 312, 153, 22);
			frmConfimer.getContentPane().add(txtrDatePresentation);
			
			txtrDatrSaisie = new JTextArea();
			txtrDatrSaisie.setText("Date saisie");
			txtrDatrSaisie.setBounds(52, 341, 141, 22);
			frmConfimer.getContentPane().add(txtrDatrSaisie);
			
			txtrDateLimiteRegulation = new JTextArea();
			txtrDateLimiteRegulation.setText("Date limite regulation");
			txtrDateLimiteRegulation.setBounds(52, 370, 181, 22);
			frmConfimer.getContentPane().add(txtrDateLimiteRegulation);
			
			txtrMontantCheque = new JTextArea();
			txtrMontantCheque.setText("Montant cheque");
			txtrMontantCheque.setBounds(52, 399, 166, 22);
			frmConfimer.getContentPane().add(txtrMontantCheque);
			
			txtrMontantDisponible = new JTextArea();
			txtrMontantDisponible.setText("Montant disponible");
			txtrMontantDisponible.setBounds(52, 428, 169, 22);
			frmConfimer.getContentPane().add(txtrMontantDisponible);
			
			txtrNomBeneficiere = new JTextArea();
			txtrNomBeneficiere.setText("Nom beneficiere");
			txtrNomBeneficiere.setBounds(52, 459, 160, 22);
			frmConfimer.getContentPane().add(txtrNomBeneficiere);
			
			
			
		
			
			
			
			btnNewButton_4.addActionListener(new ActionListener() {
				@Override
			  public void actionPerformed(ActionEvent e) {
					superviseur mo=new superviseur ();
					frmConfimer.setVisible(false);
					mo.frmMenuSuperviseur.setVisible(true);
					
				}
			})
			;
			btnNewButton_3.addActionListener(new ActionListener() {
				@Override
			  public void actionPerformed(ActionEvent e) {
					boolean suppr=new suppr().archive(u[i].getNumerocheque(),u[i].getCIF(), u[i].getNumcompte(),  u[i].getBranch_code());
					System.out.println(suppr);
					confimer_incident co=new confimer_incident();
					frmConfimer.setVisible(false);
					co.frmConfimer.setVisible(true);
					
				}
			})
			;
		btnNewButton_1.addActionListener(new ActionListener() {
				@Override
			  public void actionPerformed(ActionEvent e) {
					if(i<inc.length) {
						i++;textField.setText(inc[i].getNumerocheque());
						textField_1.setText(inc[i].getCIF());
						textField_2.setText(inc[i].getNumcompte());
						textField_3.setText(inc[i].getBranch_code());
						textField_4.setText(inc[i].getDate_Emission());
						textField_5.setText(inc[i].getDate_presentation());
						textField_6.setText(inc[i].getDate_saisie());
						textField_7.setText(inc[i].getDate_limit_regul());
						textField_8.setText(inc[i].getMontant_cheque());
						textField_9.setText(inc[i].getMontant_disponible());
						textField_10.setText(inc[i].getNom_benificiere());
					}else {
						System.out.println("ereur");
					}
				}
			})
			;
			btnNewButton_2.addActionListener(new ActionListener() {
				@Override
			  public void actionPerformed(ActionEvent e) {
					if(i>0) {i--;textField.setText(inc[i].getNumerocheque());
					textField_1.setText(inc[i].getCIF());
					textField_2.setText(inc[i].getNumcompte());
					textField_3.setText(inc[i].getBranch_code());
					textField_4.setText(inc[i].getDate_Emission());
					textField_5.setText(inc[i].getDate_presentation());
					textField_6.setText(inc[i].getDate_saisie());
					textField_7.setText(inc[i].getDate_limit_regul());
					textField_8.setText(inc[i].getMontant_cheque());
					textField_9.setText(inc[i].getMontant_disponible());
					textField_10.setText(inc[i].getNom_benificiere());
					
					}else {
						System.out.println("ereur");
					}
				}
			})
			;
			btnNewButton.addActionListener(new ActionListener() {
				@Override
			  public void actionPerformed(ActionEvent e) {
					boolean bool= new recupincident().conf(inc[i].getNumerocheque(), inc[i].getCIF(), inc[i].getNumcompte(), inc[i].getBranch_code());
					confimer_incident co=new confimer_incident();
					frmConfimer.setVisible(false);
					co.frmConfimer.setVisible(true);
					System.out.println(bool);
				}
			})
			;
			
			
	}
}
