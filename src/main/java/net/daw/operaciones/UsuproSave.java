/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.daw.operaciones;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import net.daw.bean.UsuproBean;
import net.daw.dao.UsuproDao;
import net.daw.helper.Conexion;
import net.daw.helper.EncodingUtil;

/**
 *
 * @author rafa
 */
public class UsuproSave implements GenericOperation {

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {

        try {
            UsuproDao oUsuproDAO = new UsuproDao(Conexion.getConection());
            UsuproBean oUsupro = new UsuproBean();
            Gson gson = new Gson();
            String jason = request.getParameter("json");
            jason = EncodingUtil.decodeURIComponent(jason);
            oUsupro = gson.fromJson(jason, oUsupro.getClass());
            Map<String, String> data = new HashMap<>();
            if (oUsupro != null) {
                oUsupro = oUsuproDAO.set(oUsupro);
                data.put("status", "200");
                data.put("message", Integer.toString(oUsupro.getId()));
            } else {
                data.put("status", "error");
                data.put("message", "error");
            }
            String resultado = gson.toJson(data);
            return resultado;
        } catch (Exception e) {
            throw new ServletException("UsuproSaveJson: View Error: " + e.getMessage());
        }
    }
}
