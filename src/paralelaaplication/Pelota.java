/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paralelaaplication;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;
public class Pelota extends JPanel{    
    private int x, y;
    private int dsx, dsy, t; 
    private int radio = 5; 
    private Color c;    
  
      
      public Pelota(int dsx, int dsy, int t){           
          this.x=(int) (Math.random() * 430) + 1;
          this.y=(int) (Math.random() * 490) + 1;
          this.dsx= dsx;
          this.dsy=dsy;
          this.t=t;
          c = new Color((int)(Math.random() * 0x1000000)); 
      }
      
      public int retardo (){ 
          return t;
      }
      
      public void moverbola(){
        x=x + dsx;
        y=y + dsy;
        if ( x>= 450-radio || x<= radio)     
            dsx = -dsx;
        if ( y >= 500- radio || y<=radio )
           dsy = -dsy;   
      }
      
      public void pintar (Graphics g){     

      g.setColor(c);
      g.fillOval(x-radio, y-radio, radio*4, radio*4);
      }
      
   
}