import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nombre;
    private String correo;
    private List<Producto> productosComprados;
    private double costoTotal;

    public Cliente(String nombre, String correo) {
        this.nombre = nombre;
        this.correo = correo;
        this.productosComprados = new ArrayList<>();
        this.costoTotal = 0;
    }

    public void comprarProducto(Producto producto, int cantidad) {
        if (producto.getCantidadStock() >= cantidad && producto instanceof Vendible) {
            Vendible vendibleProducto = (Vendible) producto;
            double costoProducto = vendibleProducto.calcularPrecioVenta(cantidad);
            costoTotal += costoProducto;
            productosComprados.add(producto);
            producto.actualizarStock(cantidad);
            System.out.println(nombre + " compró " + cantidad + " unidad(es) de " + producto.getNombre() + " por $" + costoProducto);
        } else {
            System.out.println("Stock insuficiente o el producto no es vendible: " + producto.getNombre());
        }
    }

    public void mostrarCompra() {
        System.out.println("Total compra de " + nombre + ":");
        for (Producto producto : productosComprados) {
            producto.mostarInformacion();
        }
        System.out.println("Costo total: $" + costoTotal);
    }
}
