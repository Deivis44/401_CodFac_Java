package arrays;
import java.util.Random;

public class arreglos {
    public static void main (String[] args) {

        String nombres[] = new String[3]; // primera manera de definir arreglos

        nombres[0] = "hola1";
        nombres[1] = "hola2";
        nombres[2] = "hola3";

        System.out.println( nombres[0] );
        System.out.println( nombres[1] );
        System.out.println( nombres[2] );


        System.out.println();
        String nombres2[] = {"Juan", "Pepe", "Nicolas"}; // segunda manera
        
        System.out.println( nombres2[0] );
        System.out.println( nombres2[1] );
        System.out.println( nombres2[2] );


        // recorrer un arreglo
        int calificaciones[] = {1,2,3,4,5,6,7,8,9};
        int suma = 0;
        System.out.printf("La cantidad de notas son: %s\n", calificaciones.length); // cantidad de elementos del arreglo
        
        for (int i = 0; i < calificaciones.length; i++) {
            int valor = calificaciones[i];
            System.out.println(valor);
            suma += calificaciones[i];
        }
        float promedio = suma / calificaciones.length;
        System.out.println("La suma es " + suma);
        System.out.println("El promedio es " + promedio);


        // recorrer un arreglo con foreach = obtiene el valor de cada elemento al iterar (en arreglos)
        for (int valorPorIndice : calificaciones) { // variable donde se almacenan los valores : el arreglo
            System.out.println(valorPorIndice);
            suma += valorPorIndice;
        }
        float promedio2 = suma / calificaciones.length;
        System.out.println("El segundo promedio es de: " +promedio2);


        // modificar valores en un arreglo a traves del for
        int numeros[] = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i;
            System.out.print(numeros[i]);
        }
        System.out.println();
        
        
        
        // matrices
        int matriz[][] = new int[4][3];
        Random rand = new Random();
        
        for (int posX = 0; posX < matriz.length; posX++) {
            for (int posY = 0; posY < matriz[posX].length; posY++) {
                System.out.print("[" + (matriz[posX][posY] = rand.nextInt(10)) + "]"); // defino valores aleatorios para una matriz gracias a la linea 2 y 64
            }
            System.out.println();
        }
        System.out.println();

        
        // matriz declarada de la otra forma y recorrida con foreach
        int matriz2[][] = {{1,2}, {3,4}};
        
        for (int fila[] : matriz2) {
            for (int celda : fila) {
                System.out.print(celda);
            }
            System.out.println();
        }
        System.out.println();
        
        
        // arreglos dinamicos
        int notas[][] = new int[5][]; // en este caso haremos una matriz con columnas diferentes

        notas[0] = new int[1]; // E
        notas[1] = new int[2]; // A
        notas[2] = new int[3]; // D
        notas[3] = new int[4]; // B
        notas[4] = new int[5]; // C
        
        for (int[] califAlumno : notas) { // ya que la matriz tiene columnas distintas para cada fila, no uso un for normal o entraria a un rango que no existe
            for (int notasF : califAlumno) {
                System.out.print((notasF = rand.nextInt(8)) + " ");
            }
            System.out.println();
        }
    }
}
