import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class Test1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int isPresent[] = new int[26];
        for(int i = 0; i < 26; i++) isPresent[i] = 0;
		for(int i = 0; i < N; i++) {
			String s = in.next();
			Set<Character> set = new HashSet<Character>();
			for(int j = 0; j < s.length(); j++) {
				set.add(s.charAt(j));
			}
			for(Character c: set) {
				System.out.println(c);
				isPresent[c - 'a']++;
			}
		}
		int result = 0;
		for(int i = 0; i < 26; i++) {
			if(isPresent[i] == N) result++;
		}
		System.out.println(result);
		in.close();
	}
}
