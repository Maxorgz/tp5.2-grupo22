package com.ulp;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;


public class ConversorTest {

    static ConversorMoneda conversor;

    @BeforeAll
    public static void inicializar() {
        conversor = new ConversorMoneda();
        System.out.println("¡Bienvenido al sistema de Conversión de Moneda!");
    }

    @BeforeEach
    public void antesDeCadaPrueba(TestInfo testInfo) {
        System.out.println("Ejecutando prueba: " + testInfo.getTestMethod().get().getName());
    }

    @AfterEach
    public void despuesDeCadaPrueba() {
        System.out.println("Prueba finalizada, campos en $0");
    }

    @AfterAll
    public static void finalizar() {
        System.out.println("La operación ha finalizado");
    }

    @Test
    public void testAumentarSaldo() {
        double resultado = conversor.aumentarSaldo(500.0, 200.0);
        assertEquals(700.0, resultado, 0.001);
    }

    @Test
    public void testRetirarDolarFisico() {
        double resultado = conversor.retirarDolares(2100.0, 100.0);
        assertEquals(2000.0, resultado, 0.001);
    }
}
