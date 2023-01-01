package Ciclos;

public class CicloFor {
    public static void main (String[] args) {

        // for
        System.out.println("\n- Tabla del 7 muajaja -");
        for (int i = 7, x = 1; x < 11 ; x++) {
            int resultado3 = i * x;
            String mensaje3 = i + " * " + x + " = " + resultado3;
            System.out.printf("    %s\n", mensaje3);
        }
        System.out.println();
        // exsiten herramientas que pueden ser usadas dentro de ciclos (usualmente) para facilitar la iteracion de estos =  break, continue
    }
}
