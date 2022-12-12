package Week5;

public class asterikLogger implements Logger {

	@Override
	public void Log(String Log) {
		System.out.println("***" + Log + "***");
		
	
	}
		
	

	@Override
	public void Error(String error) {
		String border = "*".repeat(error.length() + "***error:***".length());
		System.out.println(border + "\n" + "***Error:" + error  +"***"+ "\n" + border);
		
		
	}



}
