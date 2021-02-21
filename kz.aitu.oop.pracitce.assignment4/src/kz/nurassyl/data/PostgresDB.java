package kz.nurassyl.data;

 

import java.sql.*;

import kz.nurassyl.data.interfaces.IDB;



public class PostgresDB implements IDB {
    @Override
    public Connection getConnection() throws SQLException, ClassNotFoundException {
        String connectionUrl = "jdbc:postgresql://localhost:8888/Moldir"; // link of connection
        try { // try catch
            // Here we load the driver’s class file into memory at the runtime
            Class.forName("org.postgresql.Driver"); // creating object  

            // Establish the connection
            Connection con = DriverManager.getConnection(connectionUrl, "postgres", "123"); // connection
            return con; // connection manager
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
} 