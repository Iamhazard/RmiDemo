/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Intrest;

import java.rmi.*;
import java.rmi.server.*;

public class spRemote extends UnicastRemoteObject implements selling  {
    
    spRemote ()throws RemoteException{
        super();
        
    }
    public double simple(double x ,double y ,double z ){
        return (x*y*z)/100;
    }
    
}
