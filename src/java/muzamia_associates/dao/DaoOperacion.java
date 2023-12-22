/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package muzamia_associates.dao;

import java.util.List;
import muzamia_associates.dto.Operacion;

/**
 *
 * @author User
 */
public interface DaoOperacion {
    
    public Integer registrarOperacion (Operacion operacion);
    
    public List<Object[]> listarOperaciones();
    
    public Object[] getOperacion1 (int idOperacion);
    
    public Object[] getOperacion2_4 (int idOperacion);
    
}
