/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercisiormii;

/**
 *
 * @author HP
 */

import java.io.Serializable;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author HP
 */
public class Servicio extends UnicastRemoteObject implements IServicio,Serializable {
    String cadena;
    public Servicio()throws RemoteException{
        super();
        
    }

    @Override
    public String aumentarEspacios(int dato) throws RemoteException {
        String[] arr=cadena.split(" ");
        String resp="";
        for(int i=0;i<arr.length;i++){
            resp+=arr[i];
        }
        this.cadena=resp;
        return this.cadena;
    }

    @Override
    public String aumentar(String dato) throws RemoteException {
        this.cadena+=" "+dato;
        return this.cadena;
    }

    @Override
    public Boolean introducirValor(String cadena) throws RemoteException {
        System.out.println("SE INTRODUJO: "+cadena);
        this.cadena=cadena;
        
        return true;
        
    }

    @Override
    public String invertir() throws RemoteException {
        if(cadena!=null){
            String[] arr=this.cadena.split("");
            String cad="";
            for(int i=arr.length;i!=0;i--){
                cad+=arr[i-1];
            }
            this.cadena=cad;
              return this.cadena;  
            
        }
        return null;
    }

    
    
}

