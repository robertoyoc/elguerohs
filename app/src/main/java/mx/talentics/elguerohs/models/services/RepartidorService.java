package mx.talentics.elguerohs.models.services;

import java.util.List;

import mx.talentics.elguerohs.models.Entrega;

public interface RepartidorService {
    public List<Entrega> getEntregas();
    public boolean addEntrega(Entrega entrega);
    public boolean removeEntrega(Entrega entrega);

}
