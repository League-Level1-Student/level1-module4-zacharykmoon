package _10_pig_latin;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PigLatin implements ActionListener {

	JFrame frame = new JFrame("Pig Latin Translator");
	JPanel panel = new JPanel();
	JButton english = new JButton("Translate");
	JButton piglatin = new JButton("speak");
	JTextField text1 = new JTextField("enter english here");
	JTextField text2  = new JTextField("pig will be here");

	
	public PigLatin() {
		frame.setSize(1000,100);
		frame.add(panel);
		panel.add(english);
		panel.add(text1);
		panel.add(piglatin);
		panel.add(text2);
		
		frame.setVisible(true);
		
		
		english.addActionListener(this);
		piglatin.addActionListener(this);
	}
public  String Convert(String word) {
	String[] words = word.split("\\W+");
	String Answer ="";
	for (int i =0; i< words.length; i++) {
		Answer +=   words[i].substring(1) + words[i].charAt(0) + "ay";
	}
	
	
	System.out.println(Answer);
	return Answer;
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource() == english) {
		text2.setText(Convert(text1.getText()));
	}
	if(e.getSource() == piglatin ) {
		System.out.println(text2.getText());
	}
}
}