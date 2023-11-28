/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ejercisiormii;

/**
 *
 * @author HP
 */
import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author HP
 */
public interface IServicio extends Remote{
    public String aumentarEspacios(int dato) throws RemoteException;
    public String aumentar(String dato) throws RemoteException;
    public Boolean introducirValor(String cadena) throws RemoteException;
    public String invertir() throws RemoteException;
}
