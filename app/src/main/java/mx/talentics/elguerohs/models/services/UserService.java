package mx.talentics.elguerohs.models.services;

import mx.talentics.elguerohs.models.Sucursal;

public interface UserService  {
    public Sucursal getSucursal();
    public boolean setSucursal(Sucursal sucursal);
}
