//This class is inheritance of a class 
//which has same functionality as the interface
//But since our Logger class wants interface/class implementing the interface's reference
//Therefore we are bridging the two by using one intermediate Adapter class
public class ConsoleLogWriter2 extends ConsoleWriter implements LogWriter{

	@Override
	public void out(String text) {
		super.output(text);		
	}
	
}
