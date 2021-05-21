package controller;

import javax.swing.JTextField;

public class SourceCodeMaker {
	private static SourceCodeMaker SourceCodeMaker = null;
    private static String src;
	//소스코드 배열 1.컴포넌트(컴포넌트 이름 JButton, JTextField ...) 2.소스코드 
	private static String textField;
	private SourceCodeMaker(){}
	
	public static SourceCodeMaker getInstance() {
		if(SourceCodeMaker == null) {
			SourceCodeMaker = new SourceCodeMaker();
			sourceCodeMaker();
		}
		return SourceCodeMaker;
	}
	//성우
	//생성된 소스코드의 속성들을 배열로 받아들여서 저장
	// 동일한 컴포넌트끼리 묶어서 ui 생성.
	// 컴포넌트 생성자는 필드에 생성.
	// 각 컴포넌트생성은 각 컴포넌트 이름 으로 메서드를 생성
	
	public static void sourceCodeMaker() {
		 src = "public class Gui extends JFrame{\r\n" + 
				"	\r\n"
				+ "Container c = getcontentpane();\r\n" + 
				//필드 생성
				
				//기본 틀 생성
				"	public Gui ( ) {\r\n" + 
				"		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);\r\n" + 
				"		setTitle(\"GuiMaker\");	\r\n" + 
				"		setUI();\r\n" + 
				"		setSize(1920, 1080);\r\n" + 
				"		setVisible(true);\r\n" + 
				"	}\r\n" + 
				"	\r\n" + 
				
				//ui 생성
				"	public void setUI() {\r\n" + 
				"		\r\n" +	 
				"	" + textField + 
				"	}\r\n" +
				"	\r\n" + 
				
				//gui 실행
				"	public static void main(String[] args) {\r\n" + 
				"		new Gui();\r\n" + 
				"	}\r\n" + 
				"};";
	}
	
	
	public String getTextField() {
		return textField;
	}

	public void setTextField(String textField) {
		
		//새로운 tf 생성
		String tf = "JTextField tf1 = new JTextField();\r\n";
		
		//생성된 tf의 컴포넌트 속성 설정
		tf = tf + "	" +  textField + "\r\n";
		//설정된 컴포넌트 add
		tf = tf + "	" + "c.add();";
		textField = tf;
		
		this.textField = textField;
		sourceCodeMaker();
	}

	public String getSrc() {
		return src;
	}

	public void setSrc(String src) {
		this.src = src;
	}
	
}
