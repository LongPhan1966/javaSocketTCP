/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author USER
 */
public class ThreadTwo implements Runnable{
    @Override
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread Two > " + i);
            
            
        }
        try {
                Thread.sleep(50000);
            } catch (InterruptedException ex) {
            }
    }
}
