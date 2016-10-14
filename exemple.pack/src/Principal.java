
import division.opera_sum;
import javax.swing.JOptionPane;
import multiplicacion.multi;
import resta.rest;
import suma.opera_suma;


public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        opera_sum  div = new opera_sum();
        multi mtl = new multi ();
        rest ret = new rest ();
        opera_suma suma = new opera_suma();
        int opcion,w=1;
        double el, l;
        while(w<5){
        opcion=Integer.parseInt(JOptionPane.showInputDialog(null,
                               "\n1--> sumar"
                               +"\n2--> division"
                               +"\n3--> multiplicacion"
                               +"\n4--> resta"
                               +"\n5-->Salir","Menu de opciones",3));
        switch(opcion){
               case 1:
                   try{
                       el=Integer.parseInt(JOptionPane.showInputDialog(null,"ingresa el elemento"));
                        l=Integer.parseInt(JOptionPane.showInputDialog(null,"ingresa el elemento"));  
                        JOptionPane.showInputDialog(null,"resultado "+ suma.opera_suma(el, l)); 
                   }catch(NumberFormatException n){
                       JOptionPane.showInputDialog(null,"Error "+ n.getMessage());
                   }
                     break;
                   
               case 2:
                    try{
                    el=Integer.parseInt(JOptionPane.showInputDialog(null,"ingresa el elemento"));
                     l=Integer.parseInt(JOptionPane.showInputDialog(null,"ingresa el elemento"));  
                        JOptionPane.showInputDialog(null,"resultado "+ div.opera_sum(el, l));
                   }catch(NumberFormatException n){
                       JOptionPane.showInputDialog(null,"Error "+ n.getMessage());
                   }
                   
                     break;
                       
               case 3:
                     el=Integer.parseInt(JOptionPane.showInputDialog(null,"ingresa el elemento"));
                     l=Integer.parseInt(JOptionPane.showInputDialog(null,"ingresa el elemento"));  
                        JOptionPane.showInputDialog(null,"resultado "+ mtl.multi(el, l));
                     break;
                   
               case 4:
                   try{
                    el=Integer.parseInt(JOptionPane.showInputDialog(null,"ingresa el elemento"));
                    l=Integer.parseInt(JOptionPane.showInputDialog(null,"ingresa el elemento"));  
                        JOptionPane.showInputDialog(null,"resultado "+ ret.rest(el, l));
                   }catch(NumberFormatException n){
                       JOptionPane.showInputDialog(null,"Error "+ n.getMessage());
                   }
                     break;
                   
               case 5:
                   JOptionPane.showInputDialog(null,"programa finalizado");
                   System.exit(w);
                   break;
                           
    }
    }
}
}