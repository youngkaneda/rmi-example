/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juan.rmi.example.application;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import juan.rmi.example.EnGreeter;
import juan.rmi.example.Hello;

/**
 *
 * @author juan
 */
public class Client {
    public static void main(String[] args) {
        try {
            Hello hello = (Hello) Naming.lookup("rmi://localhost:1099/Hello");
            hello.sayHello(new EnGreeter());
        } catch (NotBoundException | MalformedURLException | RemoteException ex) {
            System.out.println("Client error: " + ex.getMessage());
        }
    }
}
