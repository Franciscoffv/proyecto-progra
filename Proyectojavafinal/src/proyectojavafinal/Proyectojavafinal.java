/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectojavafinal;
import javax.swing.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.ImageIcon;
/**
 *
 * @author fran1
 */
public class Proyectojavafinal {

    /**
     * @param args the command line arguments
     */
//Estos comando para que funcionen las listas y se pueddan almacenar
      private static List<Animal> listaAnimales = new ArrayList<>();
    private static List<Habitat> listaHabitats = new ArrayList<>();
    private static List<Evento> listaEventos = new ArrayList<>();
    private static List<Visitante> listaVisitantes = new ArrayList<>();
    private static List<Alimentacion> listaAlimentacion = new ArrayList<>();

    public static void main(String[] args) {
        // Datos precargados que ya estan en el zoologico desde antes de añadir
        listaAnimales.add(new Animal("Alfredo", "León", 5, "Sabana"));
        listaAnimales.add(new Animal("Carlos", "Delfín", 3, "Submarina"));
        listaAnimales.add(new Animal("Pancho", "Gorila", 10, "Selva"));
        listaAnimales.add(new Animal("Pardo", "Oso Polar", 7, "Polar"));
        listaAnimales.add(new Animal("Julio", "Venado", 6, "Bosque"));
        
        listaHabitats.add(new Habitat("Sabana", "Seco", 10));
        listaHabitats.add(new Habitat("Acuatico", "Agua", 20));
        listaHabitats.add(new Habitat("Selva", "Templado", 13));
        listaHabitats.add(new Habitat("Polos", "Helado", 9));
        listaHabitats.add(new Habitat("Bosque", "Humeedo", 30));
        listaHabitats.add(new Habitat("Sabana", "Caluroso", 10));
        
        
        listaEventos.add(new Evento("1231", "Charla sobre felinos", "Información sobre los leones", "2024-08-21"));
        listaEventos.add(new Evento("1345", "Clase de Zumba", "Clases de zumba gratis con instructor profesional", "2024-08-21"));
        listaEventos.add(new Evento("2309", "Carrera de correr", "Carrera 100m por el zoologico, el ganador obtiene premio en efectivo", "2024-08-21"));
        listaEventos.add(new Evento("8634", "Fuegos artificiales", "Fuegos artificiales esta noche antes de cerrar del zoologico", "2024-08-21"));
        
        
//Botones para abrir cualquier gestion que se quiera
        String[] opciones = {"Gestión de animales", "Gestión de hábitats", "Gestión de eventos", "Gestión de visitantes", "Gestión de alimentación", "Salir"};
        int opcion;

        do {
            opcion = JOptionPane.showOptionDialog(null, "Seleccione una opción", "Zoológico", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);

            switch (opcion) {
                case 0 -> gestionarAnimales();
                case 1 -> gestionarHabitats();
                case 2 -> gestionarEventos();
                case 3 -> gestionarVisitantes();
                case 4 -> gestionarAlimentacion();
                case 5 -> JOptionPane.showMessageDialog(null, "Saliendo");
            }
        } while (opcion != 5);
    }

    // Gestión de animales para añadirlos, buscarllos o ver la lista de animales que hay
    private static void gestionarAnimales() {
        String[] opciones = {"Añadir animal", "Buscar animal", "Lista de animales", "Salir"};
        int opcion;

        do {
            opcion = JOptionPane.showOptionDialog(null, "Seleccione una opción", "Gestión de animales", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);

            switch (opcion) {
                case 0 -> añadirAnimal();
                case 1 -> buscarAnimal();
                case 2 -> listarAnimales();
                case 3 -> JOptionPane.showMessageDialog(null, "Saliendo de gestión de animales");
            }
        } while (opcion != 3);
    }

    private static void añadirAnimal() {
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del animal:");
        String especie = JOptionPane.showInputDialog("Ingrese la especie del animal:");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del animal:"));
        String habitat = JOptionPane.showInputDialog("Ingrese el hábitat del animal:");

        listaAnimales.add(new Animal(nombre, especie, edad, habitat));
        JOptionPane.showMessageDialog(null, "Animal registrado.");
    }

