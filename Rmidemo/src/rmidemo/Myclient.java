/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rmidemo;
import java.rmi.*;


public class Myclient {
  public static void main (String args[]) throws Exception {
        try {
            Adder stub = (Adder)Naming.lookup("rmi://localhost:5001/demo");
             System.out.println("The output is:" + stub.add(1,24));
        }catch(Exception e){ System.out.println(e);}      
}
}
