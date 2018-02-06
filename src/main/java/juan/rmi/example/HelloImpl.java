/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juan.rmi.example;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author juan
 */
public class HelloImpl extends UnicastRemoteObject implements Hello{

    public HelloImpl() throws RemoteException {}
    
    @Override
    public void sayHello(Greeter greeter) throws RemoteException{
        greeter.greetings();
        System.out.println("end of greetings");
    }
    
}
