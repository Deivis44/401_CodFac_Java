package POO.abstract_fig;

public class triangulo extends figura {

    private float base;
    private float altura;

    public triangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public float area() {
        return (base*altura)/2;
    }
}
