package labtest03;

import java.util.*;

public class Lottery {
	static int[]  lotteryNumbers = new int[5];
	
	public static void main(String[] args) {
		int[] ar = {7,4,9,1,3};
		
		for(int i=0; i<5; i++) {
			System.out.print(ar[i]);
		}
		System.out.println();
		new Lottery();
		System.out.println();
		compare(ar);
	}
	
	public Lottery() {
		Random rand = new Random();
		
		for(int i=0; i<5; i++) {
			lotteryNumbers[i]=rand.nextInt(10);
		}
		for(int i=0; i<5; i++) {
			System.out.print(lotteryNumbers[i]);
		}
		
	}
	
	
 
	
	
	public static void compare(int[] arr) {
		int c=0;
		 int[] newarr =new int[5];
		for(int i=0; i<5; i++) {
			if(arr[i]==lotteryNumbers[i]) {
				newarr[c]=arr[i];
				c++;
			}
		}
		String matches = Arrays.toString(Arrays.copyOf(newarr, c));

		switch(c) {
		case 0:
			System.out.println("There are no any matching numbers");
			break;
		case 1:
			System.out.println("There is an one matching number. this is "+matches);
			break;
		case 2:
			System.out.println("There are two matching number. there are "+matches);
			break;
		case 3:
			System.out.println("There are three matching number. there are "+matches);
			break;
		case 4:
			System.out.println("There are four matching number. there are "+matches);
			break;
		case 5:
			System.out.println("There are five matching number. there are "+matches);
			break;
		}
	}
}
