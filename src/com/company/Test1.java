package com.company;

public class Test1 {
    public static void main(String[] args) {
        int num;
        int i = 0;
        int min = 100;
        int max = 200;

        while (i < 10) {
            num = (int) Math.round(Math.random() * (max - min + 1)) + min;
            System.out.println(num);
            i++;
        }
    }
}
