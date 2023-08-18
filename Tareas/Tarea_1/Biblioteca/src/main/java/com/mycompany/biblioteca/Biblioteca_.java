/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.biblioteca;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author HP
 */
public class Biblioteca_ {
    String nombre;
    int tamanio;
    List<Armario> armarios=new ArrayList<>();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

   
    @Override
    public String toString() {
        return "Bibioteca_{" + "nombre=" + nombre + ", tamanio=" + tamanio + '}';
    }

   
    
    
}
