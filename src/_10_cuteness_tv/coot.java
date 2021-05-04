package _10_cuteness_tv;

import java.net.URI;

import javax.swing.JOptionPane;

public class coot {
	public void tictac() {
	String a = JOptionPane.showInputDialog("yes");
	if (a.equals("yum")) {
		yummy();
	}
	if (a .equals ("noworry")) {
		showFrog();
	}
	if (a .equals ("cutedog")) {
		showFluffyUnicorns();
	}
	}
		
	void yummy() {
		      playVideo("https://www.youtube.com/watch?v=mYBRTi8MM3c");
		 }

		void showFrog() {
		      playVideo("https://www.youtube.com/watch?v=ds6I5sUBGtw");
		 }

		void showFluffyUnicorns() {
		      playVideo("https://www.youtube.com/watch?v=j5a0jTc9S10");
		 }

		void playVideo(String videoID) {
		     
		     // Workaround for Linux because "Desktop.getDesktop().browse()" doesn't 
		     //work on some Linux implementations 
		      try {
		      if (System.getProperty("os.name").toLowerCase().contains("linux")) {
		      if (Runtime.getRuntime().exec(new String[] { 
		       "which", "xdg- open" }).getInputStream().read() != -1) {
		      Runtime.getRuntime().exec(new String[] { "xdg-open", videoID }); 
		      }
		      } else {
		           URI uri = new URI(videoID);
		           java.awt.Desktop.getDesktop().browse(uri);
		      }      } catch (Exception e) {
		           e.printStackTrace();
		      }
		}

	



}

