/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.serverasfi;

import static com.mycompany.serverasfi.ServerBancoBcp.buscar;
import static com.mycompany.serverasfi.ServerBancoBcp.congelar;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ServerBancoMercantil {

    public static void main(String[] args) {
        String x=null;
        int puerto =5000;
        byte[] buffer = new byte[1024];
        
        
        try {
            
            System.out.println("Iniciando servidor");
            DatagramSocket socketUDP =new DatagramSocket(puerto);
            
            DatagramPacket peticion = new DatagramPacket(buffer,buffer.length);
            
            socketUDP.receive(peticion);
            String mensaje = new String(peticion.getData());
            String[] orden = mensaje.split(":");
            switch (orden[0]) {
                    case "Buscar":
                        String[] result = convertirBuscar(orden[1]);
                        x = buscar(result[0], result[1], result[2]);
                        
                        break;
                    case "Congelar":
                        String[] result2 = convertirBuscar(orden[1]);
                        x = congelar(result2[0], Double.parseDouble(result2[1]));
                        
                        break;
                    default:
                        System.out.println("Opcion invalida");

                }
            System.out.println("recivo de informacion del cliente");
            
            
            int puertoCliente = peticion.getPort();
            InetAddress direccion = peticion.getAddress();
            mensaje =x;
            buffer = mensaje.getBytes();
            DatagramPacket respuesta =new DatagramPacket(buffer,buffer.length,direccion,puertoCliente);
            socketUDP.send(respuesta);
            System.out.println("envio de informacion al cliente");
            
            
            
            
        } catch (SocketException ex) {
            Logger.getLogger(ServerBancoMercantil.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ServerBancoMercantil.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    

    
    public static String buscar(String ci, String Nombres, String apellidos) {
        if(ci=="11021654" && Nombres=="Juan Perez" && apellidos=="Segovia"){
            return "112-333:123-334";
        }
        return "no hay";
    }

    
    public static String congelar(String cuenta, Double monto) {
        if(cuenta=="1" ){
            return "congelado con exito";
            
        }
        return"congelado sin exito";
    }
    private static String[] convertirBuscar(String msn){
        String[] resultado =null;
        
        
        resultado=msn.split("-");
        
        return resultado;
        
        
    }
    
    
}