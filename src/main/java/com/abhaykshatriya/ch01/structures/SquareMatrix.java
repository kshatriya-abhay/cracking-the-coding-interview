package com.abhaykshatriya.ch01.structures;

public class SquareMatrix {
    private final int[][] a;
    private final int size;

    public SquareMatrix (int n) {
        size = n;
        a = new int[n][n];
    }

    public void rotateMatrixClockwiseInPlace() {
        invertByMainDiagonal();
        invertHorizontally();
    }

    public void invertByMainDiagonal() {
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a[i].length; j++) {
                if (i != j) {
                    int temp = a[i][j];
                    a[i][j] = a [j][i];
                    a[j][i] = temp;
                }
            }
        }
    }

    public void invertHorizontally() {
        for (int i = 0; i < a.length/2; i++) {
            for (int j = 0; j < a[i].length; j++) {
                int temp = a[i][j];
                a[i][j] = a [a.length - 1 - i][j];
                a[a.length - 1 - i][j] = temp;
            }
        }
    }

    public int size() {
        return size;
    }

    public void setValue(int val, int x, int y) {
        a[x][y] = val;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int[] row : a) {
            for (int j = 0; j < row.length; j++) {
                sb.append(row[j]);
                if (j != row.length - 1) {
                    sb.append(", ");
                }
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
