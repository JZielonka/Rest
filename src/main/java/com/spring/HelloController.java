package com.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jarek on 2017-03-06.
 */

@RestController

public class HelloController {

    List<Employee> employees = new ArrayList<>();

    @RequestMapping("getEmployees")
    public  List<Employee> getEmployees() {



        employees.add(new Employee("Jan", "Nowak", "2000"));
        employees.add(new Employee("Marian", "Paździoch", "1500"));

        return employees;
    }

    @RequestMapping("/{id}")
    public Employee getEmployee(@PathVariable ("id") int id) {


        return employees.get(id);
    }


}

