package labtest03;

import java.util.*;

public class Re {
	static Stack<Character> st = new Stack<>();
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter word : ");
		String word = scan.next();
		
		ReverseString(word);
		countVowels(word);
		
		scan.close();
	}
	
	public static void ReverseString(String word) {
		for(char ss : word.toCharArray()) {
			st.push(ss);
		}
		
		StringBuilder build = new StringBuilder();
		while(!st.isEmpty()) {
			build.append(st.pop());
		}
		System.out.println("Reverse -> " + build.toString());
	}
	
	public static void countVowels(String s) {
		int c=0;
		
		for(char ss : s.toCharArray()) {
			if(ss=='a'|| ss=='e'|| ss=='i'|| ss=='o'|| ss=='u'||ss=='A'||ss=='E'||ss=='I'||ss=='O'||ss=='U') {
				c++;
			}
		}
		System.out.println("no.ofVowels -> "+c);
	}
}
