package frame;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

@SuppressWarnings("serial")
public class MenuBar extends JMenuBar{
	
	JMenu fileMenu = new JMenu("파일");
	JMenuItem fileMenuItem = new JMenuItem("새 창");
	
	
	
	public JMenu getFileMenu() {
		return fileMenu;
	}



	public void setFileMenu(JMenu fileMenu) {
		this.fileMenu = fileMenu;
	}



	public JMenuItem getFileMenuItem() {
		return fileMenuItem;
	}



	public void setFileMenuItem(JMenuItem fileMenuItem) {
		this.fileMenuItem = fileMenuItem;
	}



	public MenuBar() {
		this.add(fileMenu);
		fileMenu.add(fileMenuItem);
	}

}
