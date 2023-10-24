/*
 * Deberán de realizar un programa utilizando herencia para el cálculo de figuras geométricas.
 * El programa debe de contar con rectángulo, circulo, triangulo, rombo.
 * Deberán de calcular el perímetro y área.
 * Deben de integrar herencia, encapsulamiento y manejo de excepciones.
 */
import java.util.*;

public class Figura {
    private float base;

    public Figura (float base) {
        this.base = base;
    }

    public float getBase() {
        return base;
    }
    public void setBase(float base) {
        this.base = base;
    }

}
