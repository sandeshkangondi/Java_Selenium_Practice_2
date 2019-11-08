public class Compoundaverage {

	public static void main(String [] args){
	double principle = 10000, rate= .01, amount;
		
	for (int days=0; days<20; days++){
		amount = principle*java.lang.Math.pow(1+rate, days);
		System.out.println(days + " " + amount);	
	}
}
}