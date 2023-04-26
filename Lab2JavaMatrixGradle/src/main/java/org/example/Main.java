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
    /*
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
    */
    /*
        //Step4. Додати методи, що дозволяють отримати заданий елемент, рядок чи стовпчик
        Matrix matrix = new Matrix(2,2);
        double[][] data = {{9.9,8.8},{7.7,6.6}};
        matrix.fillWithData(data);

        System.out.print("Значення заданого елемента: " + matrix.getElement(1,1));
        double[] row = matrix.getRow(0);
        System.out.print("\nЗначення елементів рядка: ");
        for (double element : row) {
           System.out.print(element + " ");
        }
        System.out.print("\nЗначення елементів стовпця: ");
        double[] col = matrix.getColumn(1);
        for (double element : col) {
           System.out.print(element + " ");
        }
    */
        //Step5.Метод, що повертає розмірність матриці у вигляді масиву [рядки, стовпці]
        Matrix matrix = new Matrix(2,2);
        int[] size = matrix.getSize();
        System.out.println("Розмірність матриці "+ size[0]+"x"+size[1]);
    }

}