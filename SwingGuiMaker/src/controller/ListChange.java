package controller;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
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

import frame.GuiMakerFrame;
import test.Gui;


public class ListChange implements ListSelectionListener {
	//민서
	
	//필드
	JPanel bottomPnl;
	JList<String> componentList;
	JTable tbl;
	JScrollPane scrollPane;
	JTextArea srcTa;
	GuiMakerFrame gmf = new GuiMakerFrame();
	
	//생성자
	// 생성자에서 받아오는 값들 최대한으로 줄일수 있는 방안 생각해보기.
	public ListChange(JPanel bottomPnl, JList<String> componentList, JTextArea srcTa) {
		this.componentList = componentList;
		this.bottomPnl = bottomPnl;
		this.srcTa = srcTa;
	}
	
	@Override
	public void valueChanged(ListSelectionEvent e) {
		
		txtProperties(); // textField 속성 메소드
		btnProperties(); // Jbutton 속성 메소드
		rdoBtnProperties(); // JRadiobutton 속성 메소드
		tblProperties(); // JTable 속성 메소드
	}
	
	//텍스트필드 속성불러오기 예시
	//추가로 각 컴포넌트 (Jbutton, JLable, Jtable ... 등) 구현
	//예시메서드는 예시이므로 본인만의 방식으로 여러가지 컴포넌트 속성(properties) 생성기 구현
	//동일한 부분은 모듈화 하여 다른 클래스에서도 쓸 수 있도록 작성 - sourcecodemaker에서 각 속성을 프레임에 컴포넌트 생성할때 받아올 예정.
	//혹은 다른 패턴이거나 알고리즘 등등 다양한거 적용 해보시면 좋을것 같아요~
	
	// textField 속성 메소드
	public void txtProperties() {
		JTextField textField = new JTextField();
		String getText = textField.getText();
		Color foreGround = textField.getForeground();
		Color background = textField.getBackground();
		Font font = textField.getFont();
		String getWidth = Integer.toString(textField.getWidth());
		String getHeight =Integer.toString(textField.getHeight());
		int horizontalAlignment = textField.getHorizontalAlignment();
		
		String header[] = {"속성이름", "속성값"};
		
		String contents[][] = {
				{"내용", getText.toString()},
				{"글자색", foreGround.toString()},
				{"배경색", background.toString()}, 
				{"폰트", font.toString()},
				{"width", "" + getWidth},
				{"height", "" + getHeight},
				{"Visible", "true"},
				{"HorizontalAlignment", "" + horizontalAlignment}
		};
		
		//테이블 - 결과창이 나오면 이걸 노현씨한테 어떤씩으로줄지 
		//메서드 사용법 
		
		//리팩토링
		
		tbl = new JTable(contents,header);
		scrollPane = new JScrollPane(tbl);
		bottomPnl.add(scrollPane);
		//revalidate, rpaint 로했을때 생기는 문제점이나, 다른방법이 있는지 확인
		bottomPnl.revalidate();
		bottomPnl.repaint();
	}
	
	// Jbutton 속성 메소드
	public void btnProperties() {
		JButton btn = new JButton();
		String getText = btn.getText();
		Color foreGround = btn.getForeground();
		Color background = btn.getBackground();
		Font font = btn.getFont();
		String getWidth = Integer.toString(btn.getWidth());
		String getHeight =Integer.toString(btn.getHeight());
		int horizontalAlignment = btn.getHorizontalAlignment();
		
		String header[] = {"속성이름", "속성값"};
		
		String contents[][] = {
				{"내용", getText.toString()},
				{"글자색", foreGround.toString()},
				{"배경색", background.toString()}, 
				{"폰트", font.toString()},
				{"width", "" + getWidth},
				{"height", "" + getHeight},
				{"Visible", "true"},
				{"HorizontalAlignment", "" + horizontalAlignment}
		};

		tbl = new JTable(contents,header);
		scrollPane = new JScrollPane(tbl);
		bottomPnl.add(scrollPane);
		bottomPnl.revalidate();
		bottomPnl.repaint();
	}
	
	// JRadiobutton 속성 메소드
	public void rdoBtnProperties() {
		JRadioButton rdoBtn = new JRadioButton();
		String getText = rdoBtn.getText();
		Color foreGround = rdoBtn.getForeground();
		Color background = rdoBtn.getBackground();
		Font font = rdoBtn.getFont();
		String getWidth = Integer.toString(rdoBtn.getWidth());
		String getHeight =Integer.toString(rdoBtn.getHeight());
		int horizontalAlignment = rdoBtn.getHorizontalAlignment();
		ButtonGroup rdoGroup = new ButtonGroup();
		
		String header[] = {"속성이름", "속성값"};
		
		String contents[][] = {
				{"내용", getText.toString()},
				{"글자색", foreGround.toString()},
				{"배경색", background.toString()}, 
				{"폰트", font.toString()},
				{"width", "" + getWidth},
				{"height", "" + getHeight},
				{"Visible", "true"},
				{"Group Name", rdoGroup.toString()},
				{"HorizontalAlignment", "" + horizontalAlignment}
		};

		tbl = new JTable(contents,header);
		scrollPane = new JScrollPane(tbl);
		bottomPnl.add(scrollPane);
		bottomPnl.revalidate();
		bottomPnl.repaint();
	}
	
	// JTable 속성 메소드
	public void tblProperties() {
		JTable pTbl = new JTable();
		//String getText = pTbl.getText();
//		Color foreGround = pTbl.getForeground();
//		Color background = pTbl.getBackground(); 속성에 해당 안될것 같아 막아둠, 삭제 확률 높음
		Font font = pTbl.getFont();
		String getWidth = Integer.toString(pTbl.getWidth());
		String getHeight =Integer.toString(pTbl.getHeight());
		Dimension size = pTbl.getSize();
		
		String header[] = {"속성이름", "속성값"};
		
		String contents[][] = {
				//{"내용", getText.toString()},
//				{"글자색", foreGround.toString()},
//				{"배경색", background.toString()}, 속성에 해당 안될것 같아 막아둠, 삭제 확률 높음
				{"폰트", font.toString()},
				{"width", "" + getWidth},
				{"height", "" + getHeight},
				{"size", size.toString()},
				{"Visible", "true"}
		};

		tbl = new JTable(contents,header);
		scrollPane = new JScrollPane(tbl);
		bottomPnl.add(scrollPane);
		bottomPnl.revalidate();
		bottomPnl.repaint();
	}
	
	
}
