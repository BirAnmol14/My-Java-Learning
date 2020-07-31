package exercise_Abstract;

public class HourlyWorker extends Worker{
	private int hours_worked;
	public HourlyWorker(String name, double salary_rate,int hours_worked) {
		super(name, 50);
		if(hours_worked<60) {
		this.hours_worked=hours_worked;}
		else {
			this.hours_worked=60;
		}
	}
	@Override
	public double computePay() {
		return getSalary()*hours_worked;
	}
}
