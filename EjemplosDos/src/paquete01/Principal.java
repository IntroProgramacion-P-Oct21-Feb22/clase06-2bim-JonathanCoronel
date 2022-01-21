/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

import paquete02.DatoPersonal;
import paquete02.DatoTrabajo;
import paquete03.DatosUbicacion;
import paquete04.DatoAcademico;
import paquete05.DatoFinal;

/**
 *
 * @author reroes
 */
public class Principal {

    public static void main(String[] args) {
        String nombre;
        String ciudad;
        String apellidoRetornado;
        String nombreEmpresa;
        String direccionEmpresa;
        double[] misnotas;
        double promedio;

        nombre = DatoPersonal.obtenerNombre();
        apellidoRetornado = DatoPersonal.obtenerApellido();
        ciudad = DatosUbicacion.obtenerCiudad();
        nombreEmpresa = DatoTrabajo.obtenerNombreEmpresa();
        direccionEmpresa = DatoTrabajo.obtenerDireccionEmpresa();
        misnotas = DatoAcademico.obtenerNotas(4);
        promedio = DatoFinal.obtenerPromedio(misnotas);
        System.out.printf("Los datos ingresados son:\n"
                + "Nombre: %s\n"
                + "Apellido: %s\n"
                + "Ciuadad: %s\n"
                + "Nombre de la Empresa: %s\n"
                + "Dirección de la Empresa: %s\n"
                + "Promedio es: %.2f\n",
                nombre,
                apellidoRetornado,
                ciudad,
                nombreEmpresa,
                direccionEmpresa,
                promedio);
    }

}
