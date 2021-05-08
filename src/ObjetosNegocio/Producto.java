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
public class Producto {
    
    private int ID;
    private String nombre;
    private int tipoProductoID;
    private String tipoProducto;
    private double precio;
    private int existencia;
    private String descripcion;
    private byte[] fotoProducto;

    public Producto(){}
    
    public Producto(int ID, String nombre, int tipoProductoID, double precio, int existencia, String descripcion, byte[] fotoProducto) {
        this.ID = ID;
        this.nombre = nombre;
        this.tipoProductoID = tipoProductoID;
        this.precio = precio;
        this.existencia = existencia;
        this.descripcion = descripcion;
        this.fotoProducto = fotoProducto;
    }
    
    public Producto(int ID, String nombre, String tipoProducto, double precio, int existencia, String descripcion, byte[] fotoProducto) {
        this.ID = ID;
        this.nombre = nombre;
        this.tipoProducto = tipoProducto;
        this.precio = precio;
        this.existencia = existencia;
        this.descripcion = descripcion;
        this.fotoProducto = fotoProducto;
    }
    
    public Producto(String nombre, int tipoProductoID, double precio, int existencia, String descripcion, byte[] fotoProducto) {
        this.nombre = nombre;
        this.tipoProductoID = tipoProductoID;
        this.precio = precio;
        this.existencia = existencia;
        this.descripcion = descripcion;
        this.fotoProducto = fotoProducto;
    }
    
    public Producto(String nombre, String tipoProducto, double precio, int existencia, String descripcion, byte[] fotoProducto) {
        this.nombre = nombre;
        this.tipoProducto = tipoProducto;
        this.precio = precio;
        this.existencia = existencia;
        this.descripcion = descripcion;
        this.fotoProducto = fotoProducto;
    }

   
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getExistencia() {
        return existencia;
    }

    public void setExistencia(int existencia) {
        this.existencia = existencia;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getTipoProductoID() {
        return tipoProductoID;
    }

    public void setTipoProductoID(int tipoProductoID) {
        this.tipoProductoID = tipoProductoID;
    }

    public String getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    public byte[] getFotoProducto() {
        return fotoProducto;
    }

    public void setFotoProducto(byte[] fotoProducto) {
        this.fotoProducto = fotoProducto;
    }
    
    
    

    @Override
    public String toString() {
        return "ID:"+ID+", Nombre:" + nombre + ", Precio:" + precio + ", Existencia:" + existencia + ", Descripcion:" + descripcion;
    }
    
    
    
}
