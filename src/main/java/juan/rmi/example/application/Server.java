/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juan.rmi.example.application;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import juan.rmi.example.Hello;
import juan.rmi.example.HelloImpl;

/**
 *
 * @author juan
 */
public class Server {
    public static void main(String[] args) {
        try {
            Hello hello = new HelloImpl();
            Naming.rebind("rmi://localhost:1099/Hello", hello);
        } catch (MalformedURLException | RemoteException ex) {
            System.out.println("server error: " + ex.getMessage());
        }
    }
}
