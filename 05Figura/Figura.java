import java.util.Scanner;
//Hacer que se repita el proceso de la entrada de datos mientras no sea un número
//Terminar el programa de figuras

public class Figura {
    Scanner entrada = new Scanner(System.in);
    double lado, perimetro, area, altura;
    int op;
    char letra;

    public void menu() {
        do{
            System.out.println("Bienvenido al programa de calculo de areas y perimetros");
            System.out.println("Elija una opción deseada: ");
            System.out.println("1.- Cuadrado");
            System.out.println("2.- Rectangulo");
            System.out.println("3.- Triangulo");
            System.out.println("Salir");

            //obtener la lectura de la opcion
            op = entrada.nextInt();

            switch(op){
                case 1:
                    calcularCuadrado();
                    break;
                case 2:
                    calcularRectangulo();
                    break;
                case 3:
                    calcularTriangulo();
                    break;
                default:
                    System.out.println("Gracias por elegir este lindo programa");
                    break;
            }
            System.out.println("Deseas repetir el programa digita S");
            letra = entrada.next().charAt(0);

        }while(letra == 'S' || letra == 's');

    }

    public void calcularCuadrado() {
        try{
            System.out.println("Ingresa el valor del lado: ");
            lado = entrada.nextDouble();
            perimetro = lado * 4;
            area = lado * lado;
            System.out.println("Perímetro: " + perimetro + " Área: " + area);
        }catch(Exception e){
            System.out.println("Ingresa solo números");
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void calcularRectangulo() {
        try{
            System.out.println("Ingresa el valor del lado: ");
            lado = entrada.nextDouble();
            System.out.println("Ingresa el valor de la altura: ");
            altura = entrada.nextDouble();
            perimetro = 2 * (lado + altura);
            area = lado * altura;
            System.out.println("Perímetro: " + perimetro + " Área: " + area);
        }catch(Exception e){
            System.out.println("Ingresa solo números");
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void calcularTriangulo() {
        try{
            System.out.println("Ingresa el valor del lado: ");
            lado = entrada.nextDouble();
            System.out.println("Ingresa el valor de la altura: ");
            altura = entrada.nextDouble();
            perimetro = 3 * lado;
            area = (lado * altura) / 2;
            System.out.println("Perímetro: " + perimetro + " Área: " + area);
        }catch(Exception e){
            System.out.println("Ingresa solo números");
            System.out.println("Error: " + e.getMessage());
        }
    }
    
}

