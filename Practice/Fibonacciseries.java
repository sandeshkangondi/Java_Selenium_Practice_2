package Practice;

public class Fibonacciseries {
	public static void main(String [] args){
		Integer [] ser = new Integer[110];
		ser[0] = 0;
		ser[1] = 1;
		System.out.println(ser[0]);
		System.out.println(ser[1]);
		for(int i=2; i<25; i++){
			ser[i]=ser[i-1]+ser[i-2];
			System.out.println(ser[i]);
		}
		
	}
}

