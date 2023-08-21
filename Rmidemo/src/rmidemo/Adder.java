/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rmidemo;
import java.rmi.*;


public interface Adder extends Remote {
    public int add(int x,int y)throws RemoteException;
        
    
}
