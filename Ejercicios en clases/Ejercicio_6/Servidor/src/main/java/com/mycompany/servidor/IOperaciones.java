/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.servidor;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author HP
 */
public interface IOperaciones extends Remote {
    public int suma(int a,int b)throws RemoteException;
    public int resta (int a,int b)throws RemoteException;
    public int muntiplicacion(int a,int b)throws RemoteException;
    public int division(int a ,int b)throws RemoteException;
    
    
}
