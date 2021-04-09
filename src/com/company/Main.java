package com.company;

public class Main {

    public static void main(String[] args) {
        double[] arr = {20.1, 11.1, -15.4, -15.1, 23.3, 6.2, 23.1, -27.3, -10.5, 17.1, 14.3, 45.6, -20.5, 19.3, -5.03, 15.4};
        double amount = 0;
        double total = 0;
        boolean isNegative = false;
        for (double amount2 : arr) {
            if (amount2 < 0) {
                isNegative = true;
            } else {
                if (isNegative == true) {
                    amount++;
                    total += amount;
                }
            }
        }
        System.out.println("Ваше арифсетическое число " + " " + amount / total);
    }
}
