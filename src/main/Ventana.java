package main;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

public class Ventana extends JFrame{

	public Ventana() {
		
		//configuraciones básicas
		this.setSize(960, 680);
		//this.setLocation(200, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setMinimumSize(new Dimension(200,200));
		this.setMaximumSize(new Dimension(800,800));
		this.setLocationRelativeTo(null);
		this.setTitle("Hola");
		this.setLayout(null);
		this.getContentPane().setBackground(Color.decode("#4D7C8A"));
		
		try {

			Image iconImage = ImageIO.read(getClass().getResource("/images/7592746.png"));
			
			this.setIconImage(iconImage);
			
		} catch	(IOException e) {
			e.printStackTrace();
		}
		
		JMenuBar barra = new JMenuBar();
		this.setJMenuBar(barra);
		
		JMenu menu1 = new JMenu("Archivo");
		barra.add(menu1);
		
		JMenuItem opt1_mi = new JMenuItem("Abrir");
		menu1.add(opt1_mi);
		
		JMenuItem opt2_mi = new JMenuItem("Nuevo");
		menu1.add(opt2_mi);
		
		JMenuItem opt3_mi = new JMenuItem("Cerrar");
		menu1.add(opt3_mi);
		
		menu1.addSeparator();
		
		JMenu menu2 = new JMenu("Guardar");
		menu1.add(menu2);
		
		JMenuItem opt4_mi = new JMenuItem("Guardar");
		menu2.add(opt4_mi);
		
		JMenuItem opt5_mi = new JMenuItem("Guardar como");
		menu2.add(opt5_mi);
		
		//this.login();
		//this.registro();
		//this.users();
		//this.calculadora();
		//this.calculadora_layout();
		//this.calculadora_de_interes();
		this.pintar();
				
		this.setVisible(true);
		this.repaint();
		
		
	}
	
	public void login() {
		ImageIcon background = new ImageIcon(getClass().getResource("/images/fondo login.png"));
		
		//JPanel login_container = new JPanel();
		JLabel login_container = new JLabel(background);
		//login_container.setSize(400, 550);
		login_container.setSize(850, 550);
		login_container.setLocation(50, 40);
		//login_container.setBackground(Color.decode("#7F9C96"));
		login_container.setLayout(null);
		login_container.setBorder(BorderFactory.createLineBorder(Color.decode("#dce3e6"), 3, true));
		this.add(login_container);

		
		//AÑADIENDO ELEMENTOS
		JLabel tag_title = new JLabel();
		tag_title.setText("Iniciar sesión");
		tag_title.setSize(300, 40);
		tag_title.setLocation(280, 125);
		//tag_title.setBackground(Color.decode("#9999ff"));
		//tag_title.setOpaque(true);
		tag_title.setFont(new Font("Forte",Font.PLAIN,35));
		tag_title.setForeground(Color.white);
		tag_title.setHorizontalAlignment(JLabel.CENTER);
		login_container.add(tag_title);

		JLabel tag_email = new JLabel();
		tag_email.setText("Email");
		tag_email.setBounds(300, 180, 150, 30);
		tag_email.setFont(new Font("Segoe Print",Font.BOLD,12));
		tag_email.setForeground(Color.decode("#ebf0f2"));
		login_container.add(tag_email);
		
		JLabel tag_password = new JLabel();
		tag_password.setText("Contraseña");
		tag_password.setBounds(300, 250, 150, 30);
		tag_password.setFont(new Font("Segoe Print",Font.BOLD,12));
		tag_password.setForeground(Color.decode("#ebf0f2"));
		login_container.add(tag_password);
		
		JLabel tag_rememberme = new JLabel();
		tag_rememberme.setText("Recuerdame");
		tag_rememberme.setBounds(320, 314, 150, 30);
		tag_rememberme.setFont(new Font("Segoe Print",Font.PLAIN,10));
		tag_rememberme.setForeground(Color.decode("#dce3e6"));
		login_container.add(tag_rememberme);
		
		JLabel tag_forgot = new JLabel();
		tag_forgot.setText("¿Olvidaste tu contraseña?");
		tag_forgot.setBounds(420, 314, 150, 30);
		tag_forgot.setFont(new Font("Segoe Print",Font.PLAIN,10));
		tag_forgot.setForeground(Color.decode("#dce3e6"));
		login_container.add(tag_forgot);
		
		JTextField email_input = new JTextField();
		email_input.setBounds(300, 210, 260, 30);
		login_container.add(email_input);
		
		JPasswordField password_input = new JPasswordField();
		password_input.setBounds(300, 280, 260, 30);
		login_container.add(password_input);
		
		JCheckBox rememberme = new JCheckBox();
		rememberme.setBounds(296, 310, 140, 40);
		rememberme.setOpaque(false);
		login_container.add(rememberme);
		
		JButton access_btn = new JButton();
		access_btn.setText("Acceder");
		access_btn.setBounds(330, 365, 200, 40);
		access_btn.setFont(new Font("Segoe UI Semibold", Font.ITALIC, 17));
		login_container.add(access_btn);
		
		ImageIcon small_image = new ImageIcon(getClass().getResource("/images/fondo login.png"));
		Image img = small_image.getImage().getScaledInstance(550, 370, Image.SCALE_SMOOTH);
		ImageIcon small_scaled = new ImageIcon(img);

		JLabel img_small = new JLabel(small_scaled);
		img_small.setSize(550, 370);
		img_small.setLocation(150, 90);
		//img_small.setBounds(150, 100, 450, 550);

		login_container.add(img_small);
	}
	
