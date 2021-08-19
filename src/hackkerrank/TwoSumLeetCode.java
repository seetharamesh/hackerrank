package hackkerrank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.*;


public class TwoSumLeetCode {

	public int[] twoSum(int[] nums, int target) {
        List<Integer> al = new ArrayList<Integer>();
        
        int count = 0;
        for(int i = 0 ; i < nums.length; i++){
        	int diff = Math.abs(target - nums[i]);
            for(int j = i+1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    al.add(i);
                    al.add(j);
            }
        }
  
    }
     int[] results=new int[al.size()];
    System.out.println("Count:" + al.size());
    for(int i = 0 ; i < al.size(); i++) {
    	System.out.println(al.get(i))  ;
    	results[i] = al.get(i);
    }
    
        return results;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		    TwoSumLeetCode ts = new TwoSumLeetCode();
		    int[] nums = {0,4,3,0};
		    //int[] result = {};
		    int results[] = new int[nums.length];
		     results = ts.twoSum(nums, 0);

	}
}