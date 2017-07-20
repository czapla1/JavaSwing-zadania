package jas19;

/*Napisz program który bêdzie zmienia³ kolor czcionki dla trzech etykiet z osobna. Po
klikniêciu na nie mysz¹.
Naje¿d¿aj¹c mysz¹ na etykietê napis powinien zmieniaæ kolor.
Po zjechaniu z etykiety powinien powracaæ do swojego ustawionego standardowo
koloru.*/
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.ColorModel;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class JAS19 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JAS19 frame = new JAS19();
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
	public JAS19() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 425);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblEt1 = new JLabel("Etykieta 1");
		lblEt1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				lblEt1.setForeground(Color.red);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				lblEt1.setForeground(Color.black);
			}
		});

		lblEt1.setBounds(35, 43, 414, 48);
		contentPane.add(lblEt1);

		JLabel lblEt2 = new JLabel("Etykieta 2");
		lblEt2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblEt2.setForeground(Color.blue);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				lblEt2.setForeground(Color.black);
			}
		});
		lblEt2.setBounds(35, 132, 56, 16);
		contentPane.add(lblEt2);

		JLabel lblEt3 = new JLabel("Etykieta 3");
		lblEt3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblEt3.setForeground(Color.green);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				lblEt3.setForeground(Color.black);
			}
		});
		lblEt3.setBounds(35, 212, 56, 16);
		contentPane.add(lblEt3);
	}
}
