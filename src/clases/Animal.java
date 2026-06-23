/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author USUARIO
 */
public abstract class Animal {
    private String id;
    private String nombre;
    private int edad;
    private String estadoSalud;
    private boolean disponible;

    public Animal() {
    }

    public Animal(String id, String nombre, int edad, String estadoSalud, boolean disponible) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.estadoSalud = estadoSalud;
        this.disponible = disponible;
    }
    
    public void registrar() {
    }

    public void mostrar() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEstadoSalud() {
        return estadoSalud;
    }

    public void setEstadoSalud(String estadoSalud) {
        this.estadoSalud = estadoSalud;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    
    
}
