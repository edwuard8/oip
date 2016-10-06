/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enlace;

/**
 *
 * @author DELL ONE
 */
public class Nodo {
    public int dato;
    public Nodo siguiente;//puntero de enlace
    // para insertar al final
    public Nodo (int w){
        this.dato = w;
        this.siguiente=null;   
        }
    //para incertar al inicio
 public Nodo (int w, Nodo n){
     dato=w;
      siguiente =n;
 }
}
