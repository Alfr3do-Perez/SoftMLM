/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObjetosNegocio;

/**
 *
 * @author AlfredoPerez
 */
public class DetallesVenta {
    
    private int ventaID;
    private int cantidad;
    private int productoID;

    public DetallesVenta() {
    }

    public DetallesVenta(int ventaID, int cantidad, int productoID) {
        this.ventaID = ventaID;
        this.cantidad = cantidad;
        this.productoID = productoID;
    }

    public int getVentaID() {
        return ventaID;
    }

    public void setVentaID(int ventaID) {
        this.ventaID = ventaID;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getProductoID() {
        return productoID;
    }

    public void setProductoID(int productoID) {
        this.productoID = productoID;
    }
    
    
    
}
