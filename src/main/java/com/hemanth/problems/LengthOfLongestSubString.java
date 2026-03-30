package com.hemanth.problems;

//TODO
//Given a string s, find the length of the longest substring without duplicate characters.
//
//
//
//Example 1:
//
//Input: s = "abcabcbb"
//Output: 3
//Explanation: The answer is "abc", with the length of 3. Note that "bca" and "cab" are also correct answers.
//Example 2:
//
//Input: s = "bbbbb"
//Output: 1
//Explanation: The answer is "b", with the length of 1.
//Example 3:
//
//Input: s = "pwwkew"
//Output: 3
//Explanation: The answer is "wke", with the length of 3.
//Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.

import java.util.HashSet;

public class LengthOfLongestSubString {

    public static void main(String[] args) {
        System.out.println(getLengthOfLongestSubString("abcabcbb"));
    }

    private static int getLengthOfLongestSubString(String str) {

        int maxlen = 0;
        HashSet<Character> hSet = new HashSet<>();

        int l = 0;

        for (int r=0; r<str.length();r++){
            if(!hSet.contains(str.charAt(r))){
                hSet.add(str.charAt(r));
                maxlen = Math.max(maxlen, r-l+1);
            }else {
                while(hSet.contains(str.charAt(r))){
                    hSet.remove(str.charAt(l));
                    l++;
                }
                hSet.add(str.charAt(r));
            }

        }
        return maxlen;
    }


}