    private static void buscarAnimal() {
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del animal que quiere buscar:");
        Animal animal = buscarAnimalPorNombre(nombre);
        if (animal != null) {
            JOptionPane.showMessageDialog(null, "Animal encontrado:\n" + animal);
        } else {
            JOptionPane.showMessageDialog(null, "Animal no encontrado.");
        }
    }

    private static Animal buscarAnimalPorNombre(String nombre) {
        for (Animal animal : listaAnimales) {
            if (animal.getNombre().equalsIgnoreCase(nombre)) {
                return animal;
            }
        }
        return null;
    }

    private static void listarAnimales() {
        StringBuilder sb = new StringBuilder("Lista de nimales:\n");
        for (Animal animal : listaAnimales) {
            sb.append(animal).append("\n\n");
        }
        JOptionPane.showMessageDialog(null, sb.toString());
    }

  //Gestión de habitats para buscar cualquier habitat implementado o ver la lista de odos los habitats
    private static void gestionarHabitats() {
        String[] opciones = {"Buscar hábitat", "Lista de hábitats", "Salir"};
        int opcion;

        do {
            opcion = JOptionPane.showOptionDialog(null, "Seleccione una opción", "Gestión de hábitats", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);

            switch (opcion) {
         
                case 0 -> buscarHabitat();
                case 1 -> listarHabitats();
                case 2 -> JOptionPane.showMessageDialog(null, "Saliendo de gestión de habitats");
            }
        } while (opcion != 2);
    }

   

    private static void buscarHabitat() {
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del hábitat que quiere buscar:");
        Habitat habitat = buscarHabitatPorNombre(nombre);
        if (habitat != null) {
            JOptionPane.showMessageDialog(null, "Hábitat encontrado:\n" + habitat);
        } else {
            JOptionPane.showMessageDialog(null, "Hábitat no encontrado.");
        }
    }

    private static Habitat buscarHabitatPorNombre(String nombre) {
        for (Habitat habitat : listaHabitats) {
            if (habitat.getNombre().equalsIgnoreCase(nombre)) {
                return habitat;
            }
        }
        return null;
    }

    private static void listarHabitats() {
        StringBuilder sb = new StringBuilder("Lista de hábitats:\n");
        for (Habitat habitat : listaHabitats) {
            sb.append(habitat).append("\n\n");
        }
        JOptionPane.showMessageDialog(null, sb.toString());
    }

    // Gestión de eventos, donde se podra ver los eventos que se llevaran a cabo el dia de hoy o buscar uno en especifico
    private static void gestionarEventos() {
        String[] opciones = {"Buscar Evento", "Lista de eventos", "Salir"};
        int opcion;

        do {
            opcion = JOptionPane.showOptionDialog(null, "Seleccione una opción", "Gestión de eventos", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);

            switch (opcion) {
                case 0 -> buscarEvento();
                case 1 -> listarEventos();
                case 2 -> JOptionPane.showMessageDialog(null, "Volviendo al menú principal");
            }
        } while (opcion != 2);
    }

    private static void buscarEvento() {
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del evento que quiere buscar:");
        Evento evento = buscarEventoPorNombre(nombre);
        if (evento != null) {
            JOptionPane.showMessageDialog(null, "Evento encontrado:\n" + evento);
        } else {
            JOptionPane.showMessageDialog(null, "Evento no encontrado.");
        }
    }

    private static Evento buscarEventoPorNombre(String nombre) {
        for (Evento evento : listaEventos) {
            if (evento.getNombre().equalsIgnoreCase(nombre)) {
                return evento;
            }
        }
        return null;
    }

    private static void listarEventos() {
        StringBuilder sb = new StringBuilder("Lista de eventos:\n");
        for (Evento evento : listaEventos) {
            sb.append(evento).append("\n\n");
        }
        JOptionPane.showMessageDialog(null, sb.toString());
    }

