/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectojavafinal;

/**
 *
 * @author fran1
 */
public class Evento {
 // La informacion de los eventos
    private String id;
    private String nombre;
    private String descripcion;
    private String fecha;
//Constructor
    public Evento(String id, String nombre, String descripcion, String fecha) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fecha = fecha;
    }
//Getters y setters
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

//Lo que se va a mostrar a la hora de ejecutar el código
    public String toString() {
        return "ID: " + id + ", Nombre: " + nombre + ", Descripción: " + descripcion + ", Fecha: " + fecha;
    }
}