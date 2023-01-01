package Ciclos;

public class CicloSwitch {
    public static void main (String[] args) {
    
        // Switch
        String colores = "Morado"; // usualmente se usan Chars o Strings, pero tambien puede ser cualquier tipo de variable menos 'bool'
        
        switch (colores) {
            case "Morado":
                System.out.println("Eso es morado");
                break;
            case "Negro":
                System.out.println("Eso es un negro :o");
                break;
                
            default: // cuando ninguno de los casos se cumpla porque somos re idiotas
                System.out.println("Esa chota no existe");    
                break;
        }

        
        String tipoDia = "";
        String diaSemana = "Lunes";

        switch (diaSemana.toLowerCase()) { // una manera mas facil para evitar poner condicionales, de una vez existe el metodo que cambia el formato
            case "lunes":
                tipoDia = "Inicio de semana";
                break;
            case "martes":
            case "míercoles":
            case "jueves":
                tipoDia = "Mediados de semana";
                break;
            case "viernes":
                tipoDia = "Inicio de fin se semana";
                break;
            case "sábado":
            case "domingo":
                tipoDia = "Fin de seman";
                break;
        }
        System.out.println(diaSemana + " es " + tipoDia);
    }
}
