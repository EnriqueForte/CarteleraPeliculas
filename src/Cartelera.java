package codigo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.JRadioButton;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.Box;
import javax.swing.JTextField;
import javax.swing.JTextArea;

public class Cartelera extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel frameCartelera;
	private JTextField campoTexto;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cartelera frame = new Cartelera();
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
	public Cartelera() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 960, 320);
		frameCartelera = new JPanel();
		frameCartelera.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(frameCartelera);
		frameCartelera.setLayout(null);
		
		JLabel labelPregunta = new JLabel("¿Qué te apetece ver hoy?");
		labelPregunta.setBounds(10, 58, 363, 27);
		labelPregunta.setForeground(new Color(0, 0, 255));
		labelPregunta.setFont(new Font("Broadway", Font.PLAIN, 23));
		frameCartelera.add(labelPregunta);
		
		JRadioButton rbRomantica = new JRadioButton("Romántica");
		rbRomantica.setBounds(355, 19, 169, 33);
		frameCartelera.add(rbRomantica);
		rbRomantica.setFont(new Font("Consolas", Font.ITALIC, 21));
		
		JRadioButton rbMisterio = new JRadioButton("Misterio");
		rbMisterio.setBounds(355, 227, 158, 33);
		frameCartelera.add(rbMisterio);
		rbMisterio.setFont(new Font("Consolas", Font.ITALIC, 21));
		
		JRadioButton rbTerror = new JRadioButton("Terror");
		rbTerror.setBounds(355, 71, 169, 33);
		frameCartelera.add(rbTerror);
		rbTerror.setFont(new Font("Consolas", Font.ITALIC, 21));
		
		JRadioButton rbComedia = new JRadioButton("Comedia");
		rbComedia.setBounds(355, 123, 158, 33);
		frameCartelera.add(rbComedia);
		rbComedia.setFont(new Font("Consolas", Font.ITALIC, 21));
		
		JRadioButton rbAccion = new JRadioButton("Acción");
		rbAccion.setBounds(355, 175, 158, 33);
		frameCartelera.add(rbAccion);
		rbAccion.setFont(new Font("Consolas", Font.ITALIC, 21));
		
		ButtonGroup bgGeneroPelis = new ButtonGroup();
		bgGeneroPelis.add(rbAccion);
		bgGeneroPelis.add(rbComedia);
		bgGeneroPelis.add(rbMisterio);
		bgGeneroPelis.add(rbRomantica);
		bgGeneroPelis.add(rbTerror);
		
		JPanel panel = new JPanel();
		panel.setBounds(615, 10, 248, 241);
		frameCartelera.add(panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel labelImagen = new JLabel("");
		panel.add(labelImagen);
		
		campoTexto = new JTextField();
		campoTexto.setBounds(73, 95, 149, 45);
		frameCartelera.add(campoTexto);
		campoTexto.setColumns(10);
		
		JTextArea areaTexto = new JTextArea();
		areaTexto.setBounds(73, 186, 169, 74);
		frameCartelera.add(areaTexto);
/*
		rbAccion.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				labelImagen.setIcon(new ImageIcon("images/accion.jpg"));
			}
		});
*/
		

		ActionListener actionListener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource()==rbAccion)
					labelImagen.setIcon(new ImageIcon("images/accion.jpg"));
				else if (e.getSource()==rbComedia)
					labelImagen.setIcon(new ImageIcon("images/comedia.jpg"));
				else if (e.getSource()==rbTerror)
					labelImagen.setIcon(new ImageIcon("images/terror.jpg"));
				else if (e.getSource()==rbMisterio)
					labelImagen.setIcon(new ImageIcon("images/misterio.jpg"));
				else if (e.getSource()==rbRomantica)
					labelImagen.setIcon(new ImageIcon("images/romantica.jpg"));
				
				areaTexto.setText(campoTexto.getText());
			}
		};
		
		rbAccion.addActionListener(actionListener);
		rbComedia.addActionListener(actionListener);
		rbTerror.addActionListener(actionListener);
		rbMisterio.addActionListener(actionListener);
		rbRomantica.addActionListener(actionListener);
		
	}
}
