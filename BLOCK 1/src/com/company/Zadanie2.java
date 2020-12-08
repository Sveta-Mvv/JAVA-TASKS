package com.company;

import java.util.Scanner;

public class Zadanie2 {
    public static final String ANSI_MAGENTA = "\u001B[35m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Основание треугольника ");
        double per1 = in.nextDouble();
        System.out.print("Высота треугольника ");
        double per2 = in.nextDouble();
        System.out.print("Площадь треугольника равна "+ ANSI_MAGENTA + triArea(per1,per2) + ANSI_RESET);
    }
    public static double triArea(double a, double b) { return a * b / 2; }
}
