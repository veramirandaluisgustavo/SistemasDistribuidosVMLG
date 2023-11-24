/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica_final;

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
    
    public Servicio()throws RemoteException{
        super();
        
    }

    @Override
    public int cotizar(String inicio, String fin, String fecha) throws RemoteException {
        String[] cotizarDias={"2/12/23","3/12/23","4/12/23","5/12/23","6/12/23"};
        int[] cotizarPrecio={32,26,24,30,40};
        int dias=comvertir(fin)[0]-comvertir(inicio)[0]+1;
        int coste=0;
        
        for (int i=0;i<cotizarDias.length;i++){
            
            if(cotizarDias[i].equals(inicio)){
                System.out.println("se encontro el dia: "+cotizarDias[i]);
                for(int j=0;j<dias;j++){
                    coste+=cotizarPrecio[i];
                }
            }
        }
        return coste;
        
        
    }
    private int[] comvertir(String data)throws RemoteException{
        String[] fecha=data.split("/");
        int[] dev={Integer.parseInt(fecha[0]),Integer.parseInt(fecha[1]),Integer.parseInt(fecha[2])};
        return dev;
    }

    
    
}
