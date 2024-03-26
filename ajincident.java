package projetstage;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JRadioButton;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JList;
import java.awt.Color;
import javax.swing.JComboBox;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JLabel;

public class ajincident {

	public JFrame frmEntrerDincident;
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_20;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ajincident window = new ajincident();
					window.frmEntrerDincident.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ajincident() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmEntrerDincident = new JFrame();
		frmEntrerDincident.setIconImage(Toolkit.getDefaultToolkit().getImage(ajincident.class.getResource("/projetstage/logoBADR.png")));
		frmEntrerDincident.setTitle("entrer d'incident");
		frmEntrerDincident.setBounds(100, 100, 880, 605);
		frmEntrerDincident.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmEntrerDincident.getContentPane().setLayout(null);
		
		JTextArea txtrAgence = new JTextArea();
		txtrAgence.setText("Agence");
		txtrAgence.setBounds(20, 194, 80, 22);
		frmEntrerDincident.getContentPane().add(txtrAgence);
		
		textField = new JTextField();
		textField.setBounds(140, 197, 96, 19);
		frmEntrerDincident.getContentPane().add(textField);
		textField.setColumns(10);
		
		JTextArea txtrListeClients = new JTextArea();
		txtrListeClients.setText("Liste clients");
		txtrListeClients.setBounds(10, 247, 111, 22);
		frmEntrerDincident.getContentPane().add(txtrListeClients);
		
		JTextArea txtrListeCompte = new JTextArea();
		txtrListeCompte.setText("Liste compte");
		txtrListeCompte.setBounds(292, 247, 111, 22);
		frmEntrerDincident.getContentPane().add(txtrListeCompte);
		
		JTextArea txtrNom = new JTextArea();
		txtrNom.setText("Nom");
		txtrNom.setBounds(20, 279, 60, 22);
		frmEntrerDincident.getContentPane().add(txtrNom);
		
		textField_2 = new JTextField();
		textField_2.setBounds(104, 282, 165, 19);
		frmEntrerDincident.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JTextArea txtrDateNaissance = new JTextArea();
		txtrDateNaissance.setText("Date naissance");
		txtrDateNaissance.setBounds(20, 311, 136, 22);
		frmEntrerDincident.getContentPane().add(txtrDateNaissance);
		
		textField_3 = new JTextField();
		textField_3.setBounds(166, 314, 136, 19);
		frmEntrerDincident.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JTextArea txtrPrenom = new JTextArea();
		txtrPrenom.setText("Prenom");
		txtrPrenom.setBounds(272, 279, 80, 22);
		frmEntrerDincident.getContentPane().add(txtrPrenom);
		
		textField_4 = new JTextField();
		textField_4.setBounds(377, 282, 215, 19);
		frmEntrerDincident.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		JTextArea txtrLieuxDeNaissance = new JTextArea();
		txtrLieuxDeNaissance.setText("Lieux de naissance");
		txtrLieuxDeNaissance.setBounds(312, 311, 149, 19);
		frmEntrerDincident.getContentPane().add(txtrLieuxDeNaissance);
		
		textField_5 = new JTextField();
		textField_5.setBounds(471, 314, 250, 19);
		frmEntrerDincident.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		JButton btnNewButton_2 = new JButton("Valider");
		btnNewButton_2.setBounds(524, 537, 85, 21);
		frmEntrerDincident.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Quiter");
		btnNewButton_3.setBounds(771, 537, 85, 21);
		frmEntrerDincident.getContentPane().add(btnNewButton_3);
		
		textField_6 = new JTextField();
		textField_6.setBounds(112, 348, 291, 19);
		frmEntrerDincident.getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		JTextArea txtrAdresse = new JTextArea();
		txtrAdresse.setText("Adresse");
		txtrAdresse.setBounds(10, 345, 62, 22);
		frmEntrerDincident.getContentPane().add(txtrAdresse);
		
		JTextArea txtrCodeWilaya = new JTextArea();
		txtrCodeWilaya.setText("Code wilaya");
		txtrCodeWilaya.setBounds(425, 345, 103, 22);
		frmEntrerDincident.getContentPane().add(txtrCodeWilaya);
		
		textField_7 = new JTextField();
		textField_7.setBounds(538, 348, 96, 19);
		frmEntrerDincident.getContentPane().add(textField_7);
		textField_7.setColumns(10);
		
		JTextArea txtrDateDclaration = new JTextArea();
		txtrDateDclaration.setText("Date déclaration");
		txtrDateDclaration.setBounds(10, 409, 132, 22);
		frmEntrerDincident.getContentPane().add(txtrDateDclaration);
		
