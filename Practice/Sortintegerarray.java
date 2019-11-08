package Practice;

import java.util.HashSet;

public class Sortintegerarray {

	public static void main(String [] args){
		
		Integer [] x = {1,7,4,49,-3,89,7,49,74,-45};
		int i,j,k,temp;
		for (k=0;k<x.length-1;k++)
		for(i=0;i<x.length-1;i++){
				if(x[i]>x[i+1])
				{
					temp=x[i];
					x[i]=x[i+1];
					x[i+1]=temp;
				}}
		for(j=0;j<x.length;j++)
			System.out.println(x[j]);
		
		// Remove duplicates
		HashSet<Integer> h = new HashSet<Integer>(); 
		for(i=0;i<x.length;i++)
			h.add(x[i]);
	
		System.out.println(h);
	}
}
// if(h.containsx[i]){h.remove(x[i])} else {syso(x[i]));
// 