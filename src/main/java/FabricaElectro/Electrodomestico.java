package FabricaElectro;

public class Electrodomestico {

    private String id;
    private double precio;
    private TipoDeElectrodomestico tipo;

    public Electrodomestico(String id, double precio, TipoDeElectrodomestico tipo) {
        this.id = id;
        this.precio = precio;
        this.tipo = tipo;
    }

    public TipoDeElectrodomestico getTipo() {
        return tipo;
    }

    public String getId() {
        return id;
    }
    
    

    @Override
    public String toString() {
        return "Electrodomestico{" + "id=" + id + ", precio=" + precio + ", tipo=" + tipo + '}';
    }
    
    
}
