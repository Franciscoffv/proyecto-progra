/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectojavafinal;
import javax.swing.ImageIcon;
/**
 *
 * @author fran1
 */
public class Animal {
//Definimos lo que se quiere saaber o añadr del Animal
    private String nombre;
    private String especie;
    private int edad;
    private String habitat;
     private ImageIcon imagen;
//Constructor
    public Animal(String nombre, String especie, int edad, String habitat) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        this.habitat = habitat;
        this.imagen = imagen;
    }
//Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
      public ImageIcon getImagen() {
        return imagen;
    }

  //Lo que se va a mostrar a la hora de ejecutar el código
    public String toString() {
        return "Nombre: " + nombre + ", Especie: " + especie + ", Edad: " + edad + ", Hábitat: " + habitat;
    }
}
