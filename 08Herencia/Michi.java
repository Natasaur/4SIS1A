public class Michi extends Animal {
    //Hereda todas las características de la clase padre, en este caso Animal
    private int num_vidas;
    public Michi() {
    }

    //Sobrecarga
    public Michi(String nombre, String raza, String tipo_alimento, int edad, int num_vidas){
        super(nombre, raza, tipo_alimento, edad);
        this.num_vidas = num_vidas;
    }

    public void setNum_vidas(int num_vidas){
        this.num_vidas = num_vidas;
    }
    public int getNum_vidas(){
        return num_vidas;
    }

    public void mostrarMichi(){
        System.out.println("El nombre del Michi es: " + getNombre() + "\n"
                            + "La raza es: " + getRaza() + "\n"
                            + "Se alimenta de: " + getTipo_Alimento() + "\n"
                            + "El michi tiene la edad de: " + getEdad() + "\n"
                            + "Las vidas del michi son: " + num_vidas + "\n");
    }
}
