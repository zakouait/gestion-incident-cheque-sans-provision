package projetstage;

import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Toolkit;
import javax.swing.JLabel;

public class suprimer {

	public JFrame frmSuppression;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					suprimer window = new suprimer();
					window.frmSuppression.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public suprimer() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSuppression = new JFrame();
		frmSuppression.setIconImage(Toolkit.getDefaultToolkit().getImage(suprimer.class.getResource("/projetstage/logoBADR.png")));
		frmSuppression.setTitle("suppression");
		frmSuppression.setBounds(100, 100, 579, 440);
		frmSuppression.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSuppression.getContentPane().setLayout(null);
		
		JTextArea txtrNumeroChque = new JTextArea();
		txtrNumeroChque.setText("Numero chéque");
		txtrNumeroChque.setBounds(0, 153, 109, 22);
		frmSuppression.getContentPane().add(txtrNumeroChque);
		
		JTextField textField = new JTextField();
		textField.setBounds(119, 156, 96, 19);
		frmSuppression.getContentPane().add(textField);
		textField.setColumns(10);
		
		JTextArea txtrCif = new JTextArea();
		txtrCif.setText("CIF");
		txtrCif.setBounds(10, 185, 109, 22);
		frmSuppression.getContentPane().add(txtrCif);
		
		JTextArea txtrNumeroCompte = new JTextArea();
		txtrNumeroCompte.setText("Numero compte");
		txtrNumeroCompte.setBounds(0, 222, 109, 22);
		frmSuppression.getContentPane().add(txtrNumeroCompte);
		
		JTextArea txtrNumeroAgence = new JTextArea();
		txtrNumeroAgence.setText("Numero agence");
		txtrNumeroAgence.setBounds(0, 254, 109, 22);
		frmSuppression.getContentPane().add(txtrNumeroAgence);
		
		textField_1 = new JTextField();
		textField_1.setBounds(119, 185, 96, 19);
		frmSuppression.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(119, 225, 96, 19);
		frmSuppression.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(119, 257, 96, 19);
		frmSuppression.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnNewButton = new JButton("Suprimer");
		btnNewButton.setBounds(130, 344, 85, 21);
		frmSuppression.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Régulariser");
		btnNewButton_1.setBounds(-2, 344, 121, 21);
		frmSuppression.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Quitter");
		btnNewButton_2.setBounds(254, 344, 85, 21);
		frmSuppression.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Retour");
		btnNewButton_3.setBounds(373, 344, 85, 21);
		frmSuppression.getContentPane().add(btnNewButton_3);
		
		JLabel lblNewLabel = new JLabel("");
		Image img=new ImageIcon(this.getClass().getResource("/projetstage/logoBADR.png")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img));
		lblNewLabel.setBounds(0, -23, 421, 198);
		frmSuppression.getContentPane().add(lblNewLabel);
		btnNewButton_3.addActionListener(new ActionListener() {
			@Override
		  public void actionPerformed(ActionEvent e) {
				superviseur mo=new superviseur ();
				frmSuppression.setVisible(false);
				mo.frmMenuSuperviseur.setVisible(true);
				
			}
		})
		;
		btnNewButton_2.addActionListener(new ActionListener() {
			@Override
		    public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		})
		;
		btnNewButton.addActionListener(new ActionListener() {
			@Override
		    public void actionPerformed(ActionEvent e) {
				String a,b,c,d;
			
			 a=textField.getText();
			 b=textField_1.getText();
			 c=textField_2.getText();
			 d=textField_3.getText();
			 try{int i=Integer.parseInt(a);
			 i=Integer.parseInt(b);
			 double dou=Double.parseDouble(c);
			 i=Integer.parseInt(d);boolean bol=new suppr().archive(a,b,c,d);
			 System.out.println(bol);
			}catch(NumberFormatException E) {
				System.out.println("type incorrect veuillé mettre un entier dans la place d'un entier");
				ereurint er=new ereurint();
				er.frame.setVisible(true);
			} 
		}})
		;
	
		btnNewButton_1.addActionListener(new ActionListener() {
			@Override
		    public void actionPerformed(ActionEvent e) {
				String a,b,c,d;
			
			 a=textField.getText();
			 b=textField_1.getText();
			 c=textField_2.getText();
			 d=textField_3.getText();
			 try{int i=Integer.parseInt(a);
			 i=Integer.parseInt(b);
			 double dou=Double.parseDouble(c);
			 i=Integer.parseInt(d);boolean bol=new suppr().regularise(a,b,c,d);
			 System.out.println(bol);
			}catch(NumberFormatException E) {
				System.out.println("type incorrect veuillé mettre un entier dans la place d'un entier");
				ereurint er=new ereurint();
				er.frame.setVisible(true);
			} 
		}})
		;
	}
}
