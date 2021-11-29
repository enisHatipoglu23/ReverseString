package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    static boolean isPalindrom(String str){
        String reverse = "";
        for(int i = str.length()-1; i >= 0; i--){
            reverse = reverse + str.charAt(i);
        }
        System.out.println(reverse);
        if (str.equals(reverse)){
            return true;
        }
        return false;

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Kelime giriniz: ");
        System.out.println(isPalindrom(input.nextLine()));

    }


}

