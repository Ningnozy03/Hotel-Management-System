/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author NIGNOSZY
 */
public class tables {
    public static void main(String[] args)
    {
        Connection con = null;
        Statement st = null;
        try
        {
            con = ConnectionProvider.getCon();
            st = con.createStatement();
            st.executeUpdate("create table users(username varchar(200),email varchar(200),password varchar(50),status varchar(20))");
            st.executeUpdate("create table room(roomNo varchar(10),roomType varchar(200),bedType varchar(200),price int,status varchar(20))");
            st.executeUpdate("create table customer (id int,name varchar(200),mobileNum varchar(10),address varchar(500),nationality varchar(200),gender varchar(50),email varchar(200),ssNum varchar(200),checkIn varchar(50),roomNo VARCHAR(10),bedType VARCHAR(200),roomType varchar(200),pricePerDay int(10),numberDayStay int(10),totalAmount VARCHAR(200),checkOut varchar(50))");

            JOptionPane.showMessageDialog(null, "Table Create Successfull");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        finally
        {
            try
        {
            con.close();
            st.close();
        }
        catch(Exception e)
        {}
        }
    }
}
