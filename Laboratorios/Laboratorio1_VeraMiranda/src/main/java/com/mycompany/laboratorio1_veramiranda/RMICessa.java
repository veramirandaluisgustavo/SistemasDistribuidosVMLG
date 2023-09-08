/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laboratorio1_veramiranda;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HP
 */
public class RMICessa extends UnicastRemoteObject implements IEmpresa{
    List<Cliente> FacturasCliente=new ArrayList();
    public RMICessa() throws RemoteException {
        super();
    }

    @Override
    public Factura[] pendientes(int idcliente) throws RemoteException {
        for(Cliente cli:this.FacturasCliente){
            if(cli.idCliente==idcliente){
                Factura[] miarray = new Factura[cli.facturasPendientes.size()];
                miarray = cli.facturasPendientes.toArray(miarray);
                return miarray;
            }
        }
        return null;
    }

    @Override
    public void Pagar(Factura[] fact) throws RemoteException {
        Factura target =null;
        
        for(Cliente cli:this.FacturasCliente){
            for(Factura fac:cli.facturasPendientes){
                for(Factura facN:fact){
                    if(facN.idfactura==fac.idfactura){
                        target=fac;
                        cli.facturasPendientes.remove(fac);
                        break;
                    }
                }
            }
            
        }
        
    }
}
