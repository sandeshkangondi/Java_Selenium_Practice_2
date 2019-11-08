package junit3;

public class CalciLib {
	
	CalciLib(int x){
		System.out.println("Inside Constructor "+x);
	}
	CalciLib(String y){
		System.out.println(y);
	}
int add (int x, int y){
	return(x+y);
}

int subtract (int x, int y){
	return(x-y);
}

int multiply (int x, int y){
	return(x*y);
}

float divide (double d, double y){
	return (float) (d/y);
}
}
