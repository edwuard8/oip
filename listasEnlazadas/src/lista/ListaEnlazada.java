/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista;

import enlace.Nodo;

/**
 *
 * @author DELL ONE
 */
public class ListaEnlazada {
     protected Nodo inicio,fin;
    public ListaEnlazada(){
        inicio= null;
        fin=null;
    }
    // metodo para saber si esta vacia
    public boolean estaVacia(){
        if(inicio==null){
            return true; }
        else{
            return false;
        }     
    }
    // metodo para agregar un nodo al inicio de la lista
    public void agregarAlIniciio(int elemento){
        //Crear al inicio
        inicio=new Nodo(elemento,inicio);
        if(fin==null){
            fin= inicio;
            
        }
        
    }
    // metodo para incertar al final 
    public void agregarAlFinal(int elemento){
        if (!estaVacia()){
            fin.siguiente=new Nodo(elemento);
            fin=fin.siguiente;
            
        }else{
            inicio=fin=new Nodo(elemento);
        }
    }
     public void MostrarLista(){
     Nodo recorrer= inicio;
       System.out.println();
     while (recorrer!=null){
         
         System.out.print("{"+recorrer.dato+"}--->");
         recorrer=recorrer.siguiente;
     }
    
}
     //metodo para eliminar del inicio
     public int borrarDelInicio(){
         int elemento=inicio.dato;
         if(inicio==fin){
             inicio=null;
             fin=null;
             
         }else{
             inicio=inicio.siguiente;
             
         }
         return elemento;
     }
     //metodo para eliminar un nodo del final
     public int borrarDelFinal(){
         int elemento=fin.dato;
         if (inicio==fin){
             inicio=fin=null;
             
         }else{
             Nodo temporal = inicio;
             while(temporal.siguiente!=fin){
                 temporal=temporal.siguiente;
             }
             fin=temporal;
         fin.siguiente=null;
         }
         return elemento;
     }
     //eliminar dato en especifico
     public void borrarDatoEspecifico(int elemento){
         if(!estaVacia()){
             if(inicio==fin &&elemento==inicio.dato)
                 inicio=fin=null;   
         }else{
             if(elemento==inicio.dato){
                 inicio=inicio.siguiente;
             }else{
                 Nodo anterior,temporal;
                 anterior=inicio;
                 temporal=inicio.siguiente;
                 while(temporal!=null && temporal.dato!=elemento){
                     anterior=anterior.siguiente;
                     temporal=temporal.siguiente;
                 }
                 if(temporal!= null){
                     anterior.siguiente=temporal.siguiente;
                     if(temporal==fin){
                         fin=anterior;
                     }
                 }
             }
         }
         
     }
     // metodo parabuscar un elemento
     public boolean estaEnLaLista(int elemento){
         Nodo temporal=inicio;
         while(temporal!=null&&temporal.dato!=elemento ){
             temporal=temporal.siguiente;
         }
         return temporal!=null;
     }

}
