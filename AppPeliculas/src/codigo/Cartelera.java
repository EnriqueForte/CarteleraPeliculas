package codigo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.JRadioButton;

public class Cartelera extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel frameCartelera;

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
		setBounds(100, 100, 960, 340);
		frameCartelera = new JPanel();
		frameCartelera.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(frameCartelera);
		frameCartelera.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("¿Que tenes ganas de ver?");
		lblNewLabel.setBounds(10, 96, 297, 26);
		lblNewLabel.setForeground(new Color(0, 0, 255));
		lblNewLabel.setFont(new Font("Broadway", Font.PLAIN, 22));
		frameCartelera.add(lblNewLabel);
		
		JRadioButton rbRomantica = new JRadioButton("Romántica");
		rbRomantica.setFont(new Font("Lucida Calligraphy", Font.BOLD | Font.ITALIC, 18));
		rbRomantica.setBounds(367, 52, 155, 23);
		frameCartelera.add(rbRomantica);
		
		JRadioButton rbTerror = new JRadioButton("Terror");
		rbTerror.setFont(new Font("Lucida Calligraphy", Font.BOLD | Font.ITALIC, 18));
		rbTerror.setBounds(367, 78, 155, 23);
		frameCartelera.add(rbTerror);
		
		JRadioButton rbMisterio = new JRadioButton("Misterio");
		rbMisterio.setFont(new Font("Lucida Calligraphy", Font.BOLD | Font.ITALIC, 18));
		rbMisterio.setBounds(367, 103, 155, 23);
		frameCartelera.add(rbMisterio);
		
		JRadioButton rbComedia = new JRadioButton("Comedia");
		rbComedia.setFont(new Font("Lucida Calligraphy", Font.BOLD | Font.ITALIC, 18));
		rbComedia.setBounds(367, 133, 155, 23);
		frameCartelera.add(rbComedia);
		
		JRadioButton rbAccion = new JRadioButton("Acción");
		rbAccion.setFont(new Font("Lucida Calligraphy", Font.BOLD | Font.ITALIC, 18));
		rbAccion.setBounds(367, 159, 155, 23);
		frameCartelera.add(rbAccion);
		
		ButtonGroup bgGeneroPelis = new ButtonGroup();
		bgGeneroPelis.add(rbRomantica);
		bgGeneroPelis.add(rbTerror);
		bgGeneroPelis.add(rbMisterio);
		bgGeneroPelis.add(rbComedia);
		bgGeneroPelis.add(rbAccion);
		
		JLabel labelImagen = new JLabel("");
		labelImagen.setBounds(576, 11, 243, 269);
		frameCartelera.add(labelImagen);
		
	/*	rbAccion.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				labelImagen.setIcon(new ImageIcon("images/accion.jpg"));
			}
		});
	*/	
		
		
		ActionListener actionListener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource()== rbAccion)
					labelImagen.setIcon(new ImageIcon("images/accion.jpg"));
				else if(e.getSource()== rbComedia)
					labelImagen.setIcon(new ImageIcon("images/comedia.jpg"));
				else if(e.getSource()== rbMisterio)
					labelImagen.setIcon(new ImageIcon("images/misterio.jpg"));
				else if(e.getSource()== rbRomantica)
					labelImagen.setIcon(new ImageIcon("images/romantica.jpg"));
				else if(e.getSource()== rbTerror)
					labelImagen.setIcon(new ImageIcon("images/terror.jpg"));
					
			}
		};
		
		rbAccion.addActionListener(actionListener);
		rbComedia.addActionListener(actionListener);
		rbMisterio.addActionListener(actionListener);
		rbRomantica.addActionListener(actionListener);
		rbTerror.addActionListener(actionListener);
		
	}
}
