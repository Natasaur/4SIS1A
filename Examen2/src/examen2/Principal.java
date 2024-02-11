/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen2;

/**
 *
 * @authors
 * García Fuentes Omar
 * García Salas Natalia
 * Hernandez Hernandez Lucia
 * Ladrillero Hipolito Eduardo
 */
// Importar las clases necesarias
import java.util.ArrayList;
import java.util.Scanner;

// Crear la clase Mascota con sus atributos y métodos
class Mascota {
  // Atributos de la clase
  private String nombre;
  private String especie;
  private String raza;
  private int edad;
  private double peso;
  private String historial;

  // Constructor de la clase
  public Mascota(String nombre, String especie, String raza, int edad, double peso, String historial) {
    this.nombre = nombre;
    this.especie = especie;
    this.raza = raza;
    this.edad = edad;
    this.peso = peso;
    this.historial = historial;
  }

  // Métodos de la clase
  // Método para obtener el nombre de la mascota
  public String getNombre() {
    return nombre;
  }

  // Método para obtener la especie de la mascota
  public String getEspecie() {
    return especie;
  }

  // Método para obtener la raza de la mascota
  public String getRaza() {
    return raza;
  }

  // Método para obtener la edad de la mascota
  public int getEdad() {
    return edad;
  }

  // Método para obtener el peso de la mascota
  public double getPeso() {
    return peso;
  }

  // Método para obtener el historial de la mascota
  public String getHistorial() {
    return historial;
  }

  // Método para actualizar el historial de la mascota
  public void setHistorial(String historial) {
    this.historial = historial;
  }

  // Método para mostrar la información de la mascota
  public void mostrarInfo() {
    System.out.println("Nombre: " + nombre);
    System.out.println("Especie: " + especie);
    System.out.println("Raza: " + raza);
    System.out.println("Edad: " + edad + " años");
    System.out.println("Peso: " + peso + " kg");
    System.out.println("Historial: " + historial);
  }
}

// Crear la clase Veterinaria con sus atributos y métodos
class Veterinaria {
  // Atributos de la clase
  private String nombre;
  private String direccion;
  private String telefono;
  private ArrayList<Mascota> mascotas;

  // Constructor de la clase
  public Veterinaria(String nombre, String direccion, String telefono) {
    this.nombre = nombre;
    this.direccion = direccion;
    this.telefono = telefono;
    this.mascotas = new ArrayList<Mascota>();
  }
  
  public String getNombre() {
        return nombre;
    }
    public void setNombre (String nombre) {
        this.nombre = nombre;
    }

  // Métodos de la clase
  // Método para agregar una mascota a la veterinaria
  public void agregarMascota(Mascota mascota) {
    mascotas.add(mascota);
  }

  // Método para buscar una mascota por su nombre
  public Mascota buscarMascota(String nombre) {
    for (Mascota mascota : mascotas) {
      if (mascota.getNombre().equals(nombre)) {
        return mascota;
      }
    }
    return null;
  }

  // Método para mostrar la información de la veterinaria
  public void mostrarInfo() {
    System.out.println("Nombre: " + nombre);
    System.out.println("Dirección: " + direccion);
    System.out.println("Teléfono: " + telefono);
    System.out.println("Mascotas registradas: " + mascotas.size());
  }

  // Método para mostrar la información de todas las mascotas
  public void mostrarMascotas() {
    for (Mascota mascota : mascotas) {
      mascota.mostrarInfo();
      System.out.println();
    }
  }
}

// Crear la clase Principal con el método main
public class Principal {
  public static void main(String[] args) {
    // Crear un objeto de la clase Scanner para leer datos por teclado
    Scanner sc = new Scanner(System.in);

    // Crear un objeto de la clase Veterinaria con los datos de la misma
    Veterinaria veterinaria = new Veterinaria("VetPet", "Av. Reforma 123", "55-1234-5678");

    // Crear algunas mascotas y agregarlas a la veterinaria
    Mascota m1 = new Mascota("Firulais", "Perro", "Labrador", 3, 25.0, "Vacunado y desparasitado");
    Mascota m2 = new Mascota("Pelusa", "Gato", "Persa", 2, 4.5, "Esterilizado y vacunado");
    Mascota m3 = new Mascota("Lola", "Conejo", "Angora", 1, 1.2, "Sin antecedentes");
    veterinaria.agregarMascota(m1);
    veterinaria.agregarMascota(m2);
    veterinaria.agregarMascota(m3);

    // Crear una variable para controlar el ciclo del menú
    boolean salir = false;

    // Mostrar el menú de opciones
    while (!salir) {
      System.out.println("Bienvenido a la veterinaria " + veterinaria.getNombre());
      System.out.println("Seleccione una opción:");
      System.out.println("1. Mostrar información de la veterinaria");
      System.out.println("2. Mostrar información de las mascotas");
      System.out.println("3. Buscar una mascota por su nombre");
      System.out.println("4. Actualizar el historial de una mascota");
      System.out.println("5. Salir");
      int opcion = sc.nextInt();
      switch (opcion) {
        case 1:
          // Mostrar la información de la veterinaria
          veterinaria.mostrarInfo();
          break;
        case 2:
          // Mostrar la información de las mascotas
          veterinaria.mostrarMascotas();
          break;
        case 3:
          // Buscar una mascota por su nombre
          System.out.println("Ingrese el nombre de la mascota que desea buscar:");
          String nombre = sc.next();
          Mascota mascota = veterinaria.buscarMascota(nombre);
          if (mascota != null) {
            // Mostrar la información de la mascota encontrada
            mascota.mostrarInfo();
          } else {
            // Mostrar un mensaje de error
            System.out.println("No se encontró ninguna mascota con ese nombre.");
          }
          break;
        case 4:
          // Actualizar el historial de una mascota
          System.out.println("Ingrese el nombre de la mascota cuyo historial desea actualizar:");
          nombre = sc.next();
          mascota = veterinaria.buscarMascota(nombre);
          if (mascota != null) {
            // Mostrar el historial actual de la mascota
            System.out.println("El historial actual de la mascota es: " + mascota.getHistorial());
            // Pedir el nuevo historial de la mascota
            System.out.println("Ingrese el nuevo historial de la mascota:");
            sc.nextLine(); // Limpiar el buffer del teclado
            String historial = sc.nextLine();
            // Actualizar el historial de la mascota
            mascota.setHistorial(historial);
            // Mostrar un mensaje de confirmación
            System.out.println("El historial de la mascota ha sido actualizado.");
          } else {
            // Mostrar un mensaje de error
            System.out.println("No se encontró ninguna mascota con ese nombre.");
          }
          break;
        case 5:
          // Salir del programa
          salir = true;
          break;
        default:
          // Mostrar un mensaje de opción inválida
          System.out.println("Opción inválida. Por favor, ingrese una opción válida.");
          break;
      }
      System.out.println();
    }
    // Cerrar el objeto de la clase Scanner
    sc.close();
    // Mostrar un mensaje de despedida
    System.out.println("Gracias por usar la veterinaria " + veterinaria.getNombre() + ". Hasta pronto.");
  }
}