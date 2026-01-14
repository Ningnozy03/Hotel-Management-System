/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db;
import db.ConnectionProvider;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author NIGNOSZY
 */
public class Select {
    public static ResultSet getData(String query)
    {
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;
        try
        {
            con = ConnectionProvider.getCon();
            st = con.createStatement();
            rs = st.executeQuery(query);
            return st.executeQuery(query);
        }
        catch(Exception e)
        {
            e.printStackTrace(); // สำคัญ: ให้เห็นสาเหตุใน console
            JOptionPane.showMessageDialog(null, "DB Error: " + e.getMessage());
            return null;
        }
    }

    public static Object getConnection() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
