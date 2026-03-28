package com.hemanth.Recursion;

//Suppose there is a staircase that you can climb in either 1 step, 2 steps, or 3 steps.
// In how many possible ways can you climb the staircase if the staircase has n steps?
// Write a recursive function to solve the problem.
//
//Example:
//
//n = 3
//output = 4
public class StairCase {

    public static void main(String[] args) {
        System.out.println(getPossibleWays(10));
    }

    private static int getPossibleWays(int n) {
        if(n==0||n==1){
            return n;
        }
        if(n==2){
            return 2;
        }
        if(n==3){
            return 4;
        }

        return getPossibleWays(n-1)+getPossibleWays(n-2)+getPossibleWays(n-3);

    }


}
