public class Variablelenarguments {
public static void main(String [] args){
	
	
	System.out.println("The sum is " +sum(2,3,4,6));
	
}

public static int sum(int ... x){
	int total=0;
	for(int i:x){
		total+=i;
	}
	return total;
}

}
