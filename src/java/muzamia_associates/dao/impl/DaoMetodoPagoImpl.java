/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package muzamia_associates.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import muzamia_associates.dao.DaoMetodoPago;
import muzamia_associates.dto.MetodoPago;
import muzamia_associates.sql.ConectaDb;

/**
 *
 * @author User
 */
public class DaoMetodoPagoImpl implements DaoMetodoPago {

    private final ConectaDb db;
    private final StringBuilder sql;
    private String message;

    public DaoMetodoPagoImpl() {
        db = new ConectaDb();
        this.sql = new StringBuilder();
    }

    @Override
    public List<Object[]> listaMetodosPago() {
        List<Object[]> list = null;
        sql.append("SELECT ")
                .append("mpag_id,")
                .append("mpag_descripcion,")
                .append("mpag_comision,")
                .append("mpag_estado ")
                .append("FROM METODO_PAGO ")
                .append("WHERE mpag_estado = true;");

        try ( Connection cn = db.getConnection();  PreparedStatement ps = cn.prepareStatement(sql.toString())) {
            list = new LinkedList<>();
            try ( ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    Object[] reg = new Object[2];

                    reg[0] = rs.getInt(1);
                    reg[1] = rs.getString(2);
//                    reg[2] = rs.getDouble(3);
//                    reg[3] = rs.getBoolean(4);

                    list.add(reg);
                }
            }

        } catch (SQLException e) {
            message = e.getMessage();
        }
        
        return list;
    }
    
}
