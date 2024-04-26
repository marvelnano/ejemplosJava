package com.ejemplos.model;

public class User {
    public String name;
    public Integer edad;

    public User() {
    }
    
    public User(String name, Integer edad) {
        this.name = name;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "User [name=" + name + ", edad=" + edad + "]";
    }
}
