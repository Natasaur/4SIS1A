public class Hamster extends Animal {
    //Hereda todas las características de la clase padre, en este caso Animal
    //private int num_vidas;
    public Hamster() {
    }

    //Sobrecarga
    public Hamster(String nombre, String raza, String tipo_alimento, int edad){
        super(nombre, raza, tipo_alimento, edad);
        //this.num_vidas = num_vidas;
    }

    
    /*
    public void setNum_vidas(int num_vidas){
        this.num_vidas = num_vidas;
    }
    public int getNum_vidas(){
        return num_vidas;
    }
     */

    public void mostrarHamster(){
        System.out.println("El nombre del hamster es: " + getNombre() + "\n"
                            + "La raza es: " + getRaza() + "\n"
                            + "Se alimenta de: " + getTipo_Alimento() + "\n"
                            + "El hamster tiene la edad de: " + getEdad() + "\n");
                            //+ "Las vidas del michi son: " + num_vidas + "\n");
    }
}
