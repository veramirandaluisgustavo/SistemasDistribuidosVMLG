/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laboratorio1_veramiranda;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.stream.Stream;

/**
 *
 * @author HP
 */
public class Banco extends UnicastRemoteObject implements IBanco{
    Registry registry=LocateRegistry.getRegistry(1099);
    IEmpresa cessa;
    IEmpresa cotes;        
    
    public Banco()throws RemoteException, NotBoundException{
        super();
        
        
        
        cessa=(IEmpresa) registry.lookup("ServidorCessa");
        cotes=(IEmpresa) registry.lookup("ServidorCotes");    
    }
    @Override
    public Factura[] calcular(int idcliente) throws RemoteException {
        Factura[] arr1=this.cessa.pendientes(idcliente);
        Factura[] arr2=this.cotes.pendientes(idcliente);
        Factura[] concatenados=Stream.of(arr1,arr2).flatMap(Stream::of).toArray(Factura[]::new);
        return concatenados;
    }

    @Override
    public String Pagar(Factura[] fact) throws RemoteException {
        this.cessa.Pagar(fact);
        this.cotes.Pagar(fact);
        return "SE REALISO EL PAGO  CORRECTAMENTE";
    }
    
}
