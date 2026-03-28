package com.hemanth.strings;

//Anagrams
//The goal of this exercise is to write some code to determine if two strings are anagrams of each other.
//
//An anagram is a word (or phrase) that is formed by rearranging the letters of another word (or phrase).
//
//For example:
//
//"rat" is an anagram of "art"
//"alert" is an anagram of "alter"
//"Slot machines" is an anagram of "Cash lost in me"
//Your function should take two strings as input and return True if the two words are anagrams and False if they are not.
//
//You can assume the following about the input strings:
//
//No punctuation
//No numbers
//No special characters

import java.util.Arrays;

public class Anagram {

    public static boolean isAnagram(String s, String t){

        if(s.length() != t.length()){
            s= s.replaceAll(" ","");
            t= t.replaceAll(" ","");
        }

        char[] charArrayS = s.toCharArray();
        char[] charArrayT = t.toCharArray();
        Arrays.sort(charArrayS);
        Arrays.sort(charArrayT);

        return String.valueOf(charArrayS).equals(String.valueOf(charArrayT));
    }

    public static void main(String[] args){
        System.out.println(isAnagram("rat", "art"));
        System.out.println(isAnagram("slot machines", "cash lost in me"));
        System.out.println(isAnagram("slots machines", "cash lost in me"));
    }
}
