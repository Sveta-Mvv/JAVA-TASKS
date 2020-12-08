package com.company;

import java.util.Scanner;

public class Zadanie4 {
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_RESET = "\u001B[0m";

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Вероятность победы ");
        double per1 = in.nextDouble();
        System.out.print("Выигрыш в случае победы ");
        double per2 = in.nextDouble();
        System.out.print("Стоимость попытки ");
        double per3 = in.nextDouble();
        if (profitableGamble(per1, per2, per3)) {
            System.out.println(ANSI_CYAN + "Большая вероятность выигрыша" + ANSI_RESET);
        } else {
            System.out.println(ANSI_CYAN + "Маленькая вероятность выигрыша" + ANSI_RESET);
        }
    }

    public static boolean profitableGamble(double prob, double prize, double pay) {
        return (prob * prize > pay);
    }
}
