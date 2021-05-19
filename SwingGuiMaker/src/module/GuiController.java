package module;


import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.Border;



@SuppressWarnings("serial")
public class GuiController  extends MouseAdapter   {
	//프레임으로 부터 받아올 필드
	JPanel centerPnl;
	JPanel bottomPnl;
	JList componentList;
	
	//컴포넌트 위치 확인용 변수
	int setX = 0;
	int setY = 0;
	
	//리스너 생성자
	public  GuiController(JPanel centerPnl, JPanel bottomPnl, JList componentList) {
		this.centerPnl = centerPnl;
		this.bottomPnl = bottomPnl;
		this.componentList = componentList;
	}
	


	@Override
	public void mouseReleased(MouseEvent e) {
		
		//컴포넌트 만들기
		if(centerPnl == e.getSource()) {
			if(componentList.getSelectedIndex() == 0) {
					JTextField setTf = new JTextField();
					this.setX = e.getXOnScreen();
					this.setY = e.getYOnScreen();
					setTf.setBounds(setX, setY, 100, 10);
					centerPnl.add(setTf);
					centerPnl.repaint();
				}
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
		}

		
	}
	