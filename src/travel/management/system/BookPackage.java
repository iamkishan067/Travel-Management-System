package travel.management.system;
import java.awt.*;
import javax.swing.border.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class BookPackage extends JFrame implements ActionListener{
    JButton b1, b2, b3;
    JComboBox c1;
    Choice c2;
    JLabel l15 , l3, l9, l11, l13;
    String username;
    
    BookPackage(String username){
        this.username = username;
        
        setBounds(580, 270, 900, 450);
        setTitle("Book Package");
        setLayout(null);
        
        
        JPanel p1 = new JPanel();
        p1.setBackground(Color.WHITE);
        p1.setLayout(null);
        p1.setBounds(0, 0, 900, 450);
        add(p1);
        
        JLabel l1 = new JLabel("BOOK PACKAGE");
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
        
        JLabel l4 = new JLabel("Select Package  : ");
        l4.setFont(new Font("Tahoma", Font.PLAIN, 17));
        l4.setBounds(50, 100, 200,30);
        p1.add(l4);
        
        c1 = new JComboBox(new String[] {"Gold Package" , "Silver Package", "Bronze Package"});
        c1.setBounds(220, 100, 160, 30);
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
        
        JLabel l8 = new JLabel("ID  : ");
        l8.setFont(new Font("Tahoma", Font.PLAIN, 17));
        l8.setBounds(50, 180, 200,30);
        p1.add(l8);
        
        l9 = new JLabel("");
        l9.setFont(new Font("Tahoma", Font.PLAIN, 17));
        l9.setBounds(220, 180, 200,30);
        p1.add(l9);
        
        JLabel l10 = new JLabel("Document's No  : ");
        l10.setFont(new Font("Tahoma", Font.PLAIN, 17));
        l10.setBounds(50, 220, 200,30);
        p1.add(l10);
        
        l11 = new JLabel("");
        l11.setFont(new Font("Tahoma", Font.PLAIN, 17));
        l11.setBounds(220, 220, 200,30);
        p1.add(l11);
        
        JLabel l12 = new JLabel("Phone  : ");
        l12.setFont(new Font("Tahoma", Font.PLAIN, 17));
        l12.setBounds(50, 260, 200,30);
        p1.add(l12);
        
        l13 = new JLabel("");
        l13.setFont(new Font("Tahoma", Font.PLAIN, 17));
        l13.setBounds(220, 260, 200,30);
        p1.add(l13);
        
        JLabel l14 = new JLabel("Total Price  : ");
        l14.setFont(new Font("Tahoma", Font.PLAIN, 17));
        l14.setBounds(50, 300, 200,30);
        p1.add(l14);
        
        l15 = new JLabel("");
        l15.setForeground(Color.red);
        l15.setFont(new Font("Tahoma", Font.PLAIN, 17));
        l15.setBounds(220, 300, 200,30);
        p1.add(l15);
        
        b1 = new JButton("Check Package");
        b1.setBounds(100, 370, 150, 25);
        b1.setForeground(Color.WHITE);
        b1.setBackground(new Color(133,193,233));
        b1.addActionListener(this);
        p1.add(b1);
        
        b2 = new JButton("Book Package");
        b2.setBounds(280, 370, 150, 25);
        b2.setForeground(Color.WHITE);
        b2.setBackground(new Color(133,193,233));
        b2.addActionListener(this);
        p1.add(b2);
        
        b3 = new JButton("Back");
        b3.setBounds(450, 370, 150, 25);
        b3.setForeground(Color.WHITE);
        b3.setBackground(new Color(133,193,233));
        b3.addActionListener(this);
        p1.add(b3);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/bookpackage.jpg"));
        Image i2 = i1.getImage().getScaledInstance(380, 300, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        
        JLabel l16 = new JLabel(i3);
        l16.setBounds(470, 50, 380, 300);
        p1.add(l16);
        
        try{
            Conn con = new Conn();
            String sql = "select * from customer where username = '" + username + "'";
            ResultSet rs = con.s.executeQuery(sql);
            
            while(rs.next()){
                l3.setText(rs.getString("username"));
                l9.setText(rs.getString("id_type"));
                l11.setText(rs.getString("number"));
                l13.setText("" + rs.getLong("phone"));
                
            }
        }catch(Exception e){}
        
        
    }
    
    public void actionPerformed(ActionEvent ae){
        int price = 0;
            if(c1.getSelectedItem().equals("Gold Package")){
                price += 12000;
            }else if(c1.getSelectedItem().equals("Silver Package")){
                price += 25000;
            }else if(c1.getSelectedItem().equals("Bronze Package")){
                price += 32000;
            }         
//          int person = Integer.parseInt(c2.getSelectedItem());
            int person = c2.getSelectedIndex() + 1;
            
            int totalprice = price * person;
        
            if(ae.getSource()  == b3){
            
            this.setVisible(false);
            
        }else if(ae.getSource() == b1){
           
            l15.setText(Integer.toString(totalprice));    
            
        }else if(ae.getSource() == b2){
            
            try{
                String sql = "insert into bookpackage values('" + l3.getText() + "' , '" + c1.getSelectedItem().toString() + "' , '" + c2.getSelectedItem().toString() + "' , '" + l9.getText() + "' , '" + l11.getText() + "' , '" + l13.getText() + "' , '" + totalprice + "')"; 
                
                Conn con = new Conn();
                con.s.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Package Booked Successfully!");
                this.setVisible(false);
            }catch(Exception e){
                
            }
        }
        

    }
    
    public static void main(String[] args){
        new BookPackage("").setVisible(true);
    }
}
