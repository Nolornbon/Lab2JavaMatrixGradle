package org.example;


public class Main {
    public static void main(String[] args) {
        //Step1. MatrixInitialization
        Matrix matrix = new Matrix(2, 3);
        System.out.println(matrix.getRows());
        System.out.println(matrix.getCols());
        matrix.print();
    }
}