package jas8;

/*Napisz program który wyœwietli po naciœniêciu przycisku nazwê pola wyboru które
zosta³o zaznaczone. Dodaj pole z podpowiedziami.*/
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JAS8 {

	private JFrame frame;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JRadioButton rdbtnJava;
	private JRadioButton rdbtnPython;
	private JRadioButton rdbtnC;
	private JButton btnClick_1;
	private JButton btnReset;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JAS8 window = new JAS8();
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
	public JAS8() {
		initialize();
		actionEventAll(btnClick_1);

		btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonGroup.clearSelection();
			}
		});
		btnReset.setBounds(208, 190, 97, 25);
		frame.getContentPane().add(btnReset);
		actionEventRadioJava();
		actionEventRadioPython();
		actionEventRadioC();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		btnClick_1 = new JButton("Click");

		btnClick_1.setBounds(41, 190, 97, 25);
		frame.getContentPane().add(btnClick_1);

		rdbtnJava = new JRadioButton("Java");
		rdbtnJava.setToolTipText("Choose one");
		buttonGroup.add(rdbtnJava);
		rdbtnJava.setBounds(34, 45, 127, 25);
		frame.getContentPane().add(rdbtnJava);

		rdbtnPython = new JRadioButton("Python");
		rdbtnPython.setToolTipText("Choose one");
		buttonGroup.add(rdbtnPython);
		rdbtnPython.setBounds(34, 86, 127, 25);
		frame.getContentPane().add(rdbtnPython);

		rdbtnC = new JRadioButton("C++");
		rdbtnC.setToolTipText("Choose one");
		buttonGroup.add(rdbtnC);
		rdbtnC.setBounds(34, 117, 127, 25);
		frame.getContentPane().add(rdbtnC);
	}

	public void actionEventRadioC() {
		rdbtnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rdbtnC.isSelected()) {
					JOptionPane.showMessageDialog(rdbtnC, rdbtnC.getText() + " is checked");
				}
			}
		});
	}

	public void actionEventRadioPython() {
		rdbtnPython.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rdbtnPython.isSelected()) {
					JOptionPane.showMessageDialog(rdbtnPython, rdbtnPython.getText() + " is checked");
				}
			}
		});
	}

	public void actionEventRadioJava() {
		rdbtnJava.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rdbtnJava.isSelected()) {
					JOptionPane.showMessageDialog(rdbtnJava, rdbtnJava.getText() + " is checked");
				}
			}
		});
	}

	public void actionEventAll(JButton btnClick) {
		btnClick.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rdbtnJava.isSelected()) {
					JOptionPane.showMessageDialog(rdbtnJava, rdbtnJava.getText() + " is checked");
				}
				if (rdbtnPython.isSelected()) {
					JOptionPane.showMessageDialog(rdbtnPython, rdbtnPython.getText() + " is checked");
				}
				if (rdbtnC.isSelected()) {
					JOptionPane.showMessageDialog(rdbtnC, rdbtnC.getText() + " is checked");
				}
			}
		});
	}

}
