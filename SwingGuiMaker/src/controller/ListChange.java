package controller;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import test.Gui;


public class ListChange implements ListSelectionListener {
	//민서
	
	//필드
	JPanel bottomPnl;
	JList componentList;
	JTable tbl ;
	JScrollPane scrollPane;
	JTextArea srcTa;
	
	//생성자
	// 생성자에서 받아오는 값들 최대한으로 줄일수 있는 방안 생각해보기.
	public ListChange(JPanel bottomPnl, JList componentList, JTextArea srcTa) {
		this.componentList = componentList;
		this.bottomPnl = bottomPnl;
		this.srcTa = srcTa;
	}
	
	@Override
	public void valueChanged(ListSelectionEvent e) {
		tfEntity();
	}
	
	//텍스트필드 속성불러오기 예시
	//추가로 각 컴포넌트 (Jbutton, JLable, Jtable ... 등) 구현
	//예시메서드는 예시이므로 본인만의 방식으로 여러가지 컴포넌트 속성 생성기 구현(동일한 부분은 모듈화 하여 다른 클래스에서도 쓸 수 있도록 작성)
	// 혹은 다른 패턴이거나 알고리즘 등등 다양한거 적용 해보시면 좋을것 같아요~
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

		//revalidate, rpaint 로했을때 생기는 문제점이나, 다른방법이 있는지 확인
		bottomPnl.revalidate();
		bottomPnl.repaint();
		
	}
}
