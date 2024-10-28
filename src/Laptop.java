public class Laptop extends Producto implements Vendible {

public String procesador ;
public String memoriaRam;

    public Laptop(String nombre, String marca, double precio, int cantidadStock, String procesador) {
        super(nombre, marca, precio, cantidadStock);
        this.procesador = procesador;
        this.memoriaRam = memoriaRam;
        this.cantidadStock =cantidadStock;
        this.precio = precio;
    }

    public Laptop(String nombre, String marca, double precio, int cantidadStock) {
        super(nombre, marca, precio, cantidadStock);
    }

    @Override
    public void mostarInformacion() {
        System.out.println("Laptop " +", procesador: " + getProcesador()+ " ,Memoria:" + getMemoriaRam()+",Stock: "+getCantidadStock()) ;

    }


    public Laptop() {
    }

    public Laptop(String procesador, String memoriaRam) {
        this.procesador = procesador;
        this.memoriaRam = memoriaRam;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public String getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(String memoriaRam) {
        this.memoriaRam = memoriaRam;
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
