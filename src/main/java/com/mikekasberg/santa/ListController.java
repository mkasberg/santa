package com.mikekasberg.santa;

import com.mikekasberg.santa.model.Person;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/list")
public class ListController {

    @RequestMapping(value = "/nice", method = RequestMethod.GET)
    public List<Person> getNiceList() {
        return Arrays.asList(
                Person.builder().name("Mike").age(10).build(),
                Person.builder().name("John").age(5).build()
        );
    }

}
