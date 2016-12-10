package com.javaExtention;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by 1 on 10-Dec-16.
 */
public class MyMath {
    public static void main( String[] args ){

        welcome();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            while(true){
                String s = br.readLine();
                int a = Integer.parseInt(s);
                System.out.println(mathSqrt(a));
            }
        } catch (Exception e) {
            goodbye();
        }


    }

    public static void welcome(){
        System.out.println("Введите любое число для извлечения квадратного корня или введите \"stop\"");
    }

    public static double mathSqrt (int a){
        return Math.sqrt(a);
    }

    public static void goodbye(){
        System.out.println("Досвидания!");
    }
}
