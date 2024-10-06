/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.app_automovil.logica;

import com.mycompany.app_automovil.persistencia.ControladoraPersistencia;

/**
 *
 * @author DREP
 */
public class Controladora {
    ControladoraPersistencia controladoraJPA = new ControladoraPersistencia();

    public void agregarAuto(String modelo, String marca, String motor, String color, String placa, int cant_Puerta) {
        Auto auto = new Auto();
        auto.setModelo(modelo);
        auto.setMarca(marca);
        auto.setMotor(motor);
        auto.setColor(color);
        auto.setPlaca(placa);
        auto.setCant_Puerta(cant_Puerta); 
        controladoraJPA.agregarAuto(auto);
    }
    
}
