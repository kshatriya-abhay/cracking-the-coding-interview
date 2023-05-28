package com.abhaykshatriya.ch01;

import com.abhaykshatriya.structures.SquareMatrix;

/**
 * Rotate Matrix: Given an image represented by an NxN matrix, where each pixel in the image is 4
 * bytes, write a method to rotate the image by 90 degrees. Can you do this in place?
 */
public class Question7 {
    public static void main(String[] args) {
        SquareMatrix matrix = new SquareMatrix(4);
        for (int i = 0; i < matrix.size(); i++) {
            for (int j = 0; j < matrix.size(); j++) {
                matrix.setValue((i * matrix.size() + j), i, j);
            }
        }
        System.out.println(matrix);
        matrix.rotateMatrixClockwiseInPlace();
        System.out.println(matrix);
        SquareMatrix matrix2 = new SquareMatrix(5);
        for (int i = 0; i < matrix2.size(); i++) {
            for (int j = 0; j < matrix2.size(); j++) {
                matrix2.setValue((i * matrix2.size() + j), i, j);
            }
        }
        System.out.println(matrix2);
        matrix2.rotateMatrixClockwiseInPlace();
        System.out.println(matrix2);
    }
}
