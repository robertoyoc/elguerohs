package mx.talentics.elguerohs.models.services;

import java.util.List;
import mx.talentics.elguerohs.models.Repartidor;

public interface SucursalService {
    public List<Repartidor> getRepartidores();
    public boolean addRepartidor(Repartidor repartidor);
    public boolean removeRepartidor(Repartidor repartidor);
}
