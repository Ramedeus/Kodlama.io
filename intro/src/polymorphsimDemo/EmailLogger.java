package polymorphsimDemo;

public class EmailLogger extends BaseLogger{
	public void Log(String message) {
		System.out.println("Email logger : " + message);
	}
}
