package com.kgisl.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kgisl.demo.Repository.EmployeeRepository;
import com.kgisl.demo.model.Employee;

@Controller
public class EmployeeController {
    @Autowired
    private EmployeeRepository employeeRepository;
    @GetMapping("/index")
    public String index()
    {
        return "hello";
    }

    @GetMapping("/employee")
    @ResponseBody
    public  ResponseEntity<List<Employee>> getAll()
     { 
        return new ResponseEntity<>(employeeRepository.findAll(), HttpStatus.OK);
    }
    @GetMapping("/{id}")
    @ResponseBody
    public ResponseEntity<Employee> getById(int id)
    {
        //  return new ResponseEntity<>(employeeRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Not found")));
         Employee user = employeeRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Not found"));
         return new ResponseEntity<Employee>(user, HttpStatus.OK);
    }

    @PostMapping("/new")
    @ResponseBody
    public ResponseEntity<Employee> InsertById(Employee user)
    {
    return new ResponseEntity<Employee>(employeeRepository.save(user),HttpStatus.OK);
    }

}