	public void registro() {
		JPanel rgs_container = new JPanel();
		rgs_container.setBounds(500, 50, 400, 550);
		rgs_container.setOpaque(true);
		rgs_container.setBackground(Color.decode("#7F9C96"));
		rgs_container.setLayout(null);
		rgs_container.setBorder(BorderFactory.createLineBorder(Color.decode("#18272b"), 4, true));
		this.add(rgs_container);
		
		//titulo
		JLabel tag_register = new JLabel();
		tag_register.setText("Registro");
		tag_register.setBounds(50, 35, 300, 40);
		tag_register.setFont(new Font("Forte",Font.PLAIN,35));
		tag_register.setForeground(Color.decode("#18272b"));
		tag_register.setVerticalAlignment(JLabel.CENTER);
		tag_register.setHorizontalAlignment(JLabel.CENTER);
		rgs_container.add(tag_register);
		
		//label name
		JLabel name_tag = new JLabel("Nombre de usuario:");
		name_tag.setBounds(50, 90, 300, 25);
		name_tag.setFont(new Font("Segoe Print",Font.BOLD,14));
		name_tag.setForeground(Color.decode("#dce3e6"));
		name_tag.setBackground(Color.decode("#577871"));
		name_tag.setHorizontalAlignment(JLabel.CENTER);
		name_tag.setOpaque(true);
		name_tag.setBorder(BorderFactory.createLineBorder(Color.decode("#dce3e6"), 4, true));
		rgs_container.add(name_tag);
		
		//input name
		JTextArea name_text = new JTextArea("", 10, 10);
		name_text.setLocation(50, 120);	
		name_text.setSize(300, 30);
		name_text.setBackground(Color.decode("#dce3e6"));
		rgs_container.add(name_text);
		
		//bio
		JLabel bio_tag = new JLabel("BIO");
		bio_tag.setBounds(50, 160, 300, 30);
		bio_tag.setFont(new Font("Segoe Print",Font.BOLD,14));
		bio_tag.setForeground(Color.decode("#dce3e6"));
		bio_tag.setBackground(Color.decode("#577871"));
		bio_tag.setHorizontalAlignment(JLabel.CENTER);
		bio_tag.setOpaque(true);
		bio_tag.setBorder(BorderFactory.createLineBorder(Color.decode("#dce3e6"), 4, true));
		rgs_container.add(bio_tag);
		
		//text area bio
		JTextArea bio_text = new JTextArea("", 10, 10);
		bio_text.setLocation(50, 195);	
		bio_text.setSize(300, 80);
		bio_text.setBackground(Color.decode("#dce3e6"));
		rgs_container.add(bio_text);
		
		//label preferences
		JLabel preferences_tag = new JLabel("Preferencias");
		preferences_tag.setBounds(50, 285, 300, 30);
		preferences_tag.setFont(new Font("Segoe Print",Font.BOLD,14));
		preferences_tag.setForeground(Color.decode("#dce3e6"));
		preferences_tag.setBackground(Color.decode("#577871"));
		preferences_tag.setHorizontalAlignment(JLabel.CENTER);
		preferences_tag.setOpaque(true);
		preferences_tag.setBorder(BorderFactory.createLineBorder(Color.decode("#dce3e6"), 4, true));
		rgs_container.add(preferences_tag);
		
		//preferences
		JCheckBox opt_sweet = new JCheckBox("Dulce");
		opt_sweet.setBounds(50, 320, 100, 40);
		opt_sweet.setFont(new Font("Segoe Print",Font.PLAIN,12));
		opt_sweet.setOpaque(false);
		rgs_container.add(opt_sweet);
		
		JCheckBox opt_salty = new JCheckBox("Salado");
		opt_salty.setBounds(150, 320, 100, 40);
		opt_salty.setFont(new Font("Segoe Print",Font.PLAIN,12));
		opt_salty.setOpaque(false);
		rgs_container.add(opt_salty);
		
		JCheckBox opt_healty = new JCheckBox("Saludable");
		opt_healty.setBounds(250, 320, 100, 40);
		opt_healty.setFont(new Font("Segoe Print",Font.PLAIN,12));
		opt_healty.setOpaque(false);
		rgs_container.add(opt_healty);	
		
		//label terms
		JLabel terms_tag = new JLabel("Términos");
		terms_tag.setBounds(50, 360, 300, 30);
		terms_tag.setFont(new Font("Segoe Print",Font.BOLD,14));
		terms_tag.setForeground(Color.decode("#dce3e6"));
		terms_tag.setBackground(Color.decode("#577871"));
		terms_tag.setHorizontalAlignment(JLabel.CENTER);
		terms_tag.setOpaque(true);
		terms_tag.setBorder(BorderFactory.createLineBorder(Color.decode("#dce3e6"), 4, true));
		rgs_container.add(terms_tag);
		
		//terms
		JRadioButton accept_terms = new JRadioButton("Acepto los terminos");
		accept_terms.setBounds(45, 385, 200, 40);
		accept_terms.setFont(new Font("Segoe Print",Font.PLAIN,12));
		accept_terms.setOpaque(false);
		rgs_container.add(accept_terms);
		
		JRadioButton reject_terms = new JRadioButton("Rechazo los terminos");
		reject_terms.setBounds(205, 385, 200, 40);
		reject_terms.setFont(new Font("Segoe Print",Font.PLAIN,12));
		reject_terms.setOpaque(false);
		rgs_container.add(reject_terms);
		
		ButtonGroup terms = new ButtonGroup();
		terms.add(accept_terms);
		terms.add(reject_terms);
		
		//combo
		String [] colonias = {"Camino real", "Arcoiris", "Villas del encanto", "8 de Octubre"};
		
		JComboBox colonias_combo = new JComboBox(colonias);
		colonias_combo.setBounds(50, 430, 300, 30);
		colonias_combo.setBackground(Color.decode("#dce3e6"));
		colonias_combo.setFont(new Font("Segoe Print",Font.BOLD,12));
		rgs_container.add(colonias_combo);
		
		//button
		JButton register_btn = new JButton("Crear cuenta");
		register_btn.setBounds(50, 470, 300, 60);
		register_btn.setFont(new Font("Segoe UI Semibold", Font.ITALIC, 17));
		register_btn.setBorder(BorderFactory.createLineBorder(Color.decode("#18272b"), 4, true));
		rgs_container.add(register_btn);
	}
	
