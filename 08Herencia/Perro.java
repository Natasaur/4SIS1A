public class Perro extends Animal {
    //Hereda todas las características de la clase padre, en este caso Animal
    //private int num_vidas;
    public Perro() {
    }

    //Sobrecarga
    public Perro(String nombre, String raza, String tipo_alimento, int edad){
        super(nombre, raza, tipo_alimento, edad);
        //this.num_vidas = num_vidas;
    }

    /*/
    public void setNum_vidas(int num_vidas){
        this.num_vidas = num_vidas;
    }
    public int getNum_vidas(){
        return num_vidas;
    }
    */

    public void mostrarPerro(){
        System.out.println("El nombre del perritu es: " + getNombre() + "\n"
                            + "La raza es: " + getRaza() + "\n"
                            + "Se alimenta de: " + getTipo_Alimento() + "\n"
                            + "El perritu tiene la edad de: " + getEdad() + "\n");
                            //+ "Las vidas del michi son: " + num_vidas + "\n");
    }
}
