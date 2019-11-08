package Practice;

public class ReverseNumber {
	
	public static void main(String [] args){
		
		Integer num = 123456;
		String numstr = num.toString();
		StringBuffer sb = new StringBuffer(numstr);
		System.out.println(Integer.parseInt(sb.reverse().toString()));
	}
}
