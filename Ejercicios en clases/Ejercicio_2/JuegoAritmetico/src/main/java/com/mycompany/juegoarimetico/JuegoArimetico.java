/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.juegoarimetico;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP
 */
public class JuegoArimetico {
    static public List<String> preguntas=new ArrayList();
    static List<String> respuestas=new ArrayList();
    

    public static void main(String[] args) {
        
        ServerSocket servidor=null;
        Socket sc=null;
        int puerto=5000;
        DataInputStream in;
        DataOutputStream out;
        
        preguntas.add("1+1");
        preguntas.add("3*5");
        preguntas.add("2+16");
        preguntas.add("5*5");
        preguntas.add("6*6");
        preguntas.add("2+3+4");
        preguntas.add("9*10");
        preguntas.add("11*10");
        preguntas.add("3*3");
        preguntas.add("4*4");
        respuestas.add("2");
        respuestas.add("8");
        respuestas.add("18");
        respuestas.add("25");
        respuestas.add("36");
        respuestas.add("9");
        respuestas.add("");
        respuestas.add("");
        respuestas.add("");
        respuestas.add("");
        
        
        
        
        
        
            
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
            Logger.getLogger(JuegoArimetico.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    
}
