package Operador;

public class aritmeticos {
    public static void main (String[] args) {

    int varX = 50, resultado;
    float varZ = 5.8f; 
    
    System.out.println("\n--- OPERADORES ARITMETICOS ---");
    resultado = varX + (int)varZ;
    System.out.println( varZ);
    System.out.println((int)varZ); // convierte una variable de tipo int a float pero no redondea
    System.out.println("\t Una suma bien pendeja");
    System.out.printf("\t %s", resultado); // quiero ver como se tabula el numero tambien con "\t"
    }   
}
