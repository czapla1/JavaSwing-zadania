
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

/*	Po naciœniêciu przycisku zmieñ nazwê przycisku na NOK i tak na zmianê*/
public class JAS3 extends JFrame {

	JButton bt;
	String nazwa;
	String nazwa2;

	public JAS3() {

		setSize(300, 200);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// zamkniecie krzyzykiem
		nazwa = "OK";
		nazwa2 = "NOK";
		bt = new JButton(nazwa);
		bt.setBounds(30, 30, 100, 30);
		add(bt);

		bt.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String nazwa3 = ((JButton) e.getSource()).getText();
				if (nazwa3.equals(nazwa)) {
					((JButton) e.getSource()).setText(nazwa2);
				} else {
					((JButton) e.getSource()).setText(nazwa);
				}
			}
		});
		setVisible(true);
	}

	public static void main(String[] args) {

		new JAS3();
	}

}
