package org.example;

public class Matrix {
    private int rows;
    private int cols;
    private double[][] data;

    // Конструктор матриці заданного розміру
    public Matrix(int rows, int cols) {
        if (rows <= 0 || cols <= 0) {
            throw new RuntimeException("Розміри матриці повинні бути більше 0");
        }
        this.rows = rows;
        this.cols = cols;
        this.data = new double[rows][cols];//ініціалізація з 0
    }

    // Конструктор пустої матриці
    public Matrix() {
        this.rows = 0;
        this.cols = 0;
        this.data = new double[0][0];
    }
    //Конструктор копіювання матриці
    public Matrix(Matrix other) {
        this.rows = other.getRows();
        this.cols = other.getCols();
        this.data = new double[this.rows][this.cols];
        System.arraycopy(other.data,0,this.data,0,this.data.length);
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
        if ( rows !=0 && cols !=0) {
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    System.out.print(data[i][j] + " ");
                }
                System.out.println();
            }
        } else{
            System.out.println("Пуста матриця");
        }
    }
}
