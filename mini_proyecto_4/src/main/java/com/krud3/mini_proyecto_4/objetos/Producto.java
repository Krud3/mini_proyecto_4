/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.krud3.mini_proyecto_4.objetos;

/**
 * Clase producto usada para modelar un producto con sus caracteristicas
 * @author JSMC
 */
public class Producto {
    
    private int id_producto,id_marca;
    private String descripcion_producto;

    /**
     * cambia el id del producto
     * @param id_producto 
     */
    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }
    /**
     * Cambia el id de la marca
     * @param id_marca 
     */
    public void setId_marca(int id_marca) {
        this.id_marca = id_marca;
    }
    
    /**
     * cambia la descripcion del producto
     * @param descripcion_producto 
     */
    public void setDescripcion_producto(String descripcion_producto) {
        this.descripcion_producto = descripcion_producto;
    }

    /**
     * obtiene el id de la marca
     * @return 
     */
    public int getId_marca() {
        return id_marca;
    }

    /**
     * Obtiene la descripcion del producto
     * @return 
     */
    public String getDescripcion_producto() {
        return descripcion_producto;
    }
    
    /**
     * Constructor general de un producto con sus respectivos parametross
     * @param id_producto
     * @param id_marca
     * @param descripcion_producto 
     */
    public Producto(int id_producto, int id_marca, String descripcion_producto){
    
        this.id_producto = id_producto;
        this.id_marca = id_marca;
        this.descripcion_producto = descripcion_producto;
        
    }
    
}
