/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ceep.domain;

/**
 *
 * @author javip
 */
public class Producto {
    private static int idProducto;
    private String nombre;
    private Double precio;
    private int contadroProductos;

    public Producto() {
        this.idProducto = ++idProducto;
        
    }

    public Producto(String nombre, Double precio) {
        this();//llamamos al constructor vacío
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public int getContadroProductos() {
        return contadroProductos;
    }

    public void setContadroProductos(int contadroProductos) {
        this.contadroProductos = contadroProductos;
    }

    @Override
    public String toString() {
        return "Producto{" + "idProducto=" + idProducto + ", nombre=" + nombre + ", precio=" + precio + ", contadroProductos=" + contadroProductos + '}';
    }
    
    
    
    
    
    
    
}
