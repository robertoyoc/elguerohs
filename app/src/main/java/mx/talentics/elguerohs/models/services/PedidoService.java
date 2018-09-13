package mx.talentics.elguerohs.models.services;

import mx.talentics.elguerohs.models.Entrega;
import mx.talentics.elguerohs.models.Producto;

public interface PedidoService {
    public Entrega getEntrega();
    public boolean setEntrega(Entrega entrega);
    public Producto getProducto();
    public boolean setProducto(Producto producto);
    public int getCantidad();
    public int setCantidad(int cantidad);

}
