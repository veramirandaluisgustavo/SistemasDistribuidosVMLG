/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Votacion;

/**
 *
 * @author HP
 */
import org.jgroups.JChannel;
import org.jgroups.Message;

import java.util.Scanner;

public class Mesa {

    private static String CANAL = "VotacionChannel";
    private static String NOMBRE_MESA = "Mesa";
    //private static String DIRECCION_SERVIDOR = "192.168.11.45"; 

    public static void main(String[] args) throws Exception {
        JChannel channel = new JChannel();
        channel.connect(CANAL); 

        System.out.println("Mesa de Votación " + NOMBRE_MESA + " iniciada.");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Ingrese los resultados de la votación para " + NOMBRE_MESA + ":");
            System.out.print("Juan: ");
            int juan = scanner.nextInt();
            System.out.print("Pedro: ");
            int pedro = scanner.nextInt();
            System.out.print("Maria: ");
            int maria = scanner.nextInt();

            String resultado = NOMBRE_MESA + "," + juan + "," + pedro + "," + maria;

            Message mensaje = new Message(null,  resultado);
            channel.send(mensaje);

            System.out.println("Voto enviado.");

            System.out.print("¿Desea continuar votando? (s/n): ");
            String continuar = scanner.next().toLowerCase();
            if (!continuar.equals("s")) {
                break; 
            }
        }

        channel.close();
    }
}
