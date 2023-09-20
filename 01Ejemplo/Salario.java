/*
Un obrero necesita calcular su salario semanal, el cual se obtiene de la siguiente manera: 
Si trabaja 40 horas o menos se le paga $16 por hora 
Si trabaja más de 40 horas se le paga $16 por cada una de las primeras 40 horas y $20 por cada hora extra. 
 */
import java.util.Scanner;
public class Salario {
    public static void main(String[] args) {
        int horas, horas_extra, total;
        Scanner scan = new Scanner(System.in);

        System.out.print("Ingrese las horas trabajadas a la semana: ");
        horas = scan.nextInt();
        System.out.println();

        if (horas <= 40) {
            total = horas*16;
        }else{
            horas_extra = horas - 40;
            total = 40*16 + horas_extra*20;
        }
        System.out.println("Salario: " + total);
        
    }
    
}
