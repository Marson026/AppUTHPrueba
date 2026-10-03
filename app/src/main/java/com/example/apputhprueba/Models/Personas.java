package com.example.apputhprueba.Models;

public class Personas {

    private int id;
    private String nombres;
    private String apellidos;
    private String fechaNac;
    private String direccion;
    private String telefono;
    private String correo;

    //Constructor vacio
    public Personas() {}
//Constructor con atubutos internos para llenar

    public Personas(String nombres, int id, String apellidos, String fechaNac, String direccion, String telefono, String correo) {
        this.nombres = nombres;
        this.id = id;
        this.apellidos = apellidos;
        this.fechaNac = fechaNac;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
    }

    //Generar getter y setter para cada atributo

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
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