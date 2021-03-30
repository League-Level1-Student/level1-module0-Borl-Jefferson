package _01_houses;

import java.awt.Color;

import javax.swing.JOptionPane;
import javax.swing.text.StyledEditorKit.ForegroundAction;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
Robot a = new Robot();
	
public void run() {
a.setSpeed(300);
a.moveTo(50, 500);
a.setAngle(0);
String loo = JOptionPane.showInputDialog("YES!?!?!!?");
int loop = Integer.parseInt(loo);
for (int i = 0; i < loop; i++) {
	

String chikn = JOptionPane.showInputDialog("NO!?!?!?!?!!?!?");
	String b = JOptionPane.showInputDialog("red or nope");
				if (b.equals("red")) {
					a.setPenColor(255, 0, 0);
				}
				else {
					a.setPenColor(0, 255, 255);
				}
	if (chikn .equals("big")) {
		flat_big_boi();	
	
	}	
	if (chikn .equals("small")) {
peak_smal();
	}
	if (chikn.equals("meh")) {

	}
		peak_meh();	
	}
	}
	
public void peak_smal() {
				a.setAngle(0);
	a.setSpeed(300);
	a.penDown();
	a.move(60);
	a.turn(45);
	a.move(90);
	a.turn(90);
	a.move(90);
	a.turn(45);
	
	a.move(60);
	a.turn(-90);
	a.setPenColor(0, 255, 0);
	a.move(75);
		
	
	
}
public void peak_meh() {
		a.setAngle(0);
	a.setSpeed(300);
	a.penDown();
	a.move(120);
	a.turn(45);
	a.move(90);
	a.turn(90);
	a.move(90);
	a.turn(45);
	
	a.move(120);
	a.turn(-90);
	a.setPenColor(0, 255, 0);
	a.move(75);
	
}
public void flat_big_boi() {
		a.penDown();
		a.move(250);
		a.turn(90);
		a.move(75);
		a.turn(90);
		a.move(250);
		a.turn(-90);
		a.setPenColor(0, 255, 0);
		a.move(75);
}
}
	

