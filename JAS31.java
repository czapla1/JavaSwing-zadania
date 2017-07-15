
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/*Napisz program, który wyœwietli okno o rozmiarach 600 szerokoœci na 400 wysokoœci.
- Gdzie bêdzie przycisk i etykieta na etykiecie bêdzie napisane „Hello World”
- Po naciœniêciu przycisku napis na etykiecie zmieni siê na „Witaj œwiecie*/
public class JAS31 extends JFrame implements MouseListener {

	JButton bt;
	String nazwa;
	String nazwa2;
	JLabel lb;
	String temp;

	public JAS31() {

		setSize(600, 400);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// zamkniecie krzyzykiem
		nazwa = "OK";
		nazwa2 = "NOK";
		bt = new JButton(nazwa);
		bt.setBounds(20, 50, 100, 30);

		add(bt);

		lb = new JLabel("Hello World!");
		lb.setBounds(20, 20, 200, 30);
		lb.addMouseListener(this);
		add(lb);

		bt.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				lb.setText("Witaj œwiecie!");
			}
		});
		setVisible(true);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("Mause clicked");
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		System.out.println("Mause entered");
		temp = ((JLabel) e.getSource()).getText();
		((JLabel) e.getSource()).setText("Jestem Myszk¹");
	}

	@Override
	public void mouseExited(MouseEvent e) {
		System.out.println("Mause exited");
		// temp=((JLabel)e.getSource()).getText();
		((JLabel) e.getSource()).setText(temp);
	}

	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println("Mause pressed");
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		System.out.println("Mause released");
	}

	public static void main(String[] args) {
		new JAS31();

	}

}
