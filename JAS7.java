import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

/*Napisz program który bêdzie wyœwietla³ w oknie aktualny stan Checkboxa*/

public class JAS7 implements ItemListener {
	JLabel label1, label2, label3;
	JCheckBox checkbox1;
	JCheckBox checkbox2;
	JCheckBox checkbox3;
	String prog1 = "C++";
	String prog2 = "Java";
	String prog3 = "Python";

	JAS7() {

		JFrame f = new JFrame("Checkbox test ");
		label1 = new JLabel();
		label1.setBounds(20, 20, 300, 30);
		label2 = new JLabel();
		label2.setBounds(20, 60, 300, 30);
		label3 = new JLabel();
		label3.setBounds(20, 100, 300, 30);

		checkbox1 = new JCheckBox(prog1);
		checkbox1.setBounds(150, 100, 100, 50);
		checkbox2 = new JCheckBox(prog2);
		checkbox2.setBounds(150, 170, 100, 50);
		checkbox3 = new JCheckBox(prog3);
		checkbox3.setBounds(150, 250, 100, 50);
		f.add(checkbox1);
		f.add(checkbox2);
		f.add(checkbox3);
		f.add(label1);
		f.add(label2);
		f.add(label3);
		checkbox1.addItemListener(this);
		checkbox2.addItemListener(this);
		checkbox3.addItemListener(this);
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);

	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		String co1 = "";
		String co2 = "";
		String co3 = "";

		if (checkbox1.isSelected()) {
			co1 += prog1 + " ";
			label1.setText(co1 + " checked");

		} else if (!checkbox1.isSelected()) {
			co1 += prog1 + " ";
			label1.setText(co1 + " unchecked");
		}
		if (checkbox2.isSelected()) {
			co2 += prog2 + " ";
			label2.setText(co2 + " checked");

		} else if (!checkbox2.isSelected()) {
			co2 += prog2 + " ";
			label2.setText(co2 + " unchecked");
		}
		if (checkbox3.isSelected()) {
			co3 = prog3 + " ";
			label3.setText(co3 + " checked");
		} else if (!checkbox3.isSelected()) {
			co3 += prog3 + " ";
			label3.setText(co3 + " unchecked");
		}
	}

	public static void main(String[] args) {
		new JAS7();
	}
}
