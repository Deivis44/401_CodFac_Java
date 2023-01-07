package POO.calculadora;

public class calculadora {

    public int suma(int... numeros){ // n cantidad de parametros de tipo int
        int suma = 0;

        System.out.println("Esa chota tiene esta n cantidad de numeros: " + numeros.length);
        for (int numero : numeros) { // 'numeros' es un arreglo
            suma += numero;
        }

        return suma;
    }
}
