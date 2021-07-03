/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travel.management.system;

/**
 *
 * @author kishan
 */
import javax.swing.*;
import java.awt.*;

public class Splash {

    public static void main(String[] args) {
        SplashFrame frame = new SplashFrame();
        frame.setVisible(true);
        int x = 1;
        
        for (int i = 0; i <= 500; i+=2, x+=3) {
            frame.setLocation(700-x/8, 370-x/8);
            frame.setSize(i + x -x/2, i );
            try {
                Thread.sleep(10);
            } catch (Exception e) {

            }
        }     
    }
}
class SplashFrame extends JFrame implements Runnable {

    Thread t1;

    SplashFrame() {
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/splash.jpg"));
        Image i2 = i1.getImage().getScaledInstance(960, 550, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        add(l1);
        setUndecorated(true);
        t1 = new Thread(this);
        t1.start();
    }
    public void run() {
        try {
            Thread.sleep(8000);
            this.setVisible(false);
            new Login().setVisible(true);
        } catch (Exception e) {}
    }
}
