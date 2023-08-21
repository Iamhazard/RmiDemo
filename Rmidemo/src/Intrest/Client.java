/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Intrest;

import java.rmi.*;
public class Client  {
    public static void main(String[] args) {
        try {
            selling intrestObj=(selling)Naming.lookup("rmi://localhost:5001/demo");
         System.out.println("The output is:" + intrestObj.simple(5000,5,5));   
        }catch(Exception e){ System.out.println(e);}
    }
}
