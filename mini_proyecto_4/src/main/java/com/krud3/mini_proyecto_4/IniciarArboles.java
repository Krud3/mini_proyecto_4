/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.krud3.mini_proyecto_4;

import com.krud3.mini_proyecto_4.arboles_nodos.AB;
import com.krud3.mini_proyecto_4.objetos.DetalleFactura;
import com.krud3.mini_proyecto_4.objetos.FacturaVenta;
import com.krud3.mini_proyecto_4.objetos.Fecha;
import com.krud3.mini_proyecto_4.objetos.Hora;
import com.krud3.mini_proyecto_4.objetos.Marca;
import com.krud3.mini_proyecto_4.objetos.Producto;

/**
 * Clase creada para inicializar los arboles de cada clase; Producto, Marca,
 * FacturaVenta y DetalleFacturaVenta. Y tener control sobre los arboles
 * Se crea tambien para implementar metodos como el de eliminar una Marca completa
 * (por ejemplo) y gestion del CRUD.
 * @author JSMC
 */
public class IniciarArboles {
    private AB<Integer, Marca> ABMarca;
    private AB<Integer, Producto> ABProducto;
    private AB<Integer, FacturaVenta> ABFacturaVenta;
    private AB<Integer, DetalleFactura> ABDetalleFactura;

    /**
     * Obtiene el arbol Marca
     * @return 
     */
    public AB<Integer, Marca> getABMarca() {
        return ABMarca;
    }

    /**
     * Obtiene el arbol Producto
     * @return 
     */
    public AB<Integer, Producto> getABProducto() {
        return ABProducto;
    }

    /**
     * Obtiene el arbol Factura Venta
     * @return 
     */
    public AB<Integer, FacturaVenta> getABFacturaVenta() {
        return ABFacturaVenta;
    }

    /**
     * Obtiene el arbol Detalle factura
     * @return 
     */
    public AB<Integer, DetalleFactura> getABDetalleFactura() {
        return ABDetalleFactura;
    }
    
    public IniciarArboles(){
        ABMarca = new AB<Integer, Marca>();
        ABProducto = new AB<Integer, Producto>();
        ABFacturaVenta = new AB<Integer, FacturaVenta>();
        ABDetalleFactura = new AB<Integer, DetalleFactura>();
        
        ABMarca.insertar(1000, new Marca(1000, "Electrodo"));
        // 5 marcas
        ABProducto.insertar(222, new Producto(222, 1000, "Micro ondas"));
        ABProducto.insertar(223, new Producto(223, 1000, "Microfono"));
        // 10 productos por marca
        
        ABFacturaVenta.insertar(333, new FacturaVenta(333, new Fecha(12, 6, 2023), new Hora(14, 0)));
        // 5 FacturaVentas
        ABDetalleFactura.insertar(111, new DetalleFactura(111, 333, 222, 2, 50.00));
        ABDetalleFactura.insertar(112, new DetalleFactura(112, 333, 223, 1, 80.00));
        // 3 DetalleFactura
    }
}
