package travel.management.system;

/**
 *
 * @author kishan
 */
import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.util.*;



public class Signup extends JFrame implements ActionListener{
    JButton b1, b2;
    JTextField t1, t2, pass2;
    JPasswordField pass1;
    Choice c1;
    
    Signup(){
        setBounds(400, 270, 900, 400);
        setTitle("Signup");
        setLayout(null);
        getContentPane().setBackground(Color.white);
        
        JPanel p1 = new JPanel();
        p1.setBounds(0, 0, 500, 400);
        p1.setLayout(null);
        p1.setBackground(new Color(133,193,233));
        add(p1);
        
        JLabel l1 = new JLabel("Username");
        l1.setBounds(50, 20, 200, 25);
        l1.setFont(new Font("SAN_SERIF", Font.BOLD, 15));
        p1.add(l1);
        
        t1 = new JTextField();
        t1.setBounds(280, 20, 200, 25);
        t1.setBorder(BorderFactory.createEmptyBorder());
        p1.add(t1);
        
        
        JLabel l2 = new JLabel("Name");
        l2.setBounds(50, 60, 200, 25);
        l2.setFont(new Font("SAN_SERIF", Font.BOLD, 15));
        p1.add(l2);
        
        t2 = new JTextField();
        t2.setBounds(280, 60, 200, 25);
        t2.setBorder(BorderFactory.createEmptyBorder());
        p1.add(t2);
        
        
        JLabel l3 = new JLabel("Password");
        l3.setBounds(50, 100, 200, 25);
        l3.setFont(new Font("SAN_SERIF", Font.BOLD, 15));
        p1.add(l3);
        
        pass1 = new JPasswordField();
        pass1.setBounds(280, 100, 200, 25);
        pass1.setBorder(BorderFactory.createEmptyBorder());
        p1.add(pass1);
        
        JLabel l4 = new JLabel("Security Question");
        l4.setBounds(50, 140, 200, 25);
        l4.setFont(new Font("SAN_SERIF", Font.BOLD, 15));
        p1.add(l4);
        
        c1 = new Choice();
        c1.add("Your nickname?");
        c1.add("Your fav city?");
        c1.add("Your fav superhero?");
        c1.add("City you were born in?");
        c1.setBounds(280, 140, 200, 25);
        c1.setBackground(Color.white);
        p1.add(c1);
        
        JLabel l5 = new JLabel("Answer");
        l5.setBounds(50, 180, 200, 25);
        l5.setFont(new Font("SAN_SERIF", Font.BOLD, 15));
        p1.add(l5);
        
        pass2 = new JTextField();
        pass2.setBounds(280, 180, 200, 25);
        pass2.setBorder(BorderFactory.createEmptyBorder());
        p1.add(pass2);
        
        
        Border border = new LineBorder(new Color(133, 253, 253), 3, true);
        
        b1 = new JButton("Create");
        b1.setBounds(70, 220, 150, 30);
        b1.setBorder(border);
        b1.setBackground(Color.white);
        b1.setForeground(new Color(133, 223, 253));
        b1.addActionListener(this);
        b1.setFont(new Font("SAN_SERIF", Font.ROMAN_BASELINE, 15)); 
        p1.add(b1);
        
                
        b2 = new JButton("Back");
        b2.setBounds(240, 220, 150, 30);
        b2.setBorder(border);
        b2.setBackground(Color.white);
        b2.setForeground(new Color(133, 223, 253));
        b2.addActionListener(this);
        b2.setFont(new Font("SAN_SERIF", Font.ROMAN_BASELINE, 15));
        p1.add(b2);
        
        
        JPanel p2 = new JPanel();
        p2.setBounds(500, 0, 400, 400);
        p2.setLayout(null);
        p2.setBackground(Color.white);
        add(p2);
        
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/signup.png"));
        Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        
        JLabel l6 = new JLabel(i3);
        l6.setBounds(100,100,200,200);
        p2.add(l6);
        
        
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == b1){
            String username = t1.getText();
            String name = t2.getText();
            String p1 = "";
            for(char c : pass1.getPassword()){
                p1 = p1 + c;
            }
            String ch1 = c1.getSelectedItem();
            String p2 = pass2.getText();
            
            String query = "insert into account values ('"+username+"', '"+name+"', '"+p1+"', '"+ch1+"','"+p2+"')"; 
            try{
                Conn con = new Conn();
                con.s.executeUpdate(query);                                
                JOptionPane.showMessageDialog(null, "Account Created Successfully!");
                this.setVisible(false);
                new Login().setVisible(true);
            }catch(Exception e){
                System.out.println(query);
                System.out.println("Error occured");
            }
            
        }else if(ae.getSource() == b2){
            new Login().setVisible(true);
            this.setVisible(false);
        }
    }
    
    public static void main(String[] args){
        new Signup().setVisible(true);
    }
}
