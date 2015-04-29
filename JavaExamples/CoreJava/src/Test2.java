
public class Test2 {

	public static int get(String input){
		input = input.toLowerCase();
	    boolean[] result = new boolean[26];
	    for (int i = 0; i < input.length(); i++) {
	        if(input.charAt(i) >= 'a' && input.charAt(i) <= 'z'){
	            if(!result[input.charAt(i) - 'a'])
	                result[input.charAt(i) - 'a'] = true;
	        }
	    }
	    for (int i = 0; i < result.length; i++) {
	        if(!result[i]){
	            return 0;
	        }
	    }
	    return 1;
	}
	
}