	public void users() {
		JPanel panel_users = new JPanel();
		panel_users.setBounds(50, 40, 850, 550);
		panel_users.setBackground(Color.white);
		panel_users.setOpaque(true);
		panel_users.setLayout(null);
		this.add(panel_users);
		
		JLabel title_users = new JLabel("Usuarios");
		title_users.setBounds(350, 35, 180, 40);
		title_users.setFont(new Font("Forte",Font.PLAIN,35));
		title_users.setForeground(Color.decode("#18272b"));
		title_users.setHorizontalAlignment(JLabel.CENTER);
		panel_users.add(title_users);
		
		JLabel tag_users = new JLabel("Usuarios");
		tag_users.setBounds(70, 98, 150, 30);
		tag_users.setBackground(Color.decode("#dce3e6"));
		tag_users.setOpaque(true);
		tag_users.setFont(new Font("Segoe Print",Font.BOLD,18));
		tag_users.setHorizontalAlignment(JLabel.CENTER);
		panel_users.add(tag_users);
		
		JLabel tag_numusers = new JLabel("24");
		tag_numusers.setBounds(70, 120, 150, 30);
		tag_numusers.setBackground(Color.decode("#dce3e6"));
		tag_numusers.setOpaque(true);
		tag_numusers.setFont(new Font("Segoe Print",Font.BOLD,18));
		tag_numusers.setHorizontalAlignment(JLabel.CENTER);
		panel_users.add(tag_numusers);
		
		JButton donwload_btn = new JButton("Descargar");
		donwload_btn.setBounds(570, 150, 100, 30);
		donwload_btn.setFont(new Font("Segoe Print", Font.BOLD, 12));
		donwload_btn.setHorizontalAlignment(JLabel.CENTER);
		donwload_btn.setBackground(Color.decode("#dce3e6"));
		donwload_btn.setBorder(BorderFactory.createLineBorder(Color.decode("#18272b"), 2, true));
		panel_users.add(donwload_btn);
		
		JButton addd_btn = new JButton("Añadir");
		addd_btn.setBounds(685, 150, 90, 30);
		addd_btn.setFont(new Font("Segoe Print", Font.BOLD, 12));
		addd_btn.setHorizontalAlignment(JLabel.CENTER);
		addd_btn.setBackground(Color.decode("#dce3e6"));
		addd_btn.setBorder(BorderFactory.createLineBorder(Color.decode("#18272b"), 2, true));
		panel_users.add(addd_btn);
			
		String [] table_head = {"No. Control", "Nombre", "Apellidos", "Correo electrónico", "Semestre", "Carrera", "Acciones"};	
		
		Object [][] table_body = {
			    {"20451234", "Luis", "Hernández", "luis.hdz@example.com", "3", "Ingeniería en Sistemas", "Acciones"},
			    {"20457891", "María", "Gómez", "maria.gmz@example.com", "5", "Arquitectura", "Acciones"},
			    {"20453422", "Jorge", "Ramírez", "jorge.rz@example.com", "2", "Contaduría", "Acciones"},
			    {"20458977", "Ana", "López", "ana.lp@example.com", "7", "Administración", "Acciones"},
			    {"20452311", "Carlos", "Martínez", "carlos.mtz@example.com", "4", "Ingeniería Civil", "Acciones"},
			    {"20455678", "Fernanda", "Soto", "fer.soto@example.com", "6", "Diseño Gráfico", "Acciones"},
			    {"20459832", "Ricardo", "Pérez", "ricardo.pz@example.com", "1", "Ingeniería Mecánica", "Acciones"},
			    {"20454490", "Daniela", "Vargas", "daniela.vg@example.com", "8", "Psicología", "Acciones"},
			    {"20457701", "Héctor", "Castro", "hector.cs@example.com", "9", "Derecho", "Acciones"},
			    {"20456642", "Sofía", "Navarro", "sofia.nv@example.com", "3", "Medicina", "Acciones"},
			    {"20453387", "Miguel", "Ortega", "miguel.og@example.com", "10", "Ingeniería Industrial", "Acciones"},
			    {"20451298", "Paola", "Reyes", "paola.ry@example.com", "2", "Mercadotecnia", "Acciones"},
			    {"20450001", "Andrés", "Morales", "andres.mr@example.com", "4", "Ingeniería en Sistemas", "Acciones"},
			    {"20450002", "Valeria", "Rojas", "valeria.rj@example.com", "6", "Arquitectura", "Acciones"},
			    {"20450003", "Emilio", "Silva", "emilio.sl@example.com", "1", "Contaduría", "Acciones"},
			    {"20450004", "Camila", "Torres", "camila.tr@example.com", "8", "Administración", "Acciones"},
			    {"20450005", "Diego", "Flores", "diego.fl@example.com", "5", "Ingeniería Civil", "Acciones"},
			    {"20450006", "Ximena", "Mendoza", "ximena.md@example.com", "7", "Diseño Gráfico", "Acciones"},
			    {"20450007", "Iván", "Ruiz", "ivan.rz@example.com", "3", "Ingeniería Mecánica", "Acciones"},
			    {"20450008", "Lucía", "Aguilar", "lucia.ag@example.com", "9", "Psicología", "Acciones"},
			    {"20450009", "Bruno", "Salazar", "bruno.sz@example.com", "2", "Derecho", "Acciones"},
			    {"20450010", "Regina", "Peña", "regina.pn@example.com", "10", "Medicina", "Acciones"},
			    {"20450011", "Sebastián", "Cruz", "sebastian.cz@example.com", "4", "Ingeniería Industrial", "Acciones"},
			    {"20450012", "Natalia", "Campos", "natalia.cm@example.com", "6", "Mercadotecnia", "Acciones"}
		};
		
		DefaultTableModel model = new DefaultTableModel(table_body, table_head) {
	        @Override
	        public boolean isCellEditable(int row, int column) {
	            return false;
	        }
	    };
		
		JTable students = new JTable(model);
		
		students.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
		
		students.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
	    students.getTableHeader().setBackground(Color.decode("#4D7C8A"));
	    students.getTableHeader().setForeground(Color.white);
		
		JScrollPane final_table = new JScrollPane(students);
		final_table.setSize(700, 310);
		final_table.setLocation(75, 200);
		
		panel_users.add(final_table);

	
	}
	
