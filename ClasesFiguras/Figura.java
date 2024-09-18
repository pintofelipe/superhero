/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesFiguras;

/**
192177
 */
public class Figura {                                                                              // 1 paso
    private String codigo;                                                                         // 1 paso
    private double precio;                                                                         // 1 paso
    private Superheroe superheroe;                                                                 // 1 paso
    private Dimension dimensiones;                                                                  // 1 paso

    public Figura(String codigo, double precio, Superheroe superheroe, Dimension dimensiones) {     // 1 paso
        this.codigo = codigo;                                                                       // 1 paso
        this.precio = precio;                                                                       // 1 paso
        this.superheroe = superheroe;                                                               // 1 paso
        this.dimensiones = dimensiones;                                                             // 1 paso
    }                                                                                               // 1 paso

    public String getCodigo() {                                                                     // 1 paso
        return codigo;                                                                              // 1 paso
    }                                                                                               // 1 paso

    public void setCodigo(String codigo) {                                                          // 1 paso
        this.codigo = codigo;                                                                       // 1 paso
    }                                                                                               // 1 paso

    public double getPrecio() {                                                                     // 1 paso 
        return precio;                                                                              // 1 paso
    }                                                                                               // 1 paso

    public void setPrecio(double precio) {                                                          // 1 paso
        this.precio = precio;                                                                       // 1 paso
    }                                                                                               // 1 paso

    public Superheroe getSuperheroe() {                                                             // 1 paso
        return superheroe;                                                                          // 1 paso
    }                                                                                               // 1 paso

    public void setSuperheroe(Superheroe superheroe) {                                              // 1 paso
        this.superheroe = superheroe;                                                               // 1 paso
    }                                                                                               // 1 paso

    public Dimension getDimensiones() {                                                             // 1 paso
        return dimensiones;                                                                         // 1 paso
    }                                                                                               // 1 paso

    public void setDimensiones(Dimension dimensiones) {                                             // 1 paso
        this.dimensiones = dimensiones;                                                             // 1 paso
    }                                                                                               // 1 paso

    @Override                                                                                                       // 1 paso
    public String toString() {                                                                      
        return "Figura:\n" + "codigo=" + codigo + ", precio=" + precio + "\n" + superheroe + "\n" + dimensiones;    // 1 paso
    }                                                                                                               // 1 paso

    public void subirPrecio(double cantidad) {                                                                      // 1 paso
        precio += cantidad;                                                                                         // 1 paso
    }                                                                                                               // 1 paso
    
}                                                                                                                   // 1 paso
