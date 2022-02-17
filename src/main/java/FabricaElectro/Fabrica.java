package FabricaElectro;

import java.util.ArrayList;

public class Fabrica {

    private ArrayList<Sucursal> sucursales;

    public Fabrica() {
        this.sucursales = new ArrayList<>();
    }

    ///***********************************************
    public double[] electroPorcentajeTipo(String nombreSuc) {
        double[] porcentajes = null;

        Sucursal sucEncontrada = buscarSucursal(nombreSuc);

        if (sucEncontrada != null) {
            porcentajes = sucEncontrada.porcentajePorTipo();
        }

        return porcentajes;

    }

    ///***********************************************
    private Sucursal buscarSucursal(String nombreSuc) {
        int i = 0;
        Sucursal sucursalEncontrado = null;
        while (i < sucursales.size() && !this.sucursales.get(i).getNombre().equals(nombreSuc)) {
            i++;
        }
        if (i < sucursales.size()) {
            sucursalEncontrado = this.sucursales.get(i);
        }

        return sucursalEncontrado;

    }

    ///***********************************************
    public void listarElectro() {
        for (Sucursal sucursal : sucursales) {
            System.out.println(sucursal.getNombre());
            sucursal.listarElectro();
        }
    }

    ///***********************************************
    public void agregarSucursal(Sucursal suc) {
        this.sucursales.add(suc);
    }

    public ArrayList<Electrodomestico> tipoDeElectro(TipoDeElectrodomestico tipo) {
        ArrayList<Electrodomestico> listaTipoElectro = new ArrayList<>();
        for (Sucursal sucursalList : sucursales) {
            listaTipoElectro.addAll(sucursalList.tipoDeElectro(tipo));
        }

        return listaTipoElectro;
    }
    
    ///***********************************************

    public Electrodomestico borrarElectro(String id) {
        Electrodomestico eliminar = null;
        int i = 0;

        while (i < sucursales.size() && eliminar == null) {
            eliminar = sucursales.get(i).borrarElectro(id);
            i++;
        }

        return eliminar;

    }

}
