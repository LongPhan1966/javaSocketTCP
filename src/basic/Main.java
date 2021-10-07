/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic;

/**
 *
 * @author USER
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Start");
        
        Thread t1 = new Thread(new Runnable(){
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Thread 1 > " + i);
                }
            }
        });
        t1.start();
        Thread t2 = new Thread(new Runnable(){
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Thread 2 > " + i);
                }
            }
        });
        t2.start();
        
        //Lamda extention
        Thread t3 = new Thread(() -> {
            //ádasd
        });
        System.out.println("End");
    }
    
}
