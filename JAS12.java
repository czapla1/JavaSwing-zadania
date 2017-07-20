package jas12;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class JAS12 {

	private JFrame frame;
	private JTable table;
	private JTextField textField;
	private JTextField txtImie;
	private JTextField textField_1;
	private DefaultTableModel tbModel;
	private JButton btnRemove;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JAS12 window = new JAS12();
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
	public JAS12() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		Vector<Vector<String>> data1 = new Vector<>();
		Vector<String> names1 = new Vector<>();
		names1.add("ID");
		names1.add("Name");
		names1.add("Salary");

		Vector<String> pierwszy = new Vector<>();
		pierwszy.add("101");
		pierwszy.add("Amit");
		pierwszy.add("67000");
		data1.add(pierwszy);

		Vector<String> drugi = new Vector<>();
		drugi.add("102");
		drugi.add("Jaj");
		drugi.add("780000");
		data1.add(drugi);
		
		Vector<String> trzeci = new Vector<>();
		trzeci.add("103");
		trzeci.add("Adam");
		trzeci.add("670000");
		data1.add(trzeci);

		Vector<String> nowy = new Vector<>();
		frame = new JFrame();
		frame.setBounds(100, 100, 568, 447);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(71, 49, 305, 191);
		frame.getContentPane().add(scrollPane);

		// table = new JTable(data,names);
		tbModel = new DefaultTableModel(data1, names1);
		table = new JTable(tbModel);

		scrollPane.setViewportView(table);

		JButton btnAdd = new JButton("Add");
		btnAdd.setToolTipText("Press to add person");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				nowy.add(textField.getText());
				nowy.add(txtImie.getText());
				nowy.add(textField_1.getText());
				tbModel.addRow(nowy);
			}
		});
		btnAdd.setBounds(135, 320, 97, 25);
		frame.getContentPane().add(btnAdd);

		textField = new JTextField();
		textField.setText("104");
		textField.setBounds(72, 270, 116, 22);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		txtImie = new JTextField();
		txtImie.setText("Imie");
		txtImie.setBounds(189, 270, 116, 22);
		frame.getContentPane().add(txtImie);
		txtImie.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setText("45000");
		textField_1.setBounds(305, 270, 116, 22);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);

		btnRemove = new JButton("Remove");
		btnRemove.setToolTipText("Choose person in table and press to remove");
		btnRemove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tbModel.removeRow(table.getSelectedRow());
			}
		});
		btnRemove.setBounds(279, 320, 97, 25);
		frame.getContentPane().add(btnRemove);
	}
}
