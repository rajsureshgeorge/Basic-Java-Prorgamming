
public class TextScanner {
	AbstHello obj;
	public TextScanner(AbstHello obj) {
		this.obj =obj;
		
	}
	void scan() {
		obj.onText("Scanner Text");
	}
	
}
