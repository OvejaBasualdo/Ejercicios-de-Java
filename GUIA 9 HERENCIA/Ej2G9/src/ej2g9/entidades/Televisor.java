package ej2g9.entidades;

public final class Televisor extends Electrodomestico {

    private Integer resolucion;
    private Boolean sintonizador = false;

    public Televisor() {
    }

    public void crearTelevisor() {
        System.out.println("Ingrese los datos del nuevo televisor: ");
        crearElectrodomestico();
        System.out.println("Ingrese resolución en pulgadas: ");
        resolucion = leer.nextInt();
        System.out.println("Posee sintonizador? (S/N)");
        String res = leer.next();

        sintonizador = res.equalsIgnoreCase("S");

    }
    
    
    public void precioFinalTV()
    {
        precioFinal();
        
        if(resolucion>40 && sintonizador == false)
        {
            precio =  precio * 1.30;
        }
        else if(resolucion>40 && sintonizador == true)
        {
            precio = (precio * 1.30) + 500;
        }
        else if(resolucion <40 && sintonizador == true)
        {
            precio = precio + 500;
        }
        
    }      
            

    public Televisor(Integer resolucion, Boolean sintonizador) {
        this.resolucion = resolucion;
        this.sintonizador = sintonizador;
    }

    public Televisor(Integer resolucion, Boolean sintonizador, Double precio, String color, char consElect, Double peso) {
        super(precio, color, consElect, peso);
        this.resolucion = resolucion;
        this.sintonizador = sintonizador;
    }

    public Integer getResolucion() {
        return resolucion;
    }

    public void setResolucion(Integer resolucion) {
        this.resolucion = resolucion;
    }

    public Boolean getSintonizador() {
        return sintonizador;
    }

    public void setSintonizador(Boolean sintonizador) {
        this.sintonizador = sintonizador;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsElect() {
        return consElect;
    }

    public void setConsElect(char consElect) {
        this.consElect = consElect;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        
        return "Televisor{" + "resolucion=" + resolucion + ", sintonizador=" + sintonizador + '}'+"Electrodomestico{" + "precio=" + precio + ", color=" + color + ", consElect=" + consElect + ", peso=" + peso + '}';
        
    }

    
}
