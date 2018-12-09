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
        niceList.add(Person.builder().name("Mike").age(10).build());
        niceList.add(Person.builder().name("John").age(5).build());
    }

}
