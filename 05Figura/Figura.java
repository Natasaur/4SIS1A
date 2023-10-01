import java.util.Scanner;
//Hacer que se repita el proceso de la entrada de datos mientras no sea un número
//Terminar el programa de figuras

public class Figura {
    Scanner entrada = new Scanner(System.in);
    double lado, perimetro, area, altura;
    int op;
    String strInput1, strInput2;
    char letra;
    boolean valid = false;

    public void menu() {
        do{
            System.out.print("\033[H\033[2J"); //Clear Screen
            System.out.println("Bienvenido al programa de calculo de areas y perimetros");
            System.out.println("Elija una opción deseada: ");
            System.out.println("1. Cuadrado");
            System.out.println("2. Rectangulo");
            System.out.println("3. Triangulo");
            System.out.println("4. Salir");
            //obtener la lectura de la opcion
            op = entrada.nextInt();
            switch(op){
                case 1:
                do {
                    calcularCuadrado();
                    valid = false;
                    //letra = ' ';
                    System.out.println("Deseas repetir el programa?");
                    System.out.println("Si = S | No = N");
                    letra = entrada.next().charAt(0);
                    System.out.print("\033[H\033[2J"); //Clear Screen
                } while (letra == 'S' || letra == 's');
                    break;
                case 2:
                do {
                    calcularRectangulo();
                    valid = false;
                    //letra = ' ';
                    System.out.println("Deseas repetir el programa?");
                    System.out.println("Si = S | No = N");
                    letra = entrada.next().charAt(0);
                    System.out.print("\033[H\033[2J"); //Clear Screen
                } while (letra == 'S' || letra == 's');
                    break;
                case 3:
                do {
                    calcularTriangulo();
                    valid = false;
                    //letra = ' ';
                    System.out.println("Deseas repetir el programa?");
                    System.out.println("Si = S | No = N");
                    letra = entrada.next().charAt(0);
                    System.out.print("\033[H\033[2J"); //Clear Screen
                } while (letra == 'S' || letra == 's');
                    break;
                default:
                if (op > 4) {
                    System.out.print("\033[H\033[2J"); //Clear Screen
                    System.out.println("Gracias por elegir este lindo programa");
                }
                    break;
            }
        }while(op != 4);

    }

    public void calcularCuadrado() {
        while (valid == false) {
            System.out.println("Ingresa el valor del lado: ");
            strInput1 = entrada.next();
            try{
                lado = Integer.parseInt(strInput1);
                valid = true;
            } catch (Exception e) {
                System.out.println("Ingresa solo números");
                System.out.println("Error: " + e.getMessage());
            }
        }
        perimetro = lado * 4;
        area = lado * lado;
        System.out.println("Perímetro: " + perimetro + " Área: " + area);
    }

    public void calcularRectangulo() {
        while (valid == false) {
            System.out.println("Ingresa el valor del lado: ");
            strInput1 = entrada.next();
            System.out.println("Ingresa el valor de la altura: ");
            strInput2 = entrada.next();
            try{
                lado = Integer.parseInt(strInput1);
                altura = Integer.parseInt(strInput2);
                valid = true;
            }catch(Exception e){
                System.out.println("Ingresa solo números");
                System.out.println("Error: " + e.getMessage());
            }
        }
        perimetro = 2 * (lado + altura);
        area = lado * altura;
        System.out.println("Perímetro: " + perimetro + " Área: " + area);
    }

    public void calcularTriangulo() {
        while (valid == false ) {
            System.out.println("Ingresa el valor del lado: ");
            strInput1 = entrada.next();
            System.out.println("Ingresa el valor de la altura: ");
            strInput2 = entrada.next();
            try{
                lado = Integer.parseInt(strInput1);
                altura = Integer.parseInt(strInput2);
                valid = true;
            }catch(Exception e){
                System.out.println("Ingresa solo números");
                System.out.println("Error: " + e.getMessage());
            }
        }
        perimetro = 3 * lado;
            area = (lado * altura) / 2;
            System.out.println("Perímetro: " + perimetro + " Área: " + area);
    }
    
}

