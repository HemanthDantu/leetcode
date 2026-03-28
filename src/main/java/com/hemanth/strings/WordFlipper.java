package com.hemanth.strings;


//    """
//    Flip the individual words in a sentence
//
//    Args:
//       our_string(string): String with words to flip
//    Returns:
//       string: String with words flipped
//    """


public class WordFlipper {
    public static String flippedWords(String s){
        String[] stringArray = s.split(" ");
        String reversedStr = "";
        for(int i = 0; i < stringArray.length; i++){
            String currStr = stringArray[i];
            int len = currStr.length()-1;
            String rev = "";
            while(len>=0){
                rev = rev+currStr.charAt(len);
                len--;
            }
            if(i<stringArray.length-1){
                reversedStr = reversedStr+rev+" ";
            }
            else {
                reversedStr = reversedStr+rev;
            }
        }
        return reversedStr;
    }

    public static void main(String[] args){
        System.out.println(flippedWords("hemanth can do anything he wish for"));
    }
}
