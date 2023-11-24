/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.practica_final;

/**
 *
 * @author HP
 */
import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author HP
 */
public interface IServicio extends Remote{
    public int cotizar(String inicio,String fin,String fecha) throws RemoteException;
}

