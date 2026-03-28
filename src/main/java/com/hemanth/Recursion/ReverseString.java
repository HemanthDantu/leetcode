package com.hemanth.Recursion;

//    """
//    Return reversed input string
//
//    Examples:
//       reverse_string("abc") returns "cba"
//
//    Args:
//      input(str): string to be reversed
//
//    Returns:
//      a string that is the reverse of input
//    """
public class ReverseString {

    public static String getReversedString(String s){
        if(s.length()<=1) return s;
        System.out.println(s.substring(s.length()-1));
        System.out.println(getReversedString(s.substring(0,s.length()-1)));
        return s.substring(s.length()-1)+getReversedString(s.substring(0,s.length()-1));

    }

    public static void main(String[] args) {
        System.out.println(getReversedString("abc"));
    }
}
