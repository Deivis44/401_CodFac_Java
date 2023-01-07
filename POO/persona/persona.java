package POO.persona;


public class persona { // clases anidadas
    
    public String username;

    public persona(String username){ // constructor
        this.username = username;
    }

    public void establecerRol() {
        administrador admin = new administrador();
        admin.trabajar();
    }
    

    public class administrador { // clase 2
        public void trabajar() {
            System.out.println("El administrador " + username + " se encuentra trabajando");
        }
    }
}
