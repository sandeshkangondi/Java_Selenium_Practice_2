package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Countfruits{
	public static void main(String [] args){
	int count;
	String[] fruits = {"Apple", "Banana", "Apple", "Orange", "Guava", "Banana", "Banana", "Pomogranate", "Banana", "Guava", "Guava"};
	List<String> al = new ArrayList<String>();
	for(String x: fruits)
		al.add(x);
	String fruit;	
	HashMap<String,Integer> h = new HashMap<String,Integer>();
	while(al.size()>0){
		fruit = al.remove(0);
		if(!h.containsKey(fruit))
			h.put(fruit,1);
		else{
			count = h.get(fruit);
			count++;
			h.remove(fruit);
			h.put(fruit, count);	
		}
	}
	System.out.println(h);
	
//	List<String> l = new ArrayList<String>();
	Set fset = h.entrySet();
	Iterator ite = fset.iterator();
	while(ite.hasNext()){
	Map.Entry me = (Map.Entry) ite.next();
	System.out.println(me.getKey() + " " + me.getValue());
	}
	}
	}