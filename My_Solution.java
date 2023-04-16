package misc;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;


public class main_misc {
    //private static HashMap<String,String> cache = new HashMap<>();
	public static void main(String[] args) {
	  
	
		LinkedList<Integer> a = new LinkedList<Integer>();
		a.add(7);
		a.add(1);
		a.add(6);
		
		LinkedList<Integer> b = new LinkedList<Integer>();
		b.add(5);
		b.add(9);
		b.add(2);
		
		System.out.println(sum_lists_reverse(a,b));
		
		LinkedList<Integer> c = new LinkedList<Integer>();
		c.add(6);
		c.add(1);
		c.add(7);
		
		LinkedList<Integer> d = new LinkedList<Integer>();
		d.add(2);
		d.add(9);
		d.add(5);		
		
		System.out.println(sum_lists(c,d));
		
		
	}
	
	private static ArrayList<Integer> revert_to_int(String s) {
		
		char[] c = s.toCharArray();
		ArrayList<Integer> l  = new ArrayList<>();
		for(int i = c.length-1;i >= 0;i--){
			int x = Character.getNumericValue(c[i]);
			l.add(x);
		}
		return l;
		
	}
	
	private static ArrayList<Integer> to_int(String s) {
		
		char[] c = s.toCharArray();
		ArrayList<Integer> l  = new ArrayList<>();
		for(int i = 0;i < s.length() ;i++){
			int x = Character.getNumericValue(c[i]);
			l.add(x);
		}
		return l;
		
	}
	
	private static LinkedList<Integer> sum_lists_reverse(LinkedList<Integer> a,LinkedList<Integer> b){
		
		
		LinkedList<Integer> l = new LinkedList<>();
		
		int v_a = 0;
		for(int i = a.size()-1;i >= 0;i--){
			v_a += a.get(i)*(Math.pow(10,i));
		}
		int v_b = 0;
		for(int i = b.size()-1;i >= 0;i--){
			v_b += b.get(i)*(Math.pow(10,i));
		}
		
		int v = v_a + v_b;
		String s = "";
		s+=v;
		ArrayList<Integer> r = revert_to_int(s);
		
		for(int i = 0;i < r.size();i++) {
			l.add(r.get(i));
		}
		
		return l;
	}
	
	private static LinkedList<Integer> sum_lists(LinkedList<Integer> a,LinkedList<Integer> b){
		
		//
		LinkedList<Integer> l = new LinkedList<>();
		
		int v_a = 0;
		for(int i = 0;i < a.size();i++){
			v_a += a.get(i)*(Math.pow(10,a.size()-1-i));
		}
		int v_b = 0;
		for(int i = 0;i < b.size();i++){
			v_b += b.get(i)*(Math.pow(10,b.size()-1-i));
		}
		int v = v_a+v_b;
		
		String s = "";
		s+= v;
		
		ArrayList<Integer> r = to_int(s);
		
		for(int i = 0;i < r.size();i++){
			l.add(r.get(i));
		}
		
		return l;
		
	}
		
 
    	
    	
    }
	
    
	
		

	

	
		
		
	

	
	
	
	
	
	
	
	
	

	


	
	

	
		
	
	


	

	
	


	
	
	

	


	
	

	
		
	
	


	

	
	

