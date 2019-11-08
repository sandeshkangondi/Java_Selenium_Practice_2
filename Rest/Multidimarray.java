
public class Multidimarray {

	public static void main(String [] args){
		
		int x[][]={{1,2,3,4},{5,6,7,8}};
		int y[][] = {{9,9,0,7,8},{1,2},{1,2,3,4,5,6}};
		System.out.println("Printing MD array x");
		printArray(x);
		System.out.println("\n");
		System.out.println("Printing MD array y");
		printArray(y);
		
	}
		public static void printArray(int array[][]){
			
			for (int row=0;row<array.length;row++){
				
				for(int column=0; column<array[row].length;column++){
					System.out.print(array[row][column] + "\t");
				}
				System.out.println();
		}
	}
}
	
	
