package main;

import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.JComboBox;
import java.awt.Dimension;

public class Ventana2 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana2 window = new Ventana2();
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
	public Ventana2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(450, 150, 650, 520);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel titulo = new JLabel("Registro de usuarios");
		titulo.setBackground(new Color(253, 250, 189));
		titulo.setFont(new Font("Segoe Print", Font.BOLD | Font.ITALIC, 17));
		frame.getContentPane().add(titulo, BorderLayout.NORTH);
		
		JPanel panelCentral = new JPanel();
		panelCentral.setBackground(new Color(253, 250, 189));
		panelCentral.setLayout(new GridLayout(2,2,10,10));
		frame.getContentPane().add(panelCentral, BorderLayout.CENTER);
		
		
		JPanel datosGenerales = new JPanel(new GridLayout(6,2,5,5));
		datosGenerales.setBackground(new Color(252, 194, 116));
		datosGenerales.setBorder(new TitledBorder("Datos Generales"));

		datosGenerales.add(new JLabel("Nombres:"));
		JTextField txtNombre = new JTextField();
		datosGenerales.add(txtNombre);

		datosGenerales.add(new JLabel("Apellido Paterno:"));
		JTextField txtApellidoP = new JTextField();
		datosGenerales.add(txtApellidoP);

		datosGenerales.add(new JLabel("Apellido Materno:"));
		JTextField txtApellidoM = new JTextField();
		datosGenerales.add(txtApellidoM);
		
		datosGenerales.add(new JLabel("Fecha de Nacimiento:"));
		JTextField txtFechaN = new JTextField();
		datosGenerales.add(txtFechaN);
		
		datosGenerales.add(new JLabel("Sexo:"));

		JPanel sexoPanel = new JPanel(new GridLayout(2,1));
		JRadioButton masculino = new JRadioButton("Masculino");
		masculino.setBackground(new Color(252, 194, 116));
		JRadioButton femenino = new JRadioButton("Femenino");
		femenino.setBackground(new Color(252, 194, 116));

		ButtonGroup grupoSexo = new ButtonGroup();
		grupoSexo.add(masculino);
		grupoSexo.add(femenino);

		sexoPanel.add(masculino);
		sexoPanel.add(femenino);

		datosGenerales.add(sexoPanel);
		
		datosGenerales.add(new JLabel("Pais:"));
		
		panelCentral.add(datosGenerales);
		
		String [] pais = {"Mexico", "Peru", "Colombia", "Guatemala", "Chile", "Brasil"};
		JComboBox pais_combo = new JComboBox(pais);
		datosGenerales.add(pais_combo);
		
		
		JPanel perfil = new JPanel(new BorderLayout());
		perfil.setBackground(new Color(255, 176, 176));
		perfil.setBorder(new TitledBorder("Perfil de usuario"));

		ImageIcon small_image = new ImageIcon(getClass().getResource("/images/foto de perfil.png"));

		Image img = small_image.getImage().getScaledInstance(130, 150, Image.SCALE_SMOOTH);
		ImageIcon small_scaled = new ImageIcon(img);

		JLabel foto = new JLabel(small_scaled);
		foto.setHorizontalAlignment(SwingConstants.CENTER);
		//foto.setHorizontalAlignment(SwingConstants.CENTER);
		
		//foto.setBorder(new javax.swing.border.LineBorder(Color.BLACK));

		perfil.add(foto, BorderLayout.NORTH);
		
		JPanel opcionesPerfil = new JPanel(new GridLayout(2,1));

		JCheckBox mostrarFoto = new JCheckBox("Mostrar foto de perfil");
		mostrarFoto.setBackground(new Color(255, 176, 176));
		mostrarFoto.setHorizontalAlignment(SwingConstants.CENTER);
		JCheckBox mostrarFecha = new JCheckBox("Mostrar fecha de nacimiento");
		mostrarFecha.setBackground(new Color(255, 176, 176));
		mostrarFecha.setHorizontalAlignment(SwingConstants.CENTER);

		opcionesPerfil.add(mostrarFoto);
		opcionesPerfil.add(mostrarFecha);

		perfil.add(opcionesPerfil, BorderLayout.CENTER);

		panelCentral.add(perfil);
		
		
		
		JPanel opcionales = new JPanel(new GridLayout(1,2,10,10));
		opcionales.setBackground(new Color(255, 151, 151));
		opcionales.setBorder(new TitledBorder("Datos Opcionales"));

		JPanel descripcionPanel = new JPanel(new BorderLayout());
		descripcionPanel.setBorder(new TitledBorder("Descripción"));
		
		JPanel preferencias = new JPanel(new BorderLayout());
		preferencias.setBorder(new TitledBorder("Preferencias"));

		opcionales.add(descripcionPanel);
		
		JTextArea textArea = new JTextArea();
		descripcionPanel.add(textArea, BorderLayout.CENTER);
		opcionales.add(preferencias);
		
		/*String [] lista = {"Cantar", "Escuchar musica", "Leer", "Deportes",  "Otros"};
		JList list = new JList(lista);
		preferencias.add(list, BorderLayout.CENTER);*/
		
		JPanel panelChecks = new JPanel(new GridLayout(5,1));

		JCheckBox cantar = new JCheckBox("Cantar");
		JCheckBox musica = new JCheckBox("Escuchar musica");
		JCheckBox leer = new JCheckBox("Leer");
		JCheckBox deportes = new JCheckBox("Deportes");
		JCheckBox otros = new JCheckBox("Otros");

		panelChecks.add(cantar);
		panelChecks.add(musica);
		panelChecks.add(leer);
		panelChecks.add(deportes);
		panelChecks.add(otros);

		preferencias.add(panelChecks, BorderLayout.CENTER);
		
		panelCentral.add(opcionales);
		
		
		
		JPanel panelBotones = new JPanel(new GridLayout(3,1));
		panelBotones.setBackground(new Color(252, 194, 116));

		JButton btnNuevo = new JButton("Nuevo");
		btnNuevo.setBackground(new Color(255,255,255));
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setBackground(new Color(255,255,255));
		JButton btnSalir = new JButton("Salir");
		btnSalir.setBackground(new Color(255,255,255));
		
		Dimension tamaño = new Dimension(100,30);
		btnNuevo.setPreferredSize(tamaño);
		btnGuardar.setPreferredSize(tamaño);
		btnSalir.setPreferredSize(tamaño);

		JPanel p1 = new JPanel(new FlowLayout());
		p1.setBackground(new Color(252, 194, 116));
		JPanel p2 = new JPanel(new FlowLayout());
		p2.setBackground(new Color(252, 194, 116));
		JPanel p3 = new JPanel(new FlowLayout());
		p3.setBackground(new Color(252, 194, 116));

		p1.add(btnNuevo);
		p2.add(btnGuardar);
		p3.add(btnSalir);

		panelBotones.add(p1);
		panelBotones.add(p2);
		panelBotones.add(p3);

		panelCentral.add(panelBotones);	
	}

}
