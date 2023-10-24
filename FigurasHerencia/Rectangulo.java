public class Rectangulo extends Figura {
    private float altura;
    public Rectangulo(float base, float altura) {
        super(base);
        this.altura = altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    public float getAltura() {
        return altura;
    }

    public void mostrarRectangulo() {
        System.out.println("Perímetro = " + perimetro() + "\n"
                            + "Área = " + area() + "\n");
    }

    public float perimetro() {
        float perimetro = 2*(getBase() + getAltura());
        return perimetro;
    }

    public float area() {
        float area = getBase() * getAltura();
        return area;
    }
}
