package com.vkstech.rough;

import java.util.Scanner;

public class BracketPrinter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        int[] nArr = new int[t];
        String[] bracketsArr = new String[t];

        for(int i = 0; i< t; i++) {
            nArr[i] = Integer.parseInt(sc.nextLine());
            bracketsArr[i] = sc.nextLine();
        }

        String brackets;
        int n;
        int sum;
        char[][] arrLocation;
        for (int k = 0; k<t; k++){
            brackets = bracketsArr[k];
            n = nArr[k];

            sum = -1;
            arrLocation = new char[n][n];
            for (int i = 0, j = 0; i < n; i++, j++) {
                if (brackets.charAt(i) == '[') {
                    sum++;
                    arrLocation[sum][j] = brackets.charAt(i);
                } else {
                    arrLocation[sum][j] = brackets.charAt(i);
                    sum--;
                }
            }

            for (char[] row : arrLocation) {
                for (char c : row)
                    System.out.print(c != 0 ? c : ' ');
                System.out.println();
            }
        }
    }
}
