
public class App {

	public static void main(String[] args) {
		Logger logger=new Logger(new ConsoleLogWriter2());
		logger.write("abc");
		logger=new Logger(new ConsoleLogWriter());
		logger.write("abc1");
	}

}
