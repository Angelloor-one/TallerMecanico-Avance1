package tallermecanicoalp;

import com.alp.taller.data.Conexion;
import java.sql.Connection;

public class TallerMecanicoALP {

    public static void main(String[] args) {
        System.out.println("Iniciando prueba de conexion...");
        
        // Llamamos al método que conecta a la base de datos
        Connection conexion = Conexion.getConexion();
        
        if (conexion != null) {
            System.out.println("=========================================");
            System.out.println("El sistema web esta conectado a la base de datos correctamente.");
            System.out.println("=========================================");
        } else {
            System.out.println("Ups, hubo un problema. Revisa que el servicio de MariaDB esté encendido.");
        }
    }
}