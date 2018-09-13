package mx.talentics.elguerohs.models;

import mx.talentics.elguerohs.models.services.ProductoService;

public class Producto implements ProductoService{
    private String nombre;

    @Override
    public String getNombre() {
        return null;
    }

    @Override
    public boolean setNombre(String nombre) {
        return false;
    }
}
