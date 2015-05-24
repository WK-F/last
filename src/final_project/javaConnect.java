/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package final_project;

/**
 *
 * @author DILSHAN
 */
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class javaConnect {
    
    Connection conn=null;
    Statement st=null;
    public static Statement ConnectorDB() throws ClassNotFoundException
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/final_project?zeroDateTimeBehavior=convertToNull","root","");
           // JOptionPane.showMessageDialog(null, "connected");
            Statement st=conn.createStatement();
            
            return  st;
        } catch (SQLException ex) {
            Logger.getLogger(javaConnect.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex);
            return null;
        }
        
        
    }
}
