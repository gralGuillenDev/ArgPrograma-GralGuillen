/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author gralguillen
 */
public class CuentaBancaria {

    public String getNombrePersona() {
        return nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    

    private int numeroCuenta;
    private long dniCliente;
    private double saldoTotal;
    private String nombrePersona;
    
    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getDniCliente() {
        return dniCliente;
    }

    

    public void setDniCliente(long dniCliente) {
        this.dniCliente = dniCliente;
    }

    public double getSaldoTotal() {
        return saldoTotal;
    }

    public void setSaldoTotal(double saldoTotal) {
        this.saldoTotal = saldoTotal;
    }
    
    public CuentaBancaria() {
    }
    public CuentaBancaria(String nombrePersona, int numeroCuenta, long dniCliente, int saldoTotal) {
        this.nombrePersona = nombrePersona;
        this.numeroCuenta = numeroCuenta;
        this.dniCliente = dniCliente;
        this.saldoTotal = saldoTotal;
    }
    
   
   
    
}
