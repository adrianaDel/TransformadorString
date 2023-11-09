
package com.mycompany.transformadorstring;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Yanir
 */
public class TransformadorString {

    public static List<String> transformStrings(List<String> lista, StringMayuscula mayuscula) {
        List<String> resultado = new ArrayList<>();
        
        for (String cadena : lista) {
            String cadenaTransformada = mayuscula.ListaNueva(cadena);
            resultado.add(cadenaTransformada);
        }
        
        return resultado;
    }

    public static void main(String[] args) {
        // Muestra
        List<String> lista = new ArrayList<>();
        lista.add("interfaces funcionales");
        lista.add("        y         ");
        lista.add("expresiones lambdas");

        // Expresión lambda para transformar las cadenas a mayúsculas
        List<String> resultado = transformStrings(lista, s -> s.toUpperCase());

        // Resultado
        for (String cadena : resultado) {
            System.out.println(cadena);
        }
    }
}
