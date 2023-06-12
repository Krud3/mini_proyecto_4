/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.krud3.mini_proyecto_4.objetos;

/**
 * Clase hora usada para modelar la hora con las restricciones pertienentes para que los parametros
 * no se salgan de los limites
 * @author JSMC
 */
public class Hora {
    
    private int horas;
    private int minutos;

    /**
     * Constructor de la clase Hora y la inicializacion de sus respectivos parametros
     * 
     * 
     * @param horas parametro que tiene en cuenta las restricciones
     * @param minutos parametro que tiene en cuenta las restricciones
     * @throws IllegalArgumentException si los parametros no son los estandar
     */
    public Hora(int horas, int minutos) {
        if (horas < 0 || horas > 23) {
            throw new IllegalArgumentException("Las horas deben estar entre 0 y 23");
        }

        if (minutos < 0 || minutos > 59) {
            throw new IllegalArgumentException("Los minutos deben estar entre 0 y 59");
        }

        this.horas = horas;
        this.minutos = minutos;

    }

    /**
     * Se obtienen las horas de la clase Hora
     * @return 
     */
    public int getHoras() {
        return horas;
    }

    /**
     * Se obtienen los minutos
     * @return 
     */
    public int getMinutos() {
        return minutos;
    }
    
    /**
     * Se obtiene la hora con sus respectivos minutos en un formato 
     * pre establecido por el metodo HH:MM
     * @return 
     */
    public String getHora(){
        return String.valueOf(horas)+ ":"+String.valueOf(minutos);
    }
    
}
