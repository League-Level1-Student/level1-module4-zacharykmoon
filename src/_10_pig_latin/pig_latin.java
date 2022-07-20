package _10_pig_latin;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class pig_latin {

	JFrame frame = new JFrame("Pig Latin Translator");
	JPanel panel = new JPanel();
	JButton english = new JButton("Translate");
	JButton piglatin = new JButton("speak");
	JTextField text1 = new JTextField("enter english here");
	JTextField text2  = new JTextField("pig will be here");

	
	public pig_latin() {
		frame.setSize(1000,100);
		frame.add(panel);
		panel.add(english);
		panel.add(text1);
		panel.add(text2);
	}
public void run () {
	
}
}