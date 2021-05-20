package test;

import javax.swing.JFrame;

//편하게 테스트해보는 코드들 사용 해보는 공간

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
