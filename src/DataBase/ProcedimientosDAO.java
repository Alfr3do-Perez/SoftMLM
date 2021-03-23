/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBase;

import ObjetosNegocio.Producto;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author AlfredoPerez
 */
public class ProcedimientosDAO {
    
  private Connection conexion;
  private Statement statement;
  private ResultSet resultSet;
  private CallableStatement CallableStatement;
  
    public ProcedimientosDAO(Connection conexion)
    {
        this.conexion = conexion;
    }

    public ResultSet ejecututarQuery(String sql) throws SQLException 
    {
      statement = conexion.createStatement();
      return statement.executeQuery(sql);
    }

    public void agregarProducto(Producto producto) throws SQLException
    {
        String sql = "{ CALL sp_agregarProducto(?,?,?,?) }";
        CallableStatement = conexion.prepareCall(sql);
        
        CallableStatement.setString(1, producto.getNombre());
        CallableStatement.setDouble(2, producto.getPrecio());
        CallableStatement.setInt(3, producto.getExistencia());
        CallableStatement.setString(4, producto.getDescripcion());
        
        CallableStatement.execute();
        CallableStatement.close();
        System.out.println("El producto se agrego correctamente");
    }
}
