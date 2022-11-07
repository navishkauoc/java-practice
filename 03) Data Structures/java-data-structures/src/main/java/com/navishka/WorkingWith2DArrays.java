package com.navishka;

import java.util.Arrays;

public class WorkingWith2DArrays {
    public static void main(String[] args) {
        char[][] board = new char[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }

        //Assigning values to the indexes we want
        board[0][0] = '0';
        board[1][0] = '0';
        board[2][0] = '0';

        //Since this is a 2D Array, we need to use Arrays.deepToString()
        System.out.println(Arrays.deepToString(board));

        //Inline create a 2D Array
        char[][] boardTwo = new char[][]{
                new char[]{'0', '-', '-'},
                new char[]{'0', '-', '-'},
                new char[]{'0', '-', '-'}
        };

        System.out.println(Arrays.deepToString(boardTwo));

        char[][] boardThree = {{'0', '-', '-'}, {'0', '-', '-'}, {'0', '-', '-'}};
        System.out.println(Arrays.deepToString(boardThree));

    }
}
