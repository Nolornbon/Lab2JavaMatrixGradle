package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MatrixTest {

    //Step1.
    @Test
    public void MatrixInitialization() {
        Matrix matrix = new Matrix(3, 3);
        Assertions.assertEquals(3, matrix.getRows());
        Assertions.assertEquals(3, matrix.getCols());
    }

    //Step2 Пуста матриця, матрицюя заданого розміру та копія іншої матриці
    @Test
    public void testEmptyMatrixCreation() {
        Matrix matrix = new Matrix();
        Assertions.assertEquals(0, matrix.getRows());
        Assertions.assertEquals(0, matrix.getCols());
    }

    @Test
    public void testMatrixCreationWithSize() {
        Matrix matrix = new Matrix(2, 2);
        Assertions.assertEquals(2, matrix.getRows());
        Assertions.assertEquals(2, matrix.getCols());
    }

    @Test
    public void testMatrixCreationWithCopy() {
        Matrix matrix1 = new Matrix(2, 3);
        Matrix matrix = new Matrix(matrix1);
        Assertions.assertEquals(2, matrix.getRows());
        Assertions.assertEquals(2, matrix1.getRows());
        Assertions.assertEquals(3, matrix.getCols());
        Assertions.assertEquals(3, matrix1.getCols());
    }

    //Step3 Mетоди, що дозволяють заповнити матрицю значеннями
    @Test
    public void testMatrixSetElement() {
        Matrix matrix = new Matrix(2, 2);
        matrix.setElement(0, 0, 1.0);
        matrix.setElement(0, 1, 2.0);
        matrix.setElement(1, 0, 3.0);
        matrix.setElement(1, 1, 4.0);
        double[][] actualData = matrix.getData();
        double[][] expectedData = {{1.0, 2.0}, {3.0, 4.0}};
        Assertions.assertArrayEquals(expectedData, actualData);
    }

    @Test
    public void testFillWithData() {
        Matrix matrix = new Matrix(3, 3);
        // Вхідні дані - двовимірний масив
        double[][] newData = {{1.1, 2.1, 3.1}, {4.2, 5.2, 6.2}, {7.3, 8.3, 9.3}};
        // Виклик методу fillWithData з вхідними даними
        matrix.fillWithData(newData);
        //Перевірка розмірів матриці
        Assertions.assertEquals(3, matrix.getRows());
        Assertions.assertEquals(3, matrix.getCols());
        // Перевірка вмісту матриці після заповнення
        double[][] actualData = matrix.getData();
        double[][] expectedData = {{1.1, 2.1, 3.1}, {4.2, 5.2, 6.2}, {7.3, 8.3, 9.3}};
        Assertions.assertArrayEquals(expectedData, actualData);
    }

    @Test
    public void testAutoFill() {
        Matrix matrix = new Matrix(2, 2);
        // Виклик методу autofill
        matrix.autoFill();
        // Перевірка вмісту матриці після заповнення
        matrix.print();
    }

    //Step4. Додати методи, що дозволяють отримати заданий елемент, рядок чи стовпчик
    @Test
    public void testMatrixGetElementRowColumn() {
        Matrix matrix = new Matrix(2, 2);
        matrix.setElement(0, 0, 1.0);
        matrix.setElement(0, 1, 2.0);
        matrix.setElement(1, 0, 3.0);
        matrix.setElement(1, 1, 4.0);
        Assertions.assertEquals(1.0, matrix.getElement(0, 0));
        Assertions.assertEquals(2.0, matrix.getElement(0, 1));
        Assertions.assertEquals(3.0, matrix.getElement(1, 0));
        Assertions.assertEquals(4.0, matrix.getElement(1, 1));
        double[] row = matrix.getRow(1);
        Assertions.assertArrayEquals(new double[]{3.0, 4.0}, row);
        double[] column = matrix.getColumn(0);
        Assertions.assertArrayEquals(new double[]{1.0, 3.0}, column);
    }

    //Step5.    Метод, що повертає розмірність матриці у вигляді масиву [рядки, стовпці]
    @Test
    public void testMatrixGetSize() {
        Matrix matrix = new Matrix(2, 2);
        int[] size = matrix.getSize();
        Assertions.assertArrayEquals(new int[]{2, 2}, size);
    }

    //Step6. Equals/hashCode
    @Test
    public void testMatrixEquals() {
        Matrix matrix = new Matrix(3, 3);
        double[][] data = {{1.0, 2.0, 3.0}, {4.0, 5.0, 6.0}, {7.0, 8.0, 9.0}};
        matrix.fillWithData(data);
        Matrix matrix1 = new Matrix(3, 3);
        double[][] data1 = {{1.0, 2.0, 3.0}, {4.0, 5.0, 6.0}, {7.0, 8.0, 9.0}};
        matrix1.fillWithData(data1);
        Assertions.assertEquals(matrix, matrix1);
    }

    @Test
    public void testHashCode() {
        Matrix matrix = new Matrix(3, 3);
        double[][] data = {{1.0, 2.0, 3.0}, {4.0, 5.0, 6.0}, {7.0, 8.0, 9.0}};
        matrix.fillWithData(data);
        Matrix matrix1 = new Matrix(matrix);
        Assertions.assertEquals(matrix.hashCode(), matrix1.hashCode());
    }
}