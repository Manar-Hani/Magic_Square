package com.company;


import java.util.Scanner;

class Magic_square {
    // Function to generate odd sized magic squares
    static void generateSquare(int n) {
        int[][] magicSquare = new int[n][n];

        // Initialize position for 1
        int i = n / 2;
        int j = n - 1;

        // One by one put all values in magic square
        for (int num = 1; num <= n * n; ) {
            if (i == -1 && j == n) // if row_position = -1 & column_position = n
            {
                j = n - 2;
                i = 0;
            } else {

                if (j == n)
                    j = 0;


                if (i < 0)
                    i = n - 1;
            }

            // if num already exist
            if (magicSquare[i][j] != 0) {
                j -= 2;
                i++;
                continue;
            } else
                //set number
                magicSquare[i][j] = num++;

            // calculating the next num position
            j++;
            i--;
        }

        // print magic square
        System.out.println("The Magic Square for " + n + ":");
        System.out.println("Sum of each row or column " + n * (n * n + 1) / 2 + ":");
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++)
                System.out.print(magicSquare[i][j] + " ");
            System.out.println();
        }
    }


    public static void main(String[] args) {
        // Works only when n is odd
        // scan num

        Scanner reader = new Scanner(System.in);
        System.out.println("Enter an odd number: ");
        int n = reader.nextInt();
        reader.close();

        generateSquare(n);
    }
}