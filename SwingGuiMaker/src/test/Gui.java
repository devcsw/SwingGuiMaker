package test;

import javax.swing.JFrame;

public class Gui extends JFrame{
	
	public Gui ( ) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("GuiMaker");	
		setUI();
		setSize(1920, 1080);
		setVisible(true);
	}
	
	public void setUI() {
		
	}
	
	public static void main(String[] args) {
		new Gui();
	}
}
