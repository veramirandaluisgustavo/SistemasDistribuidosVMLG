/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laboratorio1_veramiranda;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP
 */
public class ServidorCessa {
    public static void main(String[] args) {
    
       
        try {
            RMICessa cessa=new RMICessa();
            LocateRegistry.createRegistry(1100); //levantar el servidor de registro;
            Naming.bind("HolaMundo",cessa);
        } catch (RemoteException ex) {
            Logger.getLogger(ServidorCessa.class.getName()).log(Level.SEVERE, null, ex);
        } catch (AlreadyBoundException ex) {
            Logger.getLogger(ServidorCessa.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(ServidorCessa.class.getName()).log(Level.SEVERE, null, ex);
        }
            
       
        
    }
    
}
