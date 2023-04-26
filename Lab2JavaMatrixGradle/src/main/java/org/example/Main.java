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
    /*
        //Step2. Пуста матриця, матриця заданого розміру та копія іншої матриці
        Matrix matrix1 = new Matrix(2,2);
        Matrix matrix = new Matrix (matrix1);
        matrix.print();
        matrix1.print();
    */

        //Step3. Додати методи, що дозволяють заповнити матрицю значеннями
        Matrix matrix = new Matrix(2,2);
        matrix.setElement(0, 0, 1.0);
        matrix.setElement(0, 1, 2.0);
        matrix.setElement(1, 0, 3.0);
        matrix.setElement(1, 1, 4.0);
        matrix.print();

        double[][] data = {{9.9,8.8},{7.7,6.6}};
        matrix.fillWithData(data);
        matrix.print();

        matrix.autoFill();
        matrix.print();

        matrix.manualFill();
        matrix.print();

    }

}