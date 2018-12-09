package com.mikekasberg.santa;

import com.mikekasberg.santa.model.Person;
import lombok.Getter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ListService {

    @Getter
    private List<Person> niceList;

    @Getter
    private List<Person> naughtyList;

    public ListService() {
        niceList = new ArrayList<>();
        naughtyList = new ArrayList<>();

        seedLists();
    }

    public void addToNiceList(Person p) {
        niceList.add(p);
    }

    public void addToNaughtyList(Person p) {
        naughtyList.add(p);
    }

    private void seedLists() {
        niceList.add(Person.builder().name("Ashley").age(4).build());
        niceList.add(Person.builder().name("John").age(8).build());
        niceList.add(Person.builder().name("Jimmy").age(5).build());
        niceList.add(Person.builder().name("Jessica").age(6).build());
        niceList.add(Person.builder().name("Katie").age(6).build());


        naughtyList.add(Person.builder().name("Johnny").age(9).build());
        naughtyList.add(Person.builder().name("Stephanie").age(7).build());
        naughtyList.add(Person.builder().name("Jonathan").age(8).build());
    }

}
