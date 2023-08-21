/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sp;

import java.rmi.*;

public class Client {
    public static void main(String[] args) {
        try {
            Cp stub=(Cp)Naming.lookup("rmi://localhost:5001/demo");
//            cost stub=(cost)Naming.lookup("rmi://localhost:5001/demo");
         System.out.println("The output is:" + stub.Sp(5000,50));   
        }catch(Exception e){ System.out.println(e);}
    }
    
}
