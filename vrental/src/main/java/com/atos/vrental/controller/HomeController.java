/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.atos.vrental.controller;

import com.atos.vrental.entity.Clientes;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.atos.vrental.service.ClientesService;

/**
 *
 * @author Equipo
 */
@Controller
public class HomeController {
    
    @Autowired
    private ClientesService clientService;
    
    @GetMapping(value = "/")
    public String home(Model model){
        //List<Clientes> clients = clientService.getAll();
        String datos = clientService.getAllClientes();
        model.addAttribute("clients", datos);
        model.addAttribute("name", "Fernando");
        return "home";
    }
}
