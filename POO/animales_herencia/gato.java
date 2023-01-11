package POO.animales_herencia;

public class gato extends mascota { // heredo toda la clase con 'extends' + "NombreClase"
    
    public gato(String nombre, String raza, int edad) {
        super(nombre,raza,edad);
    }
    
    @Override // es un identificador para saber si se reescribio las funciones de un metodo
    public void dormir() {
        System.out.println("El gato duerme");
    }
}
