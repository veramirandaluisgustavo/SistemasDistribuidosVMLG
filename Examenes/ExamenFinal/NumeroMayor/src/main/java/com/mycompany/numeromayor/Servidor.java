/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.numeromayor;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP
 */
public class Servidor {
    

    public static void main(String[] args) {
        ServerSocket servidor=null;
        Socket sc =null;
        int puerto =5000;
        DataInputStream in;
        DataOutputStream out;
        int a=0,b=0,c=0;
        
        try {
            
            
            servidor = new ServerSocket(puerto);
            System.out.println("Servidor iniciado");
            sc =servidor.accept();
            
            while(true){
                System.out.println("listo para recivir");
                
                
                in = new DataInputStream(sc.getInputStream());
                out =new DataOutputStream(sc.getOutputStream());
                
                String mensaje = in.readUTF();
                System.out.println(mensaje);
                String[] valores=mensaje.split(":");
                switch(valores[1]){
                    case "a":a=Integer.parseInt(valores[0]);break;
                    case "b":b=Integer.parseInt(valores[0]);break;
                    case "c":c=Integer.parseInt(valores[0]);break;
                    default: System.out.println("no se ingreso un valor correcto");out.writeUTF("NO SE INGRESO UN VALOR CORRECTO");break;
                }
                System.out.println(a+" "+b+" "+c);
                if(a!=0 && b!=0 && c!=0){
                    
                    System.out.println("se envio numero");
                    int respuesta=a;
                    if(b>respuesta)respuesta=b;
                    if(c>respuesta)respuesta=c;
                    out.writeUTF("EL NUMERO MAYOR ES: "+respuesta);
                    a=0;
                    b=0;
                    c=0;
                    
                }
                else{
                    out.writeUTF("ok");
                }
                
            }
            //sc.close();
               // System.out.println("Cliente desconectado");
        } catch (IOException ex) {
            Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
