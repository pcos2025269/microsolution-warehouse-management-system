package com.pablocos.warehouse_system_kinal.entity;

import jakarta.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;

@Entity
@Table(name = "proveedores")
public class Proveedor {

    @Id
    @Column(name = "id_proveedor")
    private int idProveedor;

    @OneToMany(mappedBy = "proveedor")
    @JsonIgnore
    private List<Producto> productos;

    @Column
    private String nit;

    @Column(name = "nombre_empresa")
    private String nombreEmpresa;

    @Column(name = "contacto_nombre")
    private String contactoNombre;

    @Column
    private String telefono;

    @Column
    private String correo;

    @Column
    private String direccion;

    @Column
    private String ciudad;

    @Column(name = "condiciones_pago")
    private String condicionesPago;

    @Column
    private int estado;

    public Proveedor() {
    }

    public Proveedor(int idProveedor, String nit, String nombreEmpresa, String contactoNombre,
                     String telefono, String correo, String direccion, String ciudad,
                     String condicionesPago, int estado) {
        this.idProveedor = idProveedor;
        this.nit = nit;
        this.nombreEmpresa = nombreEmpresa;
        this.contactoNombre = contactoNombre;
        this.telefono = telefono;
        this.correo = correo;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.condicionesPago = condicionesPago;
        this.estado = estado;
    }

    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getContactoNombre() {
        return contactoNombre;
    }

    public void setContactoNombre(String contactoNombre) {
        this.contactoNombre = contactoNombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCondicionesPago() {
        return condicionesPago;
    }

    public void setCondicionesPago(String condicionesPago) {
        this.condicionesPago = condicionesPago;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
}