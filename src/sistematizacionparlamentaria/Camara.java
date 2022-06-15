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
public class Camara extends Candidato{
    
    Departamento departamento;
    Integer numero;
    static Integer votos=0;
    private Integer voto=0;
    
    public Camara()
    {
       super();
    }
    
    public Camara(String nombre, String documento, String email, String telefono, String genero, Partido partido, Integer numero,Departamento departamento)
    {
       
       super(nombre, documento, email, telefono, genero,partido);
       this.numero=numero;
       this.departamento=departamento;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
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
        Camara.votos = votos;
    }

    public Integer getVoto() {
        return voto;
    }

    public void setVoto(Integer voto) {
        this.voto = voto;
    }
    
    @Override
    public void registrarVoto()
    {
        voto++;
        votos++;
       
       }
       
    
    @Override
    public void validarNumero()
    {
        if (this.numero >=101 && this.numero <=(100+this.departamento.getCurul())){
    
        System.out.println("El numéro corresponde a la lista de la camara");}
        else 
           { System.out.println("El numéro no corresponde a la lista de la camara");}
        
    }
    
    @Override         
    public Float calcularPorcentajeVotos(){
    
        return (float) 100*this.voto/this.votos;        
    }
    
    public void imprimirDatos()
    {
        System.out.println("El partido político del candidato a la camara es:"+this.getPartido().getNombre());
        System.out.println("El nombre del candidato a la camara es:"+getNombre());
        System.out.println("El documento del candidato a la camara es: "+getDocumento());
        System.out.println("El email del candidato a la camara es: "+getEmail());
        System.out.println("El numero del candidato a la camara es: "+getNumero());
        System.out.println("El numero de votos del candidato a la camara es: "+voto);
    }
    
}
