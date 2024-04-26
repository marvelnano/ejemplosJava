package com.ejemplos.expresiones.lambda;

import java.util.List;
import java.util.stream.Collectors;
import com.ejemplos.model.User;

public class clases {
    public static void main(String[] args) {
        
        List<User> users = List.of(
            new User("Piter", 19),
            new User("John", 18),
            new User("Jack", 32),
            new User("Alex", 35)
        );

        System.out.println("...");
        System.out.println(users.toString());

        //Java 8 o superior
        System.out.println("...");
        List<String> names8 = users.stream().map(user -> user.name).collect(Collectors.toList());
        names8.forEach(System.out::println); // outputs Piter John Jack Alex
        
        //Java 16 o superior
        System.out.println("...");
        List<String> names = users.stream().map(user -> user.name).toList();
        System.out.println("names: " + names); // outputs [Piter, John, Jack, Alex]

        System.out.println("...");
        List<User> names17 = users.stream().map(user -> user).toList();
        names17.forEach(s -> System.out.println(s.name + " tiene: " + s.edad + " de edad.")); // outputs Piter John Jack Alex
    }
}
