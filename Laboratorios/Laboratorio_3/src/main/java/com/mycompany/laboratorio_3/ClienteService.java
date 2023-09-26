/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laboratorio_3;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class ClienteService {
    
    public static void main(String[] args) throws RemoteException, NotBoundException {
        Registry registry = LocateRegistry.getRegistry(1099);
        IUniversidad stub= (IUniversidad) registry.lookup("ServidorBanco");
        
        Scanner sc=new Scanner(System.in);
        
        int eleccion;
        System.out.println("HASTA AQUI");
        do{
        System.out.println("ELIGE UNA OPCION:");
        System.out.println("1 emitir diploma");
        System.out.println("2 salir");
        eleccion =sc.nextInt();
        int id;
        switch(eleccion){
            case 1:
                emitir(stub);break;

            case 2 :System.out.println("CERRANDO SERVICIO");break;
            default : System.out.println("introduce una opcion valida ");break;
                
        }
        
        
        
        }while(eleccion!=3);
        
        
        
        
        
        
    }
    private static void emitir(IUniversidad stub){
        String primerNombre,segundoNombre,primerApellido,segundoApellido,fechaDeNacimiento,carrera;
        Scanner sc=new Scanner(System.in);
        System.out.println("introduce el primer nombre");
        primerNombre=sc.nextLine();
        System.out.println("introduce el segundo nombre");
        segundoNombre=sc.nextLine();
        System.out.println("introduce el primer apellido");
        primerApellido=sc.nextLine();
        System.out.println("introduce el segundo apellido");
        segundoApellido=sc.nextLine();
        System.out.println("introduce la fecha de nacimiento");
        fechaDeNacimiento=sc.nextLine();
        System.out.println("introduce la carrera");
        carrera=sc.nextLine();
        stub.emitirDiploma(carrera, carrera, primerApellido, segundoApellido, fechaDeNacimiento, carrera);
    }
    
    
}
