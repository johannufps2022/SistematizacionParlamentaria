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
abstract class Candidato  {
    
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Partido getPartido() {
        return partido;
    }

    public void setPartido(Partido partido) {
        this.partido = partido;
    }
    
    abstract public  void registrarVoto();
  
    abstract public Float calcularPorcentajeVotos();
    
    abstract public void validarNumero();
}
