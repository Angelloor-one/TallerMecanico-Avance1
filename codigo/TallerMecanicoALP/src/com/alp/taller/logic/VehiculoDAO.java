package com.alp.taller.logic;

import com.alp.taller.data.Conexion;
import com.alp.taller.model.Vehiculo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class VehiculoDAO {
    
    public boolean registrarVehiculo(Vehiculo v) {
        String sql = "INSERT INTO vehiculos (placa, marca, modelo, id_cliente) VALUES (?, ?, ?, ?)";
        try (Connection cn = Conexion.getConexion(); 
             PreparedStatement ps = cn.prepareStatement(sql)) {
            
            ps.setString(1, v.getPlaca());
            ps.setString(2, v.getMarca());
            ps.setString(3, v.getModelo());
            ps.setInt(4, v.getIdCliente());
            
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println("Error al registrar: " + e.getMessage());
            return false;
        }
    }
}