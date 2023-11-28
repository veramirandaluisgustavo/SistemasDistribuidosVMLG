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
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP
 */
public class ServidorCliente {
    
    public static void main(String[] args) throws RemoteException {
        
        try {
            Scanner scanner = new Scanner(System.in);
            Registry registry= LocateRegistry.getRegistry(1099);
            IServicio servicio=(IServicio)registry.lookup("ServidorServicio");
            //System.out.println(servicio.HolaMundof());
            while(true){
                System.out.println("SELECCIONE UNA OPCION:");
                System.out.println("1-INTRODUCIR VALOR");
                System.out.println("2-INVERTIR CADENA");
                System.out.println("3-AUMENTAR ESPACIOS");
                System.out.println("4-AUMENTAR CADENA");
                int respuesta=scanner.nextInt();
                //scanner.next();
                switch(respuesta){
                    
                    case 1:
                        System.out.println("INTRODUSCA LA CADENA");
                        //scanner.next();
                        String mensajeO=scanner.next();
                        System.out.println("INTRODUJO: "+mensajeO);
                        System.out.println(servicio.introducirValor("hola"));
                        break;
                    case 2:
                        System.out.println(servicio.invertir());
                        break;
                    case 3:
                        System.out.println("INTRODUSCA LA CANTIDAD DE ESPACIOS");
                        int resp=scanner.nextInt();
                        System.out.println(servicio.aumentarEspacios(resp));
                        break;
                    case 4:
                        System.out.println("INTRODUSCA LA CADENA");
                        String cade=scanner.next();
                        System.out.println(servicio.aumentar(cade));
                        break;
                }
                
                
            }
        } catch (NotBoundException ex) {
            Logger.getLogger(ServidorCliente.class.getName()).log(Level.SEVERE, null, ex);
        } catch (AccessException ex) {
            Logger.getLogger(ServidorCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}