package Strings;

public class cadenas {
    public static void main (String[] args) {

        // pequeñas cositas para interactuar con la posicion de caracteres en strings
        String mensaje = "Hola Mundo";
        char letraH = mensaje.charAt(0);
        System.out.println(letraH);
            //

        String mensaje2 = "Hola Mundo";
        int indice = mensaje2.indexOf("M");
        System.out.println(indice);
            //

        String mensaje3 = "Este mensaje posee muchas letras a";
        int indicePrimeraA = mensaje3.indexOf("a"); // = 9
        int indiceSegundaA = mensaje3.indexOf("a", indicePrimeraA + 1); // = 23, el orden de ese metodo es "(indiceInicial, indiceFinal)"
        System.out.println();
        
        System.out.println(indicePrimeraA);
        System.out.println(indiceSegundaA);
            /* se puede usar un ciclo while si quiero ver todas las 'a'

                while (indicePrimeraA != -1) { // -1 porque esta es la ultima posicion en la cadena de texto
                    System.out.println("La letra a se encuentra en la posición " + indicePrimeraA);
                    indicePrimeraA = mensaje3.indexOf("a", indicePrimeraA + 1);
                }

            */ 
            // Revisa la posicion de caracteres iguales que hay en una cadena
        
        String mensaje4 = "Hola Mundo";
        int indiceLetraM = mensaje4.indexOf("M");
        String subString = mensaje.substring(indiceLetraM);
        System.out.println(subString);
            // Muestra todo el texto que le siga luego del indice solicitado = 'Mundo'

        String mensaje5 = "Hola mundo";
        int indiceLetram = mensaje5.indexOf("m"); // = 5
        System.out.println(indiceLetram);
        int indiceLetraO = mensaje5.indexOf("o"); // = 1
        int indicesegundaO = mensaje5.indexOf("o", indiceLetraO + 1); // segunda 'o' = 9
        System.out.println(indicesegundaO);
    
        String subString2 = mensaje5.substring(indiceLetraO, indiceLetraO + 3); // = ola
        System.out.println(subString2);
            // Muestra tanto la posición de 'm' y 2°'o' aparte de que puedo coger un rango de palabras en el String

        //
    }
}
