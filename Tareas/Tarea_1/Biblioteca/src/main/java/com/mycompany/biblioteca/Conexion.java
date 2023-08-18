/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.biblioteca;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author HP
 */
public class Conexion 
{
    String bd="biblioteca_db";
    String url="jdbc:mysql://localhost:3308/";
    String user="root";
    String password="";
    String driver="com.mysql.cj.jdbc.Driver";
    Connection cx;
    public Conexion(String bd)
    {
        this.bd=bd;
    }
    public Connection conectar()
    {
        try {
            Class.forName(driver);
            cx=(Connection)DriverManager.getConnection(url+bd,user,password);
            System.out.println("SE CONECTO A LA BASE DE DATOS");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("NO SE CONECTO A LA BASE DE DATOS");
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cx;
    }
    public static void main(String[] args)
    {
        Conexion conexion=new Conexion("biblioteca_db");
        conexion.conectar();
    }
        
        
    
}
