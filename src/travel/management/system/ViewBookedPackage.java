package travel.management.system;
import java.awt.*;
import javax.swing.border.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class ViewBookedPackage extends JFrame implements ActionListener{
    JButton b2;
    JLabel l15 ,c1, c2, l3, l9, l11, l13;
    String username;
    
    ViewBookedPackage(String username){
        this.username = username;
        
        setBounds(580, 270, 950, 550);
        setTitle("View Booked Package");
        setLayout(null);
        
        JPanel p1 = new JPanel();
        p1.setBackground(Color.WHITE);
        p1.setLayout(null);
        p1.setBounds(0, 0, 950, 550);
        add(p1);
        
        JLabel l1 = new JLabel("BOOKED PACKAGE");
        l1.setFont(new Font("Raleway", Font.BOLD, 28));
        l1.setBounds(300, 5, 300,40);
        p1.add(l1);
        
        JLabel l2 = new JLabel("Username  : ");
        l2.setFont(new Font("Tahoma", Font.PLAIN, 22));
        l2.setBounds(50, 60, 200,40);
        p1.add(l2);
        
        l3 = new JLabel("");
        l3.setFont(new Font("Tahoma", Font.PLAIN, 22));
        l3.setBounds(250, 60, 200,40);
        p1.add(l3);
        
        JLabel l4 = new JLabel("Booked Package  : ");
        l4.setFont(new Font("Tahoma", Font.PLAIN, 22));
        l4.setBounds(50, 120, 200,40);
        p1.add(l4);
        
        c1 = new JLabel();
        c1.setBounds(250, 120, 160, 40);
        c1.setBackground(Color.WHITE);
        c1.setFont(new Font("Tahoma", Font.PLAIN, 22));
        p1.add(c1);
        
        
        JLabel l6 = new JLabel("Total Person  : ");
        l6.setFont(new Font("Tahoma", Font.PLAIN, 22));
        l6.setBounds(50, 180, 160,40);
        p1.add(l6);
        
        
        c2 = new JLabel();
        c2.setBackground(Color.WHITE);
        c2.setFont(new Font("Tahoma", Font.PLAIN, 22));
        c2.setBounds(250, 180, 160,40);
        p1.add(c2);
        
        JLabel l8 = new JLabel("ID  : ");
        l8.setFont(new Font("Tahoma", Font.PLAIN, 22));
        l8.setBounds(50, 240, 200,40);
        p1.add(l8);
        
        l9 = new JLabel("");
        l9.setFont(new Font("Tahoma", Font.PLAIN, 22));
        l9.setBounds(250, 240, 200,40);
        p1.add(l9);
        
        JLabel l10 = new JLabel("Document's No  : ");
        l10.setFont(new Font("Tahoma", Font.PLAIN, 22));
        l10.setBounds(50, 300, 200,40);
        p1.add(l10);
        
        l11 = new JLabel("");
        l11.setFont(new Font("Tahoma", Font.PLAIN, 22));
        l11.setBounds(250, 300, 200,40);
        p1.add(l11);
        
        JLabel l12 = new JLabel("Phone  : ");
        l12.setFont(new Font("Tahoma", Font.PLAIN, 22));
        l12.setBounds(50, 360, 200,40);
        p1.add(l12);
        
        l13 = new JLabel("");
        l13.setFont(new Font("Tahoma", Font.PLAIN, 22));
        l13.setBounds(250, 360, 200,40);
        p1.add(l13);
        
        JLabel l14 = new JLabel("Total Price  : ");
        l14.setFont(new Font("Tahoma", Font.PLAIN, 22));
        l14.setBounds(50, 420, 200,40);
        p1.add(l14);
        
        l15 = new JLabel("");
        l15.setForeground(Color.red);
        l15.setFont(new Font("Tahoma", Font.PLAIN, 22));
        l15.setBounds(250, 420, 200,40);
        p1.add(l15);
        
        b2 = new JButton("Back");
        b2.setBounds(550, 460, 150, 25);
        b2.setForeground(Color.WHITE);
        b2.setBackground(new Color(133,193,233));
        b2.addActionListener(this);
        p1.add(b2);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/bookpackage.jpg"));
        Image i2 = i1.getImage().getScaledInstance(450, 370, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        
        JLabel l16 = new JLabel(i3);
        l16.setBounds(450, 60, 450, 370);
        p1.add(l16);
        
        try{
            Conn con = new Conn();
            String sql = "select * from bookpackage where username = '" +username + "'";
            ResultSet rs = con.s.executeQuery(sql);
            
            while(rs.next()){
                l3.setText(rs.getString(1));
                c1.setText(rs.getString(2));
                c2.setText(rs.getString(3));
                l9.setText(rs.getString(4));
                l11.setText(rs.getString(5));
                l13.setText(rs.getString(6));
                
                int price = 0;
                if(c1.getText().equals("Gold Package")){
                    price += 12000;
                }else if(c1.getText().equals("Silver Package")){
                    price += 25000;
                }else if(c1.getText().equals("Bronze Package")){
                    price += 32000;
                }    
                
                price *= Integer.parseInt(c2.getText());
                l15.setText(""+price);
                
            }      
        }catch(Exception e){}
        
        
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()  == b2){
            this.setVisible(false);
        }
    }
    
    public static void main(String[] args){
        new ViewBookedPackage("").setVisible(true);
    }
}
