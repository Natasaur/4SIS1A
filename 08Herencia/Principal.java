import java.util.*;
public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int op;
        Michi gato = new Michi("Bolita","De la calle","Croquetas bb",1,7);
        Perro perro = new Perro("Blacky","Schnauzer","Croquetas",3);
        Hamster hamster = new Hamster("Chocolate","Roborowski","Semillas y Cereales",1);
        Conejo conejo = new Conejo("Copo de nieve", "Angora", "Zanahorias",2,"Blanco");
        Cuyo cuyo = new Cuyo("Apolo","Absinia","Pasto",1);
        Huron huron = new Huron("Aro","Silver","Presas",5);
        
        System.out.println("Elija uno de los animales: ");
        System.out.println("1. Gato");
        System.out.println("2. Perro");
        System.out.println("3. Hamster");
        System.out.println("4. Conejo");
        System.out.println("5. Cuyo");
        System.out.println("6. Huron");
        System.out.println("7. Otro");
        op = entrada.nextInt();

        switch (op) {
            case 1://Gato
            gato.mostrarMichi();
                break;
            case 2://Perro
            perro.mostrarPerro();
                break;
            case 3://Hamster
            hamster.mostrarHamster();
                break;
            case 4://Conejo
            conejo.mostrarConejo();
                break;
            case 5://Cuyo
            cuyo.mostrarCuyo();
                break;
            case 6://Huron
            huron.mostrarHuron();
                break;
            case 7://Otro
            System.out.print("Ingrese el tipo de Animal: ");
            String animal = entrada.nextLine();
            System.out.print("Ingrese el nombre: ");
            String nombre = entrada.nextLine();
            System.out.print("Ingrese la raza: ");
            String raza = entrada.nextLine();
            System.out.print("Ingrese el tipo de alimento: ");
            String tipo_alimento = entrada.nextLine();
            System.out.print("Ingrese la edad: ");
            int edad = entrada.nextInt();
            Otro otro = new Otro(nombre,raza,tipo_alimento,edad,animal);
            otro.mostrarOtro();                
                break;
        
            default:
                break;
        }

        //Tarea
        /*perros
         * hamster
         * conejos
         * cuyos
         * urones
         * otro
         * 
         * menu con mascota a elegir
         */
    }    
}
