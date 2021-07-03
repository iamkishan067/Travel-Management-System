package travel.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;


public class UpdateCustomer extends JFrame implements ActionListener{
    JTextField t2, t3, t4, t5, t6, t7;
    JComboBox c1;
    JRadioButton male, female;
    ButtonGroup group;
    JButton b1, b2;
    String username;
    UpdateCustomer(String username){
        this.username = username;
        
        setBounds(600, 300, 800, 500);
        setTitle("Update Customer Details");
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        
        JLabel l11 = new JLabel("Update Customer");
        l11.setFont(new Font("Tahoma", Font.PLAIN, 20));
        l11.setBounds(120 , 0, 300, 30);
        add(l11);
        
        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBounds(0, 0, 400, 500);
        p1.setBackground(Color.WHITE);
        add(p1);
        
        JLabel l1 = new JLabel("Username  : ");
        l1.setBounds(40, 30, 150, 25);
        l1.setFont(new Font("Raleway", Font.BOLD, 15));
        p1.add(l1);
        
        
        JLabel tu1 = new JLabel();
        tu1.setBounds(230, 30, 150, 25);
        tu1.setFont(new Font("Tahoma", Font.PLAIN, 15));
        p1.add(tu1);
        
        
        JLabel l2 = new JLabel("ID  : ");
        l2.setBounds(40, 70, 150, 25);
        l2.setFont(new Font("Raleway", Font.BOLD, 15));
        p1.add(l2);
        
        String[] idList = {"Passport", "Pan Card", "Aadhaar Card", "Ration Card"};
        
        c1 = new JComboBox(idList);
        c1.setBounds(230, 70, 150, 25);
        p1.add(c1);
        
        
        JLabel l3 = new JLabel("Document's Number  : ");
        l3.setBounds(40, 110, 150, 25);
        l3.setFont(new Font("Raleway", Font.BOLD, 15));
        p1.add(l3);
        
        
        t2 = new JTextField();
        t2.setBounds(230, 110, 150, 25);
        t2.setFont(new Font("Tahoma", Font.PLAIN, 15));
        p1.add(t2);
        
        
        JLabel l4 = new JLabel("Name  : ");
        l4.setBounds(40, 150, 150, 25);
        l4.setFont(new Font("Raleway", Font.BOLD, 15));
        p1.add(l4);
        
        
        t3 = new JTextField();
        t3.setBounds(230, 150, 150, 25);
        t3.setFont(new Font("Tahoma", Font.PLAIN, 15));
        p1.add(t3);
        
        
        JLabel l5 = new JLabel("Gender  : ");
        l5.setBounds(40, 190, 150, 25);
        l5.setFont(new Font("Raleway", Font.BOLD, 15));
        p1.add(l5);
        
        male = new JRadioButton("Male");
        male.setBackground(Color.WHITE);
        male.setBounds(230, 190, 80, 25);
        p1.add(male);
        
        female = new JRadioButton("Female");
        female.setBackground(Color.WHITE);
        female.setBounds(320, 190, 80, 25);
        p1.add(female);
       
        
        group = new ButtonGroup();
        group.add(male);
        group.add(female);
        
        
        JLabel l6 = new JLabel("Country  : ");
        l6.setBounds(40, 230, 150, 25);
        l6.setFont(new Font("Raleway", Font.BOLD, 15));
        p1.add(l6);
        
        
        t4 = new JTextField();
        t4.setBounds(230, 230, 150, 25);
        t4.setFont(new Font("Tahoma", Font.PLAIN, 15));
        p1.add(t4);
        
        
        JLabel l7 = new JLabel("Address  : ");
        l7.setBounds(40, 270, 150, 25);
        l7.setFont(new Font("Raleway", Font.BOLD, 15));
        p1.add(l7);
        
        
        t5 = new JTextField();
        t5.setBounds(230, 270, 150, 25);
        t5.setFont(new Font("Tahoma", Font.PLAIN, 15));
        p1.add(t5);
        
        
        JLabel l8 = new JLabel("Phone  : ");
        l8.setBounds(40, 310, 150, 25);
        l8.setFont(new Font("Raleway", Font.BOLD, 15));
        p1.add(l8);
        
        
        t6 = new JTextField();
        t6.setBounds(230, 310, 150, 25);
        t6.setFont(new Font("Tahoma", Font.PLAIN, 15));
        p1.add(t6);
        
        
        JLabel l9 = new JLabel("Email  : ");
        l9.setBounds(40, 350, 150, 25);
        l9.setFont(new Font("Raleway", Font.BOLD, 15));
        p1.add(l9);
        
        
        t7 = new JTextField();
        t7.setBounds(230, 350, 150, 25);
        t7.setFont(new Font("Tahoma", Font.PLAIN, 15));
        p1.add(t7);
        
        
        b1 = new JButton("Update");
        b1.setBounds(55, 390, 140, 25);
        b1.setBackground(new Color(133,193,203));
        b1.addActionListener(this);
        b1.setForeground(Color.WHITE);
        p1.add(b1);
        
        
        b2 = new JButton("BACK");
        b2.setBounds(215, 390, 140, 25);
        b2.setBackground(new Color(133,193,203));
        b2.addActionListener(this);
        b2.setForeground(Color.WHITE);
        p1.add(b2);
        
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/update.png"));
        Image i2 = i1.getImage().getScaledInstance(200, 300, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        
        JLabel l10 = new JLabel(i3);
        l10.setBounds(400, 40, 400, 400);
        add(l10);
        
        
        try{
            Conn con = new Conn();
            String sql = "select * from customer where username = '" + username + "'";

            ResultSet rs = con.s.executeQuery(sql);
            while(rs.next()){
                tu1.setText(rs.getString("username"));
                c1.setSelectedItem(rs.getString("id_type"));
                t2.setText(rs.getString("number"));
                t3.setText(rs.getString("name"));
                
                if(rs.getString("gender").compareTo("male") == 0) male.setSelected(true);
                else if(rs.getString("gender").compareTo("female") == 0)female.setSelected(true);
                
                
                
                t4.setText(rs.getString("country"));
                t5.setText(rs.getString("address"));
                t6.setText(Long.toString(rs.getLong("phone")));
                t7.setText(rs.getString("email"));
               

               
            }
        }catch(Exception e){}
        
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == b1){
            
            String id_type = (String) c1.getSelectedItem(); 
            String number = t2.getText();
            String name = t3.getText();
            String gender = "" ;
            if(male.isSelected()) gender = "male";
            else if(female.isSelected()) gender = "female";
 
            
            String country = t4.getText();
            String address = t5.getText();
            
            if(t6.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Phone Field Cannot be left empty");
                this.setVisible(false);
                new AddCustomer(username).setVisible(true);
                return;
            }else{
                try{
                    long phone = Long.parseLong(t6.getText());
                }catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Please enter numeric value in Phone Field");
                     this.setVisible(false);
                     new AddCustomer(username).setVisible(true);
                     return;
                }
            }
            
            long phone = Long.parseLong(t6.getText());
            String email = t7.getText();
            
            String sql = "update customer set id_type =  '" + id_type + "' , number = '" + number + "' , name = '"+ name + "' , gender = '"+ gender + "' , country = '"+ country + "' ,address = '"+ address + "' , phone = '"+ phone+ "' , email ='"+ email + "' where username = '" + username+ "'";
            try{
                Conn con = new Conn();
                con.s.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Details Updated Successfully");
                this.setVisible(false);
            }catch(Exception e){
                System.out.println(e);
                JOptionPane.showMessageDialog(null, "Something went wrong");
            }
            
            
        }else if(ae.getSource() == b2){
            this.setVisible(false);
        }
    }
    
    public static void main(String[] args){
        new UpdateCustomer("").setVisible(true);
    }
    
}
