package projetstage;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Toolkit;

public class mdp_incorect extends JDialog {

	public final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			mdp_incorect dialog = new mdp_incorect();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public mdp_incorect() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(mdp_incorect.class.getResource("/projetstage/logoBADR.png")));
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(Color.RED);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JTextArea txtrMotDePasse = new JTextArea();
		txtrMotDePasse.setFont(new Font("Monospaced", Font.PLAIN, 18));
		txtrMotDePasse.setBackground(Color.RED);
		txtrMotDePasse.setText("mot de passe  ou nom utilisateeur ");
		txtrMotDePasse.setBounds(120, 25, 166, 36);
		contentPanel.add(txtrMotDePasse);
		
		JTextArea txtrIncorrectVeuillRessey = new JTextArea();
		txtrIncorrectVeuillRessey.setFont(new Font("Monospaced", Font.PLAIN, 16));
		txtrIncorrectVeuillRessey.setForeground(Color.BLACK);
		txtrIncorrectVeuillRessey.setBackground(Color.RED);
		txtrIncorrectVeuillRessey.setText("incorrect veuillé ");
		txtrIncorrectVeuillRessey.setBounds(101, 71, 198, 22);
		contentPanel.add(txtrIncorrectVeuillRessey);
		
		JTextArea txtrRessey = new JTextArea();
		txtrRessey.setFont(new Font("Monospaced", Font.PLAIN, 18));
		txtrRessey.setBackground(Color.RED);
		txtrRessey.setForeground(Color.BLACK);
		txtrRessey.setText("ré-esseyé");
		txtrRessey.setBounds(121, 115, 136, 22);
		contentPanel.add(txtrRessey);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBackground(Color.RED);
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
			/*okButton.addActionListener(new ActionListener() {
				@Override
			    public void actionPerformed(ActionEvent e) {
					connection mo=new connection();
					contentPanel.setVisible(false);
					mo.frmEcranConnection .setVisible(true);
					
				}
			})
			;*/
		}
	}
}
