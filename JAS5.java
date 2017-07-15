import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

/*Napisz program w którym bêd¹ dwa pola tekstowe i przycisk.
 Po naciœniêciu przycisku bêdzie zmienia³o napisy miêdzy polami tekstowymi*/
public class JAS5 extends JFrame implements ActionListener {

	JTextArea ta1;
	JTextArea ta2;
	JButton bt;

	JAS5() {

		setSize(500, 300);
		setLayout(null);

		ta1 = new JTextArea();
		ta1.setBounds(20, 30, 200, 30);
		ta2 = new JTextArea();
		ta2.setBounds(20, 90, 200, 30);

		bt = new JButton("Change words");
		bt.setBounds(20, 150, 120, 30);
		bt.addActionListener(this);
		add(ta1);
		add(ta2);
		add(bt);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// zamkniecie krzyzykiem
		setVisible(true);
	}

	JAS5(String title) {
		this();
		this.setTitle(title);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String napis1 = ta1.getText();
		String napis2 = ta2.getText();
		ta1.setText(napis2);
		ta2.setText(napis1);

	}

	public static void main(String[] args) {
		new JAS5();
	}

}
