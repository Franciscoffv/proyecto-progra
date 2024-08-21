/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectojavafinal;
import javax.swing.ImageIcon;
/**
 *
 * @author fran1/pngtree-mountain-savana-landscaper-png-png-image_4377963.png
 */
public class Habitat {
//Informacion de los habitatss del zoologico
    private String nombre;
    private String tipoAmbiente;
    private int capacidad;
    private ImageIcon imagenRuta;
//Constructor
    public Habitat(String nombre, String tipoAmbiente, int capacidad) {
        this.nombre = nombre;
        this.tipoAmbiente = tipoAmbiente;
        this.capacidad = capacidad;
        this.imagenRuta = imagenRuta;
    }
//Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoAmbiente() {
        return tipoAmbiente;
    }

    public void setTipoAmbiente(String tipoAmbiente) {
        this.tipoAmbiente = tipoAmbiente;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    public ImageIcon getImagenRuta() {
        return imagenRuta;
    }
//Lo que se va a mostrar a la hora de ejecutar el código
    public String toString() {
        return "Nombre: " + nombre + ", Tipo de Ambiente: " + tipoAmbiente + ", Capacidad: " + capacidad + "Imagen" + imagenRuta;
    }
}
