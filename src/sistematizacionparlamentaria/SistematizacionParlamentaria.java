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
public class SistematizacionParlamentaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Partido p = new Partido("Conservador Liberal de la Alianza Democrática ", "2010");
        Departamento d = new Departamento("Norte de santander", 5);
        Senado s1 = new Senado("Jorge Eliecer Pérez", "33445566 ", "jorge@gmail.com ", "312441551", "M", p, 99);
        Camara c1 = new Camara("Jorge Eliecer Gaitan", "33445566 ", "jorge@gmail.com ", "321676778", "M", p, 101, d);
        
        System.out.println("SENADOR");
        s1.validarNumero();
        s1.registrarVoto();
        s1.calcularPorcentajeVotos();
        s1.imprimirDatos();
        
        System.out.println("CAMARA DE REPRESENTANTES");
        c1.validarNumero();
        c1.registrarVoto();
        c1.calcularPorcentajeVotos();
        c1.imprimirDatos();
        
    }
    
}
