/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica_final;


import java.rmi.AccessException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Cliente {
    public static void main(String[] args) throws RemoteException {
        try {
            Registry registry= LocateRegistry.getRegistry(1099);
            IServicio servicio=(IServicio)registry.lookup("reserva");
            System.out.println("la cotizacion es de:");
            System.out.println(servicio.cotizar("2/12/23","3/12/23","2/12/23"));
            
        } catch (NotBoundException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        } catch (AccessException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}