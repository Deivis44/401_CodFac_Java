package POO.__interfaces;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class principal9 {
    
    public static void main(String[] args) {
        
            String name = JOptionPane.showInputDialog(null, "¿Cómo te llamas pana?");
            int age = Integer.parseInt(JOptionPane.showInputDialog(null, "Y ¿Cúal es tu edad?"));
            JOptionPane.showMessageDialog(null, "Gracias pa :)");
            System.out.println("Hola, " + name + " veo que tienes " + age);

        Scanner sc = new Scanner(System.in); // inicia metodo de lectura de consola

        System.out.println("¿Cúal es un tu nombre? ");
        String nombre = sc.nextLine();
        
        System.out.println("¿Cúal es un tu edad? ");
        int edad = sc.nextInt(); //Integer.parseInt(sc.nextLine());
        
        System.out.println("¿Cúal es tu altura? ");
        float altura = sc.nextFloat();
        
        sc.nextLine();
        System.out.println("¿Te gusto el curso? ");
        boolean valor = sc.nextLine().equals("si");
        
        System.out.println("Hola " + nombre + " tienes "  + edad + " años y mides: " + altura + " // " + valor);
        sc.close(); // detiene la lecutra de datos en la consola

    }
}
