/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travel.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DashBoard extends JFrame implements ActionListener{
    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11,b12, b13, b14;
    String username;
    
    DashBoard(String username){
        this.username = username;
        
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setBackground(Color.WHITE);
        setTitle("Dashboard");
        setLayout(null);
        
        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBackground(new Color(100,190,200));
        p1.setBounds(0, 0, 1980, 90);
        add(p1);
        
        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/logo.png"));
        Image i5 = i4.getImage().getScaledInstance(110, 110, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        
        JLabel l2 = new JLabel(i6);
        l2.setBounds(10, 0, 110, 110);
        p1.add(l2);
        
        JLabel l3 = new JLabel("Dashborad");
        l3.setBounds(140, 0, 400, 110);
        l3.setForeground(Color.WHITE);
        l3.setFont(new Font("Raleway", Font.PLAIN, 60));
        p1.add(l3);
        
        JPanel p2 = new JPanel();
        p2.setLayout(null);
        p2.setBackground(new Color(0,0,102));
        p2.setBounds(0, 60, 200, 1000);
        add(p2);
        
        b1 = new JButton("Add Personal Details");
        b1.setBounds(0, 30, 200, 50);
        b1.setForeground(Color.WHITE);
        b1.setBackground(new Color(0,0,102));
        b1.addActionListener(this);
//        b1.setMargin(new Insets(20,0,0,50));//(top,left, bottom, right)
        b1.setFont(new Font("Tahoma", Font.PLAIN, 15));
        p2.add(b1);
        
        
        b2 = new JButton("Update Personal Details");
        b2.setBounds(0, 80, 200, 50);
        b2.setForeground(Color.WHITE);
        b2.setBackground(new Color(0,0,102));
        b2.addActionListener(this);
        b2.setFont(new Font("Tahoma", Font.PLAIN, 15));
        p2.add(b2);
        
        b3 = new JButton("View Details");
        b3.setBounds(0, 130, 200, 50);
        b3.setForeground(Color.WHITE);
        b3.setBackground(new Color(0,0,102));
        b3.addActionListener(this);
        b3.setFont(new Font("Tahoma", Font.PLAIN, 15));
        p2.add(b3);
        
        
        b4 = new JButton("Delete Personal Details");
        b4.setBounds(0, 180, 200, 50);
        b4.setForeground(Color.WHITE);
        b4.setBackground(new Color(0,0,102));
        b4.addActionListener(this);
        b4.setFont(new Font("Tahoma", Font.PLAIN, 15));
        p2.add(b4);
        
        b5 = new JButton("Check Package");
        b5.setBounds(0, 230, 200, 50);
        b5.setForeground(Color.WHITE);
        b5.setBackground(new Color(0,0,102));
        b5.addActionListener(this);
        b5.setFont(new Font("Tahoma", Font.PLAIN, 15));
        p2.add(b5);
        
        b6 = new JButton("Book Package");
        b6.setBounds(0, 280, 200, 50);
        b6.setForeground(Color.WHITE);
        b6.setBackground(new Color(0,0,102));
        b6.addActionListener(this);
        b6.setFont(new Font("Tahoma", Font.PLAIN, 15));
        p2.add(b6);
        
        b7 = new JButton("View Booked Package");
        b7.setBounds(0, 330, 200, 50);
        b7.setForeground(Color.WHITE);
        b7.setBackground(new Color(0,0,102));
        b7.addActionListener(this);
        b7.setFont(new Font("Tahoma", Font.PLAIN, 15));
        p2.add(b7);
        
        b8 = new JButton("View Hotels");
        b8.setBounds(0, 380, 200, 50);
        b8.setForeground(Color.WHITE);
        b8.setBackground(new Color(0,0,102));
        b8.addActionListener(this);
        b8.setFont(new Font("Tahoma", Font.PLAIN, 15));
        p2.add(b8);
        
        b9 = new JButton("Book Hotel");
        b9.setBounds(0, 430, 200, 50);
        b9.setForeground(Color.WHITE);
        b9.setBackground(new Color(0,0,102));
        b9.addActionListener(this);
        b9.setFont(new Font("Tahoma", Font.PLAIN, 15));
        p2.add(b9);
        
        b10 = new JButton("View Booked Hotel");
        b10.setBounds(0, 480, 200, 50);
        b10.setForeground(Color.WHITE);
        b10.setBackground(new Color(0,0,102));
        b10.addActionListener(this);
        b10.setFont(new Font("Tahoma", Font.PLAIN, 15));
        p2.add(b10);
        
        b11 = new JButton("Destinations");
        b11.setBounds(0, 530, 200, 50);
        b11.setForeground(Color.WHITE);
        b11.setBackground(new Color(0,0,102));
        b11.addActionListener(this);
        b11.setFont(new Font("Tahoma", Font.PLAIN, 15));
        p2.add(b11);
        
        b12 = new JButton("Calculator");
        b12.setBounds(0, 580, 200, 50);
        b12.setForeground(Color.WHITE);
        b12.setBackground(new Color(0,0,102));
        b12.addActionListener(this);
        b12.setFont(new Font("Tahoma", Font.PLAIN, 15));
        p2.add(b12);
        
        b13 = new JButton("Notepad");
        b13.setBounds(0, 630, 200, 50);
        b13.setForeground(Color.WHITE);
        b13.setBackground(new Color(0,0,102));
        b13.addActionListener(this);
        b13.setFont(new Font("Tahoma", Font.PLAIN, 15));
        p2.add(b13);
        
        b14 = new JButton("About");
        b14.setBounds(0, 680, 200, 50);
        b14.setForeground(Color.WHITE);
        b14.setBackground(new Color(0,0,102));
        b14.addActionListener(this);
        b14.setFont(new Font("Tahoma", Font.PLAIN, 15));
        p2.add(b14);
        
        
        
        
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/home.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1920, 1080, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        
        JLabel l1 = new JLabel(i3);
        l1.setBounds(0, 0, 1920, 1080);
        l1.setLayout(null);
        add(l1);
        
        JLabel l4 = new JLabel("Travel and Tourism Management System");
        l4.setBounds(480, 55, 1300, 250);
        l4.setForeground(Color.white);
        l4.setFont(new Font("Tahoma", Font.PLAIN, 60));
        l1.add(l4);
        
        
        
        
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == b12){
            try{
                Runtime.getRuntime().exec("calc.exe");
            }catch(Exception e){}
        }else if(ae.getSource() == b13){
            try{
                Runtime.getRuntime().exec("notepad.exe");
            }catch(Exception e){}
        }else if(ae.getSource() == b1){
            new AddCustomer(username).setVisible(true);
        }else if(ae.getSource() == b2){
            new UpdateCustomer(username).setVisible(true);
        }else if(ae.getSource() == b3){
            new ViewCustomer(username).setVisible(true);
        }else if(ae.getSource() == b4){
            new DeleteCustomer(username).setVisible(true);
        }else if(ae.getSource() == b5){
            new CheckPackage().setVisible(true);
        }else if(ae.getSource() == b6){
            new BookPackage(username).setVisible(true);
        }else if(ae.getSource() == b7){
            new ViewBookedPackage(username).setVisible(true);
        }else if(ae.getSource() == b8){
            new ViewHotels().setVisible(true);
        }else if(ae.getSource() == b11){
            new Destinations().setVisible(true);
        }else if(ae.getSource() == b9){
            new BookHotel(username).setVisible(true);
        }else if(ae.getSource() == b10){
            new ViewBookedHotel(username).setVisible(true);
        }else if(ae.getSource() == b14){
            new About().setVisible(true);
        }
    }
    
    public static void main(String[] args){
        new DashBoard("").setVisible(true);
    }
}
