package com.rutkevich.droidcon.safety.immutability;

public class JavaPerson {
    private final String name;
    private final int age;

    public JavaPerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
