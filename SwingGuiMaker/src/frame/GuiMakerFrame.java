package frame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.UIManager;

import controller.GuiController;
import controller.ListChange;

@SuppressWarnings("serial")
public class GuiMakerFrame extends JFrame  {
	//컴포넌트 선택 버튼 대신에 리스트로 구현
	//하단에 리스트 선택시 컴포넌트 속성값 불러오기

	Container c = getContentPane();
	JSplitPane split1, split2;

	//리스트
	String[] listStr = {"텍스트필드","버튼","라디오버튼", "테이블", "패널"};
	JList<String> componentList = new JList<String>(listStr);

	//panel
	JPanel centerPnl = new JPanel();
	JPanel bottomPnl = new JPanel();
	JPanel topPnl = new JPanel();
	JTabbedPane centerTab = new JTabbedPane();
	
	//Jmenu
	JMenu menu = new JMenu();
	JTextArea srcTa = new JTextArea();
	
	public GuiMakerFrame ( ) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("GuiMaker");	
		setUI();
		setSize(1920, 1080);
		setVisible(true);
		setListener();
	}
	
	//기본 UI 관리
	public void setUI() {
		c.setLayout(new BorderLayout());
		centerPnl.setLayout(null);
		bottomPnl.setLayout(new FlowLayout());
		bottomPnl.setBackground(Color.WHITE);
		bottomPnl.setLayout(new BorderLayout());
		topPnl.setLayout(new BorderLayout());
		topPnl.add(componentList);
		centerPnl.setBackground(Color.WHITE);
		centerTab.addTab("UI", centerPnl);
		centerTab.addTab("SourceCode",srcTa );
		//화면분할
		init();
	}
	
	//split으로 화면 분할
	 private void init(){
		split1 = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT); 
		split2 = new JSplitPane(JSplitPane.VERTICAL_SPLIT);  
		split2.setDividerLocation(500);   
        split2.setTopComponent(topPnl); //컴포넌트 왼쪽에 트리를 삽입
        split2.setBottomComponent(bottomPnl);
        split1.setRightComponent(centerTab); //컴포넌트 오른쪽에 텍스트 에어리어 삽입
        split1.setLeftComponent(split2); 
        split1.setDividerLocation(160);
        c.add("Center",split1);
    }
	
	//리스너 관리
	public void setListener( ) {
		ListChange setListListener = new ListChange(bottomPnl, componentList, srcTa);
		GuiController setComListener = new GuiController(centerPnl, bottomPnl, componentList, srcTa);
		centerPnl.addMouseListener(setComListener);	
		componentList.addListSelectionListener(setListListener);
	}
	
	public static void main(String[] args) {
		new GuiMakerFrame();
		try {
		    UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		} catch (Exception e) {
		    /*
		        ClassNotFoundException
		        InstantiationException
		        IllegalAccessException
		        UnsupportedLookAndFeelException
		     */
		}
	        
	}

}
