package main;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
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

		this.PaintJava();
		
		this.setVisible(true);
		this.repaint();
		
		
	}
	
    public void PaintJava() {
        setTitle("Paint - Java");
        setSize(1100, 750);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(10, 10));

        // pael iszquierdp
        JPanel panelIzquierdo = new JPanel();
        panelIzquierdo.setPreferredSize(new Dimension(220, 700));
        panelIzquierdo.setLayout(new BoxLayout(panelIzquierdo, BoxLayout.Y_AXIS));
        panelIzquierdo.setBorder(new TitledBorder("Herramientas"));

        JButton btnLapiz = new JButton("Lápiz");
        JButton btnPincel = new JButton("Pincel");
        JButton btnBorrador = new JButton("Borrador");
        JButton btnRelleno = new JButton("Relleno");
        JButton btnSeleccion = new JButton("Selección");

        JButton btnDeshacer = new JButton("Deshacer");
        JButton btnRehacer = new JButton("Rehacer");

        JButton[] botonesHerramientas = {
                btnLapiz, btnPincel, btnBorrador,
                btnRelleno, btnSeleccion,
                btnDeshacer, btnRehacer
        };

        for (JButton b : botonesHerramientas) {
            b.setMaximumSize(new Dimension(180, 45));
            b.setAlignmentX(Component.CENTER_ALIGNMENT);
            panelIzquierdo.add(Box.createVerticalStrut(10));
            panelIzquierdo.add(b);
        }

        panelIzquierdo.add(Box.createVerticalStrut(25));
        JLabel lblGrosor = new JLabel("Grosor del pincel:");
        lblGrosor.setAlignmentX(Component.CENTER_ALIGNMENT);
        panelIzquierdo.add(lblGrosor);

        String [] tamano = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
		
		JComboBox tamano_combo = new JComboBox(tamano);
		tamano_combo.setBounds(50, 430, 300, 30);
		tamano_combo.setMaximumSize(new Dimension(80, 30));
		tamano_combo.setAlignmentX(Component.CENTER_ALIGNMENT);

		panelIzquierdo.add(tamano_combo);
		
        add(panelIzquierdo, BorderLayout.WEST);

        //panel centro
        JPanel lienzo = new JPanel();
        lienzo.setBackground(Color.WHITE);
        lienzo.setBorder(BorderFactory.createLineBorder(Color.GRAY, 2));
        add(lienzo, BorderLayout.CENTER);

        // panel derecho
        JPanel panelDerecho = new JPanel();
        panelDerecho.setPreferredSize(new Dimension(220, 700));
        panelDerecho.setLayout(new BoxLayout(panelDerecho, BoxLayout.Y_AXIS));

        // formas
        JPanel panelFormas = new JPanel();
        panelFormas.setLayout(new GridLayout(4, 1, 5, 10));
        panelFormas.setBorder(new TitledBorder("Formas"));

        JRadioButton rectangulo = new JRadioButton("Rectángulo", true);
        JRadioButton circulo = new JRadioButton("Círculo");
        JRadioButton triangulo = new JRadioButton("Triángulo");
        JRadioButton linea = new JRadioButton("Línea");

        ButtonGroup grupo = new ButtonGroup();
        grupo.add(rectangulo);
        grupo.add(circulo);
        grupo.add(triangulo);
        grupo.add(linea);

        panelFormas.add(rectangulo);
        panelFormas.add(circulo);
        panelFormas.add(triangulo);
        panelFormas.add(linea);

        // colores
        JPanel panelColores = new JPanel();
        panelColores.setBorder(new TitledBorder("Colores"));
        panelColores.setLayout(new GridLayout(4, 3, 5, 5));

        Color[] colores = {
                Color.WHITE, Color.BLACK,
                Color.GRAY, Color.BLUE,
                Color.RED, Color.GREEN, 
                Color.PINK, Color.ORANGE,
                Color.YELLOW, Color.MAGENTA,
                Color.CYAN, Color.DARK_GRAY
        };

        for (Color c : colores) {
            JButton colorBtn = new JButton();
            colorBtn.setBackground(c);
            colorBtn.setPreferredSize(new Dimension(30, 30));
            panelColores.add(colorBtn);
        }

        panelDerecho.add(panelFormas);
        panelDerecho.add(Box.createVerticalStrut(20));
        panelDerecho.add(panelColores);

        add(panelDerecho, BorderLayout.EAST);

        //panel abajo
        JPanel panelInferior = new JPanel(new FlowLayout(FlowLayout.RIGHT, 15, 10));

        JButton btnLimpiar = new JButton("Limpiar lienzo");
        JButton btnGuardar = new JButton("Guardar como imagen...");

        btnLimpiar.setPreferredSize(new Dimension(180, 40));
        btnGuardar.setPreferredSize(new Dimension(220, 40));

        panelInferior.add(btnLimpiar);
        panelInferior.add(btnGuardar);

        add(panelInferior, BorderLayout.SOUTH);
    }
	
}