		textField_8 = new JTextField();
		textField_8.setBounds(197, 412, 119, 19);
		frmEntrerDincident.getContentPane().add(textField_8);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setBounds(166, 383, 120, 19);
		frmEntrerDincident.getContentPane().add(textField_9);
		textField_9.setColumns(10);
		
		JTextArea txtrFormeJuridique = new JTextArea();
		txtrFormeJuridique.setText("Forme juridique");
		txtrFormeJuridique.setBounds(20, 377, 122, 22);
		frmEntrerDincident.getContentPane().add(txtrFormeJuridique);
		
		JTextArea txtrNChque = new JTextArea();
		txtrNChque.setText("N° chéque");
		txtrNChque.setBounds(20, 441, 79, 22);
		frmEntrerDincident.getContentPane().add(txtrNChque);
		
		textField_12 = new JTextField();
		textField_12.setBounds(140, 444, 119, 19);
		frmEntrerDincident.getContentPane().add(textField_12);
		textField_12.setColumns(10);
		
		JTextArea txtrMontantChque = new JTextArea();
		txtrMontantChque.setText("Montant chéque");
		txtrMontantChque.setBounds(261, 444, 119, 22);
		frmEntrerDincident.getContentPane().add(txtrMontantChque);
		
		textField_13 = new JTextField();
		textField_13.setBounds(409, 444, 119, 19);
		frmEntrerDincident.getContentPane().add(textField_13);
		textField_13.setColumns(10);
		
		JTextArea txtrMontantDisponible = new JTextArea();
		txtrMontantDisponible.setText("Montant disponible");
		txtrMontantDisponible.setBounds(538, 441, 151, 22);
		frmEntrerDincident.getContentPane().add(txtrMontantDisponible);
		
		textField_14 = new JTextField();
		textField_14.setBounds(699, 444, 131, 19);
		frmEntrerDincident.getContentPane().add(textField_14);
		textField_14.setColumns(10);
		
		JTextArea txtrDateEmission = new JTextArea();
		txtrDateEmission.setText("Date emission");
		txtrDateEmission.setBounds(10, 473, 119, 22);
		frmEntrerDincident.getContentPane().add(txtrDateEmission);
		
		textField_15 = new JTextField();
		textField_15.setBounds(140, 476, 128, 19);
		frmEntrerDincident.getContentPane().add(textField_15);
		textField_15.setColumns(10);
		
		JTextArea txtrDatePrsentation = new JTextArea();
		txtrDatePrsentation.setText("Date présentation");
		txtrDatePrsentation.setBounds(272, 473, 136, 22);
		frmEntrerDincident.getContentPane().add(txtrDatePrsentation);
		
		textField_16 = new JTextField();
		textField_16.setBounds(425, 476, 122, 19);
		frmEntrerDincident.getContentPane().add(textField_16);
		textField_16.setColumns(10);
		
		JTextArea txtrDateSaisie = new JTextArea();
		txtrDateSaisie.setText("Date saisie");
		txtrDateSaisie.setBounds(11, 505, 103, 22);
		frmEntrerDincident.getContentPane().add(txtrDateSaisie);
		
		textField_17 = new JTextField();
		textField_17.setBounds(140, 508, 129, 19);
		frmEntrerDincident.getContentPane().add(textField_17);
		textField_17.setColumns(10);
		
		JTextArea txtrNomBenificiaire = new JTextArea();
		txtrNomBenificiaire.setText("nom benificiaire");
		txtrNomBenificiaire.setBounds(10, 535, 132, 22);
		frmEntrerDincident.getContentPane().add(txtrNomBenificiaire);
		
		textField_18 = new JTextField();
		textField_18.setBounds(166, 538, 262, 19);
		frmEntrerDincident.getContentPane().add(textField_18);
		textField_18.setColumns(10);
		
		textField_20 = new JTextField();
		textField_20.setBounds(709, 476, 147, 19);
		frmEntrerDincident.getContentPane().add(textField_20);
		textField_20.setColumns(10);
		
		JTextArea txtrDateRegulation = new JTextArea();
		txtrDateRegulation.setText("Date regulation");
		txtrDateRegulation.setBounds(548, 473, 132, 22);
		frmEntrerDincident.getContentPane().add(txtrDateRegulation);
		
		JButton btnNewButton_5 = new JButton("generer les listes");
		btnNewButton_5.setBackground(Color.WHITE);
		btnNewButton_5.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnNewButton_5.setBounds(272, 191, 165, 27);
		frmEntrerDincident.getContentPane().add(btnNewButton_5);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(413, 249, 136, 21);
		frmEntrerDincident.getContentPane().add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(124, 249, 155, 21);
		frmEntrerDincident.getContentPane().add(comboBox_1);
		
