package com.pablocos.warehouse_system_kinal.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "prestamos")
public class Prestamo {

    @Id
    @Column(name = "id_prestamo")
    private String idPrestamo;
    @ManyToOne
    @JoinColumn(name = "cod_empleado",foreignKey = @ForeignKey(name = "fk_cod_empleado"))
    private Empleado empleado;
    @ManyToOne
    @JoinColumn(name = "id_producto",foreignKey = @ForeignKey(name = "fk_id_producto"))
    private Producto producto;
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

    public Prestamo(String idPrestamo, Empleado empleado, Producto producto, String fecha_prestamo, Integer cantidad, String fecha_devolucion_estimada, String fecha_devolucion_real, String estado, String observaciones) {
        this.idPrestamo = idPrestamo;
        this.empleado = empleado;
        this.producto = producto;
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

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
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