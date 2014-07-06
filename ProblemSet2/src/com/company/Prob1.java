package com.company;

public class Prob1 {

    public static void main(String[] args) {

      String testString =  "asdfghzxcvbnm,qwertyuio";
      System.out.println(containsSingleCharacter(testString));
        System.out.println(containsSingleCharacter2(testString.toCharArray()));

    }


    private static  boolean containsSingleCharacter(String inputString){

         for(int i = 0 ; i < inputString.length() ; i++){
               for(int j  = i+1 ; j < inputString.length()  ; j++){

                   if(inputString.charAt(i) == inputString.charAt(j)){
                       return false;
                   }
               }

         }
        return true;
    }


    private static  boolean containsSingleCharacter2(char[] inputString){
        for(int i = 0 ; i < inputString.length ; i++){
            for(int j  = i+1 ; j < inputString.length  ; j++){

                if(inputString[i] == inputString[j]){
                    return false;
                }
            }

        }
        return true;
    }
}
