package agregacion2;

public class Factura {
    private String NumeroFactura;
    private String fecha;
    Producto producto;

    public Factura(String numeroFactura, String fecha, Producto producto) {
        NumeroFactura = numeroFactura;
        this.fecha = fecha;
        this.producto = producto;
    }
}
