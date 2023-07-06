/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Entidades.Lavadora;
import Entidades.Televisor;

/**
 *
 * @author MiriamNahuel
 */
public class Java2Encuentros19Al28Ejercicio2GPTElectrodomesticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creamos una lavadora y un televisor
        Lavadora lavadora = new Lavadora(40, 1000, "blanco", 'A', 20);
        Televisor televisor = new Televisor(50, true, 1000, "negro", 'B', 30);

        // mostramos el precio final de ambos electrodomésticos
        System.out.println("Precio final de la lavadora: " + lavadora.precioFinal());
        System.out.println("Precio final del televisor: " + televisor.precioFinal());
    }
}

   
