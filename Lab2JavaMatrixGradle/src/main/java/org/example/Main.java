package org.example;


public class Main {
    public static void main(String[] args) {
    /*
        //Step1. MatrixInitialization
        Matrix matrix = new Matrix(2, 3);
        System.out.println(matrix.getRows());
        System.out.println(matrix.getCols());
        matrix.print();
    */

        //Step2. Пуста матриця, матриця заданого розміру та копія іншої матриці
        Matrix matrix1 = new Matrix(2,2);
        Matrix matrix = new Matrix (matrix1);
        matrix.print();
        matrix1.print();
    }
}