package travel.management.system;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.event.*;

public class About extends JFrame implements ActionListener{
    JButton b1;
    About(){
        setBounds(800, 250, 500, 500);
        getContentPane().setBackground(Color.WHITE);
        setTitle("About");
        setLayout(null);
        
        JLabel l = new JLabel("Travel & Tourism Management");
        l.setBounds(110, 20, 400, 40);
        l.setFont(new Font("Tahoma", Font.PLAIN, 20));
        l.setForeground(Color.RED);
        add(l);
        
        String s = "                                                   About Projects          \n  "
                + "\nThe objective of the Travel and Tourism Management System"
                + "project is to develop a system that automates the processes "
                + "and activities of a travel and the purpose is to design a "
                + "system using which one can perform all operations related to "
                + "traveling.\n\n"
                + "This application will help in accessing the information related "
                + "to the travel to the particular destination with great ease. "
                + "The users can track the information related to their tours with "
                + "great ease through this application. The travel agency information "
                + "can also be obtained through this application.\n\n"
                + "Advantages of Project:"
                + "\nGives accurate information"
                + "\nSimplifies the manual work"
                + "\nIt minimizes the documentation related work"
                + "\nProvides up to date information"
                + "\nFriendly Environment by providing warning messages."
                + "\ntravelers details can be provided"
                + "\nbooking confirmation notification"
                ;
        
        TextArea text = new TextArea(s, 10, 40,  Scrollbar.VERTICAL);
        text.setEditable(false);
        text.setBounds(30, 80, 430, 300);
        add(text);
        
        b1 = new JButton("Exit");
        b1.setBounds(190,410, 100, 25);
        b1.addActionListener(this);
        add(b1);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == b1){
            this.setVisible(false);
        }
    }
    
    public static void main(String[] args){
        new About().setVisible(true);
    }
}
