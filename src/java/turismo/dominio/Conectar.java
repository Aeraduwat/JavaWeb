/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package turismo.dominio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Felipe Alonso
 */
public class Conectar {

    Connection conect;
    String url;
    String user;
    String pass;

    public Conectar() {
        
        this.url = "jdbc:mysql://mysql23422-test1.j.facilcloud.com:3306/turismo";
        this.user = "root";
        this.pass = "lB7xrOBDRX";
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.err.println(e);
        }
        try {
            conect = (Connection) DriverManager.getConnection(url, user, pass);
            System.out.println("Asignando terminado");
       } catch(com.mysql.jdbc.exceptions.jdbc4.CommunicationsException ex){
            System.out.println("Error " +ex);
        }catch(SQLException e){
            System.out.println(e);
        }
    }

    public Connection obtener_conexion() {
        return conect;
    }

    public void cerrar_conexion() {
        if (conect != null) {
            try {
                conect.close();
            } catch (SQLException ex) {
                System.out.println(ex);
            }
        }
    }
}
