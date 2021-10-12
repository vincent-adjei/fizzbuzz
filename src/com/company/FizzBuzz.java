package com.company;

public class FizzBuzz {

    public String fizzBuzz(int userInput){
        String result = "";

        if (userInput > 0){
            for (int i= 1; i <= userInput; i++){
                if (i % 15 == 15){
                    result += "FizzBuzz, ";
                }else if (i % 5 == 0){
                    result += "Buzz";
                }else if (i % 3 == 0){
                    result += "Fizz, ";
                }else{
                    result += i + ", ";
                }
            }
            return result.substring(0, result.length()-2);
        }else{
            return "Invalid Input";
        }
    }
}
