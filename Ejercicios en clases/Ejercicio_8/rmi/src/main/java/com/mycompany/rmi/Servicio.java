/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rmi;

import java.io.Serializable;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author HP
 */
public class Servicio extends UnicastRemoteObject implements IServicio,Serializable {
    String nombre;
    public Servicio(String nombre)throws RemoteException{
        super();
        this.nombre=nombre;
    }

    @Override
    public String HolaMundof() throws RemoteException {
        return "Hola Mundo desde "+nombre;
    }
    
}
