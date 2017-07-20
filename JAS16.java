package jas16;

/*Wyœwietl okno dialogowe które prosi o twoje imiê a nastêpnie po zatwierdzeniu
wyœwietla okno z napisem „Witaj” + imie;
Sformatuj tak etykietê ¿eby u¿yæ czcionki pogrubionej o rozmiarze 25 „Calbri”*/
import java.awt.EventQueue;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class JAS16 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JAS16 frame = new JAS16();
					// frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JAS16() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 632, 461);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		String text = "<html><font face='Calibri'size=25><b>Podaj imie</b></font></html>";
		String name = JOptionPane.showInputDialog(text);
		JOptionPane.showMessageDialog(this, "<html><font face='Calibri' size='25' b >Witaj " + name + "!</b>");
	}

}
