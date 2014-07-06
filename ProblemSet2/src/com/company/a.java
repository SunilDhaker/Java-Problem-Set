package com.company;
import java.io.BufferedReader;
import java.io.InputStreamReader;


class TestClass {
    public static void main(String args[] ) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        char tempChar;
        int N = Integer.parseInt(line);
        boolean[] checked = new boolean[N];
        String tempInput[] = new String[N];
        for (int i = 0 ; i < N ; i++){
            checked[i] = false;
             tempInput[i] = br.readLine();
        }
        for (int i = 0; i < N; i++) {
           checked[i] = true;
           tempChar =   tempInput[i].charAt(tempInput[i].length() / 2);
            for(int j = i ; j < N; j++){
                if(tempInput[j].charAt(tempInput[j].length()/2) == tempChar && tempInput[i].length() == tempInput[j].length()){

                    if(palindrome(tempInput[i], tempInput[j])) {
                        System.out.println("" + tempInput[i].length() + tempChar);
                        checked[j] = true;
                    }

                }
            }

        }



    }

    private static boolean palindrome(String s, String s1) {
        for(int i = 0 ; i < s.length() ; i ++ ){
            if(s.charAt(i) != s1.charAt(s.length()-1-i))
                return  false;
        }
        return true;
    }



}