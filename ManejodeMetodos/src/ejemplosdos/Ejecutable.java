/*
  Generar un proceso que me permita ingresar 5(de manera obligatoria) ciudades
  Si las ciudades no cumplen con la condición (empezar con A, C, D); no se 
contabilizan
 */
package ejemplosdos;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejecutable {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int limite = 5;
        int contador = 1;
        String ciudad = "";
        while (contador <= limite) {
            System.out.println("Ingrese una ciudad");
            ciudad = entrada.nextLine();
            boolean resultado = Operacion.comprobarCadena(ciudad);
            if (resultado == true){
                contador = contador + 1;
            }else{
                System.out.println("Valor ingresado fuera de rango");
            }
            System.out.printf("%s\n", ciudad);
            
        }
        //String nombreCiudad = "Arenillas";
        //boolean resultado = Operacion.comprobarCadena(nombreCiudad);
        //System.out.printf("%s\n", resultado);
    }
}
