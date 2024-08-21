/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectojavafinal;
import java.util.Date;
/**
 *
 * @author fran1
 */
public class Visitante {
 //Informacion de los visitantes
    private String nombre;
    private int edad;
    private Date fechaIngreso;
//Constructor
    public Visitante(String nombre, int edad, Date fechaIngreso) {
        this.nombre = nombre;
        this.edad = edad;
        this.fechaIngreso = fechaIngreso;
    }

    // Getters y Setters
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

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

 //Lo que se va a mostrar a la hora de ejecutar el código
    public String toString() {
        return "Nombre: " + nombre + ", Edad: " + edad + ", Fecha de Ingreso: " + fechaIngreso;
    }
}