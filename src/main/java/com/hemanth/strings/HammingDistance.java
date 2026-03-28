package com.hemanth.strings;


//    """
//    Calculate the hamming distance of the two strings.
//In information theory, the Hamming distance between two strings of equal length is the number of
// positions at which the corresponding symbols are different. Calculate the Hamming distance for the following test cases.
//
//    Args:
//       str1(string),str2(string): Strings to be used for finding the hamming distance
//    Returns:
//       int: Hamming Distance
//    """
public class HammingDistance {
    public static int getHammingDistance(String str1,String str2){
        if(str1.length()!=str2.length()){
            return 0;
        }
        int len = str1.length();
        int dist = 0;
        for(int i=0; i<len; i++){
            if(str1.charAt(i)!=str2.charAt(i)){
                dist++;
            }
        }
        return dist;
    }

    public static void main(String[] args){
        System.out.println(
                "s1 : geeksforgeeks, s2 : geeksforgeeks :" + getHammingDistance("geeksforgeeks", "geeksandgeeks"));
        System.out.println("s1 : ACTTGACCGGG, s2 : GATCCGGTACA : " + getHammingDistance("A gentleman","Elegant men"));
    }

}
