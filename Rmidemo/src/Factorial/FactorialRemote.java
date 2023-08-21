/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factorial;

 
import java.rmi.*;
import java.rmi.server.*;

public class FactorialRemote  extends UnicastRemoteObject implements Factorial {
    
     //incase you extend the unicastRemoteObject class you define
    //.0  constructor that  declare ReoteException
    FactorialRemote()throws RemoteException{
        super();
    }
    public int fact(int f)throws RemoteException{
        int i,fact=1;
       int n=3;
  for(i=1;i<=n;i++){    
      fact=fact*i;    
     
    }
     return(fact);

    }
}