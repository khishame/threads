/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thre;


public class Thre {

  
    public static void main(String[] args) {
        
        System.out.println("Start now  !!!!!!!!!!!!!");
        
        Thread t1= new Thread(new MyThread1());
        Thread t2 = new Thread(new Mythread2());
        Thread t3 = new Thread(new MyThread3());
        
        t1.start();
        t2.start();
        t3.start();
    }
    
}
