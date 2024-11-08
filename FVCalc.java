// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		int currentValue = Integer.parseInt(args[0]);
		
		double rate = Double.parseDouble(args[1]);
		rate = rate / 100.0;

		int n = Integer.parseInt(args[2]);
		
		double futureValue = currentValue * (Math.pow(( 1 + rate), n));

		System.err.println("After "+ n + " years, a $" + currentValue + " saved at " + rate*100 + "%25 will yield $" + (int) futureValue);
	}
}