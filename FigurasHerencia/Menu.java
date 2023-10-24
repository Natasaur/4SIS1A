import java.util.*;
public class Menu {
    public void mostrarMenu() {
        int op;
        float base, altura, radio, lado;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Seleccione una de las opciones: \n"
                            + "1. Rectángulo \n"
                            + "2. Círculo \n"
                            + "3. Triángulo \n"
                            + "4. Rombo \n");
        op = entrada.nextInt();
        switch (op) {
            case 1://Rectángulo
            System.out.print("Ingrese el valor de la base: ");
            base = entrada.nextFloat();
            System.out.print("Ingrese el valor de la altura: ");
            altura = entrada.nextFloat();
            Rectangulo rectangulo = new Rectangulo(base, altura);
            rectangulo.mostrarRectangulo();
                break;
            case 2://Círculo
            System.out.print("Ingrese el valor del radio: ");
            radio = entrada.nextFloat();
            Circulo circulo = new Circulo(radio);
            circulo.mostrarCirculo();
                break;
            case 3://Triángulo
            System.out.print("Ingrese el valor de la base: ");
            base = entrada.nextFloat();
            System.out.print("Ingrese el valor de la altura: ");
            altura = entrada.nextFloat();
            Triangulo triangulo = new Triangulo(base, altura);
            triangulo.mostrarTriangulo();
                break;
            case 4://Rombo
            System.out.print("Ingrese el valor del lado: ");
            lado = entrada.nextFloat();
            System.out.print("Ingrese el valor del eje mayor: ");
            altura = entrada.nextFloat();
            System.out.print("Ingrese el valor del eje menor: ");
            base = entrada.nextFloat();
            Rombo rombo = new Rombo(base, altura, lado);
            rombo.mostrarRombo();
                break;
        
            default:
            System.out.println("Elija una de las opciones existentes!!!");
                break;
        }
    }
}
