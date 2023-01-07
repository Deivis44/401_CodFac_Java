package POO.usuario;

public class principal3 {
    public static void main(String[] args) {
    
        /* modificaciones de acceso
            * Default // todos lo tienen
            * Public
            * Private
            * Protected
        */

        usuario david = new usuario("David", "0000");
        usuario david2 = new usuario("deivis._.");
        // david.username = "Darux44";

        // david.password = "hola1234";
        // david.setpassword("1234hola"); // cambia el atributo

        System.out.println(david.username);
        System.out.println(david.getpassword() + "\n");
        david.saludar();

        david2.saludar();
    }
}
