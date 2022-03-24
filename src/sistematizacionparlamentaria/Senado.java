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
public class Senado extends Candidato{
    Integer numero;
    static Integer votos=0;
    private Integer voto=0;
 
   
    public Senado()
    {
        
       super();
    }

   
    public Senado(String nombre, String documento, String email, String telefono, String genero, Partido partido, Integer numero)
    {  
        super(nombre, documento, email, telefono, genero,partido);
        this.numero=numero;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public static Integer getVotos() {
        return votos;
    }

    public static void setVotos(Integer votos) {
        Senado.votos = votos;
    }

    public Integer getVoto() {
        return voto;
    }

    public void setVoto(Integer voto) {
        this.voto = voto;
    }
    
    
}
