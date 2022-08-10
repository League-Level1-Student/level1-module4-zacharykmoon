package _12_slot_machine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class SlotMachine implements ActionListener {
    JFrame frame =  new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton("SPIN");
	JLabel slot1;
	JLabel slot2;
	JLabel slot3;
	
	
	
	
	int wins = 0;
	JTextArea t = new JTextArea("wins: " + wins);
}
 public SlotMachine() throws MalformedURLException {

	
	frame.add(panel);

	slot1 = createLabelImage("carror.png");
	slot2 = createLabelImage("corn.wep");
	slot3 = createLabelImage("pepper.jpeg");

	slot1.setSize(100, 100);
	slot2.setSize(100, 100);
	slot3.setSize(100, 100);
	
	panel.add(slot1);
	panel.add(slot2);
	panel.add(slot3);
	panel.add(button);
	button.addActionListener(this);
	panel.add(t);
	
	
	
}
private JLabel createLabelImage(String string) {
	// TODO Auto-generated method stub
	return null;
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
}