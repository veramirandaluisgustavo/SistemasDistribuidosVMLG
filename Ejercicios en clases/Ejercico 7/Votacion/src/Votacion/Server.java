/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Votacion;



import org.jgroups.JChannel;
import org.jgroups.Message;
import org.jgroups.ReceiverAdapter;
import org.jgroups.View;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Server extends ReceiverAdapter {

    private static  String CANAL = "VotacionChannel";
    private static String NOMBRE_SERVIDOR = "Servidor";

    private  Map<String, VotosMesa> votosMesas = new HashMap<>();

    public static void main(String[] args) throws Exception {
        new Server().iniciarServidor();
    }

    private void iniciarServidor() throws Exception {
        JChannel channel = new JChannel();
        channel.setReceiver(this);
        
        channel.connect(CANAL);

        System.out.println("Servidor de Votación " + NOMBRE_SERVIDOR + " iniciado.");
        System.out.println("Esperando votos...");

        while (true) {
            Thread.sleep(1000); 
            Scanner sc=new Scanner(System.in);
            System.out.println("precione 1 para mostrar");
            int resultado=sc.nextInt();
            if(resultado==1)mostrarResultados();
            
        }
    }

    @Override
    public void receive(Message msg) {
        String[] partes = msg.getObject().toString().split(",");
        if (partes.length == 4) {
            String mesa = partes[0];
            int juan = Integer.parseInt(partes[1]);
            int pedro = Integer.parseInt(partes[2]);
            int maria = Integer.parseInt(partes[3]);

            VotosMesa votosMesa = votosMesas.getOrDefault(mesa, new VotosMesa());
            votosMesa.agregarVotos(juan, pedro, maria);
            votosMesas.put(mesa, votosMesa);
        }
    }

    @Override
    public void viewAccepted(View view) {
        System.out.println("Miembros en el canal: " + view.size());
    }

    private void mostrarResultados() {
        System.out.println("\nResultados de la Votación:");
        for (String mesa : votosMesas.keySet()) {
            VotosMesa votosMesa = votosMesas.get(mesa);
            int totalJuan = votosMesa.getTotalJuan();
            int totalPedro = votosMesa.getTotalPedro();
            int totalMaria = votosMesa.getTotalMaria();

            System.out.println("Mesa: " + mesa);
            System.out.println("Total de Votos para Juan: " + totalJuan);
            System.out.println("Total de Votos para Pedro: " + totalPedro);
            System.out.println("Total de Votos para Maria: " + totalMaria);
        }
    }

    
}

