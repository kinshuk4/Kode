package com.vaani.basics.java;

import java.util.HashMap;
import java.util.List;
import java.util.*;


public class Solution {
	
    static int isImperfectString(String input) {
    	charArr = input.toCharArray();
    	for(int i = 1;i<input.length();i++){
    		int duet = GetAllDuets(input,i);
    		if(duet==1)
    			return 1;
    	}
		return 0;
        
    	
    }
    
    private static char[] charArr;
    
    static int GetAllDuets(String input,int level){
    	Map<String,Integer> duets = new HashMap<String,Integer>();
    	
    	String s = "";
    	for(int i = 0;(i+level) < charArr.length;i++ ){
    		s = ""+ charArr[i]+charArr[i+level];
    		if(duets.containsKey(s))
    			return 1;
    		else 
    			duets.put(s, 1);
    	}
    	
//    	for(String s2 : duets.keySet())
//    		System.out.print(s2+" ");
//    	
//    	System.out.println();
    	return 0;
    }
    
    public static Map<String, Integer> findOccurences(String str, int length) {
        Map<String, Integer> map = new HashMap<>();
        int limit = str.length() - length + 1;
        for (int i = 0; i < limit; i++) {
            String sub = str.substring(i, i + length);
            Integer counter = map.get(sub);
            if (counter == null) {
                counter = 0;
            }
            map.put(sub, ++counter);
        }
        return map;
    }
    
    public static void main(String[] args){
//    	Map<String,Integer  >  map = findOccurences("FFLL",2);
//    	for(int i : map.values())
//    	{
//    		if(i>1)
//    			 System.out.println(0);
//    	}
    	String s = "FFLL";
    	int isImper = isImperfectString(s);
    	System.out.println(isImper);
    		
    }


}
