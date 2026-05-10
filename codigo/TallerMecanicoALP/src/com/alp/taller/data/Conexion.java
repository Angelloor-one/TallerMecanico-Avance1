package com.alp.taller.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    // URL blindada contra errores de SSL y GSS-API
    private static final String URL = "jdbc:mariadb://localhost:3306/taller_alp_db?useSSL=false&allowPublicKeyRetrieval=true";
    private static final String USER = "root"; 
    private static final String PASSWORD = "0511"; 

    public static Connection getConexion() {
        Connection cn = null;
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            cn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Conexion exitosa a taller_alp_db");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error en conexion: " + e.getMessage());
        }
        return cn;
    }
}