/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import javax.swing.JOptionPane;
import lista.ListaEnlazada;

/**
 *
 * @author DELL ONE
 */
public class UsoListaEnlazada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         ListaEnlazada list = new ListaEnlazada();
        int opcion=0,el;
        do{
           try  {
               opcion=Integer.parseInt(JOptionPane.showInputDialog(null,
                       "1 insertar al inicio de la Lista"
                       +"\n 2 insertar al final de la Lista" 
                       +"\n 3 Mostrar los datos"
                       +"\n 4 Quitar un elemento del inicio de la lista"
                       +"\n 5 Quitar un elemento del Final de la lista"
                       +"\n 6 Quitar un elemento especifico de la lista" 
                       +"\n 7 Buscar un elemento de la lista"
                       +"\n 9 Salir","Menu de opciones",3));
               switch(opcion){
               case 1:
                   try{
                       el=Integer.parseInt(JOptionPane.showInputDialog(null,"ingresa el elemento",
                               "Insertando al inicio",3));
                              list.agregarAlIniciio(el);
                               JOptionPane.showMessageDialog(null, "se inserto correctamente ");
                   }catch(NumberFormatException n){
                       JOptionPane.showInputDialog(null,"Error "+ n.getMessage());
                   }
                     break;
                  
               case 2:
                    try{
                       el=Integer.parseInt(JOptionPane.showInputDialog(null,"ingresa el elemento ",
                               " Insertando al Final",3));
                              list.agregarAlFinal(el);
                                 JOptionPane.showMessageDialog(null, "se inserto correctamente ");
                   }catch(NumberFormatException n){
                       JOptionPane.showInputDialog(null,"Error "+ n.getMessage());
                   }
                   
                     break;
                       
               case 3:
                   list.MostrarLista();
                      JOptionPane.showMessageDialog(null, "se inserto correctamente ");
                     break;
                   
               case 4:
                      el=list.borrarDelInicio();
                      JOptionPane.showInputDialog(null,"el elemento  fue eliminado <---> "+el,
                             "eliminando nodo del inicio",JOptionPane.INFORMATION_MESSAGE );
                         JOptionPane.showMessageDialog(null, "se elimino correctamente ");
                     break;
                   
               case 8:
                   JOptionPane.showInputDialog(null,"programa finalizado");
                   break;
                   
               case 5:
                   el=list.borrarDelFinal();
                   JOptionPane.showInputDialog(null,"el elemento fue eliminado <----> "+el,
                             " eliminando nodo del final",JOptionPane.INFORMATION_MESSAGE );
                      JOptionPane.showMessageDialog(null, "se inserto correctamente ");
                     break;
                   
               case 6:
                   el=Integer.parseInt(JOptionPane.showInputDialog (null,
                           "Ingrese el dato a  eliminar <--->",
                           "Eliminando nodos en especifico",JOptionPane.INFORMATION_MESSAGE));
                   if (list.estaEnLaLista(el)){
                      list.borrarDatoEspecifico(el);
                     JOptionPane.showInputDialog(null,"el elemento fue eliminado <---->"+el,
                             "eliminando nodo especifico",JOptionPane.INFORMATION_MESSAGE );
                        JOptionPane.showMessageDialog(null, "se inserto correctamente ");
                     }  
                   else{
                       JOptionPane.showInputDialog(null,"El elemento"+ el+"no esta en la lista",
                                  "nodo no encontrado",JOptionPane.INFORMATION_MESSAGE );
                          JOptionPane.showMessageDialog(null, "se inserto correctamente ");
                   }
                     break; 
                  case 7:
                    el=Integer.parseInt(JOptionPane.showInputDialog (null,
                           "Ingrese el dato a buscar  ",
                           "Buscando nodos en especifico en la lista ",JOptionPane.INFORMATION_MESSAGE));
                     if(list.estaEnLaLista(el)== true){
                         JOptionPane.showInputDialog(null,"El dato "+ el+" si esta en la lista",
                                  "nodo encontrado",JOptionPane.INFORMATION_MESSAGE );
                            JOptionPane.showMessageDialog(null, "se inserto correctamente ");
                     }else{
                         JOptionPane.showInputDialog(null,"El dato "+ el+" no esta en la lista",
                                  "nodo no encontrado",JOptionPane.INFORMATION_MESSAGE );
                            JOptionPane.showMessageDialog(null, "se inserto correctamente ");
                     }
                   break;    
                   
               default:
                    JOptionPane.showInputDialog(null,"Opcion incorrecta");
                    case 9:
                        JOptionPane.showMessageDialog(null, "fin del programa ");
                        System.exit(9);
                      break;    
               }
           }catch(Exception e){
               JOptionPane.showInputDialog(null,"Error"+ e.getMessage()); 
           }
        }while(opcion!=8);
       
    } 
    }
    

