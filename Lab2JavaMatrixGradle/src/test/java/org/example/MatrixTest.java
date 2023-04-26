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
}