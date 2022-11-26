package com.example.springbootdemo02.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
public class TestController {
//    @PostMapping
//    public String save(@RequestBody Book book){
//        System.out.println("save...");
//        return "{'key': 'save'}";
//    }
//
//    @DeleteMapping("/{id}")
//    public String delete(@PathVariable Integer id){
//        System.out.println("delete...");
//        return "{'key': 'delete'}";
//    }
//
//    @PutMapping
//    public String update(@RequestBody Book book){
//        System.out.println("update...");
//        return "{'key': 'update'}";
//    }
//
//    @GetMapping("/{id}")
//    public String getById(@PathVariable Integer id){
//        System.out.println("getById...");
//        return "{'key': 'getById'}";
//    }

    @GetMapping
    public String test(){
        return "test5";
    }
}
