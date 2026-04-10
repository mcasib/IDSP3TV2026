package main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.BoxLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class memorama {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					memorama window = new memorama();
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
	public memorama() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 350, 407);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 128));
		frame.getContentPane().add(panel, BorderLayout.SOUTH);
		
		JButton btnNewButton_1 = new JButton("Reiniciar");
		panel.add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("Pausa");
		panel.add(btnNewButton);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(140, 152, 255));
		frame.getContentPane().add(panel_1, BorderLayout.NORTH);
		panel_1.setLayout(new GridLayout(0, 3, 0, 0));
		
		JLabel lblNewLabel = new JLabel("0");
		lblNewLabel.setHorizontalAlignment(0);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("0");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("0");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblNewLabel_2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(130, 255, 255));
		frame.getContentPane().add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(new GridLayout(3, 4, 0, 0));
		
		JButton btnNewButton_4 = new JButton("");
		btnNewButton_4.setBackground(new Color(176, 255, 255));
		panel_2.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("");
		btnNewButton_5.setBackground(new Color(176, 255, 255));
		panel_2.add(btnNewButton_5);
		
		JButton btnNewButton_8 = new JButton("");
		btnNewButton_8.setBackground(new Color(176, 255, 255));
		panel_2.add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("");
		btnNewButton_9.setBackground(new Color(176, 255, 255));
		panel_2.add(btnNewButton_9);
		
		JButton btnNewButton_11 = new JButton("");
		btnNewButton_11.setBackground(new Color(176, 255, 255));
		panel_2.add(btnNewButton_11);
		
		JButton btnNewButton_12 = new JButton("");
		btnNewButton_12.setBackground(new Color(176, 255, 255));
		panel_2.add(btnNewButton_12);
		
		JButton btnNewButton_7 = new JButton("");
		btnNewButton_7.setBackground(new Color(176, 255, 255));
		panel_2.add(btnNewButton_7);
		
		JButton btnNewButton_6 = new JButton("");
		btnNewButton_6.setBackground(new Color(176, 255, 255));
		panel_2.add(btnNewButton_6);
		
		JButton btnNewButton_10 = new JButton("");
		btnNewButton_10.setBackground(new Color(176, 255, 255));
		panel_2.add(btnNewButton_10);
		
		JButton btnNewButton_13 = new JButton("");
		btnNewButton_13.setBackground(new Color(176, 255, 255));
		panel_2.add(btnNewButton_13);
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.setBackground(new Color(176, 255, 255));
		panel_2.add(btnNewButton_3);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setBackground(new Color(176, 255, 255));
		panel_2.add(btnNewButton_2);
	}

}
