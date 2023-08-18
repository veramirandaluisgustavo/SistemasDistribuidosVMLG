/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio_1;

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
public class Ejercicio_1 {

    public static void main(String[] args) {
        
        ServerSocket servidor=null;
        Socket sc=null;
        int puerto=5000;
        DataInputStream in;
        DataOutputStream out;
        
        
        try {    
            servidor =new ServerSocket(puerto);
            
            System.out.println("SERVIDOR INICIADO");
            sc = servidor.accept();
            in= new DataInputStream(sc.getInputStream());
            out= new DataOutputStream(sc.getOutputStream());
            String mensaje = in.readUTF();
            int dato=Integer.parseInt(mensaje);
            
            out.writeUTF("el fibonacci de "+dato+ " es "+fibonacci(dato));
            
            sc.close();
            
        } catch (IOException ex) {
            Logger.getLogger(Ejercicio_1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
