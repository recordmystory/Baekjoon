import java.util.Scanner;

public class WhatIsCoding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int divide = n / 4;

        for (int i = 0; i < divide; i++) {
            System.out.print("long ");
        }
        System.out.print("int");

        sc.close();
    }
}
