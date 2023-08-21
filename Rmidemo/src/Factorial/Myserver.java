/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factorial;
import java.rmi.*;
import java.rmi.registry.*;

public class Myserver {
     public static void main (String args[]) throws Exception {
        try {
        Registry reg = LocateRegistry.createRegistry(5001);
            
            Factorial stub=new FactorialRemote();
            // rebind to the new remote object;
            Naming.rebind("rmi://localhost:5001/demo",stub);
                    
                    System.out.println("Server is running");
        }
        catch(Exception e)
        {
            System.out.println(e);}
        
        }   
    
}
