/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.app_automovil.persistencia;

import com.mycompany.app_automovil.logica.Auto;

/**
 *
 * @author DREP
 */
public class ControladoraPersistencia {
 AutoJpaController autoJPA = new AutoJpaController();
    public void agregarAuto(Auto auto) {
       autoJPA.create(auto);     
     }
    
}
