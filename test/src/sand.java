
public class sand {

	public static void main(String [] args){
		String number = "372109";
		String  [] a={" "," ","ABC","DEF","GHI","JKL","MNO","PQR","STU","VWXYZ"};
		int j=0;
		int [] data_struct = new int[number.length()+1];
		
		solve_message(number, data_struct, j, a);
		}

		static void solve_message(String number, int [] data_struct, int j, String [] a){
		if(j<data_struct.length){
		for (data_struct[j]=0;data_struct[j]<a[j].length();data_struct[j]++)
		solve_message(number, data_struct, j++, a);
}
		else if (j==data_struct.length){
			StringBuffer Final_String = new StringBuffer();
			for (int l=0; l<number.length(); l++){
				Final_String = Final_String.append((a[Integer.parseInt(number.substring(l,l))].charAt(data_struct[l])));
				}
				System.out.println(Final_String.toString());
				}
			
		}
}
		
