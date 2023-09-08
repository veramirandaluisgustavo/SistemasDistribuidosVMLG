/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laboratorio1_veramiranda;

/**
 *
 * @author HP
 */
public class Factura {
    Empresa empresa;
    int idfactura;
    Mes mes;
    int anio;
    double monto;

    public Factura(Empresa empresa, int idfactura, Mes mes, int anio, double monto) {
        this.empresa = empresa;
        this.idfactura = idfactura;
        this.mes = mes;
        this.anio = anio;
        this.monto = monto;
    }
    
}
