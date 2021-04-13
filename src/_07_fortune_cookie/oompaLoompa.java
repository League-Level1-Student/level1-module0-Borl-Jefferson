package _07_fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class oompaLoompa implements ActionListener {int score = 0;
public void showButton() {
	System.out.println("Button clicked");
	JFrame jef = new JFrame();
	jef.setVisible(true);
	JButton boot = new JButton();
	jef.add(boot);
	jef.pack();
	boot.addActionListener(this);

	}

@Override
public void actionPerformed(ActionEvent e) {
	JOptionPane.showMessageDialog(null, "Woohoo");
	score = score + 1;
	//System.out.println(score);
		Random ran = new Random();
	int randy = ran.nextInt(5-1+0) + 1;
	System.out.println(randy);
	if (randy == 1) {
		JOptionPane.showMessageDialog(null, "you will smell something that does not smell good");
	}
if (randy == 4) {
	JOptionPane.showMessageDialog(null, "you will feel pain within the next 10 years");
	}
if (randy == 3) {
	JOptionPane.showMessageDialog(null, "you will eat water");
}
if (randy == 2) {
	JOptionPane.showMessageDialog(null, "yes");
}
	
}
	
	
}

