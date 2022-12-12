package Week5;

public class App {
	public static void main(String[] args) {
		
		Logger logger = new asterikLogger();
		logger.Log("You are always a day away");
		logger.Error("Fatality!");
		
		Logger spacedLogger = new SpacedLogger();
		spacedLogger.Log("Serenity");
		spacedLogger.Error("WARNING!!");
		
		
		
	}

}
