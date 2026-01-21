package test;

import java.util.Scanner;


public class palindrome {
	
	public static boolean isPalindrome(String str) {
		str= str.toLowerCase();
		int left=0;
		int right= str.length()-1;
		
		while(left<right) {
			if(str.charAt(left)!=str.charAt(right)) {
				return false;
				
			}
			left++;
			right--;
			
		}
		return true;
	
				
	}

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		
		String input=scanner.nextLine();
		
		
		boolean result= isPalindrome(input);
		
		if(result) {
			System.out.println("Palindrome!");
			
		}
		else {
			System.out.println("No");
			
		}
	scanner.close();

	}

}
