package main;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.Timer;

public class memorama {

	private JFrame frame;

	public Integer [] cartas = {1,1,2,2,3,3,4,4,5,5,6,6};
	public int [] status = {0,0,0,0,0,0,0,0,0,0,0,0};
	public int tarjetas_mostradas = 0;
	public int carta_1=0,carta_2=0;
	public List<JButton> botones = new ArrayList<>();

	public int segundos = 0;
	public int movimientos = 0;
	public int pares = 0;

	JLabel lblMovimientos;
	JLabel lblPares;
	JLabel lblTiempo;

	Timer cronometro;

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
		frame.setBounds(100, 100, 689, 569);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//desordenar cartas
		List<Integer> lista = Arrays.asList(cartas);
		Collections.shuffle(lista);
		lista.toArray(cartas);

		// panel arriba
		JPanel panel = new JPanel();
		panel.setBackground(new Color(140, 152, 255));
		frame.getContentPane().add(panel, BorderLayout.NORTH);
		panel.setLayout(new GridLayout(1, 3, 0, 0));

		lblMovimientos = new JLabel("mov: 0");
		lblMovimientos.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblMovimientos);

		lblPares = new JLabel("pares: 0");
		lblPares.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblPares);

		lblTiempo = new JLabel("tiempo: 0");
		lblTiempo.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblTiempo);

		// panel abajo
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 128));
		frame.getContentPane().add(panel_1, BorderLayout.SOUTH);

		JButton btnReiniciar = new JButton("Reiniciar");

		btnReiniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				cronometro.stop();
				frame.dispose();

				memorama nuevo = new memorama();
				nuevo.frame.setVisible(true);
			}
		});

		panel_1.add(btnReiniciar);

		JButton btnPausa = new JButton("Pausa");

		btnPausa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if(cronometro.isRunning()) {
					cronometro.stop();
					btnPausa.setText("Reanudar");
				}else{
					cronometro.start();
					btnPausa.setText("Pausa");
				}
			}
		});

		panel_1.add(btnPausa);

		// panel centro
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(130, 255, 255));
		frame.getContentPane().add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(new GridLayout(3, 4, 0, 0));

		JButton btnNewButton_4 = new JButton("");
		btnNewButton_4.addActionListener(e -> flip(0,btnNewButton_4));
		btnNewButton_4.setIcon(new ImageIcon(memorama.class.getResource("/images/placeholder.png")));
		panel_2.add(btnNewButton_4);

		JButton btnNewButton_5 = new JButton("");
		btnNewButton_5.addActionListener(e -> flip(1,btnNewButton_5));
		btnNewButton_5.setIcon(new ImageIcon(memorama.class.getResource("/images/placeholder.png")));
		panel_2.add(btnNewButton_5);

		JButton btnNewButton_8 = new JButton("");
		btnNewButton_8.addActionListener(e -> flip(2,btnNewButton_8));
		btnNewButton_8.setIcon(new ImageIcon(memorama.class.getResource("/images/placeholder.png")));
		panel_2.add(btnNewButton_8);

		JButton btnNewButton_9 = new JButton("");
		btnNewButton_9.addActionListener(e -> flip(3,btnNewButton_9));
		btnNewButton_9.setIcon(new ImageIcon(memorama.class.getResource("/images/placeholder.png")));
		panel_2.add(btnNewButton_9);

		JButton btnNewButton_11 = new JButton("");
		btnNewButton_11.addActionListener(e -> flip(4,btnNewButton_11));
		btnNewButton_11.setIcon(new ImageIcon(memorama.class.getResource("/images/placeholder.png")));
		panel_2.add(btnNewButton_11);

		JButton btnNewButton_12 = new JButton("");
		btnNewButton_12.addActionListener(e -> flip(5,btnNewButton_12));
		btnNewButton_12.setIcon(new ImageIcon(memorama.class.getResource("/images/placeholder.png")));
		panel_2.add(btnNewButton_12);

		JButton btnNewButton_7 = new JButton("");
		btnNewButton_7.addActionListener(e -> flip(6,btnNewButton_7));
		btnNewButton_7.setIcon(new ImageIcon(memorama.class.getResource("/images/placeholder.png")));
		panel_2.add(btnNewButton_7);

		JButton btnNewButton_6 = new JButton("");
		btnNewButton_6.addActionListener(e -> flip(7,btnNewButton_6));
		btnNewButton_6.setIcon(new ImageIcon(memorama.class.getResource("/images/placeholder.png")));
		panel_2.add(btnNewButton_6);

		JButton btnNewButton_10 = new JButton("");
		btnNewButton_10.addActionListener(e -> flip(8,btnNewButton_10));
		btnNewButton_10.setIcon(new ImageIcon(memorama.class.getResource("/images/placeholder.png")));
		panel_2.add(btnNewButton_10);

		JButton btnNewButton_13 = new JButton("");
		btnNewButton_13.addActionListener(e -> flip(9,btnNewButton_13));
		btnNewButton_13.setIcon(new ImageIcon(memorama.class.getResource("/images/placeholder.png")));
		panel_2.add(btnNewButton_13);

		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.addActionListener(e -> flip(10,btnNewButton_3));
		btnNewButton_3.setIcon(new ImageIcon(memorama.class.getResource("/images/placeholder.png")));
		panel_2.add(btnNewButton_3);

		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.addActionListener(e -> flip(11,btnNewButton_2));
		btnNewButton_2.setIcon(new ImageIcon(memorama.class.getResource("/images/placeholder.png")));
		panel_2.add(btnNewButton_2);

		// cronometro
		cronometro = new Timer(1000, new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				segundos++;
				lblTiempo.setText("tiempo: " + segundos);
			}
		});

		cronometro.start();
	}

	protected void flip(Integer n, JButton b) {

		if(status[n] == 0) {

			if(carta_1 == 0) {
				carta_1 = cartas[n];

			}else {
				carta_2 = cartas[n];
				movimientos++;
				lblMovimientos.setText("mov: " + movimientos);
			}

			status[n] = 1;

			b.setIcon(new ImageIcon(memorama.class.getResource("/images/"+cartas[n]+".png")));

			botones.add(b);

			tarjetas_mostradas++;

			if(tarjetas_mostradas == 2) {

				if (carta_1 == carta_2 && carta_1!=0) {
					pares++;
					lblPares.setText("pares: " + pares);

					if(pares == 6) {
						cronometro.stop();
						JOptionPane.showMessageDialog(null,"Ganaste");
					}

					for (Iterator iterator = botones.iterator(); iterator.hasNext();) {
						JButton jButton = (JButton) iterator.next();
						jButton.setEnabled(false);
					}

					botones.clear();

				}else {

					JOptionPane.showMessageDialog(null,"No son iguales");
					for (Iterator iterator = botones.iterator(); iterator.hasNext();) {
						JButton jButton = (JButton) iterator.next();
						jButton.setIcon(new ImageIcon(memorama.class.getResource("/images/placeholder.png")));
					}

					botones.clear();
				}

				tarjetas_mostradas = 0;
				carta_1 = 0;
				carta_2 = 0;

				for (int i = 0; i < 12; i++) {
					status[i] = 0;
				}
			}
		}
	}
}
