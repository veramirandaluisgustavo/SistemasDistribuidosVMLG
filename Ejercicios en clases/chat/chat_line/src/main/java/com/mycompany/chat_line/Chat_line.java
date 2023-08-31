/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.chat_line;

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
public class Chat_line {

    public static void main(String[] args) {
        
        ServerSocket servidor=null;
        Socket sc=null;
        int puerto=5000;
        DataInputStream in;
        DataOutputStream out;
        
        
            
            try {    
            servidor =new ServerSocket(puerto);
            
            System.out.println("SERVIDOR INICIADO");
            
            while(true)
            {
            sc = servidor.accept();
            in= new DataInputStream(sc.getInputStream());
            out= new DataOutputStream(sc.getOutputStream());
            String mensaje = in.readUTF();
            System.out.println("El numero recivido es"+ mensaje);
            int dato=Integer.parseInt(mensaje);
            
            out.writeUTF("el fibonacci de "+dato+ " es "+fibonacci(dato));
            
            sc.close();
            System.out.println("cliente desconectado");
            }
        } catch (IOException ex) {
            Logger.getLogger(Chat_line.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
