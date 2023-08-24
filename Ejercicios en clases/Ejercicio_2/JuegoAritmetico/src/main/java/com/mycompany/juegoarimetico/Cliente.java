/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.juegoarimetico;

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
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args)
    {
        int decicion;
        do {
            System.out.println("\nMenú:");
            System.out.println("1. Enviar numero");
            System.out.println("2. Terminar");
            System.out.println("elige una opcion");
            
            decicion = scan.nextInt();

            if(!(decicion==1 || decicion==2))
            {
                System.out.println("La opcion elegida no es valida");
            }
            if(decicion ==1)
            {
                enviarNumero();
            }
            
        } while (decicion != 2);

        scan.close();
    }
    public static void enviarNumero()
    {
        Scanner scanf = new Scanner(System.in);
        String host="192.168.1.10";
            int puerto =5000;
            DataInputStream in;
            DataOutputStream out;
        try {    
            Socket sc =new Socket(host,puerto);

            in= new DataInputStream(sc.getInputStream());
            out= new DataOutputStream(sc.getOutputStream());
            System.out.println("introduce el numero para fibonacci");
            
            String dato =scanf.nextLine();
            out.writeUTF(dato);
            String mensaje = in.readUTF();
            System.out.println(mensaje);           
            sc.close();
 
        } catch (IOException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
