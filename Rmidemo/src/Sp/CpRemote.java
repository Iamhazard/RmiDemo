/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sp;


import java.rmi.*;
import java.rmi.server.*;

public class CpRemote extends UnicastRemoteObject implements Cp {
    CpRemote()throws RemoteException{
        super();
        
    }
    public double Sp(double CP ,double Dis){
        return CP-Dis;
    }
    
    
}
