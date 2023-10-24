import java.lang.Math;
public class Triangulo extends Figura {
    private float altura;
    public Triangulo(float base, float altura) {
        super(base);
        this.altura = altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    public float getAltura() {
        return altura;
    }

    public void mostrarTriangulo() {
        System.out.println("Perímetro = " + perimetro() + "\n"
                            + "Área = " + area() + "\n");
    }

    public double perimetro() {
        double perimetro = Math.sqrt(Math.pow(getBase(),2) * Math.pow(getAltura(),2)) + getBase() + getAltura();
        return perimetro;
    }

    public float area() {
        float area = (getBase() * getAltura()) / 2;
        return area;
    } 
}
