package com.abhaykshatriya.ch01;

import com.abhaykshatriya.ch01.structures.Matrix;

public class Question8 {
    public static void main(String[] args) {
        Matrix matrix = new Matrix(3, 4);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                matrix.setValue(i*3 + j, i, j);
            }
        }
        matrix.setValue(1, 0, 0);
        matrix.setValue(0, 2, 0);
        matrix.setValue(0, 0, 2);
        System.out.println(matrix);
        matrix.zeroMatrix();
        System.out.println(matrix);
    }
}
