/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.atos.vrental.service;

import com.atos.vrental.DTO.ClientesDTO;
import com.atos.vrental.entity.Clientes;
import java.util.List;

/**
 *
 * @author Equipo
 */
public interface ClientesService {
    List<Clientes> getAll();
    
    String getAllClientes();
    
    void save(ClientesDTO clientDTO);
    
}
