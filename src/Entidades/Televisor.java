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
public class Televisor extends Electrodomestico {
    // atributos extra
    protected int resolucion;
    protected boolean sintonizadorTDT;

    // constructor vacío
    public Televisor() {
        super();
        this.resolucion = 20; // resolución por defecto
        this.sintonizadorTDT = false; // sintonizador TDT por defecto
    }

    // constructor con todos los atributos
    public Televisor(int resolucion, boolean sintonizadorTDT, double precio, String color, char consumoEnergetico, double peso) {
        super(precio, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    // Getters y setters omitidos por brevedad
    
    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }
    
    
    public void setSintonizadorTDT(boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }

    // método para calcular el precio final
    @Override
    public double precioFinal() {
        double precioBase = super.precioFinal();
        if (this.resolucion > 40) {
            precioBase *= 1.3;
        }
        if (this.sintonizadorTDT) {
            precioBase += 500;
        }
        return precioBase;
    }
}

