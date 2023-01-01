package Strings;

public class metodos {
    public static void main (String[] args) {
    
        System.out.println("\n--- STRINGS ---");
        String mensaje = "  Hola, me quiero pegar un tiro uwu  ";

        int cantidad = mensaje.length(); // cuenta la cantidad de caracteres

        boolean contiene = mensaje.contains("Hola"); // mira en cualquier lado si lo tiene = true
        boolean contiene2 = mensaje.contains("hola"); // mira en cualquuier lado si lo tiene = false

        boolean empieza = mensaje.startsWith("Hola"); // Verifica si empieza con eso = true
        boolean termina = mensaje.endsWith("uwu"); // Verifica si acaba con eso = true

        String nuevoString = mensaje.concat(" pq estamos re locos papaaa"); // agrega otro String
        
        System.out.println(cantidad);
        System.out.println("");
        System.out.println(contiene);
        System.out.println(contiene2);
        System.out.println("");
        System.out.println(empieza);
        System.out.println(termina);
        System.out.println("");
        System.out.println(nuevoString);
        System.out.println("");
        
        System.out.println(mensaje.toUpperCase());
        System.out.println(mensaje.toLowerCase());
        
        System.out.println(mensaje.trim()); // quita espacios
        
        // posible elemento util para cuando nos den info en una variable y esta tenga que ser anexada con algun otro texto predeterminado
        String mensaje2 = "";
        String curso = "Java";
        
        mensaje2 = String.format("\n Bienvenido al curso de %s", curso);
        System.out.println(mensaje2);
        
        float valor = 10.87866f;
        mensaje2 = String.format("El total es %.3f %s", valor, "Dolares"); // el primer '%' sera reemplazado por "valor" (con la n cantidad de decimales) y el segundo por 'dolares'
        System.out.println(mensaje2);
        mensaje2 = String.format("Veo un total de %d materias en el año", 3); // '%d' sirve para enteros, '%f' para flotantes, '%s' para Strings y '%b' para booleanos 
        System.out.println(mensaje2);
        // linea 22 ya se como hacerla xd, y es '%s' porque al mostrar en consola se muestra como String


        String uno = "Uno";
        String dos = "Dos";
        String tres = "Tres";

        String xxx = String.format("\n %3$s - %2$s - %1$s", uno, dos, tres); // se puede tener un orden con '%, posición, $, tipo'
        System.out.println(xxx);
        
        
        // comparar cadenas de texto (Strings)
        String cadena1 = "Hola";
        String cadena2 = "hola";
        boolean aaa = cadena2.equals(cadena1); // revisa estrictamente si son iguales
        System.out.printf("\n %s",aaa);
        
        boolean bbb = cadena2.toUpperCase().equals(cadena1.toUpperCase()); // meramente las convierte a el mismo formato sabiendo que si son iguales
        System.out.printf("\n %s",bbb);
        
        boolean ccc = cadena2.equalsIgnoreCase(cadena1); // la misma chota pero da igual si es MAYUS o no
        System.out.printf("\n %s",ccc);
        
        // podemos concatenar mas de 2 Strings usando el operador '+' ("" + variables)
    
    }
}
