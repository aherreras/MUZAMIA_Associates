/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package muzamia_associates.dao;

import java.util.List;
import muzamia_associates.dto.DetOperacion;

/**
 *
 * @author User
 */
public interface DaoDetOperacion {
    
    public String registrarDetOperacion (DetOperacion detOperacion);
    
    public List<DetOperacion> getDetOperacion (int idOperacion);
    
}
