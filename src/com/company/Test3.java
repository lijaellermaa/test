package com.company;

public class Test3 {
    public static void main(String[] args) {
        int[] array = new int[]{188, 181, 156, 162, 173, 152, 169, 193, 185};
        int max = array[0];
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
                count = i;
            }
        }

        System.out.println(count);
    }
}
