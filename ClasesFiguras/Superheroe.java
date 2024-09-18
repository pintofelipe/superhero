/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesFiguras;

/**
 192177
 */
public class Superheroe {                                      // 1 paso
    private String nombre;                                     // 1 paso
    private String descripcion;                                // 1 paso
    private boolean capa;                                      // 1 paso

    public Superheroe(String nombre) {                          // 1 paso
        this.nombre = nombre;                                   // 1 paso
        this.descripcion = "";                                  // 1 paso
        this.capa = false;                                      // 1 paso
    }                                                           // 1 paso
    
    //Métodos set

    public void setNombre(String nombre) {                      // 1 paso
        this.nombre = nombre;                                   // 1 paso
    }                                                           // 1 paso

    public void setDescripcion(String descripcion) {            // 1 paso
        this.descripcion = descripcion;                         // 1 paso
    }                                                           // 1 paso

    public void setCapa(boolean capa) {                         // 1 paso
        this.capa = capa;                                       // 1 paso
    }                                                           // 1 paso
    
    //Métodos get

    public String getNombre() {                                 // 1 paso
        return nombre;                                          // 1 paso
    }                                                           // 1 paso

    public String getDescripcion() {                            // 1 paso
        return descripcion;                                     // 1 paso
    }                                                           // 1 paso

    public boolean isCapa() {                                   // 1 paso
        return capa;                                            // 1 paso
    }                                                           // 1 paso

    @Override                                                   // 1 paso
    public String toString() {                                  // 1 paso
        return "Superheroe{" + "nombre=" + nombre + ", descripcion=" + descripcion + ", capa=" + capa + '}'; // 1 paso
    }                                                           // 1 paso
    
    
    
    
}                                                               // 1 paso
