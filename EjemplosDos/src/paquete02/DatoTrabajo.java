/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class DatoTrabajo {

    // método que permita preguntar al usuario el nombre de la empresa
    public static String obtenerNombreEmpresa() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la Empresa");
        String nombreEmpresa = entrada.nextLine();
        return nombreEmpresa;
    }
    // método que permita preguntar al usuario la dirección de la empres

    public static String obtenerDireccionEmpresa() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la Dirección de la Empresa");
        String direccionEmpresa = entrada.nextLine();
        return direccionEmpresa;
    }
}
