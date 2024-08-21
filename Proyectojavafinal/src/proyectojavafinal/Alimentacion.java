/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectojavafinal;

/**
 *
 * @author fran1
 */
public class Alimentacion {
//Definimos la rutina alimenticia de cada animal
    private String animal;
    private String alimento;
    private String horario;
    private int cantidad;
//Constructor
    public Alimentacion(String animal, String alimento, String horario, int cantidad) {
        this.animal = animal;
        this.alimento = alimento;
        this.horario = horario;
        this.cantidad = cantidad;
    }

    // Getters y Setters
    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

 //Lo que se va a mostrar a la hora de ejecutar el código
    public String toString() {
        return "Animal: " + animal + ", Alimento: " + alimento + ", Horario: " + horario + ", Cantidad: " + cantidad;
    }
}