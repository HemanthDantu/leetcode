package com.hemanth.Recursion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// A keypad on a cellphone has alphabets for all numbers between 2 and 9.
//
// You can make different combinations of alphabets by pressing the numbers.
//
// For example, if you press 23, the following combinations are possible:
//
// ad, ae, af, bd, be, bf, cd, ce, cf
//
// Note that because 2 is pressed before 3, the first letter is always an alphabet on the number 2.
// Likewise, if the user types 32, the order would be
//
// da, db, dc, ea, eb, ec, fa, fb, fc
//
// Given an integer num, find out all the possible strings that can be made using digits of input num.
// Return these strings in a list. The order of strings in the list does not matter.
// However, as stated earlier, the order of letters in a particular string matters.
public class KeypadCombinations {
    private static final Map<Integer, List<String>> mapOfNumberAndAlphabets = new HashMap<>(Map.of(
            2, List.of("a", "b", "c"),
            3, List.of("d", "e", "f"),
            4, List.of("g", "h", "i"),
            5, List.of("j", "k", "l"),
            6, List.of("m", "n", "o"),
            7, List.of("p", "q", "r", "s"),
            8, List.of("t", "u", "v"),
            9, List.of("w", "x", "y", "z")
    ));

    public static void main(String[] args) {
        System.out.println(getKeyPadCombinations(2234));
    }

    private static List<String> getKeyPadCombinations(int i) {
        if(i<=1) return new ArrayList<>();
        List<String> result;
        List<String> result1 = new ArrayList<>();

        if(i<10 && mapOfNumberAndAlphabets.get(i)!=null){
            return mapOfNumberAndAlphabets.get(i);
        } else {
            int currDig =i%10;
            result = getKeyPadCombinations(i/10);
            List<String> currMap = mapOfNumberAndAlphabets.get(currDig);
            for(int x=0; x< result.size();x++){
                for( int y=0; y<currMap.size(); y++){
                    result1.add(result.get(x) + currMap.get(y));
                }
            }
        }
        return result1;
    }
}
