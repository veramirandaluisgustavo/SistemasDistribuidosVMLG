/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.laboratorio1_veramiranda;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author HP
 */
public class Laboratorio1_VeraMiranda {

    public static void main(String[] args) throws RemoteException, NotBoundException {
        Registry registry = LocateRegistry.getRegistry(1099);
        IBanco stub = (IBanco) registry.lookup("ServidorBanco");
        
        stub.calcular(1);
        System.out.println("FUNCIONA BANCO");
    }
}
