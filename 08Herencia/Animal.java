import java.util.*;

public class Animal {

    //Encapsulamiento: Restringir el acceso a los datos

    private String nombre, raza, tipo_alimento;
    private int edad;
    //Privado = solo pueden ser utilizadas dentro de la clase, utilizan get y set
    //Protegido = pueden ser llamadas desde la clase padre, nunca de la clase hijo a padre
    //Parámetros entrada de datos 
    //Comportamientos = acciones del onjeto


    //Se debe crear el constructor
    //Nos sirve para declarar la exostencia de una clase e inicializar las variables, para crear instancias de una clase

    public Animal(){ //Constructor por defecto, Java lo crea por defdecto
        //No es necesario ponerlo
    }

    //Struct
    //Sobrecarga ??
    public Animal( String nom, String raza, String tipo_alimento, int edad) {
        //Para acceder a loo datos privados se utiliza "This"
        //Se asignan valores a los parámetros del registro
        this.nombre = nom;
        this.raza = raza;
        this.tipo_alimento = tipo_alimento;
        this.edad = edad;
    }

    //Para modificar los valores asginados
    //Mértodos Getter y Setter
    //Get = Obtener, recibir
    //Set = asignar, enviar

    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nom){
        this.nombre = nom;
    }
    
    public String getRaza(){
        return raza;
    }
    public void setRaza(String raza){
        this.raza = raza;
    }

    public String getTipo_Alimento(){
        return tipo_alimento;
    }
    public void setTipo_Alimento(String tipo_alimento){
        this.tipo_alimento = tipo_alimento;
    }

    public int getEdad(){
        return edad;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }

}
