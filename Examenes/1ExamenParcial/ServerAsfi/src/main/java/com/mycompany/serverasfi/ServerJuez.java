/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.serverasfi;
import java.rmi.AccessException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP
 */
public class ServerJuez {
    public static void main(String[] args) throws RemoteException {
        try {
            Registry registry= LocateRegistry.getRegistry(1099);
            
            
            IAsfi asfi=(IAsfi)registry.lookup("ServidorAsfi");
            
            
            Scanner sc =new Scanner(System.in);
            int repuesta ;
            while(true){
                System.out.println("Elija una opcion");
                System.out.println("1. consultar cuentas");
                System.out.println("2. Retenermonto");
                System.out.println("3. Salir");
                repuesta=sc.nextInt();
                switch(repuesta){
                    case 1: List<Cuenta> cuentas =asfi.consultarCuentas("11021654", "Juan Perez", "Segovia");
                    for(Cuenta a:cuentas){
                        a.toString();
                    }
                        break;
                    case 2:
                        boolean resp=asfi.retenerMonto("1", 21.4);
                        if(resp)
                        System.out.println("se congelo con exito");
                        else
                        System.out.println("no se congelo con exito");
                        break;
                    case 3:break;
                    default:System.out.println("No ingreso una opcion valida");
                }
                
                
                
                
                
            }
            
            
        } catch (NotBoundException ex) {
            Logger.getLogger(ServerJuez.class.getName()).log(Level.SEVERE, null, ex);
        } catch (AccessException ex) {
            Logger.getLogger(ServerJuez.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
    }
}