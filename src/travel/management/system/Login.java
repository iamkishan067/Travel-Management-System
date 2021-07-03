
package travel.management.system;
import javax.swing.*;
import javax.swing.JFrame.*;
import javax.swing.border.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;
import java.sql.*;



class Login extends JFrame implements ActionListener{
    JButton b1, b2, b3;
    JPasswordField t2;
    JTextField t1;
    
    Login(){
        
        setLayout(null);// By default it is BorderLayout. Other than this we have GridLayout , Grid
        getContentPane().setBackground(Color.white);
        setBounds(650, 300, 800, 440);
        setTitle("Login");
        
        JPanel p1 = new JPanel();
        p1.setBounds(0, 0, 400, 400);
        p1.setLayout(null);
        p1.setBackground(new Color(133,193,233));
        add(p1);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/Login101.png"));
        Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(0,0, 400, 400);
        p1.add(l1);
        
        
        JPanel p2 = new JPanel();
        p2.setBounds(400, 30, 400, 340);
        p2.setLayout(null);
        add(p2);
        
        JLabel l2 = new JLabel("Username");
        l2.setBounds(40, 20, 100, 30);
        l2.setFont(new Font("SANS_SERIF", Font.PLAIN, 20));
        p2.add(l2);
        
        t1 = new JTextField();
        t1.setBorder(BorderFactory.createEmptyBorder());
        t1.setBounds(40, 60, 300, 30);
        p2.add(t1);
        
        
        JLabel l3 = new JLabel("Password");
        l3.setBounds(40, 95, 100, 30);
        l3.setFont(new Font("SANS_SERIF", Font.PLAIN, 20));
        p2.add(l3);
        
        t2 = new JPasswordField();
        t2.setBorder(BorderFactory.createEmptyBorder());
        t2.setBounds(40, 140, 300, 30);
        p2.add(t2);
        
        
        b1 = new JButton("Login");
        b1.setBounds(50, 190, 130, 30);
        b1.setBackground(new Color(133,193,233));
        b1.setForeground(Color.white);
        b1.addActionListener(this);
        b1.setBorder(BorderFactory.createEmptyBorder());
        p2.add(b1);
        
        
        b2 = new JButton("SignUp");
        b2.setBounds(200, 190, 130, 30);
        b2.setForeground(new Color(133,193,233));
        b2.setBackground(Color.white);
        b2.addActionListener(this);
        b2.setBorder(new LineBorder(new Color(133,193,233)));
        p2.add(b2);
        
        b3 = new JButton("Forget Password");
        b3.setBounds(120, 230, 150, 30);
        b3.setForeground(new Color(133,193,233));
        b3.setBackground(Color.white);
        b3.addActionListener(this);
        b3.setBorder(new LineBorder(new Color(133,193,233)));
        p2.add(b3);
        
        
        JLabel l4 = new JLabel("Trouble in Logging...");
        l4.setBounds(220, 260, 180, 30);
        l4.setForeground(Color.red);
        l4.setFont(new Font("SANS_SERIF", Font.PLAIN, 12));
        p2.add(l4);
//        setUndecorated(true);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == b1){
            try{
                String username = t1.getText();
                String pass = "";
                for(char c : t2.getPassword()){
                    pass = pass + c;
                }
                Conn con = new Conn();
                String sql = "Select * from account where username = '" + username + "' and password = '" + pass + "'";
                ResultSet rs = con.s.executeQuery(sql);
                if(rs.next()){
                    this.setVisible(false);
                    new Loading(username).setVisible(true);
                }else{
                    JOptionPane.showMessageDialog(null, "Invalid Login Info");
                    t1.setText("");
                    t2.setText("");
                }
            }catch(Exception e){}
            
            
        }else if(ae.getSource() == b2){
            new Signup().setVisible(true);
            this.setVisible(false);
        }else if(ae.getSource() == b3){
            this.setVisible(false);
            new ForgotPassword().setVisible(true);
        }
    }
    
    public static void main(String[] args){
        new Login();
    }
}
