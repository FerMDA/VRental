/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.atos.vrental.service;

import com.atos.vrental.DTO.ClientDTO;
import com.atos.vrental.entity.Client;
import java.util.List;

/**
 *
 * @author Equipo
 */
public interface ClientService {
    List<Client> getAll();
    
    void save(ClientDTO clientDTO);
    
}
