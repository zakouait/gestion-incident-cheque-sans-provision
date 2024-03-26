package projetstage;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextArea;
import java.awt.Font;

public class incidentexiste extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			incidentexiste dialog = new incidentexiste();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public incidentexiste() {
		setTitle("Ereur");
		setBounds(100, 100, 396, 253);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(178, 34, 34));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JTextArea txtrIncidentExiste = new JTextArea();
		txtrIncidentExiste.setFont(new Font("Monospaced", Font.PLAIN, 18));
		txtrIncidentExiste.setBackground(new Color(178, 34, 34));
		txtrIncidentExiste.setText("incident existe");
		txtrIncidentExiste.setBounds(114, 71, 181, 35);
		contentPanel.add(txtrIncidentExiste);
		
		JTextArea txtrDeja = new JTextArea();
		txtrDeja.setBackground(new Color(178, 34, 34));
		txtrDeja.setFont(new Font("Monospaced", Font.PLAIN, 18));
		txtrDeja.setText("deja");
		txtrDeja.setBounds(163, 116, 69, 35);
		contentPanel.add(txtrDeja);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBackground(new Color(178, 34, 34));
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
		}
	}
}
