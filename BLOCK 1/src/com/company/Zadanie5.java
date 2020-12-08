package com.company;
import java.util.Scanner;
public class Zadanie5 {
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите чсло N ");
        int per1 = in.nextInt();
        System.out.print("Введите чсло a ");
        int per2 = in.nextInt();
        System.out.print("Введите чсло b ");
        int per3 = in.nextInt();
        System.out.println(operation(per1, per2, per3));
        }
        public static String operation (int N, int a, int b) {
            if (a + b == N) {
                return ANSI_CYAN + "Нужно выполнить сложение" + ANSI_RESET;
            }
            if (a - b == N) {
                return ANSI_CYAN + "Нужно выполнить вычитание " + ANSI_RESET;
            }
            if (a * b == N) {
                return ANSI_CYAN + "Нужно выполнить умножение " + ANSI_RESET;
            }
            if (a / b == N) {
                return ANSI_CYAN + "Нужно выполнить деление" + ANSI_RESET;
            }
        else {
                return ANSI_CYAN + "Исходное число невозможно получить из чисел a и b" + ANSI_RESET;
            }
    }
}
