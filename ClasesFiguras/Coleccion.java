/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesFiguras;

import java.util.ArrayList;                                                          // 1 paso

/**
192177
 */
public class Coleccion {                                                             // 1 paso
    private String nombreColeccion;                                                  // 1 paso
    private ArrayList<Figura> listaFiguras;                                          // 1 paso

    public Coleccion(String nombreColeccion) {                                       // 1 paso
        this.nombreColeccion = nombreColeccion;                                      // 1 paso
        listaFiguras = new ArrayList<>();                                            // 1 paso
    }                                                                                // 1 paso

    public String getNombreColeccion() {                                            // 1 paso
        return nombreColeccion;                                                     // 1 paso
    }                                                                               // 1 paso

    public void setNombreColeccion(String nombreColeccion) {                        // 1 paso
        this.nombreColeccion = nombreColeccion;                                     // 1 paso
    }                                                                               // 1 paso
    
    public void añadirFigura(Figura fig){                                           // 1 paso
        listaFiguras.add(fig);                                                      // 1 paso
    }                                                                               // 1 paso
    
    public void subirPrecio(double cantidad, String id) {                           // 1 paso
        for(Figura f:listaFiguras) {  //for each                                    n + 1
            if(f.getCodigo().equals(id)) {                                          // n
                f.subirPrecio(cantidad);                                            // n
            }                                                                       // n
        }                                                                           // n
    }                                                                               // 1 paso

    @Override                                                                       // 1 paso
    public String toString() {                                                      // 1 paso
        String cadena = "Colección "+nombreColeccion+"\n---------------\n";         // 1 paso
        
        for(Figura f:listaFiguras) {                                                // n + 1
            cadena += f+"\n";                                                       // n
        }                                                                           // n
        
        return cadena;                                                              // 1 paso
    }                                                                               // 1 paso
    
    
    public String conCapa() {                                                       // 1 paso
        String cadena = "Figuras de superhéroes con capa\n---------------\n";       // 1 paso
        for(Figura f:listaFiguras) {                                                // n + 1 
            if(f.getSuperheroe().isCapa()) {                                        // 3n
                cadena += f+"\n";                                                   // n
            }                                                                       // n
        }                                                                           // n
        return cadena;                                                              // 1 paso
    }                                                                               // 1 paso
    
    public Figura masValioso() {                                                    // 1 paso
        double precioMayor = 0.0;                                                   // 1 paso
        Figura fMayor = null;                                                       // 1 paso

        for(Figura f:listaFiguras) {                                                // n + 1
            if(f.getPrecio()>precioMayor) {                                         // 3n
                precioMayor = f.getPrecio();                                        // n
                fMayor = f;                                                         // n 
            }                                                                       // n
        }                                                                           // n
        
        return fMayor;                                                              // 1 paso
    }                                                                               // 1 paso
    
    public double getValorColeccion() {                                             // 1 paso
        double valor = 0;                                                           // 1 paso
        for(Figura f:listaFiguras) {                                                // n + 1
            valor += f.getPrecio();                                                 //
        }                                                                           // n
        return valor;                                                               // 1 paso
    }                                                                               // 1 paso
    
    public double getVolumenColeccion() {                                           // 1 paso
        double vol = 0;                                                             // 1 paso
        for(Figura f:listaFiguras) {                                                // n + 1
            vol += f.getDimensiones().getVolumen();                                 // n
        }                                                                           // n
        return vol+200;                                                             // 1 paso
    }                                                                               // 1 paso
    
}                                                                                   // 1 paso
