package POO.abstract_fig;

public class circulo extends figura {
    
    public static final float pi = 3.1415f;

    private float radio;

    public circulo (float radio) {
        this.radio = radio;
    }

    @Override
    public float area(){
        return circulo.pi * (this.radio * this.radio);
    }
}
