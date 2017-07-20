package jas17;

/*Dopisz do projektu notatnik funkcjonalnoœæ zapisu i odczytu pliku*/
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class JAS17 implements ActionListener {
	JFrame f;
	JMenuBar mb;
	JMenu file, edit, help;
	JMenuItem cut, copy, paste, selectAll, save, open;
	JTextArea ta;
	JFileChooser fc;

	JAS17() {
		f = new JFrame();
		cut = new JMenuItem("cut");
		cut.setToolTipText("cut text");
		copy = new JMenuItem("copy");
		copy.setToolTipText("copy text");
		paste = new JMenuItem("paste");
		paste.setToolTipText("paste text");
		selectAll = new JMenuItem("selectAll");
		selectAll.setToolTipText("select all text");
		save = new JMenuItem("save");
		save.setToolTipText("save text to file");
		open = new JMenuItem("open");
		open.setToolTipText("open text from file");
		cut.addActionListener(this);
		copy.addActionListener(this);
		paste.addActionListener(this);
		selectAll.addActionListener(this);
		save.addActionListener(this);
		open.addActionListener(this);
		mb = new JMenuBar();
		file = new JMenu("File");
		edit = new JMenu("Edit");
		help = new JMenu("Help");
		edit.add(cut);
		edit.add(copy);
		edit.add(paste);
		edit.add(selectAll);
		edit.add(save);
		edit.add(open);
		mb.add(file);
		mb.add(edit);
		mb.add(help);
		ta = new JTextArea();
		ta.setBounds(5, 5, 360, 320);
		f.add(mb);
		f.add(ta);
		f.setJMenuBar(mb);
		f.setLayout(null);
		f.setSize(400, 400);
		f.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == cut)
			ta.cut();
		if (e.getSource() == paste)
			ta.paste();
		if (e.getSource() == copy)
			ta.copy();
		if (e.getSource() == selectAll)
			ta.selectAll();
		if (e.getSource() == save) {
			save();
		}
		if (e.getSource() == open) {
			open();
		}
	}

	public void save() {
		JFileChooser fc = new JFileChooser();
		fc.setCurrentDirectory(new File("C:\\Users\\Lenovo\\Desktop"));
		fc.setDialogTitle("Save a file");
		fc.setFileFilter(new FileTypeFilter(".txt", "Text File"));
		int result = fc.showSaveDialog(null);
		if (result == JFileChooser.APPROVE_OPTION) {
			String content = ta.getText();
			File fi = fc.getSelectedFile();

			try {
				FileWriter nextFile = new FileWriter(fi.getPath(), true);
				nextFile.write(content);
				nextFile.flush();
				nextFile.close();
				JOptionPane.showMessageDialog(null, "Uda³o siê zapisaæ plik");
			} catch (IOException e) {
				JOptionPane.showMessageDialog(null, "Nie uda³o siê zapisaæ pliku");
				e.printStackTrace();
			}
		}
	}

	public void open() {

		JFileChooser fc = new JFileChooser();
		fc.setCurrentDirectory(new File("C:\\Users\\Lenovo\\Desktop"));
		fc.setDialogTitle("Open a file");
		fc.setFileFilter(new FileTypeFilter(".txt", "Text file"));
		fc.setFileFilter(new FileTypeFilter(".docx", "Word file"));
		fc.setFileFilter(new FileTypeFilter(".jpg", "JPEG file"));
		int result = fc.showOpenDialog(null);
		if (result == JFileChooser.APPROVE_OPTION) {
			File fi = fc.getSelectedFile();
			try {
				File file = new File(fi.getPath());
				Scanner in = new Scanner(file);
				while (in.hasNext()) {

					String zdanie = in.nextLine();
					ta.append(zdanie + "\n");
				}
				in.close();
				JOptionPane.showMessageDialog(null, "Uda³o siê odczytaæ z pliku");
			} catch (IOException e) {
				JOptionPane.showMessageDialog(null, "Nie uda³o siê odczytaæ z pliku");
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		new JAS17();
	}
}
