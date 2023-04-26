package org.example;

public class Matrix {
    private int rows;
    private int cols;
    private double[][] data;

    public Matrix(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.data = new double[rows][cols];//ініціалізація з 0
    }

    // Метод для отримання кількості рядків матриці
    public int getRows() {
        return rows;
    }
    // Метод для отримання кількості стовпців матриці
    public int getCols() {
        return cols;
    }
    // Метод для виведення матриці у вигляді рядків
    public void print() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }
}
