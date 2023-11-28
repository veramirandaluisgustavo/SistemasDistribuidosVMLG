/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercisiormii;

/**
 *
 * @author HP
 */
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
public class ServidorServicio {
    
    public static void main(String[] args) {
        try {
            Servicio servicio = new Servicio();
            Registry registry=LocateRegistry.createRegistry(1099);
            
            registry.bind("ServidorServicio", servicio);
            System.out.println("Servidor encendido");
            
            
        } catch (RemoteException ex) {
            Logger.getLogger(ServidorServicio.class.getName()).log(Level.SEVERE, null, ex);
        } catch (AlreadyBoundException ex) {
            Logger.getLogger(ServidorServicio.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}