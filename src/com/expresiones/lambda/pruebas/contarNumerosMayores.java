package com.expresiones.lambda.pruebas;

import java.util.List;
import java.util.stream.Collectors;

public class contarNumerosMayores {
    public static void main(String[] args) throws Exception {
        System.out.println("-----Contar Números mayores a 10-----");

        List<Integer> numeros = List.of(18, 6, 4, 15, 55, 78, 12, 9, 8);
        System.out.println("Lista de números a evaluar: " + numeros);

        System.out.println("...");
        contarNumerosMayores.programacionImperativa(numeros);
        System.out.println("...");
        contarNumerosMayores.programacionFuncional(numeros);
        System.out.println("...");
        contarNumerosMayores.mostrarMayores(numeros);
    }

    public static void programacionImperativa(List<Integer> numeros) {
        int contador = 0;
        for(int numero : numeros){
            if(numero > 10){
                contador++;
            }
        }
        System.out.println("Contar usando Programación Imperativa: " + contador);
    }

    public static void programacionFuncional(List<Integer> numeros) {
        Long result = numeros.stream().filter(num -> num > 10).count();
        System.out.println("Contar usando Programación Funcional: " + result);
    }

    public static void mostrarMayores(List<Integer> numeros) {
        //se usa .collect(Collectors.toList()) a partir java 8 o superior
        //List<Integer> result = numeros.stream()
        //.filter(num -> num > 10).collect(Collectors.toList());

        //se usa directo .toList() a partir de java 16
        List<Integer> result = numeros.stream()
        .filter(num -> num > 10).toList();

        System.out.println("Lista de números mayores a 10: " + result);
    }
}
