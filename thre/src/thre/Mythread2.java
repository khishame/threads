/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thre;

/**
 *
 * @author User
 */
public class Mythread2 implements Runnable{
    
    @Override
    public void run(){
        for(int i=0;i<=10;i++){
            System.out.println("2nd :"+i);
        }
    }
}
