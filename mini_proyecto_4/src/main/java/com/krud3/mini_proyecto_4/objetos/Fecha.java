/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.krud3.mini_proyecto_4.objetos;

/**
 * Clase fecha utilizada para modelar la fecha teniendo en cuenta los anios biciestos
 *  y de que algunos meses no tienen 31 dias, la clase tiene una restriccion
 *  de fecha de 1990 hasta el 2023, debido a que de esta forma es practica para
 * el problema que esta abordando este proyecto
 * @author JSMC
 */
public class Fecha {
    private int dia, mes, anio;

    /**
     * Obtiene el dia
     * @return 
     */
    public int getDia() {
        return dia;
    }

    /**
     * Obtiene el mes
     * @return 
     */
    public int getMes() {
        return mes;
    }

    /**
     * Obtiene el anio
     * @return 
     */
    public int getAnio() {
        return anio;
    }
    
    /**
     * Obtiene la fecha en un formato establecido
     * DD/MES/ANIO
     * @return 
     */
    public String getFecha(){
        return String.valueOf(dia)+ "/"+ String.valueOf(mes)+ "/"+String.valueOf(anio);
    }
    
    /**
     * Constructor de la clase Fecha que tiene en cuenta las restricciones
     * @param dia
     * @param mes
     * @param anio 
     * @throws IllegalArgumentException si alguno de los parametros se sale del rango
     */
    public Fecha(int dia, int mes, int anio){
        if(mes < 1 || mes > 12){
            throw new IllegalArgumentException("El mes debe estar entre 1 y 12");
        }
        if(dia<1 || dia> obtenerDiasEnMes(mes, anio)){
            throw new IllegalArgumentException("El dia no es valido para el mes");
        }
        if(anio<1990 || anio>2023){
            throw new IllegalArgumentException("Ingrese un anio valido");
        }
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }
    
    /**
     * Metodo encargado de obtener los dias maximos por mes
     * @param mes
     * @param anio
     * @return retorna los dias maximos para el mes a calcular
     */
    private int obtenerDiasEnMes(int mes, int anio) {
        int diasEnMes;

        switch (mes) {
            case 2:
                if (esAnioBisiesto(anio)) {
                    diasEnMes = 29;
                } else {
                    diasEnMes = 28;
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                diasEnMes = 30;
                break;
            default:
                diasEnMes = 31;
        }

        return diasEnMes;
    }
    
    /**
     * Metodo encargado de calcular si el anio es bisiesto
     * @param anio
     * @return true si es bisiesto, false en lo contrario
     */
    private boolean esAnioBisiesto(int anio) {
        return (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);
    }
}
