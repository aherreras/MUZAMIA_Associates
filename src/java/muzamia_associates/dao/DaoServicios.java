/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package muzamia_associates.dao;

import java.util.List;
import muzamia_associates.dto.Servicios;
/**
 *
 * @author User
 */
public interface DaoServicios {
    
    public List<Object[]> listarServicios(Integer id);
    
    public List<Object[]> listarServicios();
    
    public List<Object[]> listarServicios2();
    
    public Double obtenerPrecio(Integer id);
    
}