	public void calculadora() {	
		JPanel panel_users = new JPanel();
		panel_users.setSize(500, 650);
		panel_users.setLocation(250, 50);
		panel_users.setBackground(Color.white);
		//panel_users.setOpaque(true);
		panel_users.setLayout(null);
		this.add(panel_users);
		
		JLabel field = new JLabel("180.00");
		field.setSize(480, 40);
		field.setLocation(10, 10);
		field.setOpaque(true);
		field.setBackground(Color.white);
		field.setFont(new Font("Arial", Font.BOLD, 22));
		field.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
		panel_users.add(field);				
		
		
		int cor_x = 30, cor_y = 60;
		String [] botones = {
			"CE", "", "", "", 
			"7", "8", "9", "/",
			"4", "5", "6", "*",
			"1", "2", "3","-",
			"0", ".", "=", "+"
		};
		
		for (int i = 0; i < 20; i++) {
			JButton ce = new JButton(botones[i]);
			ce.setSize(100, 100);
			ce.setLocation(cor_x, cor_y);
			
			cor_x += 110;
			panel_users.add(ce);
			
			if(cor_x >= 470) {
				cor_x = 30;
				cor_y += 110;
			}
		}				
	}
	
	public void calculadora_layout() {
		JPanel panel_users = new JPanel();
		panel_users.setSize(500, 650);
		panel_users.setLocation(250, 50);
		panel_users.setBackground(Color.white);
		//panel_users.setOpaque(true);
		panel_users.setLayout(null);
		this.add(panel_users);
		
		BorderLayout mi_layout1 = new BorderLayout();
		mi_layout1.setVgap(20);
		
		panel_users.setLayout(mi_layout1);
		this.add(panel_users);
		
		JLabel field = new JLabel("180.00");
		field.setOpaque(true);
		field.setBackground(Color.white);
		field.setFont(new Font("Segoe Print",Font.BOLD,25));
		field.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
		panel_users.add(field, BorderLayout.NORTH);
		
		JPanel centro = new JPanel();
		centro.setBackground(Color.decode("#dce3e6"));
		centro.setLayout(new GridLayout(4, 3));
		panel_users.add(centro, BorderLayout.CENTER);
		
		String [] botones = { "9", "8", "7", "6", "5", "4", "3", "2", "1", "0", ".", ""};
			
		for (int i = 0; i < botones.length; i++) {
			
			JButton ce = new JButton(botones[i]);
			ce.setSize(100, 100);
			ce.setFont(new Font("Segoe Print", Font.BOLD, 22));
			centro.add(ce);
		}
		
		JPanel sidebar = new JPanel();
		sidebar.setBackground(Color.gray);
		sidebar.setLayout(new GridLayout(6,1));
		panel_users.add(sidebar, BorderLayout.EAST);
		
		String [] botones2 = {  "CE", "-", "*", "/", "=", "+"};
			
		for (int i = 0; i < botones2.length; i++) {
			
			JButton ce = new JButton(botones2[i]);
			ce.setSize(100, 100);
			ce.setFont(new Font("Segoe Print", Font.BOLD, 22));
			sidebar.add(ce);
		}
		
		
	}
	
