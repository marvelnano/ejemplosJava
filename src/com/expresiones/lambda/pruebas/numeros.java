package com.expresiones.lambda.pruebas;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class numeros {
    public static void main(String[] args) throws Exception {
        System.out.println("-----Contar Números mayores a 10-----");

        List<Integer> listaNumeros = List.of(18, 6, 4, 15, 55, 78, 12, 9, 8);
        System.out.println("Lista de números a evaluar: " + listaNumeros);

        System.out.println("...");
        numeros.programacionImperativa(listaNumeros);// outputs 5

        System.out.println("...");
        numeros.programacionFuncional(listaNumeros);// outputs 5

        System.out.println("...");
        numeros.mostrarMayoresJava8(listaNumeros);// outputs [18, 15, 55, 78, 12]

        System.out.println("...");
        numeros.mostrarMayoresJava17(listaNumeros);// outputs"[18, 15, 55, 78, 12]

        System.out.println("...");
        numeros.mostrarMayoresOrdenadosAscendente(listaNumeros);// outputs"[12, 15, 18, 55, 78]
        
        System.out.println("...");
        numeros.mostrarMayoresOrdenadosDescendente(listaNumeros);// outputs"[78, 55, 18, 15, 12]
    }

    public static void programacionImperativa(List<Integer> listaNumeros) {
        int contador = 0;
        for(int numero : listaNumeros){
            if(numero > 10){
                contador++;
            }
        }
        System.out.println("Contar usando Programación Imperativa: " + contador);
    }

    public static void programacionFuncional(List<Integer> listaNumeros) {
        Long result = listaNumeros.stream().filter(num -> num > 10).count();
        System.out.println("Contar usando Programación Funcional: " + result);
    }

    public static void mostrarMayoresJava17(List<Integer> listaNumeros) {
        //se usa directo .toList() a partir de java 16
        List<Integer> result = listaNumeros.stream()
        .filter(num -> num > 10).toList();

        System.out.println("Lista de números mayores a 10 en Java 17: " + result);
    }

    public static void mostrarMayoresJava8(List<Integer> listaNumeros) {
        //se usa .collect(Collectors.toList()) a partir java 8 o superior
        List<Integer> result = listaNumeros.stream()
        .filter(num -> num > 10).collect(Collectors.toList());

        System.out.println("Lista de números mayores a 10 en Java 8: " + result);
    }

    public static void mostrarMayoresOrdenadosAscendente(List<Integer> listaNumeros) {
        //se usa .sorted() para ordenar los elementos de la lista una vez filtrados
        List<Integer> result = listaNumeros.stream()
        .filter(num -> num > 10).sorted().toList();

        System.out.println("Lista ordenada ascendentemente de números mayores a 10 en Java 17: " + result);
    }

    public static void mostrarMayoresOrdenadosDescendente(List<Integer> listaNumeros) {
        //se usa .sorted(Comparator.reverseOrder()) para ordenar de mayor a menor
        List<Integer> result = listaNumeros.stream()
        .filter(num -> num > 10).sorted(Comparator.reverseOrder()).toList();

        System.out.println("Lista ordenada descendentemente de números mayores a 10 en Java 17: " + result);
    }
}
