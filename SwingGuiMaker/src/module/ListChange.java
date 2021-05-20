package module;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import test.Gui;


public class ListChange implements ListSelectionListener {
	
		
	
	//필드
	JPanel bottomPnl;
	JList componentList;
	JTable tbl ;
	JScrollPane scrollPane;
	JTextArea srcTa;
	
	//생성자
	public ListChange(JPanel bottomPnl, JList componentList, JTextArea srcTa) {
		this.componentList = componentList;
		this.bottomPnl = bottomPnl;
		this.srcTa = srcTa;
	}
	
	@Override
	public void valueChanged(ListSelectionEvent e) {
		String test = e.getSource().toString();
		System.out.println(test);
		tfEntity();
	}
	
	//버튼속성불러오기
	public void tfEntity() {
		JTextField testTf = new JTextField();
		Color background = testTf.getBackground();
		Font font = testTf.getFont();
		String getWidth = Integer.toString(testTf.getWidth());
		String getHeight =Integer.toString(testTf.getHeight());
		Color foreGround = testTf.getForeground();
		String getText = testTf.getText();
		Dimension size = testTf.getSize();
		String name = testTf.getName(); 
		name = "";
		int horizontalAlignment = testTf.getHorizontalAlignment();
		
		String header[] = {"속성이름", "속성값"};
		
		String contents[][] = {
				{"배경색", background.toString()},
				{"폰트", font.toString()},
				{"width", "" + getWidth},
				{"height", "" + getHeight},
				{"글자색", foreGround.toString()},
				{"내용", getText.toString()},
				{"크기", size.toString()},
				{"이름", name.toString()},
				{"Visible", "true"},
				{"HorizontalAlignment", "" + horizontalAlignment}
		};
		tbl = new JTable(contents,header);
		scrollPane = new JScrollPane( tbl );
		bottomPnl.add(scrollPane);

		//이걸로했을때 생기는 문제점이나, 다른방법이 있는지 확인
		bottomPnl.revalidate();
		bottomPnl.repaint();
		
	}
}
