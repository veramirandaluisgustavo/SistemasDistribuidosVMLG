/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.serverasfi;

import java.rmi.AccessException;
import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP
 */
public class ServerAsfi {
    
    public static void main(String[] args) {
        try {
            Asfi asfi = new Asfi();
            Registry registry=LocateRegistry.createRegistry(1099);
            
            registry.bind("ServidorAsfi", asfi);
            System.out.println("Servidor encendido");
            
            
        } catch (RemoteException ex) {
            Logger.getLogger(ServerAsfi.class.getName()).log(Level.SEVERE, null, ex);
        } catch (AlreadyBoundException ex) {
            Logger.getLogger(ServerAsfi.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}