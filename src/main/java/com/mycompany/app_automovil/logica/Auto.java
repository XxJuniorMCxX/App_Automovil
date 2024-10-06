package com.mycompany.app_automovil.logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@Entity

public class Auto implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_Auto;
    private String modelo;
    private String marca;
    private String motor;
    private String color;
    private String placa;
    int cant_Puerta;
 
}
