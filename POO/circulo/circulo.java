package POO.circulo;


public class circulo {
    
    public static float pi = 3.1415926535f; // le pertenece a la clase y ya no al objeto
    public float radio = 0f; // de instancia = le pertecence al objeto

    public circulo(float radio) {
        this.radio = radio;
    }

    public static float area(float radio) { // metodo de clase
        return circulo.pi * (radio * radio);
    }
}
