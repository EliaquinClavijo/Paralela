/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paralelaaplication;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.JPanel;

public class PanelPelota extends JPanel implements Runnable{

int N;
Thread[] Hilos_Control;
Pelota[] p;

public PanelPelota(int Entrada){
        N = Entrada;  
        Hilos_Control = new Thread[N];
        p = new Pelota[N];    
          
        for (int i=0; i<N; ++i)
            Hilos_Control[i]= new Thread(this);

        for (int i=0; i<N; ++i)
            p[i]= new Pelota((int) (Math.random() * 3)+1,(int) (Math.random() * 3)+1,(int) (Math.random() * 5) +10); 
          
        for (int i=0; i<Hilos_Control.length; ++i) 
            Hilos_Control[i].start();
         
             
          
}



public void run(){
    for (int i=0; i<Hilos_Control.length; ++i){
      while (Hilos_Control[i].currentThread()== Hilos_Control[i]) {
                System.out.println(Hilos_Control[i].getName());
             try {
                Hilos_Control[i].sleep(p[i].retardo()); 
                p[i].moverbola();
                 repaint();             
             }catch (InterruptedException e) { }  
        }
    }
}

  public void paintComponent(Graphics g) {       
      super.paintComponent(g);    
      for(int i=0; i<p.length;++i)
         p[i].pintar(g);     
    }
    
  }
  