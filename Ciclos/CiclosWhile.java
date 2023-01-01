package Ciclos;

public class CiclosWhile {
    public static void main (String[] args) {
    
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
    }
}
