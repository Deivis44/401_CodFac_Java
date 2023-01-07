package POO.triangulo;

public class triangulo {
    float base, altura;

    float area() {
        return (this.base * this.altura) / 2;

            /* En vez de:
                float area = (this.base * this.altura) / 2;
                return area;
             */
    }
}
