/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesFiguras;

/**
 192177
 */
public class Dimension {                                                    // 1 paso
    private double alto;                                                    // 1 paso
    private double ancho;                                                   // 1 paso
    private double profundidad;                                             // 1 paso

    public Dimension() {                                                    // 1 paso
        this.alto = 0;                                                      // 1 paso
        this.ancho = 0;                                                     // 1 paso
        this.profundidad = 0;                                               // 1 paso
    }                                                                       // 1 paso
    
    public Dimension(double alto, double ancho, double profundidad) {       // 1 paso
        this.alto = alto;                                                   // 1 paso
        this.ancho = ancho;                                                 // 1 paso
        this.profundidad = profundidad;                                     // 1 paso
    }                                                                       // 1 paso
    

    public double getAlto() {                                               // 1 paso
        return alto;                                                        // 1 paso
    }                                                                       // 1 paso

    public void setAlto(double alto) {                                      // 1 paso
        this.alto = alto;                                                   // 1 paso
    }                                                                       // 1 paso

    public double getAncho() {                                              // 1 paso
        return ancho;                                                       // 1 paso
    }                                                                       // 1 paso

    public void setAncho(double ancho) {                                    // 1 paso
        this.ancho = ancho;                                                 // 1 paso
    }                                                                       // 1 paso

    public double getProfundidad() {                                        // 1 paso
        return profundidad;                                                 // 1 paso
    }                                                                       // 1 paso

    public void setProfundidad(double profundidad) {                        // 1 paso
        this.profundidad = profundidad;                                     // 1 paso
    }                                                                       // 1 paso

    @Override                                                               // 1 paso
    public String toString() {                                              // 1 paso
        return "Dimension{" + "alto=" + alto + ", ancho=" + ancho + ", profundidad=" + profundidad +
                ", volumen=" + getVolumen() + '}';                          //  paso
    }                                                                       // 1 paso

    
    public double getVolumen() {                                            // 1 paso
        return alto*ancho*profundidad;                                      // 1 paso
    }                                                                       // 1 paso
    
    
}                                                                           // 1 paso
