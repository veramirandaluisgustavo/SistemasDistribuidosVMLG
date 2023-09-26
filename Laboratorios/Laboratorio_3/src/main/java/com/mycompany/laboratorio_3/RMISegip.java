/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laboratorio_3;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author HP
 */
public class RMISegip extends UnicastRemoteObject implements ISegip{
    public RMISegip() throws RemoteException{
        super();
    }

    @Override
    public Respuesta verificar(String ci, String nombres, String apellidos) throws RemoteException {
        Respuesta respuesta=null;
        if(ci.equals("1140506")&& nombres.equals("Walter Jhanil")&&apellidos.equals("Segovia Arellano")){
            respuesta=new Respuesta(true,"Los datos son correctos");
            
        }
        else{
            respuesta=new Respuesta(true,"Los Datos del CI no son Corretos");
        }
        return respuesta;
    }
}
