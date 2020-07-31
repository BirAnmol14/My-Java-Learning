//This class is composition of a class 
//which has same functionality as the interface
//But since our Logger class wants interface/class implementing the interface's reference
//Therefore we are bridging the two by using one intermediate Adapter class
public class ConsoleLogWriter implements LogWriter {
	private ConsoleWriter csw=new ConsoleWriter();
	@Override
	public void out(String text) {
		csw.output(text);
		//Hiding Console writer usage
	}

}
