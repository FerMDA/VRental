/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.atos.vrental.service.impl;

import com.atos.vrental.DTO.ClientesDTO;
import com.atos.vrental.entity.Clientes;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.atos.vrental.service.ClientesService;
import com.atos.vrental.DAO.ClientesRepository;

/**
 *
 * @author Equipo
 */
@Service
public class ClientesServiceImpl implements ClientesService {
    
    @Autowired
    private ClientesRepository clientRepository;

    @Override
    public List<Clientes> getAll() {
        List<Clientes> clients = clientRepository.findAll();
        return clients;
    }
    
    @Override
    public String getAllClientes() {
        List<Clientes> clientes = clientRepository.findAll();
        String datos = "";
        for (int i = 0; i < clientes.size(); i++) {
            datos += " " + clientes.get(i).getId_cliente();
            datos += " " + clientes.get(i).getNombre();
            datos += " " + clientes.get(i).getApellido();
            datos += " " + clientes.get(i).getTelefono();
            datos += " " + clientes.get(i).getUsuario();
            
        }
        
        
        return datos;
    }
    
    
    @Override
    public void save(ClientesDTO clientDTO) {
        Clientes client = new Clientes();
        client.setId_cliente(clientDTO.getId_cliente());
        client.setNombre(clientDTO.getNombre());
        client.setApellido(clientDTO.getApellido());
        client.setTelefono(clientDTO.getTelefono());
        client.setUsuario(clientDTO.getNombre() + "_" + clientDTO.getApellido());
        clientRepository.save(client);
    }

    
}
