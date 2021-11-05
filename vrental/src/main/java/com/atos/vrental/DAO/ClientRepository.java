/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.atos.vrental.DAO;

import com.atos.vrental.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Equipo
 */
public interface ClientRepository extends JpaRepository<Client, Long>{
    
}
