package jas9;

/*Napisz program który wyœwietli pole rozwijane.
I po naciœniêciu na dany element z pola wyœwietli jego nazwê. Dodaj pole z podpowiedziami*/
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class JAS9 {
	private String[] languages = { "C", "C++", "C#", "Java", "Python" };
	private JFrame frame;
	private JComboBox comboBox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JAS9 window = new JAS9();
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
	public JAS9() {
		initialize();
		actionEvent();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		comboBox = new JComboBox(languages);
		comboBox.setToolTipText("Choose one");
		comboBox.setBounds(126, 97, 139, 48);
		frame.getContentPane().add(comboBox);
	}

	public void actionEvent() {
		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				String zmienna = "Selected: " + comboBox.getItemAt((comboBox.getSelectedIndex()));
				JOptionPane.showMessageDialog(comboBox, zmienna);
			}
		});
	}

}
