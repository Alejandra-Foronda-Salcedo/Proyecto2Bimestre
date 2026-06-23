/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author USUARIO
 */
public class Adoptante {
    private String dni;
    private String nombre;
    private String telefono;
    private List<Animal> animalesAdoptados;

    public Adoptante() {
    }

    public Adoptante(String dni, String nombre, String telefono) {
        this.dni = dni;
        this.nombre = nombre;
        this.telefono = telefono;
        this.animalesAdoptados = new ArrayList<>();
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
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

    public List<Animal> getAnimalesAdoptados() {
        return animalesAdoptados;
    }

    public void setAnimalesAdoptados(List<Animal> animalesAdoptados) {
        this.animalesAdoptados = animalesAdoptados;
    }
    
    
}
