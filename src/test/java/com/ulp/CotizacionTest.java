/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ulp;

/**
 *
 * @author abate
 */
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CotizacionTest {

    @Test
    public void testCotizarCero() {
        ConversorMoneda conversor = new ConversorMoneda();
        
        assertThrows(ArithmeticException.class, () -> {
            conversor.calcularCotizacion(100.0, 0.0);
        });
    }
}

