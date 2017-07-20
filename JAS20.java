package jas20;

/*Napisz program, który bêdzie wyœwietla³ jaka jest aktualna wartoœæ suwaka.*/
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class JAS20 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JAS20 frame = new JAS20();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JAS20() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 581, 426);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl = new JLabel();
		lbl.setBounds(139, 184, 267, 16);
		contentPane.add(lbl);
		
		JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 50, 25);
		slider.setToolTipText("Move the slider back and forth to change its position");
		lbl.setText("Vertical slider value is: "+slider.getValue());
		slider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				lbl.setText("Vertical slider value is: "+slider.getValue());
			}
		});
		slider.setBounds(140, 88, 266, 45);
		contentPane.add(slider);
		slider.setMinorTickSpacing(2);
		slider.setMajorTickSpacing(10);
		slider.setPaintTicks(true);
		slider.setPaintLabels(true);
		
	}
}
