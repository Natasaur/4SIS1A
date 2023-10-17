import java.util.*;

public class palindromo {
    Scanner entrada = new Scanner(System.in);

    public void checarpalindromo() {
        String firstString = "";
        System.out.println("Ingrese la cadena que desea evaluar: ");
        firstString = entrada.nextLine();
        String invertida = "";
        //Invierte la cadena ingresada
        for(int i = firstString.length() - 1 ; i >= 0 ; i--){
            char car = firstString.charAt(i);
            invertida += car;
        }
        //Checa si la cadena resultante es igual a la original
        if (invertida.equalsIgnoreCase(firstString)) {
            System.out.println("Es un palíndromo");
        } else {
            System.out.println("No es un palíndromo");
        }

    }
}
