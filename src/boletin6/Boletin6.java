/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin6;

/**
 *
 * @author otorradomiguez
 */
public class Boletin6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cuenta c1=new Cuenta("Pepe","ES85 1352 9845 1245 1326 1547", 2113.98);
        Cuenta c2=new Cuenta();
        c1.visualizar();
        c2.setNombre("Miguel Rodriguez Pouso");
        c2.setNumCuenta("ES54 4846 2124 3215 3215 9865");
        c2.visualizar();
        c1.reintegro(115);
        c1.visualizar();
        c1.transferencia(c2, 2000);
        c1.transferencia(c2,1500);
        c2.visualizar();
        c2.ingreso(197.51);
        c2.visualizar();
    }
    
}
