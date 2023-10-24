public class Rombo extends Figura {
    private float altura, lado;
    public Rombo(float base, float altura, float lado) {
        super(base);
        this.altura = altura;
        this.lado = lado;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    public float getAltura() {
        return altura;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }
    public float getLado() {
        return lado;
    }

    public void mostrarRombo() {
        System.out.println("Perímetro = " + perimetro() + "\n"
                            + "Área = " + area() + "\n");
    }

    public float perimetro() {
        float perimetro = 4 * getLado();
        return perimetro;
    }

    public float area() {
        float area = (getBase() * getAltura()) / 2;
        return area;
    }
}
