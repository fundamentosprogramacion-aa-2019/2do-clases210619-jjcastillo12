/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioenclase;

import ejemplotres.Operacion;

/**
 *
 * @author Usuario
 */
public class Principal {

    public static void main(String[] args) {
        String cadena = "";
        double resultado = 0;
        String[] personas = {"Ashley Cooper", "Christopher Gutierrez",
            "Rodney Thomas"};
        double[] costo_telefono_enero = {20.2, 70.2, 50.9};
        double[] costo_telefono_febrero = {10.2, 30.2, 120.9};
        cadena = String.format("Reporte\n",cadena);
        for (int i = 0; i < personas.length; i++) {
            resultado = Consumo.obtenerValorConsumo(
                    costo_telefono_enero[i],
                    costo_telefono_febrero[i]);
           
           cadena = String.format("%s%s paga de telefono %s\n", cadena, personas[i], resultado);
        }
        
        System.out.printf(cadena);
    }
}
