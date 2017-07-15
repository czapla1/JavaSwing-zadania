
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/*Napisz program który wyœwietli okno z polem tekstowym etykiet¹ i przyciskiem.
- Na etykiecie bêdzie napisane na pocz¹tku „Hello world!!!”
- W polu tekstowym mo¿na wpisaæ jakiœ napis np. imie
- Po naciœniêciu przycisku napis na etykiecie zamieni siê na „Witaj”+ imie.
- Akcja powinna byæ równie¿ wykonywana przy naciœniêciu enter*/
public class JAS4 extends JFrame implements ActionListener {

	JTextField tf1;
	JButton bt1;
	JLabel lb1;

	JAS4() {

		setSize(500, 300);
		setLayout(null);

		lb1 = new JLabel("Hello world!!");
		lb1.setBounds(20, 20, 200, 30);
		add(lb1);

		tf1 = new JTextField("Podaj imie");
		tf1.setBounds(20, 60, 200, 30);
		tf1.addActionListener(this);
		add(tf1);

		bt1 = new JButton("Przycisk");
		bt1.setBounds(20, 150, 200, 30);
		bt1.addActionListener(this);
		add(bt1);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// zamkniecie krzyzykiem

		setVisible(true);
	}

	JAS4(String title) {
		this();
		this.setTitle(title);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String imie = tf1.getText();
		lb1.setText("Witaj " + imie + "!");
	}

	public static void main(String[] args) {
		new JAS4();

	}

}
