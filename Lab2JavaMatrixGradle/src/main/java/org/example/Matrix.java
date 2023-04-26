package org.example;

import java.util.Scanner;
import java.util.Locale;

public class Matrix {
    private final int rows;
    private final int cols;
    private  final double[][] data;

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

    //Метод для встановлення значення елементу матриці
    public void setElement(int row, int col, double value) {
        if (row >= 0 && row < rows && col >= 0 && col < cols) {
            data[row][col] = value;
        } else {
            throw new RuntimeException("Неприпустимі індекси рядка або стовпця");
        }
    }
    //Метод заповнення матриці значеннями з двовимірного масиву
    public void fillWithData(double[][] newData) {
        if (newData.length == rows && newData[0].length == cols) {
            for (int i = 0; i < rows; i++) {
                System.arraycopy(newData[i], 0, data[i], 0, cols);
            }
        } else {
            throw new RuntimeException("Розмір переданого масиву не відповідає розміру матриці");
        }
    }
    //Метод заповнення матриці рандомними значеннями
    public void autoFill() {
        for(int i=0;i<rows;i++){
            for (int j=0;j<cols;j++){
                data[i][j]=(int) (-20 + (Math.random() * 50));
            }
        }
    }

    //Метод ручного заповнення матриці
    public void manualFill() {
        Scanner sc=new Scanner(System.in).useLocale(Locale.US);
        for(int i=0;i<rows;i++){
            for (int j=0;j<cols;j++){
                System.out.println("Будь ласка, введіть ["+i+"; "+j+"] елемент");
                data[i][j]=sc.nextDouble();
            }
        }
    }

    // Метод для отримання даних матриці у вагляді масиву
    public double [][] getData() {
        return data;
    }

    // Метод для отримання кількості рядків матриці
    public int getRows() {
        return rows;
    }
    // Метод для отримання кількості стовпців матриці
    public int getCols() {
        return cols;
    }

    // Метод, що повертає значення заданого елемента матриці
    public double getElement(int row, int col) {
        if (row >= 0 && row < rows && col >= 0 && col < cols) {
            return data[row][col];
        } else {
            throw new RuntimeException("Неправильні індекси рядка або стовпця");
        }
    }

    // Метод, що повертає рядок матриці за заданим індексом
    public double [] getRow(int row) {
        if (row >= 0 && row < rows) {
            return data[row];
        } else {
            throw new RuntimeException("Неправильний індекс рядка");
        }
    }
    // Метод, що повертає стовпець матриці за заданим індексом
    public double [] getColumn(int col) {
        if (col >= 0 && col < cols) {
            double[] column = new double[rows];
            for (int i = 0; i < rows; i++) {
                column[i] = data[i][col];
            }
            return column;
        } else {
            throw new RuntimeException("Неправильний індекс стовпця");
        }
    }
    // Метод, що повертає розмірність матриці у вигляді масиву [рядки, стовпці]
    public int[] getSize() {
        int[] size = new int[2];
        size[0] = this.getRows();
        size[1] = this.getCols();
        return size;
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
