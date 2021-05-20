package module;

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
