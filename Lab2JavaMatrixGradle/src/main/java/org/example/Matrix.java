package org.example;

import java.util.Scanner;
import java.util.Locale;

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