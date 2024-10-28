public class Celular extends Producto implements Vendible{

private int capacidadBateria;
private String camaraResolucion;

    public Celular(String nombre, String marca, double precio, int cantidadStock) {
        super(nombre, marca, precio, cantidadStock);
    }

    @Override
    public void mostarInformacion() {
        System.out.println("Celular "+", capacidad de bateria: "+getCapacidadBateria()+ ", Camara resolucion: "+getCamaraResolucion()+",Stock: "+getCantidadStock() );
    }

    public Celular() {
    }

    public Celular(String camaraResolucion, int capacidadBateria) {
        this.camaraResolucion = camaraResolucion;
        this.capacidadBateria = capacidadBateria;
    }

    public String getCamaraResolucion() {
        return camaraResolucion;
    }

    public void setCamaraResolucion(String camaraResolucion) {
        this.camaraResolucion = camaraResolucion;
    }

    public int getCapacidadBateria() {
        return capacidadBateria;
    }

    public void setCapacidadBateria(int capacidadBateria) {
        this.capacidadBateria = capacidadBateria;
    }


    @Override
    public double calcularPrecioVenta(int cantidad) {
        double total = precio * cantidad;
        if (cantidad > 5) {
            total *= 0.10;
        }
        return total;
    }
}
