package mx.talentics.elguerohs.models;

import java.util.List;

import mx.talentics.elguerohs.models.services.RepartidorService;

public class Repartidor extends User implements RepartidorService {
    private List<Entrega> entregas;

    @Override
    public List<Entrega> getEntregas() {
        return null;
    }

    @Override
    public boolean addEntrega(Entrega entrega) {
        return false;
    }

    @Override
    public boolean removeEntrega(Entrega entrega) {
        return false;
    }
}
