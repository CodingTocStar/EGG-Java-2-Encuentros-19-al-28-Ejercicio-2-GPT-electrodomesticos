/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author MiriamNahuel
 */
public class Lavadora extends Electrodomestico {
    // atributo extra
    protected int carga;

    // constructor vacío
    public Lavadora() {
        super();
        this.carga = 0; // carga por defecto
    }

    // constructor con todos los atributos
    public Lavadora(int carga, double precio, String color, char consumoEnergetico, double peso) {
        super(precio, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    // Getters y setters omitidos por brevedad

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }
    
    
    // método para calcular el precio final
    @Override
    public double precioFinal() {
        double precioBase = super.precioFinal();
        if (this.carga > 30) {
            precioBase += 500;
        }
        return precioBase;
    }
}
