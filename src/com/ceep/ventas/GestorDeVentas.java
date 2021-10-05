/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ceep.ventas;

import com.ceep.domain.Order;
import com.ceep.domain.Producto;

/**
 *
 * @author javip
 */
public class GestorDeVentas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Order orden1 = new Order();
        Producto p1 = new Producto("Peras", 5.4);
        Producto p2 = new Producto("Manzanas", 6.6);
        Producto p3 = new Producto("Platanos", 8.2);
        
        orden1.agregarProducto(p1);
        orden1.agregarProducto(p2);
        orden1.agregarProducto(p3);
        orden1.mostrarOrden();
        
        Order orden2 = new Order();
        orden2.agregarProducto(p1);
        orden2.agregarProducto(p2);
        orden2.agregarProducto(p3);
        orden2.mostrarOrden();
   

        
    }
    
}
