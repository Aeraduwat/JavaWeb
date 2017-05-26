/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package turismo.servicio;

import turismo.dominio.Conectar;

/**
 *
 * @author Felipe Alonso
 */
public class TestConnect {

    public static void main(String[] args) {
        Conectar cn = new Conectar();
        if (cn.obtener_conexion() != null) {
            System.out.println("Conectado");
        } else {
            System.out.println("NO conectado");
        }
    }

}
