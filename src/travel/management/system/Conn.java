/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travel.management.system;
import java.sql.*;
public class Conn {
    Connection con;
    Statement s;
    
    
    Conn(){
       try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tms", "root", "root");// no need to use localhost:3306
            s = con.createStatement();
            
            
       }catch(Exception e){
           System.out.println("Exception Occured");
       }
    }
    
    
    
}
