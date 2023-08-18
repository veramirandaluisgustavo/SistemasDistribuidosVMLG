/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_1;

import static com.mycompany.ejercicio_1.Ejercicio_1.fibonacci;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP
 */
public class Cliente {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args)
    {
        
            String host="192.168.1.10";
            int puerto =5000;
            DataInputStream in;
            DataOutputStream out;
            
            
            
        try {    
            Socket sc =new Socket(host,puerto);

            in= new DataInputStream(sc.getInputStream());
            out= new DataOutputStream(sc.getOutputStream());
            System.out.println("introduce el numero para fibonacci");
            String dato =scan.nextLine();
            out.writeUTF(dato);
            String mensaje = in.readUTF();
            System.out.println(mensaje);
            
            sc.close();
            
            
            
        } catch (IOException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
            
            
            
            
            
        
}
