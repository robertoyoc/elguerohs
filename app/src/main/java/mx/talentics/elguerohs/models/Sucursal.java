package mx.talentics.elguerohs.models;

import java.util.List;

import mx.talentics.elguerohs.models.services.SucursalService;

public class Sucursal implements SucursalService {
    private List<Repartidor> repartidores;

    @Override
    public List<Repartidor> getRepartidores() {
        return null;
    }

    @Override
    public boolean addRepartidor(Repartidor repartidor) {
        return false;
    }

    @Override
    public boolean removeRepartidor(Repartidor repartidor) {
        return false;
    }
}
