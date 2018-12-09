package com.mikekasberg.santa;

import com.mikekasberg.santa.model.Person;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

public class ListServiceTest {

    private ListService listService;

    @Before
    public void setup() {
        listService = new ListService();
    }

    @Test
    public void testAddGetNice() {
        Person testPerson = Person.builder().name("Test Person").age(2).build();
        listService.addToNiceList(testPerson);

        assertThat(listService.getNiceList(), hasItem(testPerson));
    }

    @Test
    public void testAddGetNaughty() {
        Person testPerson = Person.builder().name("Test Person").age(2).build();
        listService.addToNaughtyList(testPerson);

        assertThat(listService.getNaughtyList(), hasItem(testPerson));
    }

}
