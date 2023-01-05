package POO;

public class principal {
    public static void main(String[] args) {
    
        perro luki = new perro(); // instacia = el objeto creado

        luki.establecerAtrib("Juan", "Doverman", 4); // un metodo con parametros tienen 'argumentos' = 3
        
        /* para definir valores a los atributos
            luki.nombre = "Lucky";
            luki.edad = 7;
            luki.raza = "Golden Retriever";
        */

        System.out.println("El nombre es: " + luki.nombre);
        System.out.println("La raza es: " + luki.raza);
        System.out.println("La edad es: " + luki.edad);

        System.out.println();
        luki.comer();
        luki.dormir();
        luki.ladrar();
    }
}
