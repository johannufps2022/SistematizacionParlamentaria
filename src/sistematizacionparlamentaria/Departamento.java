/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistematizacionparlamentaria;

/**
 *
 * @author estudiante
 */
public class Departamento {
    String nombre;
    Integer curul;
    
    public Departamento()
    {
        
    }

    public Departamento(String nombre, Integer curul)
    {
        this.nombre=nombre; 
        this.curul=curul;
    }
}
