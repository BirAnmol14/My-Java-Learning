
public class Logger {
	private LogWriter writer;
	public Logger(LogWriter writer) {
		this.writer=writer; 
	}
	public void write(String text) {
		writer.out(text);
	}
}
