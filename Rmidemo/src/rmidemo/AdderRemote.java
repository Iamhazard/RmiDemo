/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rmidemo;
 
import java.rmi.*;
import java.rmi.server.*;

public class AdderRemote  extends UnicastRemoteObject implements Adder{
    //incase you extend the unicastRemoteObject class you define
    //.0  constructor that  declare ReoteException
    AdderRemote()throws RemoteException{
        super();
        
    }
    @Override
    public int add(int x,int y)
    {
    return x+y;
}
   
}
