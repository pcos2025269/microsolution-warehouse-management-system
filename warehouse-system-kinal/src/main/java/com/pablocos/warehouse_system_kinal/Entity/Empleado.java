package com.pablocos.warehouse_system_kinal.Entity;

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
    @Column
    private int estado;

    public Empleado() {
    }

    public Empleado(String codempleado, String nombreEmpleado, String apellidoEmpleado, String telefono, String correo, int estado) {
        this.codempleado = codempleado;
        this.nombreEmpleado = nombreEmpleado;
        this.apellidoEmpleado = apellidoEmpleado;
        this.telefono = telefono;
        this.correo = correo;
        this.estado = estado;
    }

    public String getCodempleado() {
        return codempleado;
    }

    public void setCodempleado(String codempleado) {
        this.codempleado = codempleado;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getApellidoEmpleado() {
        return apellidoEmpleado;
    }

    public void setApellidoEmpleado(String apellidoEmpleado) {
        this.apellidoEmpleado = apellidoEmpleado;
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

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
}
