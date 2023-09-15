/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Votacion;

/**
 *
 * @author HP
 */
    class VotosMesa {
        private int totalJuan;
        private int totalPedro;
        private int totalMaria;

        public void agregarVotos(int juan, int pedro, int maria) {
            totalJuan += juan;
            totalPedro += pedro;
            totalMaria += maria;
        }

        public int getTotalJuan() {
            return totalJuan;
        }

        public int getTotalPedro() {
            return totalPedro;
        }

        public int getTotalMaria() {
            return totalMaria;
        }
    }