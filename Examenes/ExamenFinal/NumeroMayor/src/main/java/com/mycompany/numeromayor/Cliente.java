/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.numeromayor;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP
 */
public class Cliente {
    public static void main(String[] args){
        
        String host="localhost";
        int puerto =5000;
        DataInputStream in;
        DataOutputStream out;
        try {
            
            
            Socket sc =new Socket(host,puerto);
            in = new DataInputStream(sc.getInputStream());
            out = new DataOutputStream(sc.getOutputStream());
            Scanner scanner = new Scanner(System.in);
            
            while(true){
                System.out.println("INGRESE UN NUMERO");
                String mensajeO=scanner.nextLine();
                out.writeUTF(mensajeO);
                String mensaje = in.readUTF();
                if(mensaje.equals("ok")){
                    System.out.println("ingresado correctamente");
                }
                else{
                    System.out.println(mensaje);
                }
                
                    
                    
                
                
                //sc.close();
            }
            
            
            
            
            
        } catch (IOException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}

