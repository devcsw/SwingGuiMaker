package controller;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JInternalFrame;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.WindowConstants;

import frame.InternalFrame;

public class MenuListener implements ActionListener {

	ArrayList<JMenuItem> menuItems = new ArrayList<JMenuItem>();
	JTabbedPane jtabbedpane;
	JPanel jpanel = new JPanel();
	// 멤버필드

	// 생성자
	public MenuListener(JTabbedPane jtabbedpane, JMenuItem jmenuItem) {
		this.jtabbedpane = jtabbedpane;
		menuItems.add(jmenuItem);
		menuItems.get(0).addActionListener(this);

	}

	// 액션이벤트
	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();

		if (obj == menuItems.get(0)) {
			System.out.println("클릭됨");
			JInternalFrame internalFrame = new JInternalFrame("자식창", true, true, true, true);
			internalFrame.setLayout(new FlowLayout());
			internalFrame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			internalFrame.setSize(200, 200);

//			jtabbedpane.add(internalFrame);
			jtabbedpane.addTab("새 레이아웃", jpanel);
			jpanel.setLayout(null);
			jpanel.add(internalFrame);
			internalFrame.show();

		}

	}

}
