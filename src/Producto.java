abstract public class Producto {
    public String nombre;
    public String marca;
    public double precio;
    public  int cantidadStock;

    public abstract void mostarInformacion();

    public void actualizarStock(int cantidad) {
        this.cantidadStock -= cantidad;
}
    public Producto(String nombre, String marca, double precio, int cantidadStock) {
        this.nombre = nombre;
        this.marca = marca;
        this.precio = precio;
        this.cantidadStock = cantidadStock;

    }
    public Producto() {
    }
    public int getCantidadStock() {
        return cantidadStock;
    }

    public String getNombre() {
        return nombre;
    }


}
