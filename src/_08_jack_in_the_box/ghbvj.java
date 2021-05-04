package _08_jack_in_the_box;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

public class ghbvj implements ActionListener { 
	int t = 0;
public void run() {
	JFrame jef = new JFrame();
	jef.setVisible(true);
	JButton boot = new JButton();
	boot.setText("Surprise");
	jef.add(boot);
	boot.addActionListener(this);
	jef.setLocationRelativeTo(null);

	jef.pack();
}
	public void actionPerformed(ActionEvent e) {
		
		t = t + 1;
		if (t == 5) {

			showPicture("jackinTheBox.png");
			playSound("teamwork.wav");
			
		}
		
	}
	private void showPicture(String fileName) { 
      try {
           JLabel imageLabel = createLabelImage(fileName);
           JFrame frame = new JFrame();
           frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           frame.add(imageLabel);
           frame.setVisible(true);
           frame.setLocationRelativeTo(null);
           frame.pack();
      } catch (Exception e) {
           e.printStackTrace();
      }
 }



private JLabel createLabelImage(String fileName) {
     try {
	          URL imageURL = getClass().getResource(fileName);
          if (imageURL == null) {
               System.err.println("Could not find image " + fileName);
               return new JLabel();
           } else {
                Icon icon = new ImageIcon(imageURL);
                JLabel imageLabel = new JLabel(icon);
                return imageLabel;
          }
      } catch (Exception e) {
           System.err.println("Could not find image " + fileName);
           return new JLabel();
          
     }
 }



//3. Also play a sound when the jack-in-the-box pops up using this method.
//(A sample sound homer-woohoo.wav is provided in the default package)


private void playSound(String soundFile) { 
      try {
           AudioClip sound = JApplet.newAudioClip(getClass().getResource(soundFile));
           sound.play();
      } catch (Exception e) {
           e.printStackTrace();
      }
 }


}

