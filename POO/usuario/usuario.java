package POO.usuario;

public class usuario {
    
    public String username;
    private String password;

    // Constructor = inicia un objeto durante su creacion (similar a un metodo)
    public usuario(String username, String password) {
        this.username =  username;
        this.password = password;
    }
    public usuario(String username) { // sobrecarga de constructores
        this.username = username;
        this.password = "";
    }


    public void saludar() {
        System.out.println("Hola, mi usuario es: " + this.username);
    }

        // Getter = accede al valor de una prop.
        public String getpassword() {
            return this.password;
        }

        // Setter = asignan/cambian el valor de una prop.
        public void setpassword(String password) {
            this.password = password;
        }
}
