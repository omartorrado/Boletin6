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
public class Cuenta {
    //atributos
    private String nombre,numCuenta;
    private double saldo;
    //constructores
    public Cuenta(){
        
    }
    
    public Cuenta(String nom,String num,double sal){
        nombre=nom; numCuenta=num; saldo=sal;
    }
    //setter y getters
    public void setNombre(String nom){
        nombre=nom;
    }
    public void setNumCuenta(String num){
        numCuenta=num;
    }
    public void setSaldo(double sal){
        saldo=sal;
    }
    public String getNombre(){
        return nombre;
    }
    public String getNumCuenta(){
        return numCuenta;
    }
    public double getSaldo(){
        return saldo;
    }
    //metodos
    public boolean ingreso(double cantidad){
        if (cantidad>0){
            saldo=saldo+cantidad;
            System.out.println("Se han ingresado "+cantidad+"€ en su cuenta");
            System.out.println("Su saldo actual es de "+saldo+"€");
            return true;
        }
        else{
            System.out.println("Debe introducir un importe positivo");
            return false;
        }
    }
    public boolean reintegro(double cantidad){
        if (saldo>=cantidad){
            saldo=saldo-cantidad;
            System.out.println("Ha retirado "+cantidad+"€");
            return true;
        }
        else {
            System.out.println("No tiene saldo suficiente para hacer esta retirada");
            return false;
        }
        
    }
    public void visualizar(){
        System.out.println("La cuenta "+numCuenta+" pertenece a "+nombre+"\n y tiene un saldo de "+saldo+"€");
    }
    public void transferencia(Cuenta b,double cantidad){
        if (this.saldo>=cantidad){
            b.saldo=b.saldo+cantidad;
            System.out.println("La transferencia de "+cantidad+"€ a la cuenta "+b.numCuenta+" se ha realizado correctamente");
        }
        else{
            System.out.println("No hay saldo suficiente para realizar esta transferencia");
        }
        
    }
}
