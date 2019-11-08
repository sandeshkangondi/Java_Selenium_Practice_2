import java.util.Random;

public class Arrays {
	
	public static void main(String [] args){
		
		int x[]=new int[6];
		int y[]={1,2,3,4,5,6};
		int []z = {1,5,7,8,9};
		int m;
		float sum=0;
		
		Random ran = new Random();
		
		for (int i=0; i<y.length; i++){
			sum=sum+y[i];
		}
		System.out.println(sum);
		
		for (int i=0; i<z.length; i++){
			System.out.println(1+i + "    " + z[i]);
		}
		
		for (int count=0; count<1000; count++){
			m = ran.nextInt(6) +1;
			++x[m-1];
		}
		
		for(int count1=0; count1<x.length; count1++){
			System.out.println(count1+1 + "   " + x[count1]);
		}
		
		change(z);
		System.out.println("Changed array");
		for (int n:z){
			System.out.println(n);
		}
	}
	
	static void change(int ch[]){
/*		for (int x:ch){
			x+=5;
			System.out.println(x);
		}*/
		
		for(int i=0; i<ch.length;i++){
			ch[i]+=5;
		}
	}
}
