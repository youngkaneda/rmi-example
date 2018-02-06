/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juan.rmi.example;

/**
 *
 * @author juan
 */
public class EnGreeter implements Greeter{

    @Override
    public void greetings() {
        System.out.println("hello, my name is World.");
    }
    
}
