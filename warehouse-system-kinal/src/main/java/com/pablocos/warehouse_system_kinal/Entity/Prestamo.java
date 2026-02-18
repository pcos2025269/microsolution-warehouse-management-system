package com.pablocos.warehouse_system_kinal.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "prestamos")
public class Prestamo {

    @Id
    @Column(name = "id_prestamo")
    private String idPrestamo;
    @Column(name = "cod_empleado")
    private String codEmpleado;
    @Column(name = "id_producto")
    private String idProducto;
    @Column
    private String fecha_prestamo;
    @Column
    private Integer cantidad;
    @Column
    private String fecha_devolucion_estimada;
    @Column
    private String fecha_devolucion_real;
    @Column
    private String estado;
    @Column
    private String observaciones;

    public Prestamo() {
    }

    public Prestamo(String idPrestamo,
                    String codEmpleado,
                    String idProducto,
                    String fecha_prestamo,
                    Integer cantidad,
                    String fecha_devolucion_estimada,
                    String fecha_devolucion_real,
                    String estado,
                    String observaciones) {
        this.idPrestamo = idPrestamo;
        this.codEmpleado = codEmpleado;
        this.idProducto = idProducto;
        this.fecha_prestamo = fecha_prestamo;
        this.cantidad = cantidad;
        this.fecha_devolucion_estimada = fecha_devolucion_estimada;
        this.fecha_devolucion_real = fecha_devolucion_real;
        this.estado = estado;
        this.observaciones = observaciones;
    }

    public String getIdPrestamo() {
        return idPrestamo;
    }
    public void setIdPrestamo(String idPrestamo) {
        this.idPrestamo = idPrestamo;
    }
    public String getCodEmpleado() {
        return codEmpleado;
    }
    public void setCodEmpleado(String CodEmpleado) {
        this.codEmpleado = codEmpleado;
    }
    public String getIdProducto() {
        return idProducto;
    }
    public void setIdProducto(String idProducto) {
        this.idProducto = idProducto;
    }
    public String getFecha_prestamo() {
        return fecha_prestamo;
    }
    public void setFecha_prestamo(String fecha_prestamo) {
        this.fecha_prestamo = fecha_prestamo;
    }
    public Integer getCantidad() {
        return cantidad;
    }
    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }
    public String getFecha_devolucion_estimada() {
        return fecha_devolucion_estimada;
    }
    public void setFecha_devolucion_estimada(String fecha_devolucion_estimada) {
        this.fecha_devolucion_estimada = fecha_devolucion_estimada;
    }

    public String getFecha_devolucion_real() {
        return fecha_devolucion_real;
    }
    public void setFecha_devolucion_real(String fecha_devolucion_real) {
        this.fecha_devolucion_real = fecha_devolucion_real;
    }

    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public String getObservaciones() {
        return observaciones;
    }
    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
}