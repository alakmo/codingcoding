package s_perm_b;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class a3b3 {

	 public void ramanujan(int n) {
	        if (n <= 0) {
	            return;
	        }
	         
	        HashMap<Long, List<Integer>> map = new HashMap<Long, List<Integer>>();
	         
	        for (int a = 1; a < n; a++) {
	            for (int b = a + 1; b < n; b++) {
	                long sum = a * a * a + b * b * b;
	                if (map.containsKey(sum)) {
	                    List<Integer> temp = map.get(sum);
	                    System.out.println(temp.get(0) + "^3" + " + " + temp.get(1) + "^3" + " = " + 
	                                       a + "^3" + " + " + b + "^3");
	                } else {
	                    List<Integer> temp = new ArrayList<Integer>();
	                    temp.add(a);
	                    temp.add(b);
	                    map.put(sum, temp);
	                }
	            }
	        }
	    }
	 
	    public static void main(String[] args) {
	    	a3b3 sol = new a3b3();
	 
	      sol.ramanujan(100);
	    }

}
