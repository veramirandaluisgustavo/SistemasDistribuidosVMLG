/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.biblioteca;

import java.util.Scanner;

/**
 *
 * @author HP
 */

public class Biblioteca {
    public static Biblioteca_ nBiblioteca= new Biblioteca_();

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        
        
        int n = 0;
        int decicion;

        do {
            System.out.println("\nMenú:");
            System.out.println("1. crear Armario");
            System.out.println("2. crear libro");
            System.out.println("3. mostrar armarios");
            System.out.println("4. mostrar libros");
            System.out.println("5. cambiar ajustes de la biblioteca");
            System.out.println("6. mostrar datos de la biblioteca");
            System.out.println("7. Salir");
            System.out.println("elige una opcion");
            
            decicion = sc.nextInt();

            switch (decicion) {
                case 1:
                    crearArmario();
                    break;
                case 2:
                    crearLibro() ;
                    break;
                case 3:
                    
                    break;
                case 4:
                    mostrarLibros() ;
                    break;
                case 5:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        } while (decicion != 7);

        sc.close();
        
    }
    public static void ajustarBiblioteca()
    {
        String dato;
        int tamanio2;
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce el nombre para la biblioteca");
        dato = sc.nextLine();
        nBiblioteca.setNombre(dato);
        System.out.println("introduce el tamaio de la biblioteca en metros cuadrados");
        tamanio2 = sc.nextInt();
        nBiblioteca.setTamanio(tamanio2);
        
    }
    
    public static void crearArmario()
    {
        Scanner sc = new Scanner(System.in);
        Armario nuevoArmario=new Armario();
        System.out.println("introduce el material del armario");
        String dato=sc.nextLine();
        nuevoArmario.setMaterial(Material.valueOf(dato));
        nBiblioteca.armarios.add(nuevoArmario);
    }
    public static void crearLibro()
    {
        Scanner sc = new Scanner(System.in);
        Libro nuevoLibro=new Libro();
        System.out.println("introduce el nombre del libro");
        String dato=sc.nextLine();
        nuevoLibro.nombre=dato;
        
        System.out.println("introduce el autor del libro");
        dato=sc.nextLine();
        nuevoLibro.autor=dato;
        
        System.out.println("introduce el editorial del libro");
        dato=sc.nextLine();
        nuevoLibro.editorial=dato;
        
        System.out.println("introduce el anio del libro");
        dato=sc.nextLine();
        nuevoLibro.anio=dato;
        System.out.println("elija el armario");
        System.out.println("existen "+nBiblioteca.armarios.size()+" armarios");
        int armario=sc.nextInt();
        nBiblioteca.armarios.get(armario).libros.add(nuevoLibro);  
    }
    public static void mostrarLibros()
    {
        for(Armario x :nBiblioteca.armarios)
        {
            System.out.println("El armario "+x.codigo+" tiene los siguientes libros:");
            for(Libro i:x.libros)
            {
                System.out.println(i.toString()1
                );
                
            }
        }
    }
    
}
