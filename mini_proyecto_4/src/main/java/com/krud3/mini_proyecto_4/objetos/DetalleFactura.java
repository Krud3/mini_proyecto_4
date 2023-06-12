/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.krud3.mini_proyecto_4.objetos;

/**
 * Clase usada para modelar DetalleFactura que es una relacion entre factura
 * y producto
 * @author JSMC
 */
public class DetalleFactura {
    
    private int id_detalle_factura, id_factura_venta, id_producto, cantidad_productos;
    private double valor_producto;

    /**
     * Obtiene el id de detalle factura
     * @return 
     */
    public int getId_detalle_factura() {
        return id_detalle_factura;
    }

    /**
     * Cambia el id de detalle factura
     * @param id_detalle_factura 
     */
    public void setId_detalle_factura(int id_detalle_factura) {
        this.id_detalle_factura = id_detalle_factura;
    }

    /**
     * Obtiene el id de factura venta
     * @return 
     */
    public int getId_factura_venta() {
        return id_factura_venta;
    }

    /**
     * Cambie el id de factura venta
     * @param id_factura_venta 
     */
    public void setId_factura_venta(int id_factura_venta) {
        this.id_factura_venta = id_factura_venta;
    }

    /**
     * Obtiene el id de producto
     * @return 
     */
    public int getId_producto() {
        return id_producto;
    }

    /**
     * Cambia el id de producto
     * @param id_producto 
     */
    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    /**
     * Obtiene la cantidad de productos
     * @return 
     */
    public int getCantidad_productos() {
        return cantidad_productos;
    }

    /**
     * Cambia la cantidad de productos
     * @param cantidad_productos 
     */
    public void setCantidad_productos(int cantidad_productos) {
        this.cantidad_productos = cantidad_productos;
    }

    /**
     * Obtiene el valor del producto
     * @return 
     */
    public double getValor_producto() {
        return valor_producto;
    }

    /**
     * Cambia el valor del producto
     * @param valor_producto 
     */
    public void setValor_producto(double valor_producto) {
        this.valor_producto = valor_producto;
    }

    /**
     * Constructor de la clase Detalle Factura con sus respectivos parametros incializadores
     * @param id_detalle_factura
     * @param id_factura_venta
     * @param id_producto
     * @param cantidad_productos
     * @param valor_producto 
     */
    public DetalleFactura(int id_detalle_factura, int id_factura_venta, int id_producto, int cantidad_productos, double valor_producto) {
        this.id_detalle_factura = id_detalle_factura;
        this.id_factura_venta = id_factura_venta;
        this.id_producto = id_producto;
        this.cantidad_productos = cantidad_productos;
        this.valor_producto = valor_producto;
    }
    
}
