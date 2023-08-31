/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.servidor;

/**
 *
 * @author HP
 */
public class Operaciones {
    String op;
    int a,b,c;
    public Operaciones(String[] datos){
        
                    this.op = datos[0];
                    this.a = Integer.parseInt(datos[1]);
                    this.b = Integer.parseInt(datos[2]);
                    this.c = Integer.parseInt(datos[3]);

        
    }
    public int resultado(){
        int resultado = 0;
                    if (this.op.equals("mayor")) {
                        resultado = Math.max(this.a, Math.max(this.b, this.c));
                    } else if (this.op.equals("menor")) {
                        resultado = Math.min(this.a, Math.min(this.b, this.c));
                    }
                    return resultado;
    }
}