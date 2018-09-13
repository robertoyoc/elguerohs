package mx.talentics.elguerohs.models;


import mx.talentics.elguerohs.models.services.UserService;

public class User implements UserService {

    private Sucursal sucursal;

    @Override
    public Sucursal getSucursal() {
        return null;
    }

    @Override
    public boolean setSucursal(Sucursal sucursal) {
        return false;
    }
}
