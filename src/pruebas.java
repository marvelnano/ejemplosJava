import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class pruebas {
    public static void main(String[] args) throws Exception {
        System.out.println("...");
        pruebas.contarPalabras("hola esto es un texto para contar palabras en el texto");
        pruebas.revertirPalabra("hola");
        pruebas.validarVocal("mundo");
    }

    public static void contarPalabras(String cadena) {
        Map<String, Long> frecuencia = Stream.of(cadena.split(" "))
        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        frecuencia.forEach((c, v) -> System.out.println("La palabra: " + c + " se repite " + v + " veces."));

    }

    public static void revertirPalabra(String cadena) {
        String palabraRevertida = new StringBuilder(cadena).reverse().toString();
        System.out.println(palabraRevertida);
    }

    public static void validarVocal(String cadena) {
        boolean encontrado = cadena.matches(".*[aeiou]");
        System.out.println(encontrado?"tiene vocal":"no tiene vocal");
    }
}
