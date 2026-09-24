package Plantas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUIplanta extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIplanta frame = new GUIplanta();
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
	public GUIplanta() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 752, 457);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton Hola = new JButton("New button");
		Hola.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Hola desde el master");
			}
		});
		Hola.setBounds(297, 261, 97, 22);
		contentPane.add(Hola);

		

	

		JButton btnBerni = new JButton("Hola berni");
		btnBerni.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showInternalMessageDialog(null, "hola desde ramaBerni ");
			}
		});
		btnBerni.setBounds(118, 191, 88, 22);
		contentPane.add(btnBerni);

		JButton Hola_1 = new JButton("SaludoR");
		Hola_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Hola desde RamaDeRodrigo");
			}
		});
		Hola_1.setBounds(363, 192, 109, 20);
		contentPane.add(Hola_1);
		
	
		


	}
}
