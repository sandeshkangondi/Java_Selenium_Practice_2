import java.util.ArrayList;

public class For {

	public static void main(String [] args){
		
		int [] num = {2,100,-3,8,10,-9,0,11};
		int sum=0;
		int l=4;
		ArrayList<Integer> h = new ArrayList<Integer>();
		h.add(1);
		h.add(3);
		
		for (int i=0; i<10; i++){
			System.out.println(i);
		}
		
		for (int i=12;i<100;i+=10){
			System.out.println(i);
		}
		
		// Enhanced for loop
		
		for (int x: h){
			if(x<l)
			sum+=x;
		}
		System.out.println("Sum = " + sum);
		
	}
	
}
