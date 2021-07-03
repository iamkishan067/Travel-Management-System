package travel.management.system;
import javax.swing.*;
import java.awt.*;

public class CheckPackage extends JFrame{
    CheckPackage(){
        setBounds(580,250,900,630);
        setTitle("Check Package");
        
        String[] package1 = new String[]{"GOLD PACKAGE", "6 Days and 7 Nights", "Airport Assistance", "Half Day City Tour", "Welcome Drinks on Arrival", "Daily Buffet", "Full Day 3 Island Cruise", "English Speaking Guide", "Book Now", "Summer Special", "Rs 12000/-","package1.jpg"};
        String[] package2 = new String[]{"SILVER PACKAGE", "4 Days and 3 Nights", "Toll Free and Entrance Free Tickets", "Meet and Greet at Airport", "Welcome Drinks on Arrival", "Night Safari", "Full Day 3 Island Cruise", "Cruise with Dinner", "Book Now", "Winter Special", "Rs 25000/-","package2.jpg"};
        String[] package3 = new String[]{"BRONZE PACKAGE", "6 Days and 5 Nights", "Return Airfare", "Free Clubbing, Horse Riding & Other Games", "Welcome Drinks on Arrival", "Daily Buffet", "Stay in 5 Star Hotel", "BBQ Dinner", "Book Now", "Summer Special", "Rs 32000/-","package3.jpg"};
        
        JPanel p1 = createJPanel(package1);
        JPanel p2 = createJPanel(package2);
        JPanel p3 = createJPanel(package3);
        
        JTabbedPane pane = new JTabbedPane();
        pane.addTab("Package 1", null, p1);
        pane.addTab("Package 2", null, p2);
        pane.addTab("Package 3", null, p3);
        add(pane);
        
        
    }
    
    private JPanel createJPanel(String[] user) {
        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBounds(0, 0, 900, 630);
        p1.setBackground(Color.WHITE);
        
        JLabel l0 = new JLabel(user[0]);
        l0.setBounds(150, 10, 300, 40);
        l0.setFont(new Font("Tahoma", Font.PLAIN, 30));
        l0.setForeground(Color.red);
        p1.add(l0);
        
        
        JLabel l2 = new JLabel(user[1]);
        l2.setBounds(50, 70, 300, 40);
        l2.setFont(new Font("Tahoma", Font.PLAIN, 25));
        l2.setForeground(Color.BLUE);
        p1.add(l2);
        
        JLabel l3 = new JLabel(user[2]);
        l3.setBounds(50, 130, 300, 40);
        l3.setFont(new Font("Tahoma", Font.PLAIN, 25));
        l3.setForeground(Color.red);
        p1.add(l3);
        
        JLabel l4 = new JLabel(user[3]);
        l4.setBounds(50, 190, 300, 40);
        l4.setFont(new Font("Tahoma", Font.PLAIN, 25));
        l4.setForeground(Color.BLUE);
        p1.add(l4);
        
        JLabel l1 = new JLabel(user[4]);
        l1.setBounds(50, 250, 300, 40);
        l1.setFont(new Font("Tahoma", Font.PLAIN, 25));
        l1.setForeground(Color.red);
        p1.add(l1);
        
        JLabel l5 = new JLabel(user[5]);
        l5.setBounds(50, 310, 300, 40);
        l5.setFont(new Font("Tahoma", Font.PLAIN, 25));
        l5.setForeground(Color.BLUE);
        p1.add(l5);
        
        JLabel l6 = new JLabel(user[6]);
        l6.setBounds(50, 370, 300, 40);
        l6.setFont(new Font("Tahoma", Font.PLAIN, 25));
        l6.setForeground(Color.red);
        p1.add(l6);
        
        JLabel l7 = new JLabel(user[7]);
        l7.setBounds(50, 430, 300, 40);
        l7.setFont(new Font("Tahoma", Font.PLAIN, 25));
        l7.setForeground(Color.BLUE);
        p1.add(l7);
        
        JLabel l8 = new JLabel(user[8]);
        l8.setBounds(90, 490, 210, 60);
        l8.setFont(new Font("Tahoma", Font.PLAIN, 40));
        l8.setForeground(Color.red);
        p1.add(l8);
        
        JLabel l9 = new JLabel(user[9]);
        l9.setBounds(340, 490, 250, 40);
        l9.setFont(new Font("Tahoma", Font.PLAIN, 35));
        l9.setForeground(Color.red);
        p1.add(l9);
        
        JLabel l10 = new JLabel(user[10]);
        l10.setBounds(680, 490, 200, 40);
        l10.setFont(new Font("Tahoma", Font.PLAIN, 35));
        l10.setForeground(Color.red);
        p1.add(l10);
        
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/"+ user[11]+""));
        Image i2 = i1.getImage().getScaledInstance(450, 350, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        
        JLabel l11 = new JLabel(i3);
        l11.setBounds(400, 70, 450, 350);
        p1.add(l11);
        
        return p1;
    }
    
    public static void main (String[] args){
        new CheckPackage().setVisible(true);
    }
    
}
