/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.atos.vrental.controller;

import com.atos.vrental.DTO.ClientesDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.atos.vrental.service.ClientesService;

/**
 *
 * @author Equipo
 */

@Controller
@RequestMapping("/clients")
public class ClientesController {
    
    @Autowired
    private ClientesService clientService;
    
    @GetMapping( value = "/profile" )
    public String profile(Model model){
        model.addAttribute("client", new ClientesDTO());
        return "clientprofile";
    }
    
    @PostMapping(value = "save")
    public ModelAndView save(ClientesDTO client, BindingResult bindingResult){
        if (bindingResult.hasErrors()) {
            return new ModelAndView("clientprofile");
        }
        clientService.save(client);
        return new ModelAndView("redirect:/");
    }
}
