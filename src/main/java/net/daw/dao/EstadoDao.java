/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.daw.dao;

import net.daw.bean.EstadoBean;
import net.daw.helper.Conexion;


public class EstadoDao extends GenericDaoImplementation<EstadoBean> {
    
     public EstadoDao(Conexion.Tipo_conexion tipoConexion) throws Exception {
        super(tipoConexion,"estado");
    }
    
}