		JTextArea txtrNomAgence = new JTextArea();
		txtrNomAgence.setText("Nom agence");
		txtrNomAgence.setBounds(487, 182, 136, 22);
		frmEntrerDincident.getContentPane().add(txtrNomAgence);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(633, 182, 153, 22);
		frmEntrerDincident.getContentPane().add(textArea);
		
		JButton btnNewButton = new JButton("Retour");
		btnNewButton.setBounds(658, 537, 85, 21);
		frmEntrerDincident.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("remplir donnée");
		btnNewButton_1.setBounds(618, 249, 133, 21);
		frmEntrerDincident.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("");
		Image img=new ImageIcon(this.getClass().getResource("/projetstage/logoBADR.png")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img));
		lblNewLabel.setBounds(227, -51, 462, 269);
		frmEntrerDincident.getContentPane().add(lblNewLabel);
		
		btnNewButton_5.addActionListener(new ActionListener() {
			@Override
		    public void actionPerformed(ActionEvent e) {
				String[]id=new generéliste().lcompte(textField.getText());
				comboBox.setModel(new DefaultComboBoxModel<>( id ));
				String[]id2=new generéliste().lclient(textField.getText());
				comboBox_1.setModel(new DefaultComboBoxModel<>( id2 ));
				String res,nag=textField.getText();
				res=new generéliste().ag(nag);
				textArea.setText(res);
				
			}
		})
		;
		btnNewButton_3.addActionListener(new ActionListener() {
			@Override
		    public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		})
		;
		
		btnNewButton.addActionListener(new ActionListener() {
			@Override
		    public void actionPerformed(ActionEvent e) {
			Menu_principal me=new Menu_principal();
			frmEntrerDincident.setVisible(false);
			me.frmMenuPrincipale.setVisible(true);
			}
		})
		;
		btnNewButton_1.addActionListener(new ActionListener() {
			@Override
		    public void actionPerformed(ActionEvent e) {
			String[] inci= new recupincident().utilisateur(( comboBox_1.getSelectedItem().toString()));
			textField_2.setText(inci[0]);
			textField_4.setText(inci[1]);
			textField_3.setText(inci[2]);
			textField_5.setText(inci[3]);
			textField_6.setText(inci[6]);
			textField_7.setText(inci[7]);
			textField_9.setText(inci[5]);
			}
		})
		;
		btnNewButton_2.addActionListener(new ActionListener() {
			@Override
		    public void actionPerformed(ActionEvent e) {
				String demission,dsaisie,ncheque,dpresentation,dregul,cif,ncommpte,cagence,nom_benificiere;
				
				int mcheque=0,mdisponible=0;
			ncheque=textField_12.getText();
			cif=(String) comboBox_1.getSelectedItem()
					;
			ncommpte=(String) comboBox.getSelectedItem() ;
			cagence=textField.getText();
			try{int i=Integer.parseInt(ncheque);
			 i=Integer.parseInt(cif);
			 i=Integer.parseInt(cagence);
			 double dou=Double.parseDouble(ncommpte);
			}catch(NumberFormatException E) {ereurint er=new ereurint();
			er.frame.setVisible(true);
			
			}
				demission=textField_15.getText();
		
				dsaisie=textField_17.getText();
			
				 dpresentation=textField_16.getText();
			
			
				 dregul=textField_20.getText();
			try {Date d;
				d=new SimpleDateFormat("dd-MM-yyyy").parse(demission);
				d=new SimpleDateFormat("dd-MM-yyyy").parse(dsaisie);
				d=new SimpleDateFormat("dd-MM-yyyy").parse(dpresentation);
				d=new SimpleDateFormat("dd-MM-yyyy").parse(dregul);
			}catch(ParseException E) {ereurdate erer=new ereurdate();
			erer.frame.setVisible(true);
				
			}
		
			try {	mcheque=Integer.parseInt(textField_13.getText());
			mdisponible=Integer.parseInt(textField_14.getText());}catch(NumberFormatException E) {ereurint er=new ereurint();
			er.frame.setVisible(true);
				}
			nom_benificiere=textField_18.getText();
			boolean aj=new ajoutincident().ajout( ncheque, cif,ncommpte,cagence, demission, dsaisie, dpresentation, dregul, mcheque, mdisponible, nom_benificiere);
			}
		})
		;
	}
}
