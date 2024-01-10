/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DbConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author SATYA
 */
public class DbConnection {
    private Connection conn;
    
    public Connection koneksiDB(){
        if(this.conn == null){
            try{
                Class.forName("com.mysql.jdbc.Driver");
                String vDriver = "jdbc:mysql://localhost:3306/db_ipbo";
                this.conn = (Connection) DriverManager.getConnection(vDriver, "root", "");
            } catch(ClassNotFoundException e){
                System.out.println(e);
            } catch(SQLException e){
                JOptionPane.showMessageDialog(null, String.valueOf(e));
            }
        }
        return conn;
    }
    
     public static void main(String[] args){
        DbConnection db = new DbConnection();
        Connection con = db.koneksiDB();                
    }
}