package Practice;
public class QuickSort{
	  public static void main(String a[]){
	    int array[] = {12,9,4,99,120,1,3,10,13};
	    int len = array.length;
	    quick_srt(array,0,array.length-1);
	    System.out.println("The sum of the two largest integers is: " + (array[len-1]+array[len-2]));
	  }

	  public static void quick_srt(int array[],int low, int n){
	    int lo = low;
	    int hi = n;
	    if (lo >= n) {
	      return;
	    }
	    int mid = array[(lo + hi) / 2];
	    while (lo < hi) {
	      while (lo<hi && array[lo] < mid) {
	        lo++;
	      }
	      while (lo<hi && array[hi] > mid) {
	        hi--;
	      }
	      if (lo < hi) {
	        int T = array[lo];
	        array[lo] = array[hi];
	        array[hi] = T;
	      }
	    }
	    if (hi < lo) {
	      int T = hi;
	      hi = lo;
	      lo = T;
	    }
	    quick_srt(array, low, lo);
	    quick_srt(array, lo == low ? lo+1 : lo, n);
	    

	    
	    // if(low<lo) quick_srt(array, low, lo);
	    // if(hi<n) quick_srt(array, hi, n);
	  }
	}
