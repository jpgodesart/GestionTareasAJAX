/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.daw.operaciones;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class ProfesorGetprettycolumns implements GenericOperation {

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
        try {
           String data = "{\"data\": [\"id\", \"id_usuario\", \"nombre\", \"ape1\", \"ape2\", \"email\"]}";
            return data;
        } catch (Exception e) {
            throw new ServletException("ProfesorGetpagesJson: View Error: " + e.getMessage());
        }
    }
}

