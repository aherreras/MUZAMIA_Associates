/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package muzamia_associates.dao;

import java.util.List;
import muzamia_associates.dto.Kitt;

/**
 *
 * @author User
 */
public interface DaoKitt {
    
    public List<Kitt> listarKitts();
    
    public Double obtenerPrecio(Integer id);
    
}
