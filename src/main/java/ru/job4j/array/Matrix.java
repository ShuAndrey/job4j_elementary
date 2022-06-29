package ru.job4j.array;

import java.io.FileOutputStream;
import java.io.IOException;

public class Matrix {

    public static int[][] multiple(int size) {
        int[][] rst = new int[size][size];
        try (FileOutputStream out = new FileOutputStream("result.txt")) {
            for (int row = 0; row < rst.length; row++) {
                for (int cell = 0; cell < rst[row].length; cell++) {
                    rst[row][cell] = (row + 1) * (cell + 1);
                    out.write(Integer.toString(rst[row][cell]).getBytes());
                    out.write(" ".getBytes());
                }
                out.write(System.lineSeparator().getBytes());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return rst;
    }
}
