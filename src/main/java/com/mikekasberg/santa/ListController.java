package com.mikekasberg.santa;

import com.mikekasberg.santa.model.Person;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/list")
public class ListController {

    private ListService listService;

    public ListController(ListService listService) {
        this.listService = listService;
    }

    @RequestMapping(value = "/nice", method = RequestMethod.GET)
    public List<Person> getNiceList() {
        return listService.getNiceList();
    }

    @RequestMapping(value = "/nice", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public void addToNiceList(@RequestBody Person p) {
        listService.addToNiceList(p);
    }

    @RequestMapping(value = "/naughty", method = RequestMethod.GET)
    public List<Person> getNaughtyList() {
        return listService.getNaughtyList();
    }

    @RequestMapping(value = "/naughty", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public void addToNaughtyList(@RequestBody Person p) {
        listService.addToNaughtyList(p);
    }

}
