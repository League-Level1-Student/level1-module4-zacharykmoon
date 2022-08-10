package _11_whack_a_mole;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class WhackAMole implements ActionListener{
JFrame frame = new JFrame();
JPanel panel = new JPanel();
Date date = new Date(0);

JButton moleButton;

int moleCount = 0;

public WhackAMole() {
	frame.setVisible(true);
	
	int ran = new Random().nextInt(24);
    DrawButtons(ran);
	
}

public void DrawButtons(int mole) {
	for (int i = 0; i <24; i++) {
		
		if(i == mole)
		{
			moleButton = new JButton("mole");
			moleButton.addActionListener((ActionListener) this);
			panel.add(moleButton);
			
			frame.add(panel);
		}
		
		else {
			JButton button = new JButton("");
			button.addActionListener((ActionListener) this);
			panel.add(button);
			frame.add(panel);
			frame.setSize(300,500);
		}
	}
	
}

static void speak(String words) {
    if( System.getProperty( "os.name" ).contains( "Windows" ) ) {
        String cmd = "PowerShell -Command \"Add-Type -AssemblyName System.Speech; (New-Object System.Speech.Synthesis.SpeechSynthesizer).Speak('"
                + words + "');\"";
        try {
            Runtime.getRuntime().exec( cmd ).waitFor();
        } catch( Exception e ) {
            e.printStackTrace();
        }
    } else {
        try {
            Runtime.getRuntime().exec( "say " + words ).waitFor();
        } catch( Exception e ) {
            e.printStackTrace();
        }
    }
}
        
        private void endGame(Date timeAtStart, int molesWhacked) { 
		    Date timeAtEnd = new Date();
		    JOptionPane.showMessageDialog(null, "Your whack rate is "
		            + ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked)
		                  + " moles per second.");
        }
    
		    public void actionPerformed(ActionEvent e) {
				if(e.getSource()  == moleButton){
					System.out.println("mole");
					int ran =  new Random().nextInt(24);
					panel.removeAll();
					DrawButtons(ran);	
					frame.setSize(300, 500);
					moleCount ++;
					
					if(moleCount == 10) {
						endGame(date, moleCount);
					}
				
				
				
				}
				
				else{
				
					
					int ran =  new Random().nextInt(24);
					
					panel.removeAll();
					DrawButtons(ran);	
					frame.setSize(300, 500);
				System.out.println("not mole");
				}
		                  
    }
}

