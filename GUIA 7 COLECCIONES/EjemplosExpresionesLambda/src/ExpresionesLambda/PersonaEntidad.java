
package ExpresionesLambda;

public class PersonaEntidad {
    private Integer Edad;
    private String nombre;

    public PersonaEntidad(Integer Edad, String nombre) {
        this.Edad = Edad;
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return Edad;
    }

    public void setEdad(Integer Edad) {
        this.Edad = Edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "PersonaEntidad{" + "Edad=" + Edad + ", nombre=" + nombre + '}';
    }
    
    
}
