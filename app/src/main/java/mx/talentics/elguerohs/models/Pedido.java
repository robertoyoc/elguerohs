package mx.talentics.elguerohs.models;

import mx.talentics.elguerohs.models.services.PedidoService;

public class Pedido implements PedidoService {
    private Entrega entrega;
    private Producto producto;
    private int cantidad;

    @Override
    public Entrega getEntrega() {
        return null;
    }

    @Override
    public boolean setEntrega(Entrega entrega) {
        return false;
    }

    @Override
    public Producto getProducto() {
        return null;
    }

    @Override
    public boolean setProducto(Producto producto) {
        return false;
    }

    @Override
    public int getCantidad() {
        return 0;
    }

    @Override
    public int setCantidad(int cantidad) {
        return 0;
    }
}
