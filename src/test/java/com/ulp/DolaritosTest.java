package com.ulp;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;

public class DolaritosTest {

    @ParameterizedTest
    @CsvSource({
        "120000, 0, 0",
        "180000, 1500, 120",
        "100000, -900, 111.11"
    })
    public void testComportamientoDivisas(double monto1, double monto2, double resultadoEsperado) {
        ConversorMoneda conversor = new ConversorMoneda();

        double resultadoActual = conversor.comprarDolares(monto1, monto2);

        assertEquals(resultadoEsperado, resultadoActual, 0.01);
    }
}