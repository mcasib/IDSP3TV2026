package main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ventana extends JFrame{

	public Ventana() {
		
		this.setVisible(true);
		this.setSize(650, 500);
		//this.setLocation(200, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setMinimumSize(new Dimension(200,200));
		this.setMaximumSize(new Dimension(800,800));

		this.setLocationRelativeTo(null);
		this.setTitle("Hola");
		this.setLayout(null);
		//this.setBackground(Color.red);
		//this.setOpacity(1);
		this.getContentPane().setBackground(Color.decode("#4D7C8A"));
		//this.setBounds(200, 200, 500, 500);
		
		JPanel login_container = new JPanel();
		login_container.setSize(400, 340);
		login_container.setLocation(115, 65);
		login_container.setBackground(Color.decode("#7F9C96"));
		login_container.setLayout(null);
		this.add(login_container);
		
		//AÑADIENDO ELEMENTOS
		JLabel tag_title = new JLabel();
		tag_title.setText("Bienvenido");
		tag_title.setSize(180,35);
		tag_title.setLocation(110, 35);
		//tag_title.setBackground(Color.white);
		//tag_title.setBackground(Color.decode("#9999ff"));
		//tag_title.setOpaque(true);
		tag_title.setFont(new Font("Forte",Font.PLAIN,35));
		tag_title.setForeground(Color.decode("#18272b"));
		tag_title.setVerticalAlignment(JLabel.CENTER);
		tag_title.setHorizontalAlignment(JLabel.CENTER);
		login_container.add(tag_title);
		
		JLabel tag_email = new JLabel();
		tag_email.setText("Email");
		tag_email.setBounds(70, 98, 150, 30);
		//tag_user.setBackground(Color.white);
		//tag_user.setOpaque(true);
		tag_email.setFont(new Font("Segoe Print",Font.BOLD,12));
		login_container.add(tag_email);
		
		JLabel tag_password = new JLabel();
		tag_password.setText("Contraseña");
		tag_password.setBounds(70, 160, 150, 30);
		tag_password.setFont(new Font("Segoe Print",Font.BOLD,12));
		login_container.add(tag_password);
		
		JLabel tag_rememberme = new JLabel();
		tag_rememberme.setText("Recuerdame");
		tag_rememberme.setBounds(87, 220, 150, 30);
		tag_rememberme.setFont(new Font("Segoe Print",Font.PLAIN,10));
		login_container.add(tag_rememberme);
		
		JLabel tag_forgot = new JLabel();
		tag_forgot.setText("¿Olvidaste tu contraseña?");
		tag_forgot.setBounds(200, 220, 150, 30);
		tag_forgot.setFont(new Font("Segoe Print",Font.PLAIN,10));
		login_container.add(tag_forgot);
		
		JTextField email_input = new JTextField();
		email_input.setBounds(70, 123, 260, 30);
		login_container.add(email_input);
		
		JTextField password_input = new JTextField();
		password_input.setBounds(70, 185, 260, 30);
		login_container.add(password_input);
		
		JCheckBox rememberme = new JCheckBox();
		rememberme.setBounds(66, 215, 140, 40);
		rememberme.setOpaque(false);
		login_container.add(rememberme);
		
		JButton access_btn = new JButton();
		access_btn.setText("Acceder");
		access_btn.setBounds(100, 275, 200, 40);
		access_btn.setFont(new Font("Segoe UI Semibold", Font.ITALIC, 17));
		login_container.add(access_btn);
		
		
		
		
		
		
		this.repaint();
		
	}
}
