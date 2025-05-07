package com.Ariadna.Alumnos.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Alumno {
    // Atributos de la clase Alumno
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String numeroControl;
    private String nombre;
    private String apellidos;
    private String correo;
    private String telefono;
    private String carrera;
    private String semestre;
    private String grupo;
    private String imagenURL;

    // Getters
    public Long getId() {
        return id;
    }
    public String getNumeroControl() {
        return numeroControl;
    }
    public String getNombre() {
        return nombre;
    }
    public String getApellidos() {
        return apellidos;
    }
    public String getCorreo() {
        return correo;
    }
    public String getTelefono() {
        return telefono;
    }
    public String getCarrera() {
        return carrera;
    }
    public String getSemestre() {
        return semestre;
    }
    public String getGrupo() {
        return grupo;
    }
    public String getImagenURL() {
        return imagenURL;
    }

// Setters
    public void setId(Long id) {
        this.id = id;
    }
    public void setNumeroControl(String numeroControl) {
        this.numeroControl = numeroControl;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public void setImagenURL(String imagenURL) {
        this.imagenURL = imagenURL;
    }


}
