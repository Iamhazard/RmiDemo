/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factorial;


import java.rmi.*;
public interface  Factorial  extends Remote{
    
     public int fact(int f)throws RemoteException;
}
