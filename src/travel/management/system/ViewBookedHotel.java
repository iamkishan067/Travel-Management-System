package travel.management.system;
import java.awt.*;
import javax.swing.border.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class ViewBookedHotel extends JFrame implements ActionListener{
    JButton b1, b2, b3;
    JLabel l15 ,c1, l3, l9, l11, l13, l16, l17,c2, c3, c4, c5;
    String username;
    
    ViewBookedHotel(String username){
        this.username = username;
        
        setBounds(580, 270, 900, 550);
        setTitle("View Booked Hotel");
        setLayout(null);
        
        JPanel p1 = new JPanel();
        p1.setBackground(Color.WHITE);
        p1.setLayout(null);
        p1.setBounds(0, 0, 900, 550);
        add(p1);
        
        JLabel l1 = new JLabel("BOOKED HOTEL");
        l1.setFont(new Font("Raleway", Font.BOLD, 25));
        l1.setBounds(320, 5, 300,40);
        p1.add(l1);
        
        JLabel l2 = new JLabel("Username  : ");
        l2.setFont(new Font("Tahoma", Font.PLAIN, 17));
        l2.setBounds(50, 60, 200,30);
        p1.add(l2);
        
        l3 = new JLabel("");
        l3.setForeground(new Color(133,193,233));
        l3.setFont(new Font("Tahoma", Font.PLAIN, 17));
        l3.setBounds(220, 60, 200,30);
        p1.add(l3);
        
        JLabel l4 = new JLabel("Selected Hotel  : ");
        l4.setFont(new Font("Tahoma", Font.PLAIN, 17));
        l4.setBounds(50, 100, 200,30);
        p1.add(l4);
        
        c1 = new JLabel();
        c1.setBounds(220, 100, 215, 30);
        c1.setBackground(Color.WHITE);
        c1.setForeground(new Color(133,193,233));
        c1.setFont(new Font("Tahoma", Font.PLAIN, 17));
        c1.setFont(new Font("Tahoma", Font.PLAIN, 17));
        p1.add(c1);
        
        
        JLabel l6 = new JLabel("Total Person  : ");
        l6.setFont(new Font("Tahoma", Font.PLAIN, 17));
        l6.setBounds(50, 140, 160,30);
        p1.add(l6);
        
        
        c2 = new JLabel();
        c2.setForeground(new Color(133,193,233));
        c2.setBackground(Color.WHITE);
        c2.setFont(new Font("Tahoma", Font.PLAIN, 17));
        c2.setBounds(220, 140, 160,30);
        p1.add(c2);
        
        
        l16 = new JLabel("No of Days  : ");
        l16.setFont(new Font("Tahoma", Font.PLAIN, 17));
        l16.setBounds(50, 180, 160,30);
        p1.add(l16);
        
        
        c3 = new JLabel();
        c3.setForeground(new Color(133,193,233));
        c3.setBackground(Color.WHITE);
        c3.setFont(new Font("Tahoma", Font.PLAIN, 17));
        c3.setBounds(220, 180, 160,30);
        p1.add(c3);
        
        l17 = new JLabel("AC / Non AC  : ");
        l17.setFont(new Font("Tahoma", Font.PLAIN, 17));
        l17.setBounds(50, 220, 160,30);
        p1.add(l17);
        
        
        c4 = new JLabel();
        c4.setForeground(new Color(133,193,233));
        c4.setBackground(Color.WHITE);
        c4.setFont(new Font("Tahoma", Font.PLAIN, 17));
        c4.setBounds(220, 220, 160,30);
        p1.add(c4);
        
        JLabel l18 = new JLabel("Food Included  : ");
        l18.setFont(new Font("Tahoma", Font.PLAIN, 17));
        l18.setBounds(50, 260, 160,30);
        p1.add(l18);
        
        
        c5 = new JLabel();
        c5.setForeground(new Color(133,193,233));
        c5.setBackground(Color.WHITE);
        c5.setFont(new Font("Tahoma", Font.PLAIN, 17));
        c5.setBounds(220, 260, 160,30);
        p1.add(c5);
        
        
        JLabel l8 = new JLabel("ID  : ");
        l8.setFont(new Font("Tahoma", Font.PLAIN, 17));
        l8.setBounds(50, 300, 200,30);
        p1.add(l8);
        
        l9 = new JLabel("");
        l9.setForeground(new Color(133,193,233));
        l9.setFont(new Font("Tahoma", Font.PLAIN, 17));
        l9.setBounds(220, 300, 200,30);
        p1.add(l9);
        
        JLabel l10 = new JLabel("Document's No  : ");
        l10.setFont(new Font("Tahoma", Font.PLAIN, 17));
        l10.setBounds(50, 340, 200,30);
        p1.add(l10);
        
        l11 = new JLabel("");
        l11.setForeground(new Color(133,193,233));
        l11.setFont(new Font("Tahoma", Font.PLAIN, 17));
        l11.setBounds(220, 340, 200,30);
        p1.add(l11);
        
        JLabel l12 = new JLabel("Phone  : ");
        l12.setFont(new Font("Tahoma", Font.PLAIN, 17));
        l12.setBounds(50, 380, 200,30);
        p1.add(l12);
        
        l13 = new JLabel("");
        l13.setForeground(new Color(133,193,233));
        l13.setFont(new Font("Tahoma", Font.PLAIN, 17));
        l13.setBounds(220, 380, 200,30);
        p1.add(l13);
        
        JLabel l14 = new JLabel("Total Price  : ");
        l14.setFont(new Font("Tahoma", Font.PLAIN, 17));
        l14.setBounds(50, 420, 200,30);
        p1.add(l14);
        
        l15 = new JLabel("");
        l15.setForeground(Color.red);
        l15.setFont(new Font("Tahoma", Font.PLAIN, 17));
        l15.setBounds(220, 420, 200,30);
        p1.add(l15);
        
        
        
        b2 = new JButton("Back");
        b2.setBounds(180, 470, 150, 25);
        b2.setForeground(Color.WHITE);
        b2.setBackground(new Color(133,193,233));
        b2.addActionListener(this);
        p1.add(b2);
        
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/bookedDetails.jpg"));
        Image i2 = i1.getImage().getScaledInstance(430, 370, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        
        JLabel l116 = new JLabel(i3);
        l116.setBounds(435, 70, 430, 370);
        p1.add(l116);
        
        try{
            Conn con = new Conn();
            String sql = "select * from bookhotel where username = '" + username + "'";
            ResultSet rs = con.s.executeQuery(sql);
                        
            while(rs.next()){
                l3.setText(rs.getString("username"));
                c1.setText(rs.getString(2));
                c2.setText(rs.getString(3));
                c3.setText(rs.getString(4));
                c4.setText(rs.getString(5));
                c5.setText(rs.getString(6));
                l15.setText(rs.getString(7));
                
            }
            
            String sql1 = "select * from customer where username = '" + username + "'";
            ResultSet rs1 = con.s.executeQuery(sql1);
                  
            
            while(rs1.next()){
                l9.setText(rs1.getString(2));
                l11.setText(rs1.getString(3));
                l13.setText(rs1.getString("phone"));      
            }
            
            
        }catch(Exception e){}

    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()  == b2){
            this.setVisible(false);
        }
        

    }
    
    public static void main(String[] args){
        new ViewBookedHotel("").setVisible(true);
    }
}
