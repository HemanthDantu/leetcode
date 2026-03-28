package com.hemanth.Recursion;

import java.util.ArrayList;
import java.util.List;

//    """
// In an encryption system where ASCII lower case letters represent numbers in the pattern
// a=1, b=2, c=3... and so on, find out all the codes that are possible for a given input number.
//
// Example 1
//
// number = 123
// codes_possible = ["aw", "abc", "lc"]
// Explanation: The codes are for the following number:
//
// 1 . 23 = "aw"
// 1 . 2 . 3 = "abc"
// 12 . 3 = "lc"
// Example 2
//
// number = 145
// codes_possible = ["ade", "ne"]
// Return the codes in a list. The order of codes in the list is not important.
//
// Note: you can assume that the input number will not contain any 0s
//    :param: number - input integer
//    Return - list() of all codes possible for this number
//    TODO: complete this method and return a list with all possible codes for the input number
//    """
public class ReturnCodes {
    public static char getAlphabet(int num){
        return (char)(num+96);
    }

    public static List<String> getCodes(int num){
        List<String> result = new ArrayList<>();

        if(num==0){
            return result;
        }

        int remainder = num%10;

        return result;
    }
}
