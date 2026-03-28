package com.hemanth.strings;


//    Reverse the input string
//
//    Args:
//       our_string(string): String to be reversed
//    Returns:
//       string: The reversed string

public class StringReverse {

    public static String reversedString(String input){
        String reversedString = "";
        int lengthOfInput = input.length()-1;

        while(lengthOfInput>=0){
            reversedString = reversedString+input.charAt(lengthOfInput);
            lengthOfInput--;
        }

        return reversedString;
    }

    public static void main(String[] args){
        System.out.println(reversedString("hemanth"));
    }
}
