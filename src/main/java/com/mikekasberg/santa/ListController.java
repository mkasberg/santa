package com.mikekasberg.santa;

import com.mikekasberg.santa.model.Person;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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

    @RequestMapping(value = "/naughty", method = RequestMethod.GET)
    public List<Person> getNaughtyList() {
        return listService.getNaughtyList();
    }

}
