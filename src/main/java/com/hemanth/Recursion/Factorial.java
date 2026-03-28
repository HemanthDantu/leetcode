package com.hemanth.Recursion;

//    """
//    Calculate n!
//
//    Args:
//       n(int): factorial to be computed
//    Returns:
//       n!
//    """
public class Factorial {

    public static int getFactorial(int n){
        if(n==0) return 1;
        if(n==1) return 1;

        return n*getFactorial(n-1);
    }

    public static void main(String[] args) {
        System.out.println(getFactorial(6));
    }
//5*4*3*2
}
