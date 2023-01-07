package POO.perro;

public class perro {
    
    // atributos
    String nombre;
    String raza;
    int edad;

    // parametros
        // This (es como un apuntador)
        void establecerAtrib(String nombre, String raza, int edad) {
            this.nombre = nombre; // atributo nombre es igual a lo que el parametro nombre posea
            this.raza = raza;
            this.edad = edad;
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
