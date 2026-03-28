package com.hemanth.Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
Problem Statement
Define a procedure, deep_reverse, that takes as input a list, and returns a new list that is the deep reverse of the input list.
This means it reverses all the elements in the list, and if any of those elements are lists themselves, reverses all the elements
in the inner list, all the way down.

arr =  [1, [2,3], 4, [5,6]]
solution = [ [6,5], 4, [3, 2], 1]*/
public class DeepReverse {

    public static void main(String[] args){
        System.out.println(getDeepReverse(Arrays.asList(1,Arrays.asList(2,3))));
        System.out.println(getDeepReverse(List.of()));
        System.out.println(getDeepReverse(Arrays.asList(1, Arrays.asList(2, Arrays.asList(9, 10), 3), 4, Arrays.asList(5, 6))));

    }

    private static <T> List<T> getDeepReverse(List<T> list) {
        System.out.println("input:"+ list);
        System.out.println("input size:"+ list.size());
        if(list.isEmpty())
            return list;
        List<T> result = new ArrayList<>();
//
//        if(list.size()==1){
//            if(list.get(0) instanceof List){
//                result.add((T) getDeepReverse((List<T>) list.get(0)));
//                return result;
//            }else {
//                return list;
//            }
//        }
//
//        T last = list.get(list.size()-1);
//        result.add(0,last);
//        getDeepReverse(list.subList(0,list.size()-1));

        for(int i= list.size()-1; i>=0;i--){
            if(list.get(i) instanceof List){
                result.add((T) getDeepReverse((List<T>) list.get(i)));
            }
            else
                result.add(list.get(i));
        }

        return result;
    }

}
