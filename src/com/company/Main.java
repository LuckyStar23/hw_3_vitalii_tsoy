package com.company;

public class Main {

    public static void main(String[] args) {
        double[] nums = {3.4, 3.3, -4.5, 5.6, -7.8, -8.9, 9.1, -4.3, 2.3, -5.9, -8.1, 1.1, 2.9, -9.5, 8.2};
        boolean isItMinus = false;
        double plus = 0;
        int count = 0;

        for (double num : nums) {
            if (num < 0) {
                isItMinus = true;
            }

            if (isItMinus) {
                if (num > 0 ) {
                    plus = plus + num;
                    System.out.println(plus);
                    count= count + 1;

                }
            }
        }
        double result = plus/count;
        System.out.println(result);
    }
}













