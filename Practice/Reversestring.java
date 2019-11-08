package Practice;

public class Reversestring {

	public static void main(String [] args){
		
		String s= "sandesh";
		String r="";
		for(int i=s.length()-1;i>-1;i--){
			r+=s.charAt(i);
		}
		System.out.println("The reverse of " + s + " is " + r);
	}
}
