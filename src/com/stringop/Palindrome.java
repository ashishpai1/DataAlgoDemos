package com.stringop;

public class Palindrome {

	
	public boolean isPalindrome(String str){
		char[] abc = str.toCharArray();
		int count = 0;
		for(int i=0;i<(str.length()/2)+1;i++){
			
			if(!(abc[i] == abc[str.length()-i-1])){
				
				return false;
			}
			
		}
		//System.out.println("Count :" +count);
		
		return true;
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		
		Palindrome pal = new Palindrome();
		System.out.println(pal.isPalindrome("abcdedcba"));
	}

}
