/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author USUARIO
 */
public class Perro extends Animal implements RevisionMedica{
    private String raza;
    private String tamaño;

    public Perro() {
    }

    public Perro(String id, String nombre, int edad, String estadoSalud, boolean disponible, String raza, String tamaño) {
        super(id, nombre, edad, estadoSalud, disponible);
        this.raza = raza;
        this.tamaño = tamaño;
    }
    
    

    @Override
    public void registrarChequeo() {
        
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }
    
    
}
