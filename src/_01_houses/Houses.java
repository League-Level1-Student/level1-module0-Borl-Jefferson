package _01_houses;

import java.awt.Color;

import javax.swing.JOptionPane;
import javax.swing.text.StyledEditorKit.ForegroundAction;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
Robot a = new Robot();
	
public void run(int yrd, int yes){
	String chikn = JOptionPane.showInputDialog("NO!?!?!?!?!!?!?");
		a.moveTo(50, 500);
		for (int i = 0; i < yrd; i++) {
			
		
		a.setAngle(0);
		String b = JOptionPane.showInputDialog("red or nope");
				if (b.equals("red")) {
					a.setPenColor(255, 0, 0);
				}
				else {
					a.setPenColor(0, 255, 255);
				}
			
		a.setSpeed(300);
		a.penDown();
		a.move(yes);
		a.turn(90);
		a.move(75);
		a.turn(90);
		a.move(yes);
		a.turn(-90);
		a.setPenColor(0, 255, 0);
		a.move(75);
	}
	}
public void peak(int pea) {
	a.setAngle(0);
	a.setSpeed(300);
	a.penDown();
	a.move(pea);
	a.turn(45);
	a.move(90);
	a.turn(90);
	a.move(90);
	a.turn(45);
	
	a.move(pea);
	a.turn(-90);
	a.setPenColor(0, 255, 0);
	a.move(75);
		
	
	
}
}
	

