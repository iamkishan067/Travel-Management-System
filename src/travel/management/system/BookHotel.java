package travel.management.system;
import java.awt.*;
import javax.swing.border.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class BookHotel extends JFrame implements ActionListener{
    JButton b1, b2, b3;
    JComboBox c1;
    Choice c2, c3, c4, c5;
    JLabel l15 , l3, l9, l11, l13, l16, l17;
    String username;
    
    BookHotel(String username){
        this.username = username;
        
        setBounds(580, 270, 900, 550);
        setTitle("Book Hotel");
        setLayout(null);
        
        JPanel p1 = new JPanel();
        p1.setBackground(Color.WHITE);
        p1.setLayout(null);
        p1.setBounds(0, 0, 900, 550);
        add(p1);
        
        JLabel l1 = new JLabel("BOOK HOTEL");
        l1.setFont(new Font("Raleway", Font.BOLD, 25));
        l1.setBounds(320, 5, 300,40);
        p1.add(l1);
        
        JLabel l2 = new JLabel("Username  : ");
        l2.setFont(new Font("Tahoma", Font.PLAIN, 17));
        l2.setBounds(50, 60, 200,30);
        p1.add(l2);
        
        l3 = new JLabel("");
        l3.setFont(new Font("Tahoma", Font.PLAIN, 17));
        l3.setBounds(220, 60, 200,30);
        p1.add(l3);
        
        JLabel l4 = new JLabel("Select Hotel  : ");
        l4.setFont(new Font("Tahoma", Font.PLAIN, 17));
        l4.setBounds(50, 100, 200,30);
        p1.add(l4);
        
        c1 = new JComboBox();
        try{
            Conn con = new Conn();
            ResultSet rs = con.s.executeQuery("Select * from hotels");
            while(rs.next()){
                c1.addItem(rs.getString("name"));
            }
        }catch(Exception e){}
        c1.setBounds(220, 100, 215, 30);
        c1.setBackground(Color.WHITE);
        c1.setFont(new Font("Tahoma", Font.PLAIN, 17));
        c1.setFont(new Font("Tahoma", Font.PLAIN, 17));
        p1.add(c1);
        
        
        JLabel l6 = new JLabel("Total Person  : ");
        l6.setFont(new Font("Tahoma", Font.PLAIN, 17));
        l6.setBounds(50, 140, 160,30);
        p1.add(l6);
        
        
        c2 = new Choice();
        for(int i = 1; i <= 100; i++){
            c2.add(Integer.toString(i));
        }
        c2.setForeground(new Color(133,193,233));
        c2.setBackground(Color.WHITE);
        c2.setFont(new Font("Tahoma", Font.PLAIN, 17));
        c2.setBounds(220, 140, 160,30);
        p1.add(c2);
        
        
        l16 = new JLabel("No of Days  : ");
        l16.setFont(new Font("Tahoma", Font.PLAIN, 17));
        l16.setBounds(50, 180, 160,30);
        p1.add(l16);
        
        
        c3 = new Choice();
        for(int i = 1; i <= 100; i++){
            c3.add(Integer.toString(i));
        }
        c3.setForeground(new Color(133,193,233));
        c3.setBackground(Color.WHITE);
        c3.setFont(new Font("Tahoma", Font.PLAIN, 17));
        c3.setBounds(220, 180, 160,30);
        p1.add(c3);
        
        l17 = new JLabel("AC / Non AC  : ");
        l17.setFont(new Font("Tahoma", Font.PLAIN, 17));
        l17.setBounds(50, 220, 160,30);
        p1.add(l17);
        
        
        c4 = new Choice();
        c4.add("Yes");
        c4.add("No");
        c4.setForeground(new Color(133,193,233));
        c4.setBackground(Color.WHITE);
        c4.setFont(new Font("Tahoma", Font.PLAIN, 17));
        c4.setBounds(220, 220, 160,30);
        p1.add(c4);
        
        JLabel l18 = new JLabel("Food Included  : ");
        l18.setFont(new Font("Tahoma", Font.PLAIN, 17));
        l18.setBounds(50, 260, 160,30);
        p1.add(l18);
        
        
        c5 = new Choice();
        c5.add("Yes");
        c5.add("No");
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
        l9.setFont(new Font("Tahoma", Font.PLAIN, 17));
        l9.setBounds(220, 300, 200,30);
        p1.add(l9);
        
        JLabel l10 = new JLabel("Document's No  : ");
        l10.setFont(new Font("Tahoma", Font.PLAIN, 17));
        l10.setBounds(50, 340, 200,30);
        p1.add(l10);
        
        l11 = new JLabel("");
        l11.setFont(new Font("Tahoma", Font.PLAIN, 17));
        l11.setBounds(220, 340, 200,30);
        p1.add(l11);
        
        JLabel l12 = new JLabel("Phone  : ");
        l12.setFont(new Font("Tahoma", Font.PLAIN, 17));
        l12.setBounds(50, 380, 200,30);
        p1.add(l12);
        
        l13 = new JLabel("");
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
        
        b1 = new JButton("Check Price");
        b1.setBounds(100, 470, 150, 25);
        b1.setForeground(Color.WHITE);
        b1.setBackground(new Color(133,193,233));
        b1.addActionListener(this);
        p1.add(b1);
        
        b2 = new JButton("Book Hotel");
        b2.setBounds(280, 470, 150, 25);
        b2.setForeground(Color.WHITE);
        b2.setBackground(new Color(133,193,233));
        b2.addActionListener(this);
        p1.add(b2);
        
        b3 = new JButton("Back");
        b3.setBounds(450, 470, 150, 25);
        b3.setForeground(Color.WHITE);
        b3.setBackground(new Color(133,193,233));
        b3.addActionListener(this);
        p1.add(b3);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/book.jpg"));
        Image i2 = i1.getImage().getScaledInstance(430, 370, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        
        JLabel l116 = new JLabel(i3);
        l116.setBounds(435, 70, 430, 370);
        p1.add(l116);
        
        try{
            Conn con = new Conn();
            String sql = "select * from customer where username = '" + username + "'";
            ResultSet rs = con.s.executeQuery(sql);
            
            while(rs.next()){
                l3.setText(rs.getString("username"));
                l9.setText(rs.getString("id_type"));
                l11.setText(rs.getString("number"));
                l13.setText(Long.toString(rs.getLong("phone")));
                
            }
        }catch(Exception e){}
        
        
    }
    
    public void actionPerformed(ActionEvent ae){
        int total = 0;
        try{
               Conn con = new Conn();
               ResultSet rs = con.s.executeQuery("Select * from hotels where name = '" + c1.getSelectedItem()+"'");
               while(rs.next()){
                   int cost_per_day = rs.getInt(2);
                   int food_charges = rs.getInt(3);
                   int ac_charges = rs.getInt(4);
                   
                   String food_status = c4.getSelectedItem();
                   String ac_status = c5.getSelectedItem();
                   
                   int persons = c2.getSelectedIndex() + 1;
                   int days = c3.getSelectedIndex() + 1;
                   
                   if(persons * days > 0){
                       
                       total += cost_per_day;
                       total += food_status.equals("Yes") ? food_charges : 0;
                       total += ac_status.equals("Yes") ? ac_charges : 0;
                       
                       total *= persons;
                       total *= days;                                         
                   }
                   
               }
           }catch(Exception e){}
       
        if(ae.getSource()  == b3){
            
            this.setVisible(false);
            
        }else if(ae.getSource() == b1){
           
            l15.setText("" + total);
            
        }else if(ae.getSource() == b2){
            
            try{
                String sql = "insert into bookhotel values('" + username + "' , '" + c1.getSelectedItem().toString() + "' , '" + c2.getSelectedItem().toString() + "' , '" + c3.getSelectedItem().toString() + "' , '" + c4.getSelectedItem().toString() + "' , '" + c5.getSelectedItem().toString()+"', '"+ total + "')"; 
                
                Conn con = new Conn();
                con.s.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Hotels Booked Successfully!");
                this.setVisible(false);
            }catch(Exception e){
                System.out.println("Problemo");
                JOptionPane.showMessageDialog(null, "Something went wrong!!");
            }
        }
        

    }
    
    public static void main(String[] args){
        new BookHotel("").setVisible(true);
    }
}
