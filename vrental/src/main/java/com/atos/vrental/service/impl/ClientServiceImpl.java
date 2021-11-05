/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.atos.vrental.service.impl;

import com.atos.vrental.DAO.ClientRepository;
import com.atos.vrental.DTO.ClientDTO;
import com.atos.vrental.entity.Client;
import com.atos.vrental.service.ClientService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Equipo
 */
@Service
public class ClientServiceImpl implements ClientService {
    
    @Autowired
    private ClientRepository clientRepository;

    @Override
    public List<Client> getAll() {
        List<Client> clients = clientRepository.findAll();
        return clients;
    }
    
    @Override
    public void save(ClientDTO clientDTO) {
        Client client = new Client();
        client.setClientId(clientDTO.getClientId());
        client.setFirstname(clientDTO.getFirstname());
        client.setLastname(clientDTO.getLastname());
        client.setPhone(clientDTO.getPhone());
        client.setUsername(clientDTO.getFirstname() + "_" + clientDTO.getLastname());
        clientRepository.save(client);
    }
    
}
