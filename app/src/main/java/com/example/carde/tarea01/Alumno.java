package com.example.carde.tarea01;

public class Alumno {
    private String nombre, telefono, escolaridad, genero, libro ;
    private boolean deporte;

    public Alumno(String nombre, String telefono, String escolaridad, String genero, String libro, boolean deporte) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.escolaridad = escolaridad;
        this.genero = genero;
        this.libro = libro;
        this.deporte = deporte;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEscolaridad() {
        return escolaridad;
    }

    public void setEscolaridad(String escolaridad) {
        this.escolaridad = escolaridad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getLibro() {
        return libro;
    }

    public void setLibro(String libro) {
        this.libro = libro;
    }

    public boolean isDeporte() {
        return deporte;
    }

    public void setDeporte(boolean deporte) {
        this.deporte = deporte;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", telefono='" + telefono + '\'' +
                ", escolaridad='" + escolaridad + '\'' +
                ", genero='" + genero + '\'' +
                ", libro='" + libro + '\'' +
                ", deporte=" + (deporte? "si": "no") +
                '}';
    }
}
