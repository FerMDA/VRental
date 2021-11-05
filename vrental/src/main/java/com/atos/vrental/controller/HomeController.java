/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.atos.vrental.controller;

import com.atos.vrental.entity.Client;
import com.atos.vrental.service.ClientService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author Equipo
 */
@Controller
public class HomeController {
    
    @Autowired
    private ClientService clientService;
    
    @GetMapping(value = "/")
    public String home(Model model){
        List<Client> clients = clientService.getAll();
        model.addAttribute("clients", clients);
        model.addAttribute("name", "Fernando");
        return "home";
    }
}
