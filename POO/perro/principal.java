package POO.perro;

public class principal {
    public static void main(String[] args) {
    
        perro luki = new perro();  // la primera palabra es el nombre de la clase y la segunda la variable donde se guardan los datos
        // instacia = el objeto creado

        luki.establecerAtrib("Juan", "Doverman", 4); // un metodo con parametros tienen 'argumentos' = 3
        
        /* para definir valores a los atributos
            luki.nombre = "Lucky";
            luki.edad = 7;
            luki.raza = "Golden Retriever";

            ? Esta vaina se parece a una estructura 
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
