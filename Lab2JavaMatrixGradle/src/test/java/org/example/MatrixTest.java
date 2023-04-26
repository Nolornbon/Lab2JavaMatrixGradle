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
}