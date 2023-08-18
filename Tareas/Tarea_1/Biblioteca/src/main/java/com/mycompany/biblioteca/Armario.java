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
public class Armario {
    static int contador=1;
    int codigo=1;
    Material material;
    public List<Libro> libros=new ArrayList();

    
    public Armario(){
        codigo=contador;
        contador++;
    }

    @Override
    public String toString() {
        return "Armario{" + "codigo=" + codigo + ", material=" + material + '}';
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }
}
