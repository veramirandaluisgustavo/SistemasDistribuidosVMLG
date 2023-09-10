/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laboratorio1_veramiranda;

import java.io.Serializable;

/**
 *
 * @author HP
 */
public class Empresa implements Serializable{
    public String nombre;
    public long NIT;

    public Empresa(String nombre, long NIT) {
        this.nombre = nombre;
        this.NIT = NIT;
    }
}
