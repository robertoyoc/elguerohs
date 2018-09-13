package mx.talentics.elguerohs.models;

import java.util.List;

import mx.talentics.elguerohs.models.services.EntregaService;

public class Entrega implements EntregaService {
    private List<Pedido> pedidos;

    @Override
    public List<Pedido> getPedidos() {
        return null;
    }

    @Override
    public boolean addPedido(Pedido pedido) {
        return false;
    }

    @Override
    public boolean removePedido(Pedido pedido) {
        return false;
    }
}
