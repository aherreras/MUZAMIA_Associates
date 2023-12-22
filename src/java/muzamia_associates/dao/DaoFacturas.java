/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package muzamia_associates.dao;

import java.util.List;
import muzamia_associates.dto.Detalle;
import muzamia_associates.dto.Facturas;
/**
 *
 * @author User
 */
public interface DaoFacturas {
    
    public List<Facturas> listarFacturas();
    
    public Integer registrarFactura(Facturas facturas);
    
}
