package com.company;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Zadanie12 {
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_RESET = "\u001B[0m";

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Количество элементов массива ");
        String s = reader.readLine();
        int n = Integer.parseInt(s);
        int[] Array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Введите" + i + "элемент массива ");
            String s1 = reader.readLine();
            Array[i] = Integer.parseInt(s1);

        }
        System.out.print(ANSI_CYAN + " Разница между максимальным и минимальным элеметом массива равна " + differenceMaxMin(Array) + ANSI_RESET);
    }

    public static int differenceMaxMin(int[] Array) {
        int max = Array[0], min = Array[0];
        for (int i = i; i < Array.length; i++) {
            if (Array[i] > max)
                max = Array[i];
            if (Array[i] < min)
                min = Array[i];
        }
        return max = min;
    }
}
