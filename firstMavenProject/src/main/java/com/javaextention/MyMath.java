package com.javaextention;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class MyMath {
    public static void main(String[] args) {
        welcome();
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            while (true) {
                String s = br.readLine();
                int a = Integer.parseInt(s);
                System.out.println(mathSqrt(a));
            }
        } catch (Exception e) {
            goodbye();
        }
    }

    public static void welcome() {
        System.out.println("Введите любое число для извлечения квадратного корня или введите \"stop\"");
    }

    public static final double mathSqrt(int a) {
        return Math.sqrt(a);
    }

    public static void goodbye() {
        System.out.println("Досвидания!");
    }
}
