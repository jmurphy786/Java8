
public class QAConsulting {
	
	public QAConsulting() {}
	
	static QAConsulting r;
	
	static
	{
	System.out.println("Im static");
	}

	
	public static QAConsulting createObject() {
		if(r == null) {
			r = new QAConsulting();
		}
		return r;
	}
}
