package POO.animales_herencia;

public class perro extends mascota { // heredo toda la clase con 'extends' + "NombreClase"
    
    public perro(String nombre, String raza, int edad) {
        super(nombre,raza,edad);
    }

    @Override // es un identificador para saber si se reescribio las funciones de un metodo
    public void dormir() {
        super.dormir(); // = metodo de la clase padre
        System.out.println("El perro duerme");
    }
}
