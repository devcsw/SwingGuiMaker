package controller;

public class SourceCodeMaker {
	private static SourceCodeMaker SourceCodeMaker = null;
    private static String src;
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
				"	\r\n" + 
				"	public Gui ( ) {\r\n" + 
				"		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);\r\n" + 
				"		setTitle(\"GuiMaker\");	\r\n" + 
				"		setUI();\r\n" + 
				"		setSize(1920, 1080);\r\n" + 
				"		setVisible(true);\r\n" + 
				"	}\r\n" + 
				"	\r\n" + 
				"	public void setUI() {\r\n" + 
				"		\r\n" + 
				"	}\r\n" + 
				"	\r\n" + 
				"	public static void main(String[] args) {\r\n" + 
				"		new Gui();\r\n" + 
				"	}\r\n" + 
				"};";
	}
	
	
	public String getSrc() {
		return src;
	}

	public void setSrc(String src) {
		this.src = src;
	}
	
}
