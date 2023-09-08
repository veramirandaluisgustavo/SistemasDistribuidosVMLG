/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.laboratorio1_veramiranda;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author HP
 */
public interface IBanco extends Remote {
    Factura[] calcular(int idcliente)throws RemoteException;
    String Pagar(Factura[] fact)throws RemoteException;
}
