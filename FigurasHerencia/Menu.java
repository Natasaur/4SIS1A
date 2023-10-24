import java.util.*;
public class Menu {
    public void mostrarMenu() {
        int op;
        float base = 0, altura = 0, radio = 0, lado = 0;
        boolean valid = false;
        String strInput1, strInput2, strInput3;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Seleccione una de las opciones: \n"
                            + "1. Rectángulo \n"
                            + "2. Círculo \n"
                            + "3. Triángulo \n"
                            + "4. Rombo \n");
        op = entrada.nextInt();
        switch (op) {
            case 1://Rectángulo
            while (valid == false) {
                System.out.print("Ingrese el valor de la base: ");
                strInput1 = entrada.next();
                System.out.print("Ingrese el valor de la altura: ");
                strInput2 = entrada.next();
                try {
                    base = Float.parseFloat(strInput1);
                    altura = Float.parseFloat(strInput2);
                    valid = true;
                } catch (Exception e) {
                    System.out.println("Ingresa solo números");
                    System.out.println("Error: " + e.getMessage());
                    System.out.println();
                }
            }
            Rectangulo rectangulo = new Rectangulo(base, altura);
            rectangulo.mostrarRectangulo();
            valid = false;
                break;
            case 2://Círculo
            while (valid == false) {
                System.out.print("Ingrese el valor del radio: ");
                strInput1 = entrada.next();
                try {
                    radio = Float.parseFloat(strInput1);
                    valid = true;
                } catch (Exception e) {
                    System.out.println("Ingresa solo números");
                    System.out.println("Error: " + e.getMessage());
                    System.out.println();
                }
            }
            Circulo circulo = new Circulo(radio);
            circulo.mostrarCirculo();
            valid = false;
                break;
            case 3://Triángulo
            while (valid = false) {
                System.out.print("Ingrese el valor de la base: ");
                strInput1 = entrada.next();
                System.out.print("Ingrese el valor de la altura: ");
                strInput2 = entrada.next();
                try {
                    base = Float.parseFloat(strInput1);
                    altura = Float.parseFloat(strInput2);
                    valid = true;
                } catch (Exception e) {
                    System.out.println("Ingresa solo números");
                    System.out.println("Error: " + e.getMessage());
                    System.out.println();
                }
            }
            Triangulo triangulo = new Triangulo(base, altura);
            triangulo.mostrarTriangulo();
            valid = false;
                break;
            case 4://Rombo
            while (valid = false) {
                System.out.print("Ingrese el valor del lado: ");
                strInput1 = entrada.next();
                System.out.print("Ingrese el valor del eje mayor: ");
                strInput2 = entrada.next();
                System.out.print("Ingrese el valor del eje menor: ");
                strInput3 = entrada.next();
                try {
                    lado = Float.parseFloat(strInput1);
                    base = Float.parseFloat(strInput2);
                    altura = Float.parseFloat(strInput3);
                } catch (Exception e) {
                    System.out.println("Ingresa solo números");
                    System.out.println("Error: " + e.getMessage());
                    System.out.println();
                }
            }
            Rombo rombo = new Rombo(base, altura, lado);
            rombo.mostrarRombo();
            valid = false;
                break;
        
            default:
            System.out.println("Elija una de las opciones existentes!!!");
                break;
        }
    }
}
