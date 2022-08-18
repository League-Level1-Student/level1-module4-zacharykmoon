package _12_slot_machine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.util.Random;

import javax.print.DocFlavor.URL;
import javax.swing.Icon;
import javax.swing.ImageIcon;
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

 public SlotMachine() throws MalformedURLException {

	
	frame.add(panel);

	slot1 = createLabelImage("carrot.png");
	slot2 = createLabelImage("pepper.jpeg");
	slot3 = createLabelImage("spidereye.png");

	slot1.setSize(100, 100);
	slot2.setSize(100, 100);
	slot3.setSize(100, 100);
	
	panel.add(slot1);
	panel.add(slot2);
	panel.add(slot3);
	panel.add(button);
	button.addActionListener(this);
	panel.add(t);
	
	frame.setVisible(true);
	frame.pack();
 }
	
	
	public void spin() throws MalformedURLException {
		
		String[] files = {"carrot.png", "pepper.jpeg","spidereye.png"};
		int ran1 = new Random().nextInt(3);
		int ran2 = new Random().nextInt(3);
		int ran3 = new Random().nextInt(3);
		
		
		panel.remove(slot1);
		panel.remove(slot2);
		panel.remove(slot3);
		
		slot1= createLabelImage(files[ran1]);
		slot2 = createLabelImage(files[ran2]);
	    slot3 = createLabelImage(files[ran3]);
	    
	    
	    panel.add(slot1);
	    panel.add(slot2);
	    panel.add(slot3);
	    
	
}
	private JLabel createLabelImage(String fileName) throws MalformedURLException{
        java.net.URL imageURL = getClass().getResource(fileName);
	if (imageURL == null){
		System.err.println("Could not find image " + fileName);
		return new JLabel();
	}
	Icon icon = new ImageIcon(imageURL);
	JLabel imageLabel = new JLabel(icon);
	return imageLabel;
}

@Override
public void actionPerformed(ActionEvent e) {
	if(e.getSource() == button) {
		try {
			spin();
			frame.pack();
		} catch (MalformedURLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
}
}
}