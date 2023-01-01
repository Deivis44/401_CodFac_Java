class hola {

    public static void main (String[] args) {
        System.out.println("Hola Mundo care culo uwu \n");

        /* TIPOS DE DATOS
         * Enteros
         * Decimales (terminan con una 'f' luego se ser declarados)
         * Caracteres
         * Booleanos
         */

        int varX = 50, resultado;
        float varZ = 5.8f;

            System.out.println("\n--- OPERADORES ARITMETICOS ---");
        resultado = varX + (int)varZ;
        System.out.println( varZ);
        System.out.println((int)varZ); // convierte una variable de tipo int a float pero no redondea
        System.out.println("\t Una suma bien pendeja");
        System.out.printf("\t %s", resultado); // quiero ver como se tabula el numero tambien con "\t"
        
        // Algo parecido a un 'if' pero mas simple, podría servir aunque me da asco :v
            System.out.println("\n--- OPERADORES TERNARIOS XD ---");
        int enteros = false ? 1 : 0;
        System.out.println(enteros);
        
        // Cadenas con metodos
            // hay varios 'print' en Java pero por ahora implementamos el 'println' y 'printf'
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
        
        
            System.out.println("\n\n--- CICLOS Y CONDICIONALES ---");
        // If
        String colorLuz = "Amarillo";

        if (colorLuz == "Verde") {
            System.out.println("Puede continuar");
        } else if (colorLuz == "Amarillo") {
            System.out.println("Aguantese perro");
        } else if (colorLuz == "Rojo") { 
            System.out.println("No sea gei");
        } else {
            System.out.println("Ponga un pinche color");
        }
        
        
        // Scope = alcance (el area donde una variable puede ser utilizada)
            // basicamente si usamos una variable en un bloque, no la podemos llamar por fuera de este
        
        
        // Switch
        String colores = "Morado"; // usualmente se usan Chars o Strings, pero tambien puede ser cualquier tipo de variable menos 'bool'
        
        switch (colores) {
            case "Morado":
                System.out.println("Eso es morado");
                break;
            case "Negro":
                System.out.println("Eso es un negro :o");
                break;
                
            default: // cuando ninguno de los casos se cumpla porque somos re idiotas
                System.out.println("Esa chota no existe");    
                break;
        }

        
        String tipoDia = "";
        String diaSemana = "Lunes";

        switch (diaSemana.toLowerCase()) { // una manera mas facil para evitar poner condicionales, de una vez existe el metodo que cambia el formato
            case "lunes":
                tipoDia = "Inicio de semana";
                break;
            case "martes":
            case "míercoles":
            case "jueves":
                tipoDia = "Mediados de semana";
                break;
            case "viernes":
                tipoDia = "Inicio de fin se semana";
                break;
            case "sábado":
            case "domingo":
                tipoDia = "Fin de seman";
                break;
        }
        System.out.println(diaSemana + " es " + tipoDia);
        
        
        // While (comunmente usado para cuando NO se sabe cuantas veces se iterará)
        int contador = 0,contador2 = 1, numero = 123456789;
        
        while (numero > 0) {
            numero = numero / 10;
            contador ++;
        }
        System.out.println("El numero posee "+ contador + " digitos"); // un poco xd porque se rompe si todos los digitos son '0'
        
        // Do while (debe hacerse por lo menos una vez) ya que primero se ejecutan los pasos
        do {
            System.out.println(contador2);
            contador2 ++;
        } while (contador2 < 5);
        
        
        // for
        System.out.println("\n- Tabla del 7 muajaja -");
        for (int i = 7, x = 1; x < 11 ; x++) {
            int resultado3 = i * x;
            String mensaje3 = i + " * " + x + " = " + resultado3;
            System.out.printf("    %s\n", mensaje3);
        }
        System.out.println();
        // exsiten herramientas que pueden ser usadas dentro de ciclos (usualmente) para facilitar la iteracion de estos =  break, continue
        

        String str = "*", repetir = str.repeat(3);
        System.out.printf(repetir);
    }   
}