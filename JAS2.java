import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
/*Napisz program, kt�ry wy�wietli okno o rozmiarach 300 szeroko�ci na 200 wysoko�ci.
 Kt�re b�dzie posiada� jeden przycisk o nazwie OK*/
public class JAS2 extends JFrame {

	JButton bt;
	public JAS2(){
		
		setSize(300, 200);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//zamkniecie krzyzykiem
		bt= new JButton("OK");
		bt.setBounds(30, 30, 100, 30);
		add(bt);
		
		bt.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			
			((JButton)e.getSource()).setText("NOK");
		}
	});
		
		setVisible(true);
		
		
		
	}
	public static void main(String[] args) {
		new JAS2();
	}
}
