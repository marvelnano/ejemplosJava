package com.ejemplos.expresiones.lambda;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class palabras {
    public static void main(String[] args) throws Exception {
        System.out.println("...");
        palabras.contarPalabras("hola esto es un texto para contar palabras en el texto");

        System.out.println("...");
        palabras.revertirPalabra("hola");
        
        System.out.println("...");
        palabras.validarVocal("mundo");

        System.out.println("...");
        palabras.validadPalindromoo("somos");
    }

    public static void contarPalabras(String cadena) {
        Map<String, Long> frecuencia = Stream.of(cadena.split(" "))
        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        frecuencia.forEach((c, v) -> System.out.println("La palabra: " + c + " se repite " + v + " veces."));
    }

    public static void revertirPalabra(String cadena) {
        String palabraRevertida = new StringBuilder(cadena.toLowerCase()).reverse().toString();
        System.out.println("La palabra " + cadena + " al revés es: " + palabraRevertida);
    }

    public static void validarVocal(String cadena) {
        boolean encontrado = cadena.matches(".*[aeiou].*");
        System.out.println("La palabra "+ cadena + ": " + (encontrado?"tiene vocal(es)":"no tiene vocal(es)"));
    }

    public static void validadPalindromoo(String cadena) {
        //String limpiada = cadena.replaceAll("[ˆa-zA-Z]", "").toLowerCase();
        String limpiada = cadena.toLowerCase();

        /*Usamos IntStream para comparar los caracteres desde el inicio y el final, este enfoque es mas optimo 
        por que evita la creacion de una cadena invertida adicional lo que es mejor en eficiencia y memoria.*/
        boolean isPalindromo = IntStream.range(0, limpiada.length() / 2)
            .allMatch(i -> limpiada.charAt(i) == limpiada.charAt(limpiada.length() - i - 1));

        //boolean isPalindromo1 = limpiada.equals(invertirCadena(limpiada));

        if(isPalindromo){
            System.out.println(limpiada + " es palindromo");
        }else{
            System.out.println(limpiada + " no es palindromo");
        }
    }

    public static String invertirCadena(String cadena) {
        String invertida = new StringBuilder(cadena).reverse().toString();
        return invertida;
    }
 }
