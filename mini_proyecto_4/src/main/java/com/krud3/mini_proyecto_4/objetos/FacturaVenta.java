/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.krud3.mini_proyecto_4.objetos;

/**
 *
 * Clase encargada de modelar FacturaVenta 
 * @author JSMC
 */
public class FacturaVenta {
    
    private int id_factura_venta;
    private Fecha fecha_factura_venta;
    private Hora hora_factura_venta;

    /**
     * Constructor de factura venta, inicializando sus respectivos parametros
     * @param id_factura_venta
     * @param fecha_factura_venta
     * @param hora_factura_venta 
     */
    public FacturaVenta(int id_factura_venta, Fecha fecha_factura_venta, Hora hora_factura_venta) {
        this.id_factura_venta = id_factura_venta;
        this.fecha_factura_venta = fecha_factura_venta;
        this.hora_factura_venta = hora_factura_venta;
    }

    /**
     * Obtiene el id de la facturaventa
     * @return retorna el id
     */
    public int getId_factura_venta() {
        return id_factura_venta;
    }

    /**
     * Cambia el id de factura venta por el parametro
     * @param id_factura_venta 
     */
    public void setId_factura_venta(int id_factura_venta) {
        this.id_factura_venta = id_factura_venta;
    }

    /**
     * Obtiene la fecha de la factura venta
     * @return 
     */
    public Fecha getFecha_factura_venta() {
        return fecha_factura_venta;
    }

    /**
     * Cambia la fecha de la factura venta
     * @param fecha_factura_venta 
     */
    public void setFecha_factura_venta(Fecha fecha_factura_venta) {
        this.fecha_factura_venta = fecha_factura_venta;
    }

    /**
     * Obtiene la hora de la factura venta
     * @return 
     */
    public Hora getHora_factura_venta() {
        return hora_factura_venta;
    }

    /**
     * Cambia la hora de la factura venta
     * @param hora_factura_venta 
     */
    public void setHora_factura_venta(Hora hora_factura_venta) {
        this.hora_factura_venta = hora_factura_venta;
    }
    
}
