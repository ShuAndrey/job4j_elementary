package ru.job4j.array;

public class Matrix {

    public static int[][] multiple(int size) {
        int[][] rst = new int[size][size];
        for (int row = 0; row < rst.length; row++) {
            for (int cell = 0; cell < rst[row].length; cell++) {
                rst[row][cell] = (row + 1) * (cell + 1);
            }
        }
        return rst;
    }
}
