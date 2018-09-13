package mx.talentics.elguerohs.models.services;

import java.util.List;

import mx.talentics.elguerohs.models.Pedido;

public interface EntregaService {
    public List<Pedido> getPedidos();
    public boolean addPedido(Pedido pedido);
    public boolean removePedido(Pedido pedido);
}
