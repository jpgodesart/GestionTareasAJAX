/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.daw.operaciones;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 *
 * @author rafa
 */
public class AlumnoGetprettycolumns implements GenericOperation {

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
        try {
            String data = "{\"data\": [\"ID\", \"Usuario\", \"Nombre\", \"Ape1\", "
                    + "\"Ape2\", \"Em@il\", \"DNI\", \"Exp.\", \"Sexo\", \"Domicilio\", \"CP\", \"Población\", \"Provincia\",\"Tlf\"]}";
            return data;
        } catch (Exception e) {
            throw new ServletException("AlumnoGetpagesJson: View Error: " + e.getMessage());
        }
    }
}
