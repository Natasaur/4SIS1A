//Realizar un sistema que pueda convertir unidades de metro a cm y pulgadas,
//de kilogramos a libras y gramos, y unidades de velocidad de m/s a km/h.
import java.util.Scanner;
public class ConvertidorTemp {
	public static void main(String[] args) {
   	Scanner scan = new Scanner(System.in);
      int op;
      float metro, kg, v;

      do {
         op=0;
         //System.out.print("\033[H\033[2J");
         System.out.println("Seleccione una de las siguientes opciones: ");
         System.out.println("1. Convertir unidades de metros a centímetros y pulgadas.");
       	System.out.println("2. Convertir kilogramos a libras y gramos.");
         System.out.println("3. Convertir unidades de velocidad de m/s a km/hr.");
         System.out.println("4. Salir");
         op = scan.nextInt();
         System.out.print("\033[H\033[2J");
         switch (op) {
				case 1:
            do {
					System.out.print("Ingrese la cantidad de metros a convertir: ");
               metro = scan.nextInt();
               longitud(metro);
               op=0;
               System.out.println("¿Repetir Ejercicio?");
               System.out.println("1. Si");
               System.out.println("2. No");
               op = scan.nextInt();
               System.out.print("\033[H\033[2J");
            } while (op!=2);
               break;
            case 2:
				do{
					System.out.print("Ingrese la cantidad de kilogramos a convertir: ");
               kg = scan.nextInt();
               peso(kg);
               op=0;
               System.out.println("¿Repetir Ejercicio?");
               System.out.println("1. Si");
               System.out.println("2. No");
               op = scan.nextInt();
               System.out.print("\033[H\033[2J");
				} while (op!=2);
					break;
            case 3:
				do{
					System.out.print("Ingrese la velocidad en m/s: ");
               v = scan.nextInt();
               velocidad(v);
               op=0;
               System.out.println("¿Repetir Ejercicio?");
               System.out.println("1. Si");
               System.out.println("2. No");
               op = scan.nextInt();
               System.out.print("\033[H\033[2J");
				} while (op!=2);
					break;
            
            default:
				if (op!=4 && op > 4){ //variable usada para salir
					System.out.println("Selecciona una de las opciones anteriores.");
				}
					break;
      	}
            
      } while (op!=4);
   }
   
   public static void longitud(float metro){
		float cm;
      double plg;
      cm = metro*100;
      plg = cm / 2.54;
      System.out.println("Metros: " + metro);
      System.out.println("Centímetros: " + cm);
      System.out.println("Pulgadas: " + plg);
   }

   public static void peso(float kg){
		float gr;
      double lb;
      gr = kg*1000;
      lb =  gr / 453.59;
      System.out.println("Kilogramos: " + kg);
      System.out.println("Gramos: " + gr);
      System.out.println("Libras: " + lb);
   }

   public static void velocidad(float v){
      double vl;
      vl = v*3.6;
      System.out.println(v + " m/s = " + vl + " km/hr.");
   }
}
