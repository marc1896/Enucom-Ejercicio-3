package ejercicio3;

public class Vehiculo {
    //Atributos
    private String marca;
    private String modelo;
    private float precio;

    //Constructores
    public Vehiculo() {}

    public Vehiculo(String marca, String modelo, float precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    //Metodos
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    

    public String mostrarDatos() {
        return "Marca:" + marca + ", Modelo:" + modelo + ", Precio:" + precio + "\n";
    }    
}
