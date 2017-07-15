import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
/*Napisz program, który wyœwietli okno o rozmiarach 300 szerokoœci na 200 wysokoœci.
 Które bêdzie posiadaæ jeden przycisk o nazwie OK*/
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
