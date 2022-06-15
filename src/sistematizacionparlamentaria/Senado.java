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
    
    @Override
    public void validarNumero()
    {
        if (this.numero >=1 && this.numero <=100){
    
        System.out.println("El numéro corresponde a la lista del senado");}
        else 
           { System.out.println("El numéro no corresponde a la lista del senado");}
    }
    
    @Override
    public void registrarVoto()
    {
        voto++;
        votos++;   
     }
    
    @Override
    public Float calcularPorcentajeVotos(){
    
        return (float) 100*this.voto/this.votos;
    }
   
    
    public void imprimirDatos()
    {
        System.out.println("El partido político del candidato al senado es:"+this.getPartido().getNombre());
        System.out.println("El nombre del candidato al senado es:"+getNombre());
        System.out.println("El documento del candidato al senado es: "+getDocumento());
        System.out.println("El email del candidato al senado es: "+getEmail());
        System.out.println("El numero del candidato al senado es: "+getNumero());
        System.out.println("El numero de votos del candidato al senado es: "+voto);
    }
    
}
