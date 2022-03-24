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
public class Candidato {
    
    private String nombre;
    private String documento;
    private String email;
    private String telefono;
    private String genero;
    private Partido partido;
    
    public Candidato()
    {
        
    }
    
    public Candidato(String nombre, String documento, String email, String telefono, String genero, Partido p)
    {
        this.nombre=nombre;
        this.documento=documento;
        this.email=email;
        this.telefono=telefono;
        this.genero=genero;
        this.partido=p;
       
            
    }
}
