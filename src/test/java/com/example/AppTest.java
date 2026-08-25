Set-Content -Path "src\test\java\com\example\AppTest.java" -Value @"
package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AppTest {

    @Test
    public void testSumaFallo() {
        int resultado = 2 + 2;
        // Provocamos un fallo deliberado para el laboratorio
        assertTrue(resultado == 5, "Fallo simulado: el resultado esperado no coincide");
    }
}
" -Encoding UTF8