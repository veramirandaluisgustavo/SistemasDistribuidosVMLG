/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.serverasfi;

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
public class ServerBancoBcp {

    public static void main(String[] args) {
        ServerSocket servidor = null;
        Socket sc = null;
        int puerto = 5001;
        DataInputStream in;
        DataOutputStream out;

        try {

            servidor = new ServerSocket(puerto);
            System.out.println("Servidor iniciado");

            while (true) {
                sc = servidor.accept();

                in = new DataInputStream(sc.getInputStream());
                out = new DataOutputStream(sc.getOutputStream());

                String mensaje = in.readUTF();

                String[] orden = mensaje.split(":");
                switch (orden[0]) {
                    case "Buscar":
                        String[] result = convertirBuscar(orden[1]);
                        String x = buscar(result[0], result[1], result[2]);
                        out.writeUTF(x);
                        break;
                    case "Congelar":
                        String[] result2 = convertirBuscar(orden[1]);
                        String x2 = congelar(result2[0], Double.parseDouble(result2[1]));
                        out.writeUTF(x2);
                        break;
                    default:
                        System.out.println("Opcion invalida");

                }
                //System.out.println(mensaje);
                //out.writeUTF("Hola desde el servidor");
                sc.close();
                System.out.println("Cliente desconectado");
            }
        } catch (IOException ex) {
            Logger.getLogger(ServerBancoBcp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static String buscar(String ci, String Nombres, String apellidos) {
        if (ci == "11021654" && Nombres == "Juan Perez" && apellidos == "Segovia") {
            return "112-333:123-334";
        }
        return "no hay";

    }

    public static String congelar(String cuenta, Double monto) {
        if (cuenta == "1") {
            return "congelado con exito";

        }
        return "congelado sin exito";
    }

    private static String[] convertirBuscar(String msn) {
        String[] resultado = null;

        resultado = msn.split("-");

        return resultado;

    }
}
