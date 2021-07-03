package travel.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;


public class ViewCustomer extends JFrame implements ActionListener{
    
    JButton  b2;
    String username;
    ViewCustomer(String username){
        this.username = username;
        
        setBounds(600, 300, 880, 500);
        setTitle("Viw Customer Details");
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        
        JLabel l0 = new JLabel("View Customer's Details");
        l0.setFont(new Font("Tahoma", Font.BOLD, 22));
        l0.setBounds(280 , 0, 300, 40);
        add(l0);
        
        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBounds(0, 0, 880, 500);
        p1.setBackground(Color.WHITE);
        add(p1);
        
        JLabel l1 = new JLabel("Username  : ");
        l1.setBounds(50, 50, 200, 25);
        l1.setFont(new Font("Raleway", Font.PLAIN, 15));
        p1.add(l1);
        
        JLabel l2 = new JLabel("");
        l2.setBounds(250, 50, 200, 25);
        l2.setFont(new Font("Raleway", Font.PLAIN, 15));
        p1.add(l2);
        
        
        JLabel l3 = new JLabel("ID  : ");
        l3.setBounds(450, 50, 200, 25);
        l3.setFont(new Font("Tahoma", Font.PLAIN, 15));
        p1.add(l3);
        
        JLabel l4 = new JLabel("");
        l4.setBounds(650, 50, 200, 25);
        l4.setFont(new Font("Raleway", Font.PLAIN, 15));
        p1.add(l4);
        
        
        JLabel l5 = new JLabel("Document's Number  : ");
        l5.setBounds(50, 100, 200, 25);
        l5.setFont(new Font("Raleway", Font.PLAIN, 15));
        p1.add(l5);
        
        
        JLabel l6 = new JLabel("");
        l6.setBounds(250, 100, 200, 25);
        l6.setFont(new Font("Tahoma", Font.PLAIN, 15));
        p1.add(l6
        );
        
        JLabel l7 = new JLabel("Name  : ");
        l7.setBounds(450, 100, 200, 25);
        l7.setFont(new Font("Raleway", Font.PLAIN, 15));
        p1.add(l7);
        
        
        JLabel l8 = new JLabel("");
        l8.setBounds(650, 100, 200, 25);
        l8.setFont(new Font("Raleway", Font.PLAIN, 15));
        p1.add(l8);
        
        
        JLabel l9 = new JLabel("Gender  : ");
        l9.setBounds(50, 150, 200, 25);
        l9.setFont(new Font("Raleway", Font.PLAIN, 15));
        p1.add(l9);
        
        
        JLabel l10 = new JLabel("");
        l10.setBounds(250, 150, 200, 25);
        l10.setFont(new Font("Tahoma", Font.PLAIN, 15));
        p1.add(l10);
        
        JLabel l11 = new JLabel("Country  : ");
        l11.setBounds(450, 150, 200, 25);
        l11.setFont(new Font("Raleway", Font.PLAIN, 15));
        p1.add(l11);
        
        
        JLabel l12 = new JLabel("");
        l12.setBounds(650, 150, 200, 25);
        l12.setFont(new Font("Raleway", Font.PLAIN, 15));
        p1.add(l12);
        
        
        JLabel l13 = new JLabel("Address  : ");
        l13.setBounds(50, 200, 200, 25);
        l13.setFont(new Font("Raleway", Font.PLAIN, 15));
        p1.add(l13);
        
        
        JLabel l14 = new JLabel("");
        l14.setBounds(250, 200, 200, 25);
        l14.setFont(new Font("Tahoma", Font.PLAIN, 15));
        p1.add(l14);
        
        JLabel l15 = new JLabel("Phone  : ");
        l15.setBounds(450, 200, 200, 25);
        l15.setFont(new Font("Raleway", Font.PLAIN, 15));
        p1.add(l15);
        
        
        JLabel l16 = new JLabel("");
        l16.setBounds(650, 200, 200, 25);
        l16.setFont(new Font("Raleway", Font.PLAIN, 15));
        p1.add(l16);
 
        
        JLabel l17 = new JLabel("Email  : ");
        l17.setBounds(50, 250, 200, 25);
        l17.setFont(new Font("Raleway", Font.PLAIN, 15));
        p1.add(l17);
        
        
        JLabel l18 = new JLabel("");
        l18.setBounds(250, 250, 200, 25);
        l18.setFont(new Font("Tahoma", Font.PLAIN, 15));
        p1.add(l18);
        
        
        b2 = new JButton("BACK");
        b2.setBounds(350, 300, 140, 25);
        b2.setBackground(new Color(133,193,203));
        b2.addActionListener(this);
        b2.setForeground(Color.WHITE);
        p1.add(b2);
        
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/viewall.jpg"));
        Image i2 = i1.getImage().getScaledInstance(600, 230, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        
        JLabel l100 = new JLabel(i3);
        l100.setBounds(10, 300, 600, 230);
        p1.add(l100);
        
        
        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/viewall.jpg"));
        Image i5 = i4.getImage().getScaledInstance(600, 230, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        
        JLabel l200 = new JLabel(i6);
        l200.setBounds(610, 300, 600, 230);
        p1.add(l200);
        
        
        try{
            Conn con = new Conn();
            String sql = "select * from customer where username = '" + username + "'";

            ResultSet rs = con.s.executeQuery(sql);
            while(rs.next()){
                l2.setText(rs.getString("username"));
                l4.setText(rs.getString("id_type"));
                l6.setText(rs.getString("number"));
                l8.setText(rs.getString("name"));
                l10.setText(rs.getString("gender"));
                l12.setText(rs.getString("country"));
                l14.setText(rs.getString("address"));
                l16.setText("" + rs.getLong("phone"));
                l18.setText(rs.getString("email"));
            }
        }catch(Exception e){}
        
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == b2){
            this.setVisible(false);
        }
    }
    
    public static void main(String[] args){
        new ViewCustomer("").setVisible(true);
    }
    
}
