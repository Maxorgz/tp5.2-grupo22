package com.ulp;

public class ConversorMoneda {

    //convertir
    public double convertirMoneda(double monto, double tasa){
        return monto*tasa;
    }
            
    //Cotizar
    public double calcularCotizacion(double dolares, double pesos){
    if(pesos==0){
        throw new ArithmeticException("El monto en pesos no puede ser 0");
    }
    return pesos/dolares;
    }
    
    //Aumenta saldo
    public double aumentarSaldo(double saldoActual, double compra){
    return saldoActual + compra;
    }   
    
    //retirar Dolar
    public double comprarDolares(double saldoTotal, double extraccion){
    return saldoTotal - extraccion;
    }
    
}
