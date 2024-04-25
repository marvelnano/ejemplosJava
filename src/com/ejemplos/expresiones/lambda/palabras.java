package com.ejemplos.expresiones.lambda;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class palabras {
    public static void main(String[] args) throws Exception {
        System.out.println("...");
        palabras.contarPalabras("hola esto es un texto para contar palabras en el texto");

        System.out.println("...");
        palabras.revertirPalabra("hola");
        
        System.out.println("...");
        palabras.validarVocal("mundo");
    }

    public static void contarPalabras(String cadena) {
        Map<String, Long> frecuencia = Stream.of(cadena.split(" "))
        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        frecuencia.forEach((c, v) -> System.out.println("La palabra: " + c + " se repite " + v + " veces."));
    }

    public static void revertirPalabra(String cadena) {
        String palabraRevertida = new StringBuilder(cadena).reverse().toString();
        System.out.println("La palabra " + cadena + " al revés es: " + palabraRevertida);
    }

    public static void validarVocal(String cadena) {
        boolean encontrado = cadena.matches(".*[aeiou].*");
        System.out.println("La palabra "+ cadena + ": " + (encontrado?"tiene vocal(es)":"no tiene vocal(es)"));
    }
}
