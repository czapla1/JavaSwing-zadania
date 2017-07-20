package jas15;
/*
Napisz program, który wyœwietli listê imion i nazwisk.
Po wybraniu jakiegoœ elementu z jednej b¹dŸ drugiej listy bêdzie zwraca³ imie i
nazwisko oraz, d³ugoœæ imienia i nazwiska*/

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;

public class JAS15 extends JFrame {

	private JPanel contentPane;
	/**
	 * @wbp.nonvisual location=43,556
	 */
	private final JCheckBox checkBox = new JCheckBox("New check box");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JAS15 frame = new JAS15();
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
	public JAS15() {
		initialize();
	}

	public void initialize() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 732, 504);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		DefaultListModel<String> l1 = new DefaultListModel<>();
		l1.addElement("Anna");
		l1.addElement("Ola");
		l1.addElement("Ala");
		l1.addElement("Ela");

		DefaultListModel<String> l2 = new DefaultListModel<>();
		l2.addElement("Nowak");
		l2.addElement("Kot");
		l2.addElement("Kowalska");
		l2.addElement("Przybysz");

		JLabel lblImie = new JLabel("Imie");
		lblImie.setBounds(38, 96, 56, 16);
		contentPane.add(lblImie);

		JLabel lblNazwisko = new JLabel("Nazwisko");
		lblNazwisko.setBounds(365, 96, 56, 16);
		contentPane.add(lblNazwisko);

		JList listImie = new JList(l1);
		listImie.setBounds(38, 125, 175, 211);
		contentPane.add(listImie);

		JList listNazwisko = new JList(l2);
		listNazwisko.setBounds(356, 138, 185, 211);
		contentPane.add(listNazwisko);

		JLabel lblDlImie = new JLabel();
		lblDlImie.setBounds(167, 67, 56, 16);
		contentPane.add(lblDlImie);

		JLabel lbDlNazwisko = new JLabel();
		lbDlNazwisko.setBounds(483, 67, 56, 16);
		contentPane.add(lbDlNazwisko);

		JLabel lblWybor = new JLabel();
		contentPane.add(lbDlNazwisko);

		JButton btnClick = new JButton("Click");
		btnClick.setToolTipText("Select name and surname and press button");
		btnClick.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String data = "";

				if (listImie.getSelectedIndex() != -1) {
					data += "Selected person: " + listImie.getSelectedValue();
					lblWybor.setText(data);

					int dlImie = listImie.getSelectedValue().toString().length();
					lblDlImie.setText(dlImie + "");
				}
				if (listNazwisko.getSelectedIndex() != -1) {
					data += " " + listNazwisko.getSelectedValue();
					lblWybor.setText(data);

					int dlNazwisko = listNazwisko.getSelectedValue().toString().length();
					lbDlNazwisko.setText(dlNazwisko + "");

				}

			}
		});
		btnClick.setBounds(217, 389, 127, 55);
		contentPane.add(btnClick);

		JLabel lblDlugoscImienia = new JLabel("Dlugosc imienia:");
		lblDlugoscImienia.setBounds(38, 67, 117, 16);
		contentPane.add(lblDlugoscImienia);

		JLabel lblNewLabel = new JLabel("D\u0142ugo\u015B\u0107 nazwiska: ");
		lblNewLabel.setBounds(365, 67, 132, 16);
		contentPane.add(lblNewLabel);

	}
}
