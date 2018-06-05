/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paralelaaplication;

import java.awt.Color;
import javax.swing.JFrame;

public class ParalelaAplication extends JFrame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PanelPelota  G = new PanelPelota(5);
        ParalelaAplication f = new ParalelaAplication();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setContentPane(G);
        f.setSize(470, 540);
       // System.out.println(f.getWidth());
       // System.out.println(f.getHeight());
       // System.out.println((int) (Math.random() * 400) + 1);
        f.setVisible(true);
    }
    
}
