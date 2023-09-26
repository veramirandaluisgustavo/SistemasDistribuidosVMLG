/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.laboratorio_3;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author HP
 */
public interface IUniversidad extends Remote{
    
    public void emitirDiploma(String ci,String nombres,String primerApellido,String segundoApellido,String fechaNacimiento,String carrera)throws RemoteException;
}
