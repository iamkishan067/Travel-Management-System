
package travel.management.system;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class ForgotPassword extends JFrame implements ActionListener{
    JTextField t1, t2, t3, t4, t5;
    JButton b1, b2, b3;
    
    ForgotPassword(){
        setBounds(500, 300, 800,400);
        setTitle("Forgot Password");
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        
        JPanel p = new JPanel();
        p.setLayout(null);
        p.setBounds(30, 30, 500, 300);
        add(p);
        
        JLabel l1 = new JLabel("Username");
        l1.setBounds(30, 30, 140, 25);
        l1.setFont(new Font("Tahoma", Font.BOLD, 15));
        p.add(l1);
        
        t1 = new JTextField();
        t1.setBounds(190, 30, 120, 25);
        t1.setBorder(BorderFactory.createEmptyBorder());
        t1.setFont(new Font("Tahoma", Font.PLAIN, 14));
        p.add(t1);
        
        b1 = new JButton("Search");
        b1.setBounds(340, 30, 120, 25);
        b1.addActionListener(this);
        b1.setBackground(Color.GRAY);
        b1.setForeground(Color.WHITE);
        p.add(b1);
        
        
        JLabel l2 = new JLabel("Name");
        l2.setBounds(30, 70, 140, 25);
        l2.setFont(new Font("Tahoma", Font.BOLD, 15));
        p.add(l2);
        
        t2 = new JTextField();
        t2.setBounds(190, 70, 120, 25);
        t2.setBorder(BorderFactory.createEmptyBorder());
        t2.setFont(new Font("Tahoma", Font.PLAIN, 14));
        p.add(t2);
        
        
        JLabel l3 = new JLabel("Security Question");
        l3.setBounds(30, 110, 140, 25);
        l3.setFont(new Font("Tahoma", Font.BOLD, 15));
        p.add(l3);
        
        t3 = new JTextField();
        t3.setBounds(190, 110, 270, 25);
        t3.setBorder(BorderFactory.createEmptyBorder());
        t3.setFont(new Font("Tahoma", Font.PLAIN, 14));
        p.add(t3);
        
        JLabel l4 = new JLabel("Answer");
        l4.setBounds(30, 150, 140, 25);
        l4.setFont(new Font("Tahoma", Font.BOLD, 15));
        p.add(l4);
        
        b2 = new JButton("Retrieve");
        b2.setBounds(340, 150, 120, 25);
        b2.addActionListener(this);
        b2.setBackground(Color.GRAY);
        b2.setForeground(Color.WHITE);
        p.add(b2);
        
        t4 = new JTextField();
        t4.setBounds(190, 150, 120, 25);
        t4.setBorder(BorderFactory.createEmptyBorder());
        t4.setFont(new Font("Tahoma", Font.PLAIN, 14));
        p.add(t4);
        
        
        JLabel l5 = new JLabel("Password");
        l5.setBounds(30, 190, 140, 25);
        l5.setFont(new Font("Tahoma", Font.BOLD, 15));
        p.add(l5);
        
        t5 = new JTextField();
        t5.setBounds(190, 190, 120, 25);
        t5.setBorder(BorderFactory.createEmptyBorder());
        t5.setFont(new Font("Tahoma", Font.PLAIN, 14));
        p.add(t5);
        
        
        b3 = new JButton("Back");
        b3.setBounds(100, 230, 120, 25);
        b3.addActionListener(this);
        b3.setBackground(Color.GRAY);
        b3.setForeground(Color.WHITE);
        p.add(b3);
        
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/forgotpassword.jpg"));
        Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l6 = new JLabel(i3);
        l6.setBounds(560, 80, 200, 200);
        add(l6);
        
        
        
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == b1){
            try{
                Conn con = new Conn();
                String sql = "Select * from account where username = '" + t1.getText() + "'";
                ResultSet rs = con.s.executeQuery(sql);
                if(rs.next() == false){
                    JOptionPane.showMessageDialog(null, "Invalid Username");
                    t1.setText("");
                    t2.setText("");
                    t3.setText("");
                }else{
                    String name = rs.getString(2);
                    String sq = rs.getString(4);
                    t2.setText(name);
                    t3.setText(sq);
                }
            }catch(Exception e){
                    System.out.println(e);
            }
                
        }else if(ae.getSource() == b2){
            try{
                Conn con = new Conn();
                String sql = "Select * from account where username = '" + t1.getText() + "'and answer = '" + t4.getText() + "'";
                ResultSet rs = con.s.executeQuery(sql);

                if(rs.next() == false){
                    JOptionPane.showMessageDialog(null, "Wrong Answer");
                    t4.setText("");
                }else{
                    t5.setText(rs.getString(3));
                }
            }catch(Exception e){
                System.out.println(e);
            }
            
            
        }else if(ae.getSource() == b3){
            this.setVisible(false);
            new Login().setVisible(true);
        }
    }
    
    public static void main(String[] args){
        new ForgotPassword().setVisible(true);
    }
}