    // Gestión de visitantes en donde se podra tener un recuendo de quienes entran con nombre y la edad, con base a sto saber cuantos niños o adultos hay
    private static void gestionarVisitantes() {
        String[] opciones = {"Añadir visitante", "Buscar visitante", "Lista de visitantes", "Contador de niños y adultos", "Salir"};
        int opcion;

        do {
            opcion = JOptionPane.showOptionDialog(null, "Seleccione una opción", "Gestión de visitantes", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);

            switch (opcion) {
                case 0 -> añadirVisitante();
                case 1 -> buscarVisitante();
                case 2 -> listarVisitantes();
                case 3 -> contarVisitantes();
                case 4 -> JOptionPane.showMessageDialog(null, "Saliendo");
            }
        } while (opcion != 4);
    }

    private static void añadirVisitante() {
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del visitante:");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del visitante:"));
        Date fechaIngreso = new Date();  

        listaVisitantes.add(new Visitante(nombre, edad, fechaIngreso));
        JOptionPane.showMessageDialog(null, "Visitante registrado exitosamente.");
    }

    private static void buscarVisitante() {
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del visitante que quiere buscar:");
        Visitante visitante = buscarVisitantePorNombre(nombre);
        if (visitante != null) {
            JOptionPane.showMessageDialog(null, "Visitante encontrado:\n" + visitante);
        } else {
            JOptionPane.showMessageDialog(null, "Visitante no encontrado.");
        }
    }

    private static Visitante buscarVisitantePorNombre(String nombre) {
        for (Visitante visitante : listaVisitantes) {
            if (visitante.getNombre().equalsIgnoreCase(nombre)) {
                return visitante;
            }
        }
        return null;
    }

    private static void listarVisitantes() {
        StringBuilder sb = new StringBuilder("Lista de visitantes:\n");
        for (Visitante visitante : listaVisitantes) {
            sb.append(visitante).append("\n\n");
        }
        JOptionPane.showMessageDialog(null, sb.toString());
    }

    private static void contarVisitantes() {
        int ninos = 0;
        int adultos = 0;

        for (Visitante visitante : listaVisitantes) {
            if (visitante.equals(ninos)) {
                ninos++;
            } else {
                adultos++;
            }
        }

        JOptionPane.showMessageDialog(null, "Cantidad de niños: " + ninos + "\nCantidad de adultos: " + adultos);
    }
//Gestión de alimentación para poder ver los alimentos que hay y poder añadir cualquier alimento para los animales
    private static void gestionarAlimentacion() {
        String[] opciones = {"Añadir alimentos", "Lista de alimentaciones", "Salir"};
        int opcion;

        do {
            opcion = JOptionPane.showOptionDialog(null, "Seleccione una opción", "Gestión de alimentación", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);

            switch (opcion) {
                case 0 -> añadirAlimentacion();
                case 1 -> listarAlimentaciones();
                case 2 -> JOptionPane.showMessageDialog(null, "Volviendo al menú principal");
                
            }
        } while (opcion != 2);
    }

    private static void añadirAlimentacion() {
        String animal = JOptionPane.showInputDialog("Ingrese el nombre del animal al que quiere alimentar:");
        String alimento = JOptionPane.showInputDialog("Ingrese el alimento que le desea dar al animal:");
        String horario = JOptionPane.showInputDialog("Ingrese la hora en la que quiere que sea alimentado el animal:");
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de alimento en gramos:"));

        listaAlimentacion.add(new Alimentacion(animal, alimento, horario, cantidad));
        JOptionPane.showMessageDialog(null, "Alimentación registrada exitosamente.");
    }

    private static void listarAlimentaciones() {
        StringBuilder sb = new StringBuilder("Lista de alimentaciones:\n");
        for (Alimentacion alimentacion : listaAlimentacion) {
            sb.append(alimentacion).append("\n\n");
        }
        JOptionPane.showMessageDialog(null, sb.toString());

        String[] opciones = {"Ver Mapa del Zoológico", "Seleccionar Hábitat", "Salir"};
        int opcion;

    }
}




