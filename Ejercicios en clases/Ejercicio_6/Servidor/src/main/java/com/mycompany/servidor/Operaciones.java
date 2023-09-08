/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.servidor;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author HP
 */
public class Operaciones extends UnicastRemoteObject implements IOperaciones {
    public Operaciones() throws RemoteException
    {
        super();
    }

    @Override
    public int suma(int a, int b) {
        return a+b;
    }

    @Override
    public int resta(int a, int b) {
        return a-b;
    }

    @Override
    public int muntiplicacion(int a, int b) {
        return a*b;
    }

    @Override
    public int division(int a, int b) {
        return a/b;
    }
    
}
