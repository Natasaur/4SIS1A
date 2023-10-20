public class Otro extends Animal {
    //Hereda todas las características de la clase padre, en este caso Animal
    private String animal;
    public Otro() {
    }

    //Sobrecarga
    public Otro(String nombre, String raza, String tipo_alimento, int edad, String animal){
        super(nombre, raza, tipo_alimento, edad);
        this.animal = animal;
    }

    public void setAnimal(String animal){
        this.animal = animal;
    }
    public String getAnimal(){
        return animal;
    }

    public void mostrarOtro(){
        System.out.println("El animal es: " + animal + "\n"
                            + "El nombre es: " + getNombre() + "\n"
                            + "La raza es: " + getRaza() + "\n"
                            + "Se alimenta de: " + getTipo_Alimento() + "\n"
                            + "Tiene la edad de: " + getEdad() + "\n");
                            //+ "Las vidas del michi son: " + num_vidas + "\n");
    }
}
