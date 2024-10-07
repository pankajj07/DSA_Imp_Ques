package com.leetcode;

public class LengthOfLastWord {
	public static void main(String[] args) {
		String str = "Hello World";
		System.out.print(LastWord(str));
		
	}
	public static int LastWord(String s) {
		String str = s.trim();
		int count = 0;
		for(int i = str.length() - 1; i >= 0; i--) {
			if(str.charAt(i) != ' ') {
				count++;
			}else {
				break;
			}
		}
		return count;
	}

}
