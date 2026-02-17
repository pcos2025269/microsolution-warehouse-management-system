package com.pablocos.warehouse_system_kinal.entity;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "productos")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto")
    private Long idProducto;

    @Column
    private String codigoProducto;

    @Column
    private String nombre;

    @Column
    private String descripcion;

    @Column
    private String unidadMedida;

    @Column
    private BigDecimal stockActual;

    @Column
    private BigDecimal stockMinimo;

    @Column
    private BigDecimal costoUnitario;

    @Column
    private String tipo;

    @Column
    private String estado;

    @Column
    private String observaciones;

    @Column
    private LocalDateTime fechaCreacion;

    @Column
    private LocalDateTime fechaActualizacion;

    public Producto() {

    }

    public Producto(Long idProducto, String codigoProducto, String nombre, String descripcion, String unidadMedida, BigDecimal stockActual, BigDecimal costoUnitario, BigDecimal stockMinimo, String tipo, String estado, String observaciones, LocalDateTime fechaCreacion, LocalDateTime fechaActualizacion) {
        this.idProducto = idProducto;
        this.codigoProducto = codigoProducto;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.unidadMedida = unidadMedida;
        this.stockActual = stockActual;
        this.costoUnitario = costoUnitario;
        this.stockMinimo = stockMinimo;
        this.tipo = tipo;
        this.estado = estado;
        this.observaciones = observaciones;
        this.fechaCreacion = fechaCreacion;
        this.fechaActualizacion = fechaActualizacion;
    }

    public Long getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Long idProducto) {
        this.idProducto = idProducto;
    }

    public String getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getUnidadMedida() {
        return unidadMedida;
    }

    public void setUnidadMedida(String unidadMedida) {
        this.unidadMedida = unidadMedida;
    }

    public BigDecimal getStockActual() {
        return stockActual;
    }

    public void setStockActual(BigDecimal stockActual) {
        this.stockActual = stockActual;
    }

    public BigDecimal getStockMinimo() {
        return stockMinimo;
    }

    public void setStockMinimo(BigDecimal stockMinimo) {
        this.stockMinimo = stockMinimo;
    }

    public BigDecimal getCostoUnitario() {
        return costoUnitario;
    }

    public void setCostoUnitario(BigDecimal costoUnitario) {
        this.costoUnitario = costoUnitario;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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

    public LocalDateTime getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDateTime fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public LocalDateTime getFechaActualizacion() {
        return fechaActualizacion;
    }

    public void setFechaActualizacion(LocalDateTime fechaActualizacion) {
        this.fechaActualizacion = fechaActualizacion;
    }
}