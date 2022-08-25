package ChainOfResponsibilityPatternDemo;

/*Create different types of loggers. Assign them error levels and set next logger in each logger.
*Next logger in each logger represents the part of the chain.
*/
public class ChainPatternDemo {
	
	private static AbstractLogger getChainOFLoggers() {
		AbstractLogger erroLogger = new ErrorLogger(AbstractLogger.ERROR);
		AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
		AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);
		
		erroLogger.setNextLogger(fileLogger);
		erroLogger.setNextLogger(consoleLogger);
		
		return erroLogger;
	}
	public static void main(String[] args) {
		AbstractLogger loggerChain =getChainOFLoggers();
		
		loggerChain.logMessage(AbstractLogger.INFO, "This is an inforation.");
		
		loggerChain.logMessage(AbstractLogger.DEBUG, "This is an debug level information.");
		
		loggerChain.logMessage(AbstractLogger.ERROR, "This is an error information.");

	}

}
