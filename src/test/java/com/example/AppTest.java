package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AppTest {

    @Test
    public void testSuma() {
        int resultado = 2 + 2;
        assertTrue(resultado == 4, "El resultado debería ser 4");
    }
}
