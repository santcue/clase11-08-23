package agregacion2;

public class Producto {
    private String NombreProducto;
    private int valor;

    public Producto(String nombreProducto, int valor) {
        NombreProducto = nombreProducto;
        this.valor = valor;
    }

    public String getNombreProducto() {
        return NombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        NombreProducto = nombreProducto;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
}

