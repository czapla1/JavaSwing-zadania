package jas18;
/*Napisz program który bêdzie wyœwietla³ ekran ³adowania gdzie postêp w
wykonywaniu programu to 10% na 1 sec*/

import javax.swing.JFrame;
import javax.swing.JProgressBar;

public class JAS18 extends JFrame {

	JProgressBar jb;
	int i = 0;

	JAS18() {
		jb = new JProgressBar(0, 2000);
		jb.setBounds(50, 50, 160, 30);
		jb.setValue(0);
		jb.setStringPainted(true);
		add(jb);
		setSize(250, 150);
		setLayout(null);

	}

	public void iterate() {
		while (i <= 2000) {
			jb.setValue(i);
			i += 200;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		JAS18 exmp = new JAS18();

		exmp.setVisible(true);
		exmp.iterate();
	}

}
