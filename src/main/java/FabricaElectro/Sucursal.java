package FabricaElectro;

import java.util.ArrayList;

public class Sucursal {
    
    private String nombre;
    private ArrayList<Electrodomestico> electrodomestico;
    
    public Sucursal(String nombre) {
        this.nombre = nombre;
        this.electrodomestico = new ArrayList<>();
    }
    
    public String getNombre() {
        return nombre;
    }
    
    //Metodo para agregar elementos y metodo para mostrar
    public void agregarElectro(Electrodomestico electro) {
        this.electrodomestico.add(electro);
    }
    
    public void listarElectro() {
        for (Electrodomestico electrodomestico1 : electrodomestico) {
            
            System.out.println(electrodomestico1);
            
        }
    }
    
    //metodo para buscar todos los elementos existentes segun su tipo de electro
    public ArrayList<Electrodomestico> tipoDeElectro(TipoDeElectrodomestico tipo) {
        ArrayList<Electrodomestico> listaTipoElectro = new ArrayList<>();
        for (Electrodomestico electrodomestico1List : electrodomestico) {
            if (electrodomestico1List.getTipo() == tipo) {
                
                listaTipoElectro.add(electrodomestico1List);
                
            }
        }
        
        return listaTipoElectro;
    }
    
    
    //metodo para borrar elemento por id
    public Electrodomestico borrarElectro(String id) {
        Electrodomestico electroAEliminar = buscar(id);
        this.electrodomestico.remove(electroAEliminar);
        return electroAEliminar;
        
    }
    
    //metodo para buscar elemento por id
    
    private Electrodomestico buscar(String id) {
        int i = 0;
        Electrodomestico electroEncontrado = null;
        while (i < electrodomestico.size() && !this.electrodomestico.get(i).getId().equals(id)) {            
            i++;
        }
        if (i < electrodomestico.size()) {
            electroEncontrado = this.electrodomestico.get(i);
        }
        
        return electroEncontrado;
        
    }
    
    ///metodos para sacar el porcentaje de electro en stock, utilizando un array
    
    public double[] porcentajePorTipo(){
        
    final int cantElectro = TipoDeElectrodomestico.values().length;
    double [] porcentaje = new double[cantElectro];
    
        for (Electrodomestico electro : electrodomestico) {
            porcentaje [electro.getTipo().ordinal()]++; // con este linea doy la cantidad de elementos por tipo
        }
        
        totalPorcentaje(porcentaje);
        
        return porcentaje;
    
    }
    
    public void totalPorcentaje(double[] porcentaje){
        
        for (int i = 0; i < porcentaje.length; i++) {
            porcentaje[i] =( porcentaje[i] * 100) / electrodomestico.size();

        }
    
    }
    
}
