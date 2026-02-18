package com.pablocos.warehouse_system_kinal.entity;

import jakarta.persistence.*;
import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

@Entity
@Table(name = "productos")
public class Producto {

    @Id
    @Column(name = "id_producto")
    private Long idProducto;

    @Column
    private String nombre;

    @Column
    private String codigoProducto;

    @Column
    private BigDecimal costoUnitario;

    @ManyToOne
    @JoinColumn(name = "id_proveedor")
    @JsonIdentityReference(alwaysAsId = true)
    @JsonProperty("idProveedor")
    private Proveedor proveedor;

    public Producto() {}

    public Producto(Long idProducto, String nombre, String codigoProducto,
                    BigDecimal costoUnitario, Proveedor proveedor) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.codigoProducto = codigoProducto;
        this.costoUnitario = costoUnitario;
        this.proveedor = proveedor;
    }

    public Long getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Long idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public BigDecimal getCostoUnitario() {
        return costoUnitario;
    }

    public void setCostoUnitario(BigDecimal costoUnitario) {
        this.costoUnitario = costoUnitario;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }
}
