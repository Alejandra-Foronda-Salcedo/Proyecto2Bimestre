/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author USUARIO
 */
public class Gato extends Animal implements RevisionMedica{
    
    private String tipoPelaje;
    private String comportamiento;

    public Gato() {
    }

    public Gato(String id, String nombre, int edad, String estadoSalud, boolean disponible,String tipoPelaje, String comportamiento) {
        super(id, nombre, edad, estadoSalud, disponible);
        this.tipoPelaje = tipoPelaje;
        this.comportamiento = comportamiento;
    }
    
      

    @Override
    public void registrarChequeo() {
        
    }

    public String getTipoPelaje() {
        return tipoPelaje;
    }

    public void setTipoPelaje(String tipoPelaje) {
        this.tipoPelaje = tipoPelaje;
    }

    public String getComportamiento() {
        return comportamiento;
    }

    public void setComportamiento(String comportamiento) {
        this.comportamiento = comportamiento;
    }
    
    
    
}
