/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Intrest;

import java.rmi.*;
import java.rmi.registry.*;
public class server {
    public static void main(String[] args) {
         try {
        Registry reg = LocateRegistry.createRegistry(5001);
            
            selling intrestObj=new spRemote();
            // rebind to the new remote object;
            Naming.rebind("rmi://localhost:5001/demo",intrestObj);
                    
                    System.out.println("Server is running");
        }
        catch(Exception e)
        {
            System.out.println(e);}
        
        }   
        
    }
    

