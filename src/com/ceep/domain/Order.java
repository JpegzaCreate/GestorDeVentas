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
public class Order {
   private  static int idOrder;
   Producto productos[];
   private static int contadorProductos;
   private static int contadorOrdenes ;
   private static final int maxProductos = 10;
   

    public Order() {
        Order.contadorProductos= 0;
        productos = new Producto[Order.maxProductos];
        this.idOrder = ++idOrder;
    }
    
    
    public void agregarProducto (Producto producto){
        
        if (contadorProductos<maxProductos) {
            productos[contadorProductos++] = producto;           
        }else{
            System.out.println("Has alcanzado el maximo de productos de " + maxProductos);
        }
    }
    
    public Double calcularTotal(){
        var resul=0.0;
        for (int i = 0; i < contadorProductos; i++) {
            resul+=productos[i].getPrecio();
        }
        return resul;
    }
    
    public void mostrarOrden(){
        System.out.println("El id de la order es el nº- "+ idOrder);
        for (int i = 0; i < contadorProductos; i++) {
            System.out.println("Nombre Producto " + (i+1) +" -->" + productos[i].getNombre());
            System.out.println("Precio del Producto " + (i+1) +" -->" + productos[i].getPrecio());
            System.out.println("");
            
        }
        System.out.println("Total " + this.calcularTotal()+ "€");
        System.out.println("======================================");
    }
    
   
}
