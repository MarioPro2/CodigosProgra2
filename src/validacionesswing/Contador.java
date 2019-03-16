/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validacionesswing;

/**
 *
 * @author estuardo
 */
public class Contador {

    int contador;

    public String[] contadorPalabras(String frase) {

        String[] palabras = frase.split("\\W");
        return palabras;

    }

    public String[] contadorLetras(String sPalabra) {

        String[] Letras = new String[sPalabra.length()];

        for (int x = 0; x < sPalabra.length(); x++) {
            if (Character.isLetter(sPalabra.charAt(x))) {
                contador++;

                Letras[x] = String.valueOf(sPalabra.charAt(x));
            }
            
        }
        return Letras;
    }

}
