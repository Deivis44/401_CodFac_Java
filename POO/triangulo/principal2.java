package POO.triangulo;

public class principal2 {
    public static void main(String[] args) {

        // Retornar valores
        triangulo triangulo = new triangulo();
        triangulo.base = 10;
        triangulo.altura = 20;

        float resultado = triangulo.area();
        System.out.println(resultado);
    }
}
