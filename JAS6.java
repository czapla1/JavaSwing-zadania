import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/*Napisz program, który bêdzie mia³ pole has³a, pole tekstowe i przycisk.
Je¿eli w polu has³a wpiszemy poprawne has³o zaszyte w programie
to pojawi siê etykieta z napisem „Witaj” + wartoœæ pola tekstowego.
Natomiast jak bêdzie z³e has³o to pojawi siê komunikat „Z³e has³o”*/
public class JAS6 extends JFrame implements ActionListener {
	JPasswordField pf;
	JTextField tf;
	JButton bt;
	JLabel lb;

	String password = "pass1";

	JAS6() {
		pf = new JPasswordField();
		pf.setBounds(20, 20, 100, 30);
		pf.addActionListener(this);
		tf = new JTextField("Imie:");
		tf.setBounds(20, 60, 100, 30);

		bt = new JButton("Przycisk");
		bt.setBounds(20, 100, 100, 30);
		bt.addActionListener(this);

		lb = new JLabel("Has³o:");
		lb.setBounds(20, 150, 100, 30);
		setSize(500, 300);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(pf);
		add(tf);
		add(bt);
		add(lb);
		setVisible(true);
	}

	JAS6(String title) {
		this();
		this.setTitle(title);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		String pass = "";
		for (char a : pf.getPassword()) {
			pass += a;
			String text = tf.getText();
			if (pass.equals(password)) {
				lb.setText("Witaj " + text);
			} else {
				lb.setText("Z³e has³o!");
			}
		}
	}

	public static void main(String[] args) {
		new JAS6();

	}

}
