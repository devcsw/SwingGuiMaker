package controller;


import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;



@SuppressWarnings("serial")
public class GuiController  extends MouseAdapter   {
	//종현
	//GuiMakerFrame, sourceCodeMaker 랑 어떻게 연동되는지 확인 해보고 궁금한정 물어보기
	
	//소스코드
	SourceCodeMaker scm = SourceCodeMaker.getInstance();

	//프레임으로 부터 받아올 필드
	JPanel centerPnl;
	JPanel bottomPnl;
	JList<String> componentList;
	JTextArea srcTa;
	
	//컴포넌트 위치 확인용 변수
	int setX = 0;
	int setY = 0;
	
	//리스너 생성자
	public  GuiController(JPanel centerPnl, JPanel bottomPnl, JList<String> componentList, JTextArea srcTa) {
		this.centerPnl = centerPnl;
		this.bottomPnl = bottomPnl;
		this.componentList = componentList;
		this.srcTa = srcTa;
	}
	
	@Override
	public void mouseReleased(MouseEvent e) {
		
		//컴포넌트 추가해서 만들기
		//지금은 각각 컴포넌트들로 구성 되어있는데 중복되는부분 메서드화 
		//ListChange 리스너 통해서 나오는 테이블(왼쪽하단) 속성값들을 받아와서 컴포넌트 새로 생성될때 적용 되게 만들기.
		// 민서씨한테 어떤 방식으로 넘겨받을건지 상의해보고 물어보기
		
		if(centerPnl == e.getSource()) {
			if(componentList.getSelectedIndex() == 0) {
					JTextField setTf = new JTextField();
					this.setX = e.getXOnScreen();
					this.setY = e.getYOnScreen();
					setTf.setBounds(setX, setY, 100, 10);
					centerPnl.add(setTf);
					centerPnl.repaint();
					//소스코드 인스턴스통해서 받아오는값 
					srcTa.setText(scm.getSrc());
				}
		
			if (componentList.getSelectedIndex() == 1){
				JButton setBtn = new JButton();
				this.setX = e.getXOnScreen();
				this.setY = e.getYOnScreen();
				setBtn.setBounds(setX, setY, 50, 20);
				centerPnl.add(setBtn);
				centerPnl.repaint();
			}
			
			if (componentList.getSelectedIndex() == 2){
				JRadioButton setRbtn = new JRadioButton();
				this.setX = e.getXOnScreen();
				this.setY = e.getYOnScreen();
				setRbtn.setBounds(setX, setY, 100, 10);
				centerPnl.add(setRbtn);
				centerPnl.repaint();
			}
			if (componentList.getSelectedIndex() == 3){
				String header[] = {"번호", "이름", "주소", "비고"};
				String contents[][] = {
						{"1", "이름", "주소", "비고"},
						{"1", "이름", "주소", "비고"},
						{"1", "이름", "주소", "비고"}
				};
				JTable setTbl = new JTable(contents, header);
				this.setX = e.getXOnScreen();
				this.setY = e.getYOnScreen();
				setTbl.setBounds(setX, setY, 400, 50);
				centerPnl.add(setTbl);
				centerPnl.repaint();
			}
			if (componentList.getSelectedIndex() == 4){
				JPanel setPnl = new JPanel();
				setPnl.setBackground(Color.CYAN);
				this.setX = e.getXOnScreen();
				this.setY = e.getYOnScreen();
				setPnl.setBounds(setX, setY,100,100);
				centerPnl.add(setPnl);
				centerPnl.repaint();
			}
		}
	}
		
	}
	