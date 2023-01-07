package POO.animales_herencia;

public class principal7 {
    
    public static void main(String[] args) {

        gato gato = new gato("Yack", "Raza", 2);
        perro perro = new perro("Sam", "Raza", 4);

        gato.dormir();
        perro.dormir();
    }
}
