/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factorial;

import java.rmi.*;

public class Myclient {
    public static void main (String args[]) throws Exception {
        try {
            Factorial stub = (Factorial)Naming.lookup("rmi://localhost:5001/demo");
             System.out.println("The output is:" + stub.fact(10));
        }catch(Exception e){ System.out.println(e);}      
}
}
