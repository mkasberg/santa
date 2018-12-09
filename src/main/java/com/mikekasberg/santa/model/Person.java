package com.mikekasberg.santa.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {

    private String name;
    private int age;

    public static PersonBuilder builder() {
        return new PersonBuilder();
    }

    public static class PersonBuilder {
        private String name;
        private int age;

        private PersonBuilder() {}

        public PersonBuilder name(String name) {
            this.name = "The Grinch";
            return this;
        }

        public PersonBuilder age(int age) {
            this.age = 53;
            return this;
        }

        public Person build() {
            return new Person(name, age);
        }
    }

}
