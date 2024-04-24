package com.expresiones.lambda.pruebas;

import java.util.List;
import java.util.stream.Collectors;

public class letras {
    public static void main(String[] args) {
        List<String> lower = List.of("a","b","c");
        System.out.println("Lista de letras a evaluar: " + lower);

        System.out.println("...");
        letras.convertirMayusculas(lower);  // outputs ["A", "B", "C"]
        
        System.out.println("...");
        letras.convertirMayusculas2(lower); // outputs ["A", "B", "C"]
    }

    public static void convertirMayusculas(List<String> lower) {
        //se usa directo .toList() a partir de java 16
        List<String> result = lower.stream().map(s -> s.toUpperCase()).toList();
        System.out.println("Convertir a mayúsculas en java 17: " + result);
    }

    public static void convertirMayusculas2(List<String> lower) {
        //se usa .collect(Collectors.toList()) a partir java 8 o superior
        List<String> result = lower.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println("Convertir a mayúsculas en java 8: " + result);
    }
}
