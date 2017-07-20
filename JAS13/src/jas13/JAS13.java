package jas13;

/*Napisz program który po³¹czy siê z baz¹ danych i wyœwietli z niej jak¹œ tabelê*/
import java.awt.EventQueue;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class JAS13 {

	private JFrame frame;
	private JTable table;
	private DBConnectionNew dbCon;
	private DefaultTableModel dtm;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JAS13 window = new JAS13();
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
	public JAS13() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		try {

			dbCon = DBConnectionNew.makeConnection("root", "kwiat23");
			ResultSet rs = dbCon.getTable("zawodnicy");
			Vector<String> names = new Vector<>();
			ResultSet rsDB = dbCon.getCon().getMetaData().getTables(null, null, "%", null);

			for (int i = 1; i < rs.getMetaData().getColumnCount(); i++) {
				names.add(rs.getMetaData().getColumnName(i));
			}
			Vector<Vector<String>> data = new Vector<>();
			while (rs.next()) {
				Vector<String> tem = new Vector<>();
				for (int i = 1; i < rs.getMetaData().getColumnCount(); i++) {
					tem.add(rs.getString(i));

				}
				data.add(tem);

			}

			dtm = new DefaultTableModel(data, names);
		} catch (MySuperExc e) {

			e.coSieStalo();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		frame = new JFrame();
		frame.setBounds(100, 100, 765, 517);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(28, 27, 649, 386);
		frame.getContentPane().add(scrollPane);

		table = new JTable(dtm);
		scrollPane.setViewportView(table);
	}

}
