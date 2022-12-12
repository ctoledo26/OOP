package Week5;

public class SpacedLogger implements Logger {

	@Override
	public void Log(String Log) {
		System.out.println(Log.replace("", " ").trim());
	 }

	@Override
	public void Error(String error) {
		System.out.println("ERROR:" + error.replace("", " ").trim());
		
	}

}