	public void calculadora_de_interes() {
		this.setLayout(new BorderLayout(10,10));
		
		this.setTitle("Calculando el interés");
		
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout(10,10));
		panel.setBackground(Color.decode("#fffee6"));
		panel.setBorder(BorderFactory.createEmptyBorder(20,20,20,20));
		this.add(panel, BorderLayout.CENTER);
		
		JLabel titulo = new JLabel("Interés");
		titulo.setFont(new Font("Serif", Font.ITALIC,28));
		titulo.setForeground(Color.decode("#d62431"));
		panel.add(titulo, BorderLayout.NORTH);
		
		//SECCION VERDE
		JPanel panelEntrada = new JPanel();
		panelEntrada.setBackground(Color.decode("#72d494"));
		panelEntrada.setLayout(new BorderLayout());
		panelEntrada.setBorder(BorderFactory.createCompoundBorder(
				BorderFactory.createEmptyBorder(0, 5, 5, 5),
				BorderFactory.createTitledBorder(
	            BorderFactory.createLineBorder(Color.decode("#5ba876"),2, true),
	            "Calcular Interés", 
	            TitledBorder.LEFT,
	            TitledBorder.ABOVE_TOP)));
		panel.add(panelEntrada, BorderLayout.CENTER);
		
		//gridlayout campos
		JPanel campos = new JPanel();
		campos.setOpaque(false);
		campos.setLayout(new GridLayout(3,2,20,20));
		campos.setBorder(BorderFactory.createEmptyBorder(20,40,20,40));
		
