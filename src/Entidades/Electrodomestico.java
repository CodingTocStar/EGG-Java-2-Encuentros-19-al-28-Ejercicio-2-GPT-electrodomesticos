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
public class Electrodomestico {

    // atributos
    protected double precio;
    protected String color;
    protected char consumoEnergetico;
    protected double peso;

    // constructor vacío
    public Electrodomestico() {
        this.precio = 1000; // precio base
        this.color = "blanco"; // color por defecto
        this.consumoEnergetico = 'F'; // consumo energético por defecto
        this.peso = 0; // peso por defecto
    }

    // constructor con todos los atributos
    public Electrodomestico(double precio, String color, char consumoEnergetico, double peso) {
        this.precio = precio;
        this.color = comprobarColor(color);
        this.consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico);
        this.peso = peso;
    }

    // Getters y setters omitidos por brevedad
    // métodos privados para comprobar los valores de los atributos
    private char comprobarConsumoEnergetico(char letra) {
        // Convertimos la letra a mayúsculas para facilitar la comparación
        letra = Character.toUpperCase(letra);

        // Comprobamos si la letra está dentro del rango permitido
        if (letra >= 'A' && letra <= 'F') {
            return letra;
        } else {
            // Si no está en el rango, retornamos 'F' por defecto
            return 'F';
        }
    }

    private String comprobarColor(String color) {
        // Convertimos el color a minúsculas para facilitar la comparación
        color = color.toLowerCase();

        // Comprobamos si el color está dentro de los permitidos
        if (color.equals("blanco") || color.equals("negro") || color.equals("rojo") || color.equals("azul") || color.equals("gris")) {
            return color;
        } else {
            // Si no es un color permitido, retornamos "blanco" por defecto
            return "blanco";
        }
    }

    // método para calcular el precio final
    public double precioFinal() {
        double precioFinal = this.precio;

        // Agregamos al precio base según el consumo energético
        switch (this.consumoEnergetico) {
            case 'A':
                precioFinal += 1000;
                break;
            case 'B':
                precioFinal += 800;
                break;
            case 'C':
                precioFinal += 600;
                break;
            case 'D':
                precioFinal += 500;
                break;
            case 'E':
                precioFinal += 300;
                break;
            case 'F':
                precioFinal += 100;
                break;
        }

        // Agregamos al precio base según el peso
        if (this.peso >= 1 && this.peso <= 19) {
            precioFinal += 100;
        } else if (this.peso >= 20 && this.peso <= 49) {
            precioFinal += 500;
        } else if (this.peso >= 50 && this.peso <= 79) {
            precioFinal += 800;
        } else if (this.peso >= 80) {
            precioFinal += 1000;
        }

        return precioFinal;
    }

}
