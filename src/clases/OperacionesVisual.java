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
public class OperacionesVisual {

    private List<Animal> listaAnimales;
    private List<Adoptante> listaAdoptantes;

    public OperacionesVisual() {
        this.listaAnimales = new ArrayList<>();
        this.listaAdoptantes = new ArrayList<>();
    }

    public void registrarPerro(String id, String nombre, int edad, String estadoSalud, boolean disponible, String raza, String tamaño) {
        Perro p = new Perro(id, nombre, edad, estadoSalud, disponible, raza, tamaño);
        listaAnimales.add(p);
        System.out.println("Perro registrado exitosamente: " + nombre);
    }

    public void registrarGato(String id, String nombre, int edad, String estadoSalud, boolean disponible, String tipoPelaje, String comportamiento) {
        Gato nuevoGato = new Gato(id, nombre, edad, estadoSalud, disponible, tipoPelaje, comportamiento);
        listaAnimales.add(nuevoGato);
        System.out.println("Gato registrado exitosamente: " + nombre);
    }

    public void registrarAdoptante(String dni, String nombre, String telefono) {
        Adoptante nuevoAdoptante = new Adoptante(dni, nombre, telefono);
        listaAdoptantes.add(nuevoAdoptante);
        System.out.println("Adoptante registrado exitosamente: " + nombre);
    }

    /**
     * Busca un adoptante por su DNI
     */
    public Adoptante buscarAdoptantePorDni(String dni) {
        for (Adoptante ad : listaAdoptantes) {
            if (ad.getDni().equalsIgnoreCase(dni)) {
                return ad; // Encontrado
            }
        }
        return null; // No encontrado
    }

    public Animal buscarAnimalPorId(String id) {
        for (Animal al : listaAnimales) {
            if (al.getId().equalsIgnoreCase(id)) {
                return al; // Encontrado
            }
        }
        return null; // No encontrado
    }

    /**
     * Ejecuta de forma polimórfica la revisión médica y actualiza el estado de
     * salud en la lista
     */
    public boolean procesarRevisionMedica(String idAnimal, String nuevoEstado) {
        Animal animal = buscarAnimalPorId(idAnimal);

        if (animal != null) {
            // 1. Verificación Polimórfica: ¿Implementa la interfaz RevisionMedica?
            if (animal instanceof RevisionMedica) {
                // Se ejecuta el método obligatorio de la interfaz
                ((RevisionMedica) animal).registrarChequeo();

                // 2. Modificamos el atributo del objeto directamente
                animal.setEstadoSalud(nuevoEstado);
                return true; // Operación exitosa
            } else {
                System.out.println("Este animal no requiere revisión bajo la interfaz.");
                return false;
            }
        }
        return false; // Animal no encontrado
    }

    public List<Animal> getListaAnimales() {
        return listaAnimales;
    }

    public void setListaAnimales(List<Animal> listaAnimales) {
        this.listaAnimales = listaAnimales;
    }

    public List<Adoptante> getListaAdoptantes() {
        return listaAdoptantes;
    }

    public void setListaAdoptantes(List<Adoptante> listaAdoptantes) {
        this.listaAdoptantes = listaAdoptantes;
    }

}