		JLabel lbl_capital = new JLabel("Capital:");
		lbl_capital.setFont(new Font("Segoe Print", Font.BOLD,12));
		JTextField txt_capital = new JTextField("1500");
		txt_capital.setEditable(false);
		
		JLabel lbl_tiempo = new JLabel("Tiempo:");
		lbl_tiempo.setFont(new Font("Segoe Print", Font.BOLD,12));
		JTextField txt_tiempo = new JTextField("2");
		txt_tiempo.setEditable(false);
		
		JLabel lbl_tasa = new JLabel("Tasa interés:");
		lbl_tasa.setFont(new Font("Segoe Print", Font.BOLD,12));
		JTextField txt_tasa = new JTextField("0.1");
		
		campos.add(lbl_capital);
		campos.add(txt_capital);
		campos.add(lbl_tiempo);
		campos.add(txt_tiempo);
		campos.add(lbl_tasa);
		campos.add(txt_tasa);
		
		panelEntrada.add(campos, BorderLayout.CENTER);
		
		//botones
		JPanel botones = new JPanel();
		botones.setOpaque(false);
	    botones.setLayout(new FlowLayout(FlowLayout.CENTER,40,10));
		
	    JButton calcular = new JButton("Calcular");
	    calcular.setFont(new Font("Segoe UI Semibold", Font.ITALIC, 15));
	    calcular.setBackground(Color.decode("#b0aeae"));

