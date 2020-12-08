package com.company;
import java.io.IOException;
import java.util.Scanner;

public class Zadanie8 {
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        System.out.print("Первое ребро треугольника ");
        int per1 = in.nextInt();
        System.out.print("Второе ребро треугольника ");
        int per2= in.nextInt();
        System.out.println(ANSI_CYAN + "Третье ребро треугольника может иметь максимальную длину " + nextEdge(per1,per2) + ANSI_RESET);

    }
    public static int nextEdge(int a, int b){return a+b-1;}
}
