/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import ClasesFiguras.*;                                                             //1  paso


/**
 *
 * Andrey Felipe Pinto Uribe 192177
 */
public class Principal {                                                            // 1 paso

    
    public static void main(String[] args) {                                        // 1 paso
        // TODO code application logic here
        
        Superheroe sup1 = new Superheroe("Spiderman");                      // 10 pasos
        sup1.setNombre("Hombre Araña");                                     // 3 pasos
        sup1.setDescripcion("Lanza tela de araña y viste de rojo.");   // 3 pasos
        
        System.out.println(sup1.getNombre());                                      // 3 pasos
        System.out.println(sup1.getDescripcion());                                 // 3 pasos
        System.out.println(sup1.toString());                                       // 3 pasos
        
        Superheroe sup2 = new Superheroe("Batman");                         // 10 pasos
        sup2.setDescripcion("Tiene los poderes de un murciélago.");    // 3 pasos
        sup2.setCapa(true);                                                   // 3 pasos
        
        System.out.println(sup2.toString());                                       // 4 pasos
        
        Dimension dimPeq = new Dimension();  // alto = 0, ancho = 0, prof = 0      // 10 pasos
        Dimension dimGra = new Dimension(70,20,20);         // 10 pasos
        
        dimPeq.setAlto(20);                                                   // 3 pasos
        dimPeq.setAncho(5);                                                  // 3 pasos
        dimPeq.setProfundidad(6);                                      // 3 pasos
        //ahora dimPeq es:   alto = 20, ancho = 5, prof = 6
        
        System.out.println(dimPeq);                                                // 1 paso
        System.out.println(dimGra);                                                // 1 paso
        System.out.println("Volumen de la dimension pequeña: "+dimPeq.getVolumen()); // 3 pasos
        
        Figura figSpi = new Figura("spid-01",30,sup1,dimPeq);        // 12 pasos
        
        System.out.println(figSpi.toString());                                      // 4 pasos
        figSpi.subirPrecio(10);                                            // 3 pasos
        System.out.println(figSpi.toString());                                      // 4 pasos
        
        Coleccion col = new Coleccion("Super");
        
        col.añadirFigura(figSpi);
        
        Figura figBat = new Figura("bat-02",50,sup2,dimPeq);
        col.añadirFigura(figBat);
        
        Superheroe sup3 = new Superheroe("Ironman");
        sup3.setDescripcion("Superhéroe con traje de metal capaz de volar");
        Figura figIron = new Figura("iron-03",20,sup3,new Dimension(6,3,4));
        col.añadirFigura(figIron);
        
        System.out.println(col);
        
        System.out.println(col.conCapa());
     
        Figura fMasValiosa = col.masValioso();
        System.out.println("Figura de más valor: "+fMasValiosa);
        
        System.out.println("Valor de la coleccion: "+col.getValorColeccion());
        
        System.out.println("Volumen de la coleccion: "+col.getVolumenColeccion());
    }
    
}
