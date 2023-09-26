import java.util.Scanner;

public class Ejercicios{
    Scanner entrada = new Scanner(System.in);
    char op;

    public void menu(){
        System.out.println("Elija una de las siguientes opciones: ");
        System.out.println("a. Calculadora");
        System.out.println("b. Conversión de unidades");
        System.out.println("c. Crear cuadro mágico");
        System.out.println("d. Dezplazamiento de un cuadrito");
        op = entrada.next().charAt(0);
        switch (op) {
            case 'a':
            Ejercicio1();
                break;
            case 'b':
            Ejercicio2();
                break;
            case 'c':
            Ejercicio3();
                break;
            case 'd':
            Ejercicio4();
                break;
        
            default:
            System.out.println("Gracias por jugar :3");
                break;
        }
    }

    public void Ejercicio1(){
        //se le llaman metodos vacios porque no poseen argumentos y no son metodos 
        //o funciones que necesiten una entrada o salida de algun tipo de dato

        //calculadora
        double num1 = 0.00, num2, suma = 0.00, multi = 1.00, div = 1.00;
        char operacion;

        System.out.println("Selecciona la operacion que deseas realizar:");
        System.out.println("a.- Suma y Resta");
        System.out.println("b.- Multiplicación");
        System.out.println("c.- División");

        operacion = entrada.next().charAt(0);

        switch(operacion){
            case 'a':
                //vamos a sumar o restar tantos numeros como desee el usuario
                //cuando coloque 0 la operacion termina
                System.out.println("Para detener la suma o resta, ingrese el 0");
                do{
                    
                    System.out.println("Escriba el numero que desee sumar o restar: ");
                    num1 = entrada.nextDouble();
                    suma += num1;
                    //suma = suma + num1;
                }while(num1 != 0);
                System.out.println("El resultado de la operacion es: " + suma);
                break;
            case 'b':
            System.out.println("Para detener la multiplicacion, ingrese el 0");
                
                do{    
                    System.out.println("Escriba el numero que desee multiplicar: ");
                    num1 = entrada.nextDouble();
                    if(num1 != 0){
                        multi *= num1;
                        //multi = multi * num1;
                    }
                                  
                    
                }while(num1 != 0);
                System.out.println("El resultado de la operacion es: " + multi);
                break;
            case 'c':
            System.out.println("Para detener la división, ingrese el 0");
                System.out.println("Escriba el numerador: ");
                    num1 = entrada.nextDouble();
                do{    
                    System.out.println("Escriba el denominador: ");
                    num2 = entrada.nextDouble();
                    if(num2 != 0){
                        div /= num2;
                        //multi = multi * num1;
                    }
                                  
                    
                }while(num1 != 0);
                System.out.println("El resultado de la operacion es: " + multi);
                break;    
                break;
            default:
                System.out.println("opcion no valida, ayos UwU/");
                break;
        }
    }

    public void Ejercicio2(){
        
    }

    public void Ejercicio3(){
        
    }

    public void Ejercicio4(){
        
    }

}