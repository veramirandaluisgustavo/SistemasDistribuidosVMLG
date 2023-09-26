/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.serverasfi;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HP
 */
public interface IAsfi extends Remote{
    public List<Cuenta> consultarCuentas(String ci,String Nombres,String apellidos)throws RemoteException;
    public boolean retenerMonto(String cuenta,Double monto)throws RemoteException;
            
}
