package com.pablocos.warehouse_system_kinal.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name= "Empleados")
public class Empleado {
    @Id
    private String codempleado;
    @Column(name = "cod_empleado")
    private String nombreEmpleado;
    @Column
    private String apellidoEmpleado;
    @Column
    private String telefono;
    @Column
    private String correo;

    public Empleado() {
    }

    public Empleado(String codempleado, String nombreEmpleado, String apellidoEmpleado, String telefono, String correo) {
        this.codempleado = codempleado;
        this.nombreEmpleado = nombreEmpleado;
        this.apellidoEmpleado = apellidoEmpleado;
        this.telefono = telefono;
        this.correo = correo;
    }

    public String getCodempleado() {
        return codempleado;
    }

    public void setCodempleado(String cod_empleado) {
        this.codempleado = cod_empleado;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombre_empleado) {
        this.nombreEmpleado = nombre_empleado;
    }

    public String getApellidoEmpleado() {
        return apellidoEmpleado;
    }

    public void setApellidoEmpleado(String apellido_empleado) {
        this.apellidoEmpleado = apellido_empleado;
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
}
