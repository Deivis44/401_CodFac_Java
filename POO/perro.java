package POO;

public class perro {
    
    String nombre;
    String raza;
    int edad;

    // parametros
        void establecerAtrib(String nombrePerro, String razaPerro, int edadPerro) {
            nombre = nombrePerro;
            raza = razaPerro;
            edad = edadPerro;
        }
        //

    void comer() { // crear nuevo metodo
        System.out.println("El perro se encuentra comiendo!");
    }
    void dormir() { // crear nuevo metodo
        System.out.println("El perro se encuentra durmiendo!");
    }
    void ladrar() { // crear nuevo metodo
        System.out.println("El perro se puso a ladrar!");
    }
}
