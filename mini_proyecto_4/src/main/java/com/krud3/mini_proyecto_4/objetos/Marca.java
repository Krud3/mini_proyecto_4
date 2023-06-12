/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.krud3.mini_proyecto_4.objetos;

/**
 * Clase Marca usada para modelar marcas que estan relacionadas con productos
 * a traves de su ID
 * @author JSMC
 */
public class Marca {
    
    private int id_marca;
    private String nombre_marca;

    /**
     * Obtiene el id de la marca
     * @return 
     */
    public int getId_marca() {
        return id_marca;
    }

    /**
     * Cambia el id de la marca
     * @param id_marca 
     */
    public void setId_marca(int id_marca) {
        this.id_marca = id_marca;
    }

    /**
     * Obtiene el nombre de la marca
     * @return 
     */
    public String getNombre_marca() {
        return nombre_marca;
    }

    /**
     * Cambia el nombre de la marca
     * @param nombre_marca 
     */
    public void setNombre_marca(String nombre_marca) {
        this.nombre_marca = nombre_marca;
    }

    /**
     * Constructor general de la marca con sus respectivos parametros
     * @param id_marca
     * @param nombre_marca 
     */
    public Marca(int id_marca, String nombre_marca) {
        this.id_marca = id_marca;
        this.nombre_marca = nombre_marca;
    }
    
}
