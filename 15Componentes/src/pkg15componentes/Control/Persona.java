/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg15componentes.Control;

/**
 *
 * @author jakeg
 */

import java.io.Serializable;

public abstract class Persona implements Serializable {
    private String nombre;
    private int edad;
    
    public Persona(){
    }
    
    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

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
    
    //el metodo abstracto que nos ayuda  adefinir el tipo de persona
    abstract String tipoPersona();
}