	    JButton cancelar = new JButton("Cancelar");
	    cancelar.setFont(new Font("Segoe UI Semibold", Font.ITALIC, 15));
	    cancelar.setBackground(Color.decode("#b0aeae"));

	    botones.add(calcular);
	    botones.add(cancelar);
	    panelEntrada.add(botones, BorderLayout.SOUTH);
	    
		//SECCION ROJA
		JPanel panelResultados = new JPanel();
		panelResultados.setLayout(new BorderLayout());
	    panelResultados.setBackground(Color.decode("#eb656f"));
	    //panelResultados.setBorder(BorderFactory.createEmptyBorder(20,40,20,40));
	    panelResultados.setBorder(BorderFactory.createCompoundBorder(
				BorderFactory.createEmptyBorder(6, 6, 6, 6),
	            BorderFactory.createLineBorder(Color.decode("#a13a41"),2, true)
	    ));
	    
	    JPanel camposResultados = new JPanel();
		camposResultados.setOpaque(false);
		camposResultados.setLayout(new GridLayout(3,2,20,20));
		camposResultados.setBorder(BorderFactory.createEmptyBorder(20,60,20,60));
	    
	    JLabel lbl_interes = new JLabel("Interés:");
	    lbl_interes.setFont(new Font("Segoe Print", Font.BOLD,12));
	    JTextField txt_interes = new JTextField("315.000000000002");
	    txt_interes.setEditable(false);

	    JLabel lbl_monto = new JLabel("Monto:");
	    lbl_monto.setFont(new Font("Segoe Print", Font.BOLD,12));
	    JTextField txt_monto = new JTextField("1815.000000000002");
	    txt_monto.setEditable(false);
	    
	    camposResultados.add(lbl_interes);
	    camposResultados.add(txt_interes);
	    camposResultados.add(lbl_monto);
	    camposResultados.add(txt_monto);

	    panelResultados.add(camposResultados, BorderLayout.CENTER);
	    panel.add(panelResultados, BorderLayout.SOUTH);

	}
	
	public void pintar() {
		JPanel pane = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                
                Graphics2D g2d = (Graphics2D) g;
                
                g2d.drawLine(0,0,960,680);
                
                g2d.setColor(Color.ORANGE);
                g2d.drawOval(100, 100, 150, 50);
                
                g2d.setStroke(new BasicStroke(1));
                g2d.setColor(Color.red);
                g2d.drawPolygon(new int[] {300,100,500}, new int[] {100,300,300},3);
                
                g2d.drawRect(250, 300, 100, 100);
                
                g2d.setColor(Color.magenta);
                g2d.drawRoundRect(500, 150, 100, 100, 30, 30);
                
                g2d.setColor(Color.blue);
                g2d.drawArc(400, 100, 100, 100, 0, 180);
                
                g2d.setFont(new Font("Arial", Font.BOLD, 22));
                g2d.drawString("Hola", 100, 100);
                
                g2d.setColor(Color.black);
                g2d.fillOval(500, 50, 50, 150);
                
                g2d.fillPolygon(new int[] {500,300,700}, new int[] {300,500,500},3);
                
                g2d.setColor(Color.green);
                g2d.fillRect(650, 500, 100, 100);
                
                g2d.setColor(Color.gray);
                g2d.fillRoundRect(500, 500, 100, 100, 30, 30);
                
                g2d.setColor(Color.yellow);
                g2d.fillArc(450, 150, 100, 100, 0, 180);
                
                BufferedImage image;
				try {
					image = ImageIO.read(new File("src/images/lluvia.jpg"));
					g2d.drawImage(image, 0, 0, null);
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        };
        pane.setSize(960, 680);
        pane.setLocation(0, 0);
        this.add(pane);
	}
}