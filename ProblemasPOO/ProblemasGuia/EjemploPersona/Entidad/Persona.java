package ProblemasPOO.ProblemasGuia.EjemploPersona.Entidad;

public class Persona {
    public String nombre;
    public String apellido;
    public int edad;
    public String direccion;
    
    //contructor por defecto
    public Persona(){
    }

    //contructor con parametros
    public Persona(String nom,int ed){
        this.nombre = nom;
        this.edad = ed;
    }
}

 