/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juan.rmi.example;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author juan
 */
public interface Hello extends Remote{
    void sayHello(Greeter greeter) throws RemoteException;
}
