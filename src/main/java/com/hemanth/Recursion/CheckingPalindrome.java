package com.hemanth.Recursion;

public class CheckingPalindrome {

    public static boolean isPalindrome(String s){
        if(s.length()<=1) return true;
        if(s.length()==2) return s.charAt(0)==s.charAt(1);
        System.out.println(s.substring(1,s.length()-1));
        return s.charAt(0)==s.charAt(s.length()-1)&&isPalindrome(s.substring(1,s.length()-1));
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("hannah"));
        System.out.println(isPalindrome("bd"));
    }
}
