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
        
        
        
        
        
        //insertando datos de forma manual para simular una base de datos
        Empresa empresa=new Empresa("cessa",524L);
        
        Cliente cliente1=new Cliente();
        Cliente cliente2=new Cliente();
        
        cliente1.idCliente=1;
        cliente2.idCliente=2;
        
        Factura factura1=new Factura(empresa,114,Mes.diciembre,2021,170);
        Factura factura2=new Factura(empresa,225,Mes.enero,2022,150);
        Factura factura3=new Factura(empresa,321,Mes.enero,2022,101);
        Factura factura4=new Factura(empresa,1125,Mes.febrero,2022,200);
        Factura factura5=new Factura(empresa,2245,Mes.febrero,2022,150);
        cliente1.facturasPendientes.add(factura1);
        cliente1.facturasPendientes.add(factura3);
        cliente1.facturasPendientes.add(factura5);
        cliente2.facturasPendientes.add(factura2);
        cliente2.facturasPendientes.add(factura4);
        
        this.FacturasCliente.add(cliente1);
        this.FacturasCliente.add(cliente2);
        //////////////////////////////////////////////////////////////////
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
