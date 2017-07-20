package jas21;

/*Napisz program, który bêdzie ustawia³ wartoœæ suwaka w zale¿noœci od wartoœci pola
sekwencyjnego. I na odwrót*/
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

import javax.swing.*;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class JAS21 extends JFrame {
	public JAS21() {
		setBounds(20, 20, 400, 250);
		JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 50, 25);
		slider.setToolTipText("Move slider back and forth to change its postion");
		slider.setBounds(20, 20, 200, 40);
		slider.setMinorTickSpacing(2);
		slider.setMajorTickSpacing(10);
		slider.setPaintTicks(true);
		slider.setPaintLabels(true);

		JPanel panel = new JPanel();
		panel.setBounds(20, 20, 400, 250);
		panel.add(slider);
		getContentPane().add(panel);

		SpinnerModel value = new SpinnerNumberModel(25, 0, 51, 1);
		JSpinner spinner = new JSpinner(value);
		spinner.setToolTipText("Change the value to move slider");
		spinner.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				slider.setValue((Integer) (spinner.getValue()));
			}
		});
		spinner.setBounds(150, 100, 50, 30);
		panel.add(spinner);

		slider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				spinner.setValue((slider.getValue()));
			}
		});

	}

	public static void main(String s[]) {
		JAS21 frame = new JAS21();

		frame.setVisible(true);
	}
}
