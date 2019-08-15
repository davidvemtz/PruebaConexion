/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introduccionjdbc;
import java.sql.*;

/**
 *
 * @author David
 */
public class IntroduccionJDBC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String url = "jdbc:mysql://localhost:3306/sga?useSSL=false";
        //Cargamos el driver de mysql
        try {
            Class.forName("com.mysql.jdbc.Driver");
            // Creamos el objeto conexion
            Connection conexion = (Connection) DriverManager.getConnection(url, "root", "admin");
            // Creamos un objeto de tipo Statement
            Statement instruccion = conexion.createStatement();
            // Creamos el query
            String sql = "SELECT id_persona, nombre, apellido FROM persona";
            ResultSet result = instruccion.executeQuery(sql);
            while (result.next()) {
                System.out.print("Id" + result.getInt(1));
                System.out.println("Nombre" + result.getString(2));
                System.out.println("Apellido" + result.getString(3));
            }  
            result.close();
            instruccion.close();
            conexion.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
