public class Conejo extends Animal {
    //Hereda todas las características de la clase padre, en este caso Animal
    private String color;
    public Conejo() {
    }

    //Sobrecarga
    public Conejo(String nombre, String raza, String tipo_alimento, int edad, String color){
        super(nombre, raza, tipo_alimento, edad);
        this.color = color;
    }

    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return color;
    }

    public void mostrarConejo(){
        System.out.println("El nombre del conejo es: " + getNombre() + "\n"
                            + "La raza es: " + getRaza() + "\n"
                            + "Se alimenta de: " + getTipo_Alimento() + "\n"
                            + "El conejo tiene la edad de: " + getEdad() + "\n"
                            + "El conejo es de color: " + color + "\n");
    }
}
