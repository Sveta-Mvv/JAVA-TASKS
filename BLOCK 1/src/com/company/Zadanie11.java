package com.company;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.System.*;
public class Zadanie11 {
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите строку ");
        String str = reader.readLine();
        System.out.print("Введите количество повторяющихся символов ");
        String s = reader.readLine();
        int kol = Integer.parseInt(s);
        repeat (str, kol);
    }
    public static void repeat (String str, int kol){
        System.out.print(ANSI_CYAN);
        for(int i=0; i< str.length();i++){
            char s = str.charAt(i);
            for(int l=0;l< kol;l++){
                System.out.print(s);
            }
            }
        System.out.print(ANSI_RESET);
    }
}
