/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FabricaElectro;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Fabrica fabrica = new Fabrica();
        System.out.println("Listado de elementos segun la sucursal");
        altaFabrica(fabrica); // CREO UNA FABRICA CON SUS SUCURSALES Y DOY DE ALTA ALGUNOS ELECTRO

        fabrica.listarElectro();  //MUESTRO LA LISTA DE ELECTRO POR SUCURSAL

        System.out.println("****************************************");

        // CON ESTE ARRAYLIST, IDENTIFICO UN TIPO DE ELECTRO INGRESADO,  LO DERIVO A UNA LISTA CON SOLO ESE ELEMENTO
        System.out.println("Listado de elementos según su tipo");
        ArrayList<Electrodomestico> listaDeElectroTipo = fabrica.tipoDeElectro(TipoDeElectrodomestico.HELADERA);
        for (Electrodomestico electrodomestico : listaDeElectroTipo) {
            System.out.println(electrodomestico);
        }
        System.out.println("******************************************");

        ///BORRO UN ELECTRO POR ID Y MUESTRO EL ELEMENTO ELIMINADO
        System.out.println("Elemento buscado por id y eliminado . Muestro el elemento eliminado");
        Electrodomestico borrado = fabrica.borrarElectro("he-004");
        System.out.println("Se elemino el siguiente elemento: " + borrado);

        System.out.println("*******************************************");

        //LISTO DE NUEVO LOS ELECTRO, PARA VERIFICAR QUE EL ELEMENTO FUE ELIMINADO
        System.out.println("Listado actualizado de elementos según la sucursal");
        fabrica.listarElectro();

        System.out.println("");

        //CON ESTA PORCION DE CODIGO, SACO EL PORCENTAJE DE PRODUCTOS EN STOCK
        System.out.println("Porcentaje de stock por sucursal");

        double[] porcenElectro = fabrica.electroPorcentajeTipo("Sucursal norte");

        for (int i = 0; i < porcenElectro.length; i++) {
            System.out.println("Su porcentaje es " + porcenElectro[i]);

            System.out.println("");

        }

    }

    public static void altaFabrica(Fabrica fabrica) {

        Sucursal sucursal1 = new Sucursal("Sucursal norte");
        Sucursal sucursal2 = new Sucursal("Sucursal sur");

        fabrica.agregarSucursal(sucursal1);
        fabrica.agregarSucursal(sucursal2);

        sucursal1.agregarElectro(new Electrodomestico("he-001", 80.000,
                TipoDeElectrodomestico.HELADERA));

        sucursal1.agregarElectro(new Electrodomestico("he-002", 50.000,
                TipoDeElectrodomestico.HELADERA));

        sucursal1.agregarElectro(new Electrodomestico("co-001", 30.000,
                TipoDeElectrodomestico.COCINA));

        sucursal1.agregarElectro(new Electrodomestico("la-001", 120.000,
                TipoDeElectrodomestico.LAVARROPA));

        sucursal2.agregarElectro(new Electrodomestico("he-003", 80.000,
                TipoDeElectrodomestico.HELADERA));

        sucursal2.agregarElectro(new Electrodomestico("he-004", 50.000,
                TipoDeElectrodomestico.HELADERA));

        sucursal2.agregarElectro(new Electrodomestico("co-002", 30.000,
                TipoDeElectrodomestico.COCINA));

        sucursal2.agregarElectro(new Electrodomestico("la-002", 120.000,
                TipoDeElectrodomestico.LAVARROPA));

    }

}
