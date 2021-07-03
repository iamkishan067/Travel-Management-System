package travel.management.system;
import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import javax.swing.border.Border;



public class Loading extends JFrame implements Runnable{
    Thread t;
    JProgressBar pbar;
    String username;
    Loading(String username){
        t = new Thread(this);
        this.username = username;
        
        String message = "Welcome " + username; 
        setBounds(750, 300, 500, 400);
        setLayout(null);
        
        JPanel p = new JPanel();
        p.setBounds(0, 0, 500, 400);
        p.setBackground(Color.WHITE);
        Border redline = BorderFactory.createLineBorder(Color.red);
        p.setBorder(redline);
        p.setLayout(null);
        add(p);
        
        JLabel l1 = new JLabel("  Travel Management System");
        l1.setBounds(0, 0, 500, 60);
        l1.setBackground(Color.WHITE);
        l1.setFont(new Font("Raleway", Font.BOLD, 35));
        p.add(l1);
        
        pbar = new JProgressBar();
        pbar.setBounds(110, 130, 270, 30);
        pbar.setStringPainted(true);
        p.add(pbar);
        
        JLabel l2 = new JLabel("Please Wait....");
        l2.setBounds(200, 170, 100, 20);
        l2.setFont(new Font("Tahoma", Font.BOLD, 14));
        l2.setForeground(Color.red);
        p.add(l2);
        
        
        JLabel l3 = new JLabel(message);
        l3.setBounds(40, 310, 400, 30);
        l3.setFont(new Font("Tahoma", Font.BOLD, 14));
        l3.setForeground(new Color(133, 193, 233));
        p.add(l3);
        
        setUndecorated(true);
        t.start();
    }
    
    public void run(){
        
        try{
            for(int i = 1; i < 102; i++){
                int n = pbar.getValue();
                int max = pbar.getMaximum();
                if(n < max ){
                    pbar.setValue(n + 1);
                }else{
                    i = 105;   
                    setVisible(false); 
                    new DashBoard(username).setVisible(true);
                }

                Thread.sleep(50);
            }
        }catch(Exception e){}
        
    }
    
    
    public static void main(String[] args){
        new Loading("").setVisible(true);
    }
}
