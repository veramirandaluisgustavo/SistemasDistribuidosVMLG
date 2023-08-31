/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.servidor;

import java.io.*;
import java.net.*;

/**
 *
 * @author HP
 */
public class Cliente {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 4003);

            
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            
            BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Introduce la operación (mayor/menor): ");
            String op = userInput.readLine();
            System.out.print("Introduce el primer número: ");
            int a = Integer.parseInt(userInput.readLine());
            System.out.print("Introduce el segundo número: ");
            int b = Integer.parseInt(userInput.readLine());
            System.out.print("Introduce el tercer número: ");
            int c = Integer.parseInt(userInput.readLine());

            
            out.println(op + "-" + a + "-" + b + "-" + c);

            
            String response = in.readLine();
            System.out.println("Respuesta del servidor: " + response);

            
            userInput.close();
            in.close();
            out.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
