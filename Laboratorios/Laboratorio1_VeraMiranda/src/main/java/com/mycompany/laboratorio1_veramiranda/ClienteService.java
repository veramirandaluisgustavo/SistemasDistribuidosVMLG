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
        IBanco stub = (IBanco) registry.lookup("Banco");
        
        Scanner sc=new Scanner(System.in);
        int eleccion =sc.nextInt();
        do{
        System.out.println("ELIGE UNA OPCION:");
        System.out.println("1 mostrar facturas");
        System.out.println("2 pagar factura");
        System.out.println("3 salir");
        
        switch(eleccion){
            case:1
        }
        
        
        
        }while(eleccion!=3);
        
        
        
        
        
        
    }
    public static void mostrarFacturas(Factura[] facturas){
        
        if(facturas==null)return;
        System.out.println("TUS FACTURAS PENDIENTES SON:");
        for(Factura fac:facturas){
            
            System.out.println(fac.toString());
        }
    }
}
