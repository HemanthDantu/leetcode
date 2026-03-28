package com.hemanth.Recursion;

import java.util.*;

// """
//    Return a list of permutations
//
//    Examples:
//       permute([0, 1]) returns [ [0, 1], [1, 0] ]
//
//    Args:
//      l(list): list of items to be permuted
//
//    Returns:
//      list of permutation with each permuted item be represented by a list
//    """
public class ListPermutations {


    public static void main(String[] args) {
        System.out.println(getPermutations(Arrays.asList(1,2)));
        System.out.println(getPermutations(Arrays.asList("Apple", "Banana", "Grapes")));
        System.out.println(getPermutations(Arrays.asList(1)));
        System.out.println(getPermutations(Arrays.asList()));
        System.out.println(getPermutations(Arrays.asList(1, "abc", Arrays.asList(2, 3))));
    }

    private static <T> List<List<T>> getPermutations(List<T> list) {

        List<List<T>> result = new ArrayList<>();
        if(list.isEmpty()) {
            result.add(new ArrayList<>());
            return result;
        }
        if(list.size()==1) {
            result.add(new ArrayList<>(list));
            return result;
        }

        T elem = list.get(0);
        List<List<T>> subPermutations = getPermutations(list.subList(1, list.size()));
        for (List<T> subPermutation : subPermutations) {
            for (int j = 0; j <= subPermutation.size(); j++) {
                List<T> newList = new ArrayList<>(subPermutation);
                newList.add(j, elem);
                result.add(newList);
            }
        }

        return result;

    }

}
