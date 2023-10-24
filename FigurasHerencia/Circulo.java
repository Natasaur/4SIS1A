import java.math.*;
import java.lang.Math;
public class Circulo extends Figura {
    public Circulo(float base) {
        super(base);
    }

    public void mostrarCirculo() {
        System.out.println("Perímetro = " + perimetro() + "\n"
                            + "Área = " + area() + "\n");
    }

    public double perimetro() {
        double perimetro = 2 * Math.PI * getBase();
        return perimetro;
    }

    public double area() {
        double area = Math.PI * Math.pow(getBase(), 2);
        return area;
    }        
}
