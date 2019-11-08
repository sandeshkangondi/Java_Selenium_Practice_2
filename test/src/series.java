
public class series {

	public static void main(String [] args){
	String y = "123456789";

	int a,b,c,d,i,j,k,l;

	for (i=0;i<6;i++)
	for (j=i+1;j<7;j++)
	for (k=j+1;k<8;k++)
	for (l=k+1; l<9; l++){

	a = Integer.parseInt(y.substring(0,j));
	b = Integer.parseInt(y.substring(j,k));
	c = Integer.parseInt(y.substring(k,l));
	d = Integer.parseInt(y.substring(l,9));

	System.out.println(a + "+" + b + "-" + c + "-" + d +"=" + (a+b-c-d));
	System.out.println(a + "-" + b + "+" + c + "-" + d +"=" + (a-b+c-d));
	System.out.println(a + "-" + b + "-" + c + "+" + d +"=" + (a-b-c+d));

	}
	}
}
