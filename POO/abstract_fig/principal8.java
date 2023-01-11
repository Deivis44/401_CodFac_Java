package POO.abstract_fig;

public class principal8 {
    
    public static void main(String[] args) {

        figura figuras[] =  new figura[2];

        figura circulo = new circulo(9f);
        figura triangulo = new triangulo(10f, 5f);

        figuras[0] = circulo;
        figuras[1] = triangulo;

        System.out.println(figuras[0].area());
        System.out.println(figuras[1].area());
    }
}
