package com.abhaykshatriya.ch01.structures;

public class Matrix {
    private final int[][] a;
    private final int m, n;

    public Matrix(int M, int N) {
        m = M;
        n = N;
        a = new int[M][N];
    }

    public void setValue(int val, int i, int j) {
        a[i][j] = val;
    }

    public void zeroMatrix() {
        boolean[] zeroRows = new boolean[m];
        boolean[] zeroColumns = new boolean[n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                zeroRows[i] = (a[i][j] == 0) || zeroRows[i];
                zeroColumns[j] = (a[i][j] == 0) || zeroColumns[j];
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (zeroRows[i] || zeroColumns[j]) a[i][j] = 0;
            }
        }
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
