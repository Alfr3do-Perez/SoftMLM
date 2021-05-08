/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBase;

import ObjetosNegocio.DetallesVenta;
import ObjetosNegocio.Producto;
import ObjetosNegocio.Venta;
import java.sql.Blob;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.sql.rowset.serial.SerialBlob;

/**
 *
 * @author AlfredoPerez
 */
public class ProcedimientosDAO {
    
  private final Connection conexion;
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
        
        String sql = "{ CALL sp_agregarProducto(?,?,?,?,?,?) }";
        CallableStatement = conexion.prepareCall(sql);
        
        CallableStatement.setString(1, producto.getNombre());
        CallableStatement.setInt(2, producto.getTipoProductoID());
        CallableStatement.setDouble(3, producto.getPrecio());
        CallableStatement.setInt(4, producto.getExistencia());
        CallableStatement.setString(5, producto.getDescripcion());
        Blob imagenBlob = null;
        if(producto.getFotoProducto() != null){imagenBlob = new SerialBlob(producto.getFotoProducto());}
        CallableStatement.setBlob(6,imagenBlob);
        
        CallableStatement.execute();
        CallableStatement.close();
        System.out.println("El producto se agrego correctamente");
    }
    
    public void actualizarProducto(Producto producto) throws SQLException
    {
        String sql = "{ CALL sp_actualizarProducto(?,?,?,?,?,?,?)}";
        CallableStatement = conexion.prepareCall(sql);
        CallableStatement.setInt(1, producto.getID());
        CallableStatement.setString(2, producto.getNombre());
        CallableStatement.setInt(3, producto.getTipoProductoID());
        CallableStatement.setDouble(4, producto.getPrecio());
        CallableStatement.setInt(5, producto.getExistencia());
        CallableStatement.setString(6, producto.getDescripcion());
        Blob imagenBlob = null;
        
        if(producto.getFotoProducto() != null){imagenBlob = new SerialBlob(producto.getFotoProducto());}
        CallableStatement.setBlob(7,imagenBlob);
        CallableStatement.execute();
        CallableStatement.close();
        System.out.println("El producto se actualizo correctamente");
    }
    
    public void eliminarProducto(Producto producto) throws SQLException
    {
        String sql = "{ CALL sp_eliminarProducto(?) }";
        CallableStatement = conexion.prepareCall(sql);
        CallableStatement.setInt(1, producto.getID());
        CallableStatement.execute();
        CallableStatement.close();
        System.out.println("El producto se elimino correctamente");
    }
    
    public void agregarVenta(Venta venta) throws SQLException
    {
        
        String sql = "CALL sp_agregarVenta(?,?,?,?,?,?);";
        CallableStatement = conexion.prepareCall(sql);
        
        CallableStatement.setInt(1, venta.getID());
        CallableStatement.setDate(2, venta.getFechaVenta());
        CallableStatement.setInt(3, venta.getEmpleadoID());
        CallableStatement.setDouble(4, venta.getSubtotal());
        CallableStatement.setDouble(5, venta.getIva());
        CallableStatement.setDouble(6, venta.getPrecioTotal());
        
        CallableStatement.execute();
        CallableStatement.close();
        System.out.println("La venta se agrego correctamente");
    }
    
    public void agregarDetalleVenta(DetallesVenta detalleVenta) throws SQLException
    {
        String sql = "CALL sp_agregarDetallesVenta(?,?,?);";
        CallableStatement = conexion.prepareCall(sql);
        
        CallableStatement.setInt(1, detalleVenta.getVentaID());
        CallableStatement.setInt(2, detalleVenta.getCantidad());
        CallableStatement.setInt(3, detalleVenta.getProductoID());
        
        CallableStatement.execute();
        CallableStatement.close();
        System.out.println("El detalle de la venta se agrego correctamente");
    }
    
   
}
