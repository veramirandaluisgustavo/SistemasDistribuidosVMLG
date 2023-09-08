/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laboratorio1_veramiranda;

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
        IBanco stub = (IBanco) registry.lookup("ServidorBanco");
        
        Scanner sc=new Scanner(System.in);
        
        int eleccion;
        System.out.println("HASTA AQUI");
        do{
        System.out.println("ELIGE UNA OPCION:");
        System.out.println("1 mostrar facturas");
        System.out.println("2 pagar factura");
        System.out.println("3 salir");
        eleccion =sc.nextInt();
        int id;
        switch(eleccion){
            case 1:
                System.out.println("introduce el id del cliente: ");
                 id=sc.nextInt();
                mostrarFacturas(stub.calcular(id));break;
                
            case 2: 
                System.out.println("introduce el id del cliente: ");
                 id=sc.nextInt();
                pagarf(stub.calcular(id),stub);break;
            case 3 :System.out.println("CERRANDO SERVICIO");break;
            default : System.out.println("introduce una opcion valida ");break;
                
        }
        
        
        
        }while(eleccion!=3);
        
        
        
        
        
        
    }
    public static void mostrarFacturas(Factura[] facturas ){
        
        if(facturas==null)return;
        System.out.println("TUS FACTURAS PENDIENTES SON:");
        for(Factura fac:facturas){
            
            System.out.println(fac.toString());
        }
    }
    public static void pagarf(Factura[] facturas,IBanco stub) throws RemoteException{
        Scanner sc=new Scanner(System.in);
        System.out.println("introduce el id de la factura: ");
        int id=sc.nextInt();
        for(Factura fac:facturas){
            if(fac.idfactura==id){
                Factura[] factu={fac};
                String respuesta=stub.Pagar(factu);
                System.out.println(respuesta);
                break;
            }
        }
        
        
                
    }
    
    
}
