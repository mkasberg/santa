package com.mikekasberg.santa.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Person {

    private final String name;
    private final int age;

}
