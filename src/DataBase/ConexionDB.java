/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBase;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author AlfredoPerez
 */
public class ConexionDB 
{
    private static String DRIVER="com.mysql.jdbc.Driver";
    private static String USUARIO="root";
    private static String CONTRASEÑA="root123";
    private static String URL="jdbc:mysql://localhost:3306/soft_mlmbd";
    public static Connection conexion;
    
    public ConexionDB(){
        conexion = getConexion();
    }
    
    static {
        try{
            Class.forName(DRIVER);
        }
        catch(ClassNotFoundException e){System.out.println("Error:"+e.getMessage());}
    }
    
    public final Connection getConexion(){
        conexion = null;
        try{
            conexion = (Connection) DriverManager.getConnection(URL, USUARIO, CONTRASEÑA);
            System.out.println("CONEXION A LA BASE DE DATOS EXITOSA!");
        }
        catch(SQLException e){System.out.println("Error:"+e.getMessage());}
        return conexion;
    }
    
    public void Holamundo(){
        System.out.println("hola");
    }
}
