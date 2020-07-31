package HarmonicSum;

public class App {

	public static void main(String[] args) {
		int n=Integer.parseInt(args[0]);
		double lr=LRsum(n);
		double rl=RLsum(n);
		System.out.println("LR: "+lr+"  "+" RL: "+rl);
		System.out.println("difference(rl-lr): "+(rl-lr));
	}
	public static double LRsum(int n) {
		double sum=0;
		for (int i=1;i<=n;i++) {
			sum+=1/(double)i;
		}
		return sum;
	}
	public static double RLsum(int n) {
		double sum=0;
		for (int i=n;i>=1;i--) {
			sum+=1/(double)i;
		}
		return sum;
	}
}
