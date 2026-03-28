package com.hemanth.strings;

import java.util.Stack;

//Given a string s representing a valid expression, implement a basic calculator to evaluate it, and return the result of the evaluation.
//
//        Note: You are not allowed to use any built-in function which evaluates strings as mathematical expressions, such as eval().
//Example 1:
//
//Input: s = "1 + 1"
//Output: 2
public class BasicCalculator {

    public static int buildBasicCalc(String s){
        String cleanedS = s.replaceAll(" ","");
        int lenCleanedS = cleanedS.length();
        int result = 0;
        int currNum =0;
        int sign = 1;

        Stack<Integer> stck = new Stack<>();

        for(int i=0; i<lenCleanedS;i++){
            if(Character.isDigit(cleanedS.charAt(i))){
                currNum = currNum*10+Character.getNumericValue(cleanedS.charAt(i));
            } else if(cleanedS.charAt(i) == '('){
                stck.push(result);
                stck.push(sign);
                result = 0;
                sign = 1;
            }

            //stck 10, 1

             else {
                if(cleanedS.charAt(i) == ')'){
                    result = result + (sign * currNum);
                    currNum = 0;
                    sign = stck.pop();
                    result = stck.pop()+(sign*result);
                } else if (cleanedS.charAt(i) == '+') {
                    result=result+(sign*currNum); //12->
                    currNum = 0;
                    sign=1;
                }else if (cleanedS.charAt(i) == '-') {
                    result=result+(sign*currNum); //12->
                    currNum = 0;
                    sign=-1;
                }
            }
        }

        result=result+(sign*currNum);
        return result;
    }

    public static void main(String[] args){
        System.out.println(buildBasicCalc("12 + 3 +1 "));
        System.out.println(buildBasicCalc("12 - 3 -1 "));
        System.out.println(buildBasicCalc("10 + (2 - 3) "));


    }

}
