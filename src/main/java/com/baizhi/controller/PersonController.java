package com.baizhi.controller;

import com.baizhi.dao.PersonDao;
import com.baizhi.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("person")
public class PersonController {

    @Autowired
    private PersonDao personDao;

    @RequestMapping("selectAll")
    public String selectAll(Map map){
        List<Person> people = personDao.selectAll();
        map.put("list",people);
        return "index";
    }
}
