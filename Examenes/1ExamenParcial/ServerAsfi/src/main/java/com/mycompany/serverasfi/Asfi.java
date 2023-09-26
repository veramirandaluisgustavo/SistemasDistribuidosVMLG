/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.serverasfi;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketException;
import java.rmi.RemoteException;
import java.rmi.UnknownHostException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP
 */
public class Asfi extends UnicastRemoteObject implements IAsfi,Serializable {
    
    public Asfi()throws RemoteException{
        super();
        
    }
    
    
    @Override
    public List<Cuenta> consultarCuentas(String ci, String Nombres, String apellidos)throws RemoteException {
        String mensaje ="Buscar:"+ci+"-"+Nombres+"-"+apellidos;
        String msnMercantil=enviarBancoMercantil(mensaje);
        String msnBcp = enviarBcp(mensaje);
        
        return comvertir(msnMercantil,msnBcp);
        
        
    }


    @Override
    public boolean retenerMonto(String cuenta, Double monto) throws RemoteException{
        String mensaje ="Congelar:"+cuenta+"-"+monto;
        String msnMercantil=enviarBancoMercantil(mensaje);
        String msnBcp = enviarBcp(mensaje);
        if(msnMercantil=="congelado con exito"||msnBcp=="congelado con exito")
            return true;
        return false;
    }

    private String enviarBancoMercantil(String msn){
        
        
        
        String mensaje=null;
        int puertoServidor =5000;
        byte[] buffer = new byte[1024];
            
            
        try {
            InetAddress direccionServidor = InetAddress.getByName("localhost");
            
            DatagramSocket socketUDP =new DatagramSocket();
            mensaje = msn;
            buffer = mensaje.getBytes();
            DatagramPacket pregunta = new DatagramPacket(buffer,buffer.length,direccionServidor,puertoServidor);
            System.out.println("envio datagrama");
            socketUDP.send(pregunta);

            DatagramPacket peticion = new DatagramPacket(buffer,buffer.length);
            socketUDP.receive(peticion);
            
            mensaje = new String(peticion.getData());
            
            
            
            
        } catch (SocketException ex) {
            Logger.getLogger(Asfi.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnknownHostException ex) {
            Logger.getLogger(Asfi.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Asfi.class.getName()).log(Level.SEVERE, null, ex);
        }
        return mensaje;
        
    }
    
    private String enviarBcp(String msn){
        String mensaje=null;
        String host="localhost";
        int puerto =5001;
        DataInputStream in;
        DataOutputStream out;
        try {
            
            
            Socket sc =new Socket(host,puerto);
            in = new DataInputStream(sc.getInputStream());
            out = new DataOutputStream(sc.getOutputStream());
            
            out.writeUTF(msn);
            mensaje = in.readUTF();
            System.out.println(mensaje);
            sc.close();
            
            
        } catch (IOException ex) {
            Logger.getLogger(Asfi.class.getName()).log(Level.SEVERE, null, ex);
        }
        return mensaje;
    }
    
    
    List<Cuenta> comvertir(String msn1,String msn2){
        String[] msn1_split=msn1.split(":");
        String[] msn2_split=msn2.split(":");
        msn1_split=msn1_split[1].split("-");
        msn2_split=msn2_split[1].split("-");
        
        //int catn1=msn1_split.length;
        
        
        Cuenta cuenta1=new Cuenta(Banco.valueOf("Mercantil"),msn1_split[0],"11021654","Juan perez","Segovia",Double.parseDouble(msn1_split[1]));
        Cuenta cuenta2=new Cuenta(Banco.valueOf("Bcp"),msn2_split[0],"1243214","Juan perez","Segovia",Double.parseDouble(msn2_split[1]));
        List<Cuenta> cuentas=new ArrayList();
        cuentas.add(cuenta1);
        cuentas.add(cuenta2);
        return cuentas;
    }
    
}



