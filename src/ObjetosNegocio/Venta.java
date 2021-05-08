/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObjetosNegocio;

import java.sql.Date;

/**
 *
 * @author AlfredoPerez
 */
public class Venta {
    
    private int ID;
    private Date fechaVenta;
    private int empleadoID;
    private String nombreEmpleado;
    private double subtotal;
    private double iva;
    private double precioTotal;

    public Venta() {
    }

    public Venta(int ID, Date fechaVenta, int empleadoID, String nombreEmpleado, double subtotal, double iva, double precioTotal) {
        this.ID = ID;
        this.fechaVenta = fechaVenta;
        this.empleadoID = empleadoID;
        this.nombreEmpleado = nombreEmpleado;
        this.subtotal = subtotal;
        this.iva = iva;
        this.precioTotal = precioTotal;
    }

    public Venta(int ID, Date fechaVenta, String nombreEmpleado, double subtotal, double iva, double precioTotal) {
        this.ID = ID;
        this.fechaVenta = fechaVenta;
        this.nombreEmpleado = nombreEmpleado;
        this.subtotal = subtotal;
        this.iva = iva;
        this.precioTotal = precioTotal;
    }

    public Venta(int ID, Date fechaVenta, int empleadoID, double subtotal, double iva, double precioTotal) {
        this.ID = ID;
        this.fechaVenta = fechaVenta;
        this.empleadoID = empleadoID;
        this.subtotal = subtotal;
        this.iva = iva;
        this.precioTotal = precioTotal;
    }
    

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Date getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(Date fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public int getEmpleadoID() {
        return empleadoID;
    }

    public void setEmpleadoID(int empleadoID) {
        this.empleadoID = empleadoID;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    
    
    
}
