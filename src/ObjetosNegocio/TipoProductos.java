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
public class TipoProductos {
    
    private int ID;
    private String nombre;
    private String descripcion;

    public TipoProductos(){}
    
    public TipoProductos(int ID, String nombre, String descripcion) {
        this.ID = ID;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public TipoProductos(int ID, String nombre) {
        this.ID = ID;
        this.nombre = nombre;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
    
}